import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_004_Regression0 {

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
            System.out.format("%n%s%n", "JA_004_Regression0.test001");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        long long1 = cSVFormat0.getMaxRows();
        java.lang.Class<?> wildcardClass2 = cSVFormat0.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test002");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.Object obj1 = null;
        java.lang.Appendable appendable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat0.print(obj1, appendable2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test003");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = cSVFormat5.parse(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test004");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.??");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test005");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setDelimiter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test006");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.sql.ResultSetMetaData resultSetMetaData1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSetMetaData1);
        java.nio.file.Path path3 = null;
        java.nio.charset.Charset charset4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter5 = cSVFormat2.print(path3, charset4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.charset.Charset.newEncoder()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test007");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        long long4 = cSVFormat0.getMaxRows();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test008");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Oracle;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Oracle + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Oracle));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test009");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withCommentMarker((java.lang.Character) ',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test010");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreEmptyLines();
        java.nio.file.Path path9 = null;
        java.nio.charset.Charset charset10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter11 = cSVFormat7.print(path9, charset10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.charset.Charset.newEncoder()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test011");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat5.println(appendable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"appendable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test012");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MySQL + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MySQL));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test013");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.TDF;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.TDF + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.TDF));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test014");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test015");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setDelimiter("\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test016");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        long long1 = cSVFormat0.getMaxRows();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test017");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Default + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Default));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test018");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentMarker('\"');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the quoteChar cannot be the same ('\"')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test019");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setTrailingData(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test020");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<,> QuoteChar=<\"> RecordSeparator=<??> SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test021");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test022");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnload;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnload + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnload));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test023");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        long long6 = cSVFormat5.getMaxRows();
        char char7 = cSVFormat5.getDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode8 = cSVFormat5.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder0.setQuoteMode(quoteMode8);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ',' + "'", char7 == ',');
        org.junit.Assert.assertTrue("'" + quoteMode8 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode8.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test024");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        java.lang.String str3 = cSVFormat0.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test025");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test026");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setMaxRows((long) (short) 100);
        java.lang.String[] strArray12 = new java.lang.String[] { "", ",", "", ",", "," };
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder4.setHeaderComments(strArray12);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setQuote((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", ",", "", ",", "," });
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test027");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        java.sql.ResultSet resultSet3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSet3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setCommentMarker('a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test028");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char3 = cSVFormat0.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test029");
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
        java.lang.Appendable appendable25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str33 = cSVFormat32.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder34 = cSVFormat32.builder();
        java.lang.Object[] objArray35 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder34.setHeaderComments(objArray35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat29.withHeaderComments(objArray35);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat0.printRecord(appendable25, objArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"appendable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "," + "'", str33, ",");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertArrayEquals(objArray35, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(cSVFormat37);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test030");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setQuote('a');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setEscape((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test031");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test032");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setEscape('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test033");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withSystemRecordSeparator();
        java.io.File file8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat7.print(file8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.toPath()\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test034");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf(",");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.,");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test035");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str5 = cSVFormat4.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder6 = cSVFormat4.builder();
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setMaxRows((long) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", ",", "", ",", "," };
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder8.setHeaderComments(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat2.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat2.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", ",", "", ",", "," });
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test036");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        boolean boolean7 = cSVFormat6.getAutoFlush();
        boolean boolean8 = cSVFormat6.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test037");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setQuote((java.lang.Character) ' ');
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test038");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setHeaderComments(strArray11);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder8.setEscape('\"');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test039");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test040");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = builder10.build();
        boolean boolean12 = cSVFormat11.isNullStringSet();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test041");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        java.nio.file.Path path2 = null;
        java.nio.charset.Charset charset3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat1.print(path2, charset3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.charset.Charset.newEncoder()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test042");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setQuote('a');
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test043");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = cSVFormat0.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(quoteMode1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test044");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setAllowMissingColumnNames(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder10 = builder2.setDelimiter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test045");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreEmptyLines(false);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test046");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat0.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withCommentMarker((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test047");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = cSVFormat0.parse(reader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test048");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setDelimiter(' ');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test049");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = cSVFormat7.parse(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test050");
        org.apache.commons.csv.CSVFormat cSVFormat0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder1 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"allowMissingColumnNames\" because \"x0\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test051");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrailingDelimiter();
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat6.println(appendable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"appendable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test052");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withSkipHeaderRecord(false);
        java.lang.Character char7 = cSVFormat6.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test053");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        java.lang.String str9 = cSVFormat8.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test054");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withTrim(false);
        java.lang.String[] strArray15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withNullString("\n");
        org.apache.commons.csv.QuoteMode quoteMode22 = cSVFormat18.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder10.setQuoteMode(quoteMode22);
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder23.setEscape('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + quoteMode22 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode22.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test055");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test056");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setEscape('a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test057");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSystemRecordSeparator();
        org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat3.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVPrinter4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test058");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        java.sql.ResultSet resultSet3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSet3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setHeader(resultSetMetaData7);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test059");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        java.lang.Appendable appendable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat0.println(appendable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"appendable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test060");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        boolean boolean9 = cSVFormat7.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test061");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrailingDelimiter();
        boolean boolean7 = cSVFormat6.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withNullString(",");
        boolean boolean10 = cSVFormat6.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test062");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test063");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat3.println(appendable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"appendable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test064");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrailingDelimiter();
        boolean boolean7 = cSVFormat5.getLenientEof();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test065");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.ORACLE;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test066");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setMaxRows((long) (short) 100);
        java.lang.String[] strArray12 = new java.lang.String[] { "", ",", "", ",", "," };
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder4.setHeaderComments(strArray12);
        java.lang.Class<?> wildcardClass14 = builder4.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", ",", "", ",", "," });
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test067");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat.Builder builder6 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test068");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.ORACLE;
        boolean boolean1 = cSVFormat0.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test069");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat0.getDuplicateHeaderMode();
        boolean boolean3 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat0.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test070");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.CSVFormat.Builder builder2 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat1);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setTrailingData(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test071");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.Appendable appendable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat0.println(appendable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"appendable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test072");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat0.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withFirstRecordAsHeader();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test073");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat0.getDuplicateHeaderMode();
        boolean boolean3 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentMarker('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test074");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char3 = cSVFormat0.getQuoteCharacter();
        java.lang.String str4 = cSVFormat0.getNullString();
        java.io.File file5 = null;
        java.nio.charset.Charset charset6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat0.print(file5, charset6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.toPath()\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test075");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setAutoFlush(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test076");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat.Builder builder6 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setHeader(resultSetMetaData7);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test077");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withDelimiter('a');
        java.io.Reader reader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = cSVFormat4.parse(reader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test078");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        boolean boolean2 = cSVFormat0.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test080");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char3 = cSVFormat0.getQuoteCharacter();
        java.lang.String str4 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        java.lang.String[] strArray9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withNullString("\n");
        org.apache.commons.csv.QuoteMode quoteMode16 = cSVFormat12.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat0.withQuoteMode(quoteMode16);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + quoteMode16 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode16.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test081");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        java.io.Reader reader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = cSVFormat2.parse(reader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test082");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVPrinter4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test083");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder5 = cSVFormat3.builder();
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder5.setHeaderComments(objArray6);
        java.lang.String str8 = cSVFormat1.format(objArray6);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test084");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setAllowDuplicateHeaderNames(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test085");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setRecordSeparator('#');
        java.lang.Class<?> wildcardClass13 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test086");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat0.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote(' ');
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test087");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withCommentMarker(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test088");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str11 = cSVFormat10.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreEmptyLines(false);
        boolean boolean16 = cSVFormat5.equals((java.lang.Object) false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\r\n" + "'", str11, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAutoFlush(false);
        org.apache.commons.csv.CSVPrinter cSVPrinter5 = cSVFormat0.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVPrinter5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test090");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test091");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase(true);
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withHeader(resultSetMetaData8);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVPrinter4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test092");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str11 = cSVFormat10.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder12 = cSVFormat10.builder();
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setSkipHeaderRecord(false);
        java.sql.ResultSet resultSet15 = null;
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setHeader(resultSet15);
        java.sql.ResultSetMetaData resultSetMetaData17 = null;
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder14.setHeader(resultSetMetaData17);
        java.lang.Appendable appendable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat8.print((java.lang.Object) resultSetMetaData17, appendable19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "," + "'", str11, ",");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test093");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withTrailingDelimiter(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test094");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setRecordSeparator("");
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setHeader(resultSet9);
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder11.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder11.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode18 = null;
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder11.setQuoteMode(quoteMode18);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder21.setEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder23.setEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        long long27 = cSVFormat26.getMaxRows();
        char char28 = cSVFormat26.getDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode29 = cSVFormat26.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder25.setQuoteMode(quoteMode29);
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder10.setQuoteMode(quoteMode29);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + ',' + "'", char28 == ',');
        org.junit.Assert.assertTrue("'" + quoteMode29 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode29.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test095");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        java.nio.file.Path path2 = null;
        java.nio.charset.Charset charset3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat0.print(path2, charset3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.charset.Charset.newEncoder()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test096");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setDelimiter('#');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = builder2.build();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder2.setAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test097");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setDelimiter('#');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat.Builder builder9 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder9.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder9.setQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = builder19.build();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode21 = cSVFormat20.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder8.setDuplicateHeaderMode(duplicateHeaderMode21);
        org.apache.commons.csv.CSVFormat.Builder builder23 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder23.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder25.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder25.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder31.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str35 = cSVFormat34.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder36 = cSVFormat34.builder();
        java.lang.Object[] objArray37 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder38 = builder36.setHeaderComments(objArray37);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder33.setHeaderComments(objArray37);
        org.apache.commons.csv.CSVFormat.Builder builder40 = builder22.setHeaderComments(objArray37);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode21 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode21.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "," + "'", str35, ",");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertArrayEquals(objArray37, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test098");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setCommentMarker(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test099");
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
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test100");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrailingDelimiter();
        boolean boolean7 = cSVFormat6.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withNullString(",");
        boolean boolean10 = cSVFormat9.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test101");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVPrinter cSVPrinter5 = cSVFormat0.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVPrinter5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test102");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode7 = cSVFormat0.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode7 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode7.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test103");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrailingDelimiter();
        boolean boolean7 = cSVFormat6.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withNullString(",");
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.sql.ResultSetMetaData resultSetMetaData11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSetMetaData11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withDelimiter(',');
        java.lang.Appendable appendable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat9.print((java.lang.Object) ',', appendable15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(char)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test104");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setHeaderComments(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str14 = cSVFormat13.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode15 = cSVFormat13.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder8.setDuplicateHeaderMode(duplicateHeaderMode15);
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder16.setAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode15 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode15.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test105");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setLenientEof(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test106");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowDuplicateHeaderNames(false);
        boolean boolean5 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter11 = cSVFormat10.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVPrinter11);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test107");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat.Builder builder1 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim();
        boolean boolean3 = cSVFormat0.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test108");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        boolean boolean2 = cSVFormat1.isCommentMarkerSet();
        boolean boolean3 = cSVFormat1.getLenientEof();
        boolean boolean4 = cSVFormat1.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test109");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreEmptyLines(false);
        boolean boolean6 = cSVFormat3.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test110");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test111");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        java.lang.Character char2 = cSVFormat1.getEscapeCharacter();
        java.sql.ResultSet resultSet3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeader(resultSet3);
        org.apache.commons.csv.CSVFormat.Builder builder5 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test112");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder9 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder9.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder9.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder18 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder18.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder18.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode25 = null;
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder18.setQuoteMode(quoteMode25);
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder26.setRecordSeparator('a');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder26.setHeaderComments(strArray29);
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder9.setHeaderComments(strArray29);
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder8.setHeaderComments(strArray29);
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder32.setTrailingData(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test113");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('4');
        boolean boolean4 = cSVFormat0.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test114");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setTrim(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test115");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat0.getDuplicateHeaderMode();
        boolean boolean3 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test116");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrim();
        java.lang.Character char8 = cSVFormat6.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test117");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        long long8 = cSVFormat1.getMaxRows();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test118");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrim(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setMaxRows((long) ' ');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setLenientEof(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setDelimiter(' ');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test119");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator("hi!");
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat3.print(appendable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: appendable");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test120");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setCommentMarker((java.lang.Character) ',');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test121");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char3 = cSVFormat0.getQuoteCharacter();
        boolean boolean4 = cSVFormat0.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        boolean boolean7 = cSVFormat0.getLenientEof();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test122");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat0.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withFirstRecordAsHeader();
        java.sql.ResultSet resultSet6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSet6);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test123");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setDelimiter('#');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setIgnoreEmptyLines(false);
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder2.setHeader(resultSet9);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test124");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAutoFlush(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test125");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setAutoFlush(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test126");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat1.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test127");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowDuplicateHeaderNames(false);
        boolean boolean5 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat2.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + quoteMode6 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode6.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test128");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowDuplicateHeaderNames(false);
        boolean boolean5 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withTrailingDelimiter();
        boolean boolean10 = cSVFormat9.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test129");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('a');
        boolean boolean8 = cSVFormat3.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test130");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVPrinter cSVPrinter2 = cSVFormat1.printer();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withFirstRecordAsHeader();
        java.lang.String[] strArray6 = cSVFormat4.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVPrinter2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test131");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char3 = cSVFormat0.getQuoteCharacter();
        boolean boolean4 = cSVFormat0.getAutoFlush();
        boolean boolean5 = cSVFormat0.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test132");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        java.io.Reader reader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = cSVFormat0.parse(reader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test133");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        boolean boolean8 = cSVFormat6.equals((java.lang.Object) 10);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withSkipHeaderRecord(false);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode11 = cSVFormat10.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode11 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode11.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test134");
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
        char char25 = cSVFormat24.getDelimiter();
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
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + ',' + "'", char25 == ',');
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test135");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setMaxRows((long) (byte) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test136");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat0.getDuplicateHeaderMode();
        java.lang.String[] strArray3 = cSVFormat0.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test137");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withNullString("\n");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withAllowDuplicateHeaderNames(false);
        boolean boolean18 = cSVFormat15.getIgnoreEmptyLines();
        java.lang.String str19 = cSVFormat15.getRecordSeparator();
        java.lang.Appendable appendable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat7.print((java.lang.Object) cSVFormat15, appendable20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\r\n" + "'", str19, "\r\n");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test138");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withAllowMissingColumnNames();
        java.lang.String[] strArray11 = cSVFormat10.getHeaderComments();
        boolean boolean12 = cSVFormat10.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test139");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str1 = cSVFormat0.toString();
        java.lang.String str2 = cSVFormat0.getNullString();
        java.lang.Character char3 = cSVFormat0.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str1, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(char3);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test140");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withAllowMissingColumnNames();
        java.lang.String[] strArray11 = cSVFormat10.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test141");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        java.lang.String str3 = cSVFormat2.toString();
        boolean boolean4 = cSVFormat2.getIgnoreHeaderCase();
        boolean boolean5 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false" + "'", str3, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test142");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        java.lang.String[] strArray5 = cSVFormat0.getHeader();
        boolean boolean6 = cSVFormat0.getIgnoreEmptyLines();
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat0.println(appendable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"appendable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test143");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.sql.ResultSetMetaData resultSetMetaData1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSetMetaData1);
        boolean boolean3 = cSVFormat0.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withRecordSeparator(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test144");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test145");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getQuoteCharacter();
        java.lang.Character char2 = cSVFormat0.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\"' + "'", char1 == '\"');
        org.junit.Assert.assertNull(char2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test146");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        java.sql.ResultSet resultSet3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSet3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setQuote((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test147");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder15 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setTrim(true);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder15.setTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withTrim();
        boolean boolean23 = cSVFormat22.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str25 = cSVFormat24.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder26 = cSVFormat24.builder();
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder26.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder28.setMaxRows((long) (short) 100);
        java.lang.String[] strArray36 = new java.lang.String[] { "", ",", "", ",", "," };
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder28.setHeaderComments(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat22.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder19.setHeaderComments(strArray36);
        org.apache.commons.csv.CSVFormat.Builder builder40 = builder10.setHeaderComments(strArray36);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "," + "'", str25, ",");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", ",", "", ",", "," });
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test148");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.ORACLE;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat9.isQuoteCharacterSet();
        boolean boolean11 = cSVFormat5.equals((java.lang.Object) cSVFormat9);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withQuote((java.lang.Character) '4');
        boolean boolean14 = cSVFormat9.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test149");
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
        java.lang.Appendable appendable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter14 = cSVFormat12.print(appendable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: appendable");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test150");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        long long1 = cSVFormat0.getMaxRows();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter(',');
        java.lang.Appendable appendable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat0.println(appendable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"appendable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test151");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('a');
        boolean boolean8 = cSVFormat3.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test152");
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
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder22.setCommentMarker((java.lang.Character) '#');
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
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test153");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setMaxRows((long) (short) 100);
        java.lang.String[] strArray12 = new java.lang.String[] { "", ",", "", ",", "," };
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder4.setHeaderComments(strArray12);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder4.setTrailingData(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", ",", "", ",", "," });
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test154");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat.Builder builder1 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder3 = builder1.setNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder5 = builder1.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder1.setRecordSeparator('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test155");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) '#');
        boolean boolean6 = cSVFormat5.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test156");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setRecordSeparator('#');
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setRecordSeparator("\r\n");
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setEscape('\"');
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test157");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withNullString("\n");
        java.lang.Object[] objArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cSVFormat7.format(objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test158");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str5 = cSVFormat4.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder6 = cSVFormat4.builder();
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setSkipHeaderRecord(false);
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat1.print((java.lang.Object) builder8, appendable9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence, int, int)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test159");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        boolean boolean7 = cSVFormat6.getAutoFlush();
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat6.printer();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test160");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = builder6.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test161");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setNullString(",");
        java.sql.ResultSetMetaData resultSetMetaData11 = null;
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setHeader(resultSetMetaData11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test162");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAutoFlush(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test163");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode5 = cSVFormat4.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(duplicateHeaderMode5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test164");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test165");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder4.setIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test166");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setMaxRows((long) (short) 100);
        java.lang.String[] strArray12 = new java.lang.String[] { "", ",", "", ",", "," };
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder4.setHeaderComments(strArray12);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder4.setLenientEof(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", ",", "", ",", "," });
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test167");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setHeaderComments(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str14 = cSVFormat13.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode15 = cSVFormat13.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder8.setDuplicateHeaderMode(duplicateHeaderMode15);
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder16.setTrailingData(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode15 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode15.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test168");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        java.lang.String str3 = cSVFormat2.toString();
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat2.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false" + "'", str3, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test169");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        boolean boolean6 = cSVFormat2.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test170");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setAllowDuplicateHeaderNames(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test171");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        boolean boolean5 = cSVFormat4.isNullStringSet();
        java.lang.Character char6 = cSVFormat4.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test172");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        long long11 = cSVFormat10.getMaxRows();
        char char12 = cSVFormat10.getDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode13 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str15 = cSVFormat14.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder16 = cSVFormat14.builder();
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder16.setHeaderComments(objArray17);
        java.lang.String str19 = cSVFormat10.format(objArray17);
        java.lang.String str20 = cSVFormat8.format(objArray17);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertTrue("'" + quoteMode13 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode13.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "," + "'", str15, ",");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "," + "'", str20, ",");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test173");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setMaxRows((long) (short) 100);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setQuote((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test174");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = builder10.build();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuote('a');
        boolean boolean14 = cSVFormat11.isQuoteCharacterSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withQuote(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test175");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("\r\n");
        boolean boolean11 = cSVFormat8.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test176");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat.Builder builder6 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat3);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withQuote((java.lang.Character) ' ');
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat7.print((java.lang.Object) cSVFormat11, appendable12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test177");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withTrailingDelimiter(true);
        boolean boolean10 = cSVFormat9.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test178");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test179");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.ORACLE;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat9.isQuoteCharacterSet();
        boolean boolean11 = cSVFormat5.equals((java.lang.Object) cSVFormat9);
        boolean boolean12 = cSVFormat5.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test180");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        boolean boolean6 = cSVFormat1.getIgnoreHeaderCase();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode7 = cSVFormat1.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode7 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode7.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test181");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAutoFlush(false);
        java.lang.String str8 = cSVFormat7.getNullString();
        java.lang.String[] strArray9 = cSVFormat7.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test182");
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
        java.lang.Appendable appendable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter26 = cSVFormat0.print(appendable25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: appendable");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test183");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test184");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        java.lang.String str3 = cSVFormat0.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test185");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setDelimiter("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test186");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setRecordSeparator("");
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setHeader(resultSet9);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withTrim();
        boolean boolean16 = cSVFormat15.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str18 = cSVFormat17.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder19 = cSVFormat17.builder();
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder21.setMaxRows((long) (short) 100);
        java.lang.String[] strArray29 = new java.lang.String[] { "", ",", "", ",", "," };
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder21.setHeaderComments(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat15.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder12.setHeader(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "," + "'", str18, ",");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", ",", "", ",", "," });
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test187");
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
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withTrim(true);
        java.lang.Character char24 = cSVFormat21.getQuoteCharacter();
        boolean boolean25 = cSVFormat21.getAutoFlush();
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
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\"' + "'", char24 == '\"');
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test188");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat0.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withAutoFlush(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test189");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test190");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setDelimiter("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setHeader(resultSetMetaData7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat9 = builder6.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same ('\"')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test191");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str5 = cSVFormat4.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder6 = cSVFormat4.builder();
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setMaxRows((long) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", ",", "", ",", "," };
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder8.setHeaderComments(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat2.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", ",", "", ",", "," });
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test192");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setDelimiter('#');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = builder2.build();
        java.sql.ResultSet resultSet10 = null;
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder2.setHeader(resultSet10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test193");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withRecordSeparator('#');
        java.lang.String[] strArray8 = cSVFormat2.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test194");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test195");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat.Builder builder1 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder3 = builder1.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withAllowMissingColumnNames(false);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode16 = cSVFormat15.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder1.setDuplicateHeaderMode(duplicateHeaderMode16);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode16 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode16.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test196");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setDelimiter('#');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setIgnoreEmptyLines(false);
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder2.setHeader(resultSet9);
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder13.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder20 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder20.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder20.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder20.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder29 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder29.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder29.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder29.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode36 = null;
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder29.setQuoteMode(quoteMode36);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder37.setRecordSeparator('a');
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder37.setHeaderComments(strArray40);
        org.apache.commons.csv.CSVFormat.Builder builder42 = builder20.setHeaderComments(strArray40);
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder19.setHeaderComments(strArray40);
        org.apache.commons.csv.CSVFormat.Builder builder44 = builder10.setHeaderComments(strArray40);
        org.apache.commons.csv.CSVFormat.Builder builder46 = builder10.setTrailingData(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
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
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test197");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setRecordSeparator("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder4.setTrailingData(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test198");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames(true);
        java.nio.file.Path path7 = null;
        java.nio.charset.Charset charset8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat0.print(path7, charset8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.charset.Charset.newEncoder()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test199");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat.Builder builder3 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder5 = builder3.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder3.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder3.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder3.setNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder3.setCommentMarker(' ');
        boolean boolean14 = cSVFormat2.equals((java.lang.Object) builder13);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test200");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode9 = cSVFormat3.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + quoteMode9 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode9.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test201");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuote('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test202");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        java.lang.Character char6 = cSVFormat0.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test203");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test204");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test205");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test206");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withTrailingDelimiter();
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat9.println(appendable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"appendable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test207");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setMaxRows((long) (byte) 10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withTrim(false);
        java.lang.String[] strArray17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withNullString("\n");
        org.apache.commons.csv.QuoteMode quoteMode24 = cSVFormat20.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder8.setQuoteMode(quoteMode24);
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder8.setNullString("\n");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + quoteMode24 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode24.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test208");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setSkipHeaderRecord(true);
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test209");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test210");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = builder6.build();
        org.apache.commons.csv.CSVFormat.Builder builder8 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat7);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test211");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setNullString("Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test212");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        boolean boolean8 = cSVFormat6.equals((java.lang.Object) 10);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        java.lang.String[] strArray13 = cSVFormat12.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test213");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSystemRecordSeparator();
        boolean boolean4 = cSVFormat1.getTrim();
        boolean boolean5 = cSVFormat1.getAllowMissingColumnNames();
        boolean boolean6 = cSVFormat1.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test214");
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
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat0.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withIgnoreHeaderCase();
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
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test215");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char3 = cSVFormat0.getQuoteCharacter();
        boolean boolean4 = cSVFormat0.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVPrinter7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test216");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        java.lang.Object obj10 = null;
        java.lang.Appendable appendable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat8.print(obj10, appendable11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test217");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder0.setCommentMarker(' ');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder0.setMaxRows((long) (short) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test218");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = cSVFormat1.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAllowDuplicateHeaderNames();
        boolean boolean8 = cSVFormat7.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test219");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote(' ');
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
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test220");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.ORACLE;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat9.isQuoteCharacterSet();
        boolean boolean11 = cSVFormat5.equals((java.lang.Object) cSVFormat9);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreSurroundingSpaces();
        boolean boolean15 = cSVFormat13.getTrim();
        org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat13.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVPrinter16);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test221");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreEmptyLines();
        boolean boolean9 = cSVFormat7.getTrim();
        java.lang.String[] strArray10 = cSVFormat7.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test222");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('#');
        org.apache.commons.csv.CSVFormat.Builder builder9 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder12 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder14.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder14.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str24 = cSVFormat23.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder25 = cSVFormat23.builder();
        java.lang.Object[] objArray26 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setHeaderComments(objArray26);
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder22.setHeaderComments(objArray26);
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder11.setHeaderComments(objArray26);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat6.withHeaderComments(objArray26);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withEscape('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVPrinter4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "," + "'", str24, ",");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test223");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test224");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        java.lang.String str4 = cSVFormat3.getNullString();
        boolean boolean5 = cSVFormat3.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test225");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrim();
        java.lang.Character char6 = cSVFormat2.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test226");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        boolean boolean4 = cSVFormat3.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test227");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter3 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat.Builder builder4 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = cSVFormat6.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVPrinter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test228");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = builder10.build();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test229");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrailingDelimiter();
        boolean boolean7 = cSVFormat6.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withNullString(",");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test230");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat.Builder builder1 = cSVFormat0.builder();
        boolean boolean2 = cSVFormat0.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test231");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuote('a');
        boolean boolean11 = cSVFormat10.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVPrinter4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test232");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setMaxRows((long) (short) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test233");
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
        java.lang.Character char23 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat0.withNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator('a');
        boolean boolean28 = cSVFormat27.getAllowDuplicateHeaderNames();
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
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\"' + "'", char23 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test234");
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
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withSystemRecordSeparator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuote((java.lang.Character) ',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test235");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreEmptyLines();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withCommentMarker((java.lang.Character) ',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Excel + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Excel));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test236");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder4.setAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test237");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase(true);
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        java.lang.String str8 = cSVFormat3.toString();
        boolean boolean9 = cSVFormat3.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVPrinter4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str8, "Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test238");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat.Builder builder1 = cSVFormat0.builder();
        boolean boolean2 = cSVFormat0.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test239");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withAllowMissingColumnNames(false);
        long long12 = cSVFormat5.getMaxRows();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test240");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.Character char6 = cSVFormat2.getCommentMarker();
        boolean boolean7 = cSVFormat2.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test241");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = cSVFormat1.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowMissingColumnNames(false);
        java.sql.ResultSet resultSet10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withHeader(resultSet10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test242");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withEscape('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test243");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test244");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        java.lang.String str4 = cSVFormat3.getNullString();
        java.lang.Character char5 = cSVFormat3.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\"' + "'", char5 == '\"');
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test245");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreEmptyLines();
        boolean boolean12 = cSVFormat11.getAutoFlush();
        java.lang.String[] strArray13 = cSVFormat11.getHeaderComments();
        java.lang.String str14 = cSVFormat11.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored IgnoreHeaderCase:ignored SkipHeaderRecord:false" + "'", str14, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored IgnoreHeaderCase:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test246");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSystemRecordSeparator();
        boolean boolean3 = cSVFormat2.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test247");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowDuplicateHeaderNames();
        java.lang.Character char5 = cSVFormat4.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\"' + "'", char5 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test248");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setLenientEof(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = builder8.build();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test249");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        boolean boolean7 = cSVFormat6.getAutoFlush();
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat6.printer();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat.Builder builder11 = cSVFormat10.builder();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test250");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder0.setAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder11.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder11.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder17.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder22 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder22.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder24.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder24.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder24.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder31 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder31.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder31.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder31.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder31.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder40 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder42 = builder40.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder44 = builder40.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder46 = builder40.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode47 = null;
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder40.setQuoteMode(quoteMode47);
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder48.setRecordSeparator('a');
        java.lang.String[] strArray51 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder52 = builder48.setHeaderComments(strArray51);
        org.apache.commons.csv.CSVFormat.Builder builder53 = builder31.setHeaderComments(strArray51);
        org.apache.commons.csv.CSVFormat.Builder builder54 = builder30.setHeaderComments(strArray51);
        org.apache.commons.csv.CSVFormat.Builder builder55 = builder21.setHeader(strArray51);
        org.apache.commons.csv.CSVFormat.Builder builder56 = builder0.setHeaderComments((java.lang.Object[]) strArray51);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
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
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test251");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = cSVFormat1.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        java.lang.Character char7 = cSVFormat6.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test252");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat0.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat.Builder builder3 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat0.print(appendable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: appendable");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test253");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat.Builder builder8 = cSVFormat7.builder();
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test254");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(resultSetMetaData6);
        boolean boolean8 = cSVFormat2.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test255");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char3 = cSVFormat0.getQuoteCharacter();
        boolean boolean4 = cSVFormat0.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat9.printer();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withAllowMissingColumnNames();
        boolean boolean18 = cSVFormat5.equals((java.lang.Object) cSVFormat12);
        boolean boolean19 = cSVFormat12.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVPrinter10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test256");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setDelimiter('#');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setIgnoreEmptyLines(false);
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder2.setHeader(resultSet9);
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder13.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder20 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder20.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder20.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder20.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder29 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder29.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder29.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder29.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode36 = null;
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder29.setQuoteMode(quoteMode36);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder37.setRecordSeparator('a');
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder37.setHeaderComments(strArray40);
        org.apache.commons.csv.CSVFormat.Builder builder42 = builder20.setHeaderComments(strArray40);
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder19.setHeaderComments(strArray40);
        org.apache.commons.csv.CSVFormat.Builder builder44 = builder10.setHeaderComments(strArray40);
        org.apache.commons.csv.CSVFormat.Builder builder46 = builder10.setRecordSeparator("\r\n");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
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
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test257");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        java.lang.String str6 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str8 = cSVFormat7.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat7.builder();
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setDelimiter('#');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder9.setIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = builder9.build();
        org.apache.commons.csv.CSVFormat.Builder builder17 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder17.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder17.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode24 = null;
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder17.setQuoteMode(quoteMode24);
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setRecordSeparator('a');
        java.lang.String[] strArray28 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder25.setHeaderComments(strArray28);
        java.lang.String str30 = cSVFormat16.format((java.lang.Object[]) strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat3.withHeaderComments((java.lang.Object[]) strArray28);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(cSVFormat31);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test258");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = builder10.build();
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder10.setTrailingDelimiter(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test259");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setDelimiter("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test260");
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
        org.apache.commons.csv.CSVFormat.Builder builder23 = cSVFormat0.builder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat0.withCommentMarker((java.lang.Character) ',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test261");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test262");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setRecordSeparator('#');
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder8.setQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder8.setMaxRows((long) (byte) -1);
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
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test263");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        boolean boolean5 = cSVFormat4.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test264");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.sql.ResultSetMetaData resultSetMetaData1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSetMetaData1);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test265");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.getTrailingData();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test266");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder9 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder9.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder15.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder20 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder22.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder22.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder22.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder29 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder29.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder29.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder29.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder29.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder38 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder40 = builder38.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder42 = builder38.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder44 = builder38.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode45 = null;
        org.apache.commons.csv.CSVFormat.Builder builder46 = builder38.setQuoteMode(quoteMode45);
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder46.setRecordSeparator('a');
        java.lang.String[] strArray49 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder46.setHeaderComments(strArray49);
        org.apache.commons.csv.CSVFormat.Builder builder51 = builder29.setHeaderComments(strArray49);
        org.apache.commons.csv.CSVFormat.Builder builder52 = builder28.setHeaderComments(strArray49);
        org.apache.commons.csv.CSVFormat.Builder builder53 = builder19.setHeader(strArray49);
        org.apache.commons.csv.CSVFormat.Builder builder54 = builder4.setHeaderComments(strArray49);
        org.apache.commons.csv.CSVFormat.Builder builder56 = builder4.setRecordSeparator("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
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
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test267");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat0.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test268");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withAllowMissingColumnNames();
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = cSVFormat11.parse(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVPrinter4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test269");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setLenientEof(true);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setDelimiter(",");
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test270");
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
        java.lang.Character char23 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode24 = cSVFormat0.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat0.withAllowMissingColumnNames(false);
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
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\"' + "'", char23 == '\"');
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode24 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode24.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat26);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test271");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        java.lang.String str9 = cSVFormat8.getNullString();
        org.apache.commons.csv.QuoteMode quoteMode10 = cSVFormat8.getQuoteMode();
        boolean boolean11 = cSVFormat8.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + quoteMode10 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode10.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test272");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowDuplicateHeaderNames(false);
        boolean boolean5 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat.Builder builder10 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder10.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode17 = null;
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder10.setQuoteMode(quoteMode17);
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder22.setEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        long long26 = cSVFormat25.getMaxRows();
        char char27 = cSVFormat25.getDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode28 = cSVFormat25.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder24.setQuoteMode(quoteMode28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat9.withQuoteMode(quoteMode28);
        java.lang.String[] strArray31 = cSVFormat30.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + ',' + "'", char27 == ',');
        org.junit.Assert.assertTrue("'" + quoteMode28 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode28.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNull(strArray31);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test273");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        boolean boolean3 = cSVFormat0.isEscapeCharacterSet();
        char char4 = cSVFormat0.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test274");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setQuote('#');
        org.apache.commons.csv.CSVFormat.Builder builder9 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder18 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder18.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder18.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder24.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder24.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder29 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder29.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder31.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder31.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder31.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder38 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder40 = builder38.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder42 = builder38.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder44 = builder38.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder46 = builder38.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder47 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder49 = builder47.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder51 = builder47.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder53 = builder47.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode54 = null;
        org.apache.commons.csv.CSVFormat.Builder builder55 = builder47.setQuoteMode(quoteMode54);
        org.apache.commons.csv.CSVFormat.Builder builder57 = builder55.setRecordSeparator('a');
        java.lang.String[] strArray58 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder59 = builder55.setHeaderComments(strArray58);
        org.apache.commons.csv.CSVFormat.Builder builder60 = builder38.setHeaderComments(strArray58);
        org.apache.commons.csv.CSVFormat.Builder builder61 = builder37.setHeaderComments(strArray58);
        org.apache.commons.csv.CSVFormat.Builder builder62 = builder28.setHeader(strArray58);
        org.apache.commons.csv.CSVFormat.Builder builder63 = builder13.setHeaderComments(strArray58);
        org.apache.commons.csv.CSVFormat.Builder builder64 = builder4.setHeaderComments((java.lang.Object[]) strArray58);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test275");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setMaxRows((long) (byte) 10);
        org.apache.commons.csv.CSVFormat.Builder builder13 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder13.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder19.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder23.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder23.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder28 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder28.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder30.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder30.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder30.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder37 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder37.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder37.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder37.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder37.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder46 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder46.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder46.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder52 = builder46.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode53 = null;
        org.apache.commons.csv.CSVFormat.Builder builder54 = builder46.setQuoteMode(quoteMode53);
        org.apache.commons.csv.CSVFormat.Builder builder56 = builder54.setRecordSeparator('a');
        java.lang.String[] strArray57 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder58 = builder54.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder59 = builder37.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder60 = builder36.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder61 = builder23.setHeader(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder62 = builder12.setHeader(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder64 = builder12.setIgnoreHeaderCase(false);
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
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test276");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVPrinter cSVPrinter5 = cSVFormat4.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVPrinter5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test277");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuote('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test278");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        java.lang.String str8 = cSVFormat7.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test279");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape((java.lang.Character) '4');
        java.nio.file.Path path10 = null;
        java.nio.charset.Charset charset11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat7.print(path10, charset11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.charset.Charset.newEncoder()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test280");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowDuplicateHeaderNames(false);
        boolean boolean5 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withNullString(",");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test281");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setDelimiter("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setLenientEof(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test282");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat.Builder builder8 = cSVFormat7.builder();
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setTrailingData(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = builder8.build();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test283");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter3 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat.Builder builder4 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteMode(quoteMode7);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVPrinter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test284");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat6.getSkipHeaderRecord();
        java.lang.String str10 = cSVFormat6.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\r\n" + "'", str10, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test285");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('#');
        java.lang.String str9 = cSVFormat6.getNullString();
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withHeader(resultSetMetaData10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVPrinter4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test286");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("\r\n");
        char char11 = cSVFormat8.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ',' + "'", char11 == ',');
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test287");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        boolean boolean2 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.QuoteMode quoteMode3 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(quoteMode3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test288");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test289");
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
        org.apache.commons.csv.CSVFormat.Builder builder23 = cSVFormat0.builder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat0.withDelimiter('\"');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same ('\"')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test290");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('\"');
        org.apache.commons.csv.CSVFormat.Builder builder6 = cSVFormat3.builder();
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setCommentMarker('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test291");
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
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat13.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat13.withSkipHeaderRecord(true);
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
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test292");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setCommentMarker((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test293");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder0.setCommentMarker(' ');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setQuote('\"');
        java.sql.ResultSet resultSet13 = null;
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setHeader(resultSet13);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test294");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_TSV;
        java.lang.Character char1 = cSVFormat0.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\"' + "'", char1 == '\"');
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test295");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSystemRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test296");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat3.print(appendable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: appendable");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVPrinter4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test297");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setAllowDuplicateHeaderNames(true);
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setHeader(resultSet11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test298");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrim();
        char char6 = cSVFormat5.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ',' + "'", char6 == ',');
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test299");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.sql.ResultSetMetaData resultSetMetaData1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSetMetaData1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(',');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test300");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setCommentMarker((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test301");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char3 = cSVFormat0.getQuoteCharacter();
        boolean boolean4 = cSVFormat0.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat9.printer();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withAllowMissingColumnNames();
        boolean boolean18 = cSVFormat5.equals((java.lang.Object) cSVFormat12);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat5.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVPrinter10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test302");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSystemRecordSeparator();
        boolean boolean4 = cSVFormat1.getTrim();
        boolean boolean5 = cSVFormat1.getTrailingData();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test303");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowDuplicateHeaderNames(false);
        boolean boolean5 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuote((java.lang.Character) 'a');
        boolean boolean12 = cSVFormat9.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test304");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test305");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withAllowMissingColumnNames(false);
        boolean boolean11 = cSVFormat3.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test306");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder11.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder11.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder11.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder20 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder20.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder20.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode27 = null;
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder20.setQuoteMode(quoteMode27);
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder28.setRecordSeparator('a');
        java.lang.String[] strArray31 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder28.setHeaderComments(strArray31);
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder11.setHeaderComments(strArray31);
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder10.setHeaderComments(strArray31);
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder10.setQuote('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
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
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test307");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test308");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        java.lang.String str3 = cSVFormat2.toString();
        boolean boolean4 = cSVFormat2.getIgnoreHeaderCase();
        boolean boolean5 = cSVFormat2.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false" + "'", str3, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test309");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setHeaderComments(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str14 = cSVFormat13.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode15 = cSVFormat13.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder8.setDuplicateHeaderMode(duplicateHeaderMode15);
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder8.setQuote('a');
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setAllowDuplicateHeaderNames(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode15 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode15.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test310");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test311");
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
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withAutoFlush(false);
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
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test312");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setMaxRows((long) (byte) 10);
        org.apache.commons.csv.CSVFormat.Builder builder13 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder13.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder19.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder23.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder23.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder28 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder28.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder30.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder30.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder30.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder37 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder37.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder37.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder37.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder37.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder46 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder46.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder46.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder52 = builder46.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode53 = null;
        org.apache.commons.csv.CSVFormat.Builder builder54 = builder46.setQuoteMode(quoteMode53);
        org.apache.commons.csv.CSVFormat.Builder builder56 = builder54.setRecordSeparator('a');
        java.lang.String[] strArray57 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder58 = builder54.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder59 = builder37.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder60 = builder36.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder61 = builder23.setHeader(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder62 = builder12.setHeader(strArray57);
        org.apache.commons.csv.CSVFormat cSVFormat63 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat63.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat64.withTrim(false);
        java.lang.String[] strArray67 = null;
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat64.withHeader(strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat64.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat70.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat71.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat71.withIgnoreEmptyLines();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode75 = cSVFormat71.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat.Builder builder76 = builder12.setDuplicateHeaderMode(duplicateHeaderMode75);
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
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode75 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode75.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(builder76);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test313");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrailingDelimiter();
        boolean boolean7 = cSVFormat6.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withNullString(",");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker('a');
        java.lang.Appendable appendable12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str14 = cSVFormat13.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder15 = cSVFormat13.builder();
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setHeaderComments(objArray16);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat9.printRecord(appendable12, objArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"appendable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test314");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = builder10.build();
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder10.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder10.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder16 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder16.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder16.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder16.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder22.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder22.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder26.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder26.setAllowMissingColumnNames(true);
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
        org.apache.commons.csv.CSVFormat.Builder builder64 = builder26.setHeader(strArray60);
        org.apache.commons.csv.CSVFormat.Builder builder65 = builder10.setHeaderComments(strArray60);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
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
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test315");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setMaxRows((long) (byte) 10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withTrim(false);
        java.lang.String[] strArray17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withNullString("\n");
        org.apache.commons.csv.QuoteMode quoteMode24 = cSVFormat20.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder8.setQuoteMode(quoteMode24);
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder8.setNullString(",");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + quoteMode24 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode24.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test316");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        java.lang.String str9 = cSVFormat8.getNullString();
        boolean boolean10 = cSVFormat8.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withEscape('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test317");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setDelimiter("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setTrailingData(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test318");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setDelimiter("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder6.setCommentMarker(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test319");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrailingDelimiter();
        boolean boolean7 = cSVFormat6.getAllowMissingColumnNames();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeaderComments(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSystemRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test320");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setCommentMarker((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test321");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreEmptyLines();
        boolean boolean12 = cSVFormat8.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test322");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        boolean boolean5 = cSVFormat4.isNullStringSet();
        java.lang.Character char6 = cSVFormat4.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withEscape((java.lang.Character) '\"');
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = cSVFormat8.parse(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test323");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat.Builder builder1 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withDelimiter('4');
        boolean boolean5 = cSVFormat4.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test324");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames(true);
        boolean boolean7 = cSVFormat6.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test325");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote('a');
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test326");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setEscape((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test327");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat.Builder builder2 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder12.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder17 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder19.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder19.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder26 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder26.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder26.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder26.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder26.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder35 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder35.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder35.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder35.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode42 = null;
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder35.setQuoteMode(quoteMode42);
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder43.setRecordSeparator('a');
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder47 = builder43.setHeaderComments(strArray46);
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder26.setHeaderComments(strArray46);
        org.apache.commons.csv.CSVFormat.Builder builder49 = builder25.setHeaderComments(strArray46);
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder12.setHeader(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat1.withHeaderComments((java.lang.Object[]) strArray46);
        java.lang.String[] strArray52 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVPrinter cSVPrinter53 = cSVFormat1.printer();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNull(strArray52);
        org.junit.Assert.assertNotNull(cSVPrinter53);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test328");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        java.lang.Class<?> wildcardClass1 = predefined0.getClass();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Excel + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Excel));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test329");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setMaxRows((long) (byte) 10);
        org.apache.commons.csv.CSVFormat.Builder builder13 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder13.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder19.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder23.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder23.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder28 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder28.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder30.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder30.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder30.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder37 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder37.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder37.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder37.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder37.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder46 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder46.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder46.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder52 = builder46.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode53 = null;
        org.apache.commons.csv.CSVFormat.Builder builder54 = builder46.setQuoteMode(quoteMode53);
        org.apache.commons.csv.CSVFormat.Builder builder56 = builder54.setRecordSeparator('a');
        java.lang.String[] strArray57 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder58 = builder54.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder59 = builder37.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder60 = builder36.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder61 = builder23.setHeader(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder62 = builder12.setHeader(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder64 = builder62.setCommentMarker('a');
        org.apache.commons.csv.CSVFormat.Builder builder66 = builder62.setTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat.Builder builder68 = builder62.setNullString("\r\n");
        org.apache.commons.csv.CSVFormat.Builder builder70 = builder62.setEscape(',');
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
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test330");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test331");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setEscape(',');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test332");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat1);
        java.lang.String str9 = cSVFormat1.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\r\n" + "'", str9, "\r\n");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test333");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        java.lang.String[] strArray13 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false", "hi!", ",", "\n" };
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder8.setHeaderComments(strArray13);
        org.apache.commons.csv.CSVFormat.Builder builder15 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder17.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str23 = cSVFormat22.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder24 = cSVFormat22.builder();
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder24.setHeaderComments(objArray25);
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder24.setDelimiter('#');
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder28.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat.Builder builder31 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder31.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder31.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder31.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode38 = null;
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder31.setQuoteMode(quoteMode38);
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder39.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = builder41.build();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode43 = cSVFormat42.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat.Builder builder44 = builder30.setDuplicateHeaderMode(duplicateHeaderMode43);
        org.apache.commons.csv.CSVFormat.Builder builder45 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder47 = builder45.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder49 = builder45.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder51 = builder45.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder53 = builder51.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder55 = builder51.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder57 = builder55.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder59 = builder55.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder60 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder62 = builder60.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder64 = builder62.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder66 = builder62.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder68 = builder62.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder69 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder71 = builder69.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder73 = builder69.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder75 = builder69.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder77 = builder69.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder78 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder80 = builder78.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder82 = builder78.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder84 = builder78.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode85 = null;
        org.apache.commons.csv.CSVFormat.Builder builder86 = builder78.setQuoteMode(quoteMode85);
        org.apache.commons.csv.CSVFormat.Builder builder88 = builder86.setRecordSeparator('a');
        java.lang.String[] strArray89 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder90 = builder86.setHeaderComments(strArray89);
        org.apache.commons.csv.CSVFormat.Builder builder91 = builder69.setHeaderComments(strArray89);
        org.apache.commons.csv.CSVFormat.Builder builder92 = builder68.setHeaderComments(strArray89);
        org.apache.commons.csv.CSVFormat.Builder builder93 = builder55.setHeader(strArray89);
        org.apache.commons.csv.CSVFormat.Builder builder94 = builder44.setHeaderComments(strArray89);
        org.apache.commons.csv.CSVFormat.Builder builder95 = builder21.setHeaderComments(strArray89);
        org.apache.commons.csv.CSVFormat.Builder builder96 = builder14.setHeaderComments(strArray89);
        org.apache.commons.csv.CSVFormat.Builder builder98 = builder96.setDelimiter(",");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false", "hi!", ",", "\n" });
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "," + "'", str23, ",");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode43 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode43.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNotNull(builder96);
        org.junit.Assert.assertNotNull(builder98);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test334");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVPrinter cSVPrinter2 = cSVFormat1.printer();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        boolean boolean5 = cSVFormat4.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVPrinter2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test335");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setDelimiter("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder9.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder9.setQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = builder19.build();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode21 = cSVFormat20.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder8.setDuplicateHeaderMode(duplicateHeaderMode21);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode21 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode21.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test336");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowDuplicateHeaderNames(false);
        boolean boolean5 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withDelimiter('a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same ('a')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test337");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setRecordSeparator("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setCommentMarker('4');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setIgnoreHeaderCase(false);
        java.sql.ResultSetMetaData resultSetMetaData13 = null;
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setHeader(resultSetMetaData13);
        java.lang.String[] strArray21 = new java.lang.String[] { "\r\n", ",", "", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored IgnoreHeaderCase:ignored SkipHeaderRecord:false", "hi!", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder14.setHeaderComments(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "\r\n", ",", "", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored IgnoreHeaderCase:ignored SkipHeaderRecord:false", "hi!", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false" });
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test338");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat.Builder builder6 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test339");
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
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withIgnoreHeaderCase();
        boolean boolean24 = cSVFormat23.getAllowMissingColumnNames();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test340");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setCommentMarker('a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test341");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        java.lang.String str3 = cSVFormat2.toString();
        boolean boolean4 = cSVFormat2.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false" + "'", str3, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test342");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setCommentMarker((java.lang.Character) 'a');
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test343");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat8.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withQuote((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withEscape('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test344");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowDuplicateHeaderNames(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test345");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        java.lang.String[] strArray5 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(false);
        java.lang.String[] strArray8 = cSVFormat7.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test346");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder0.setAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test347");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char3 = cSVFormat2.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test348");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVPrinter cSVPrinter2 = cSVFormat1.printer();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVPrinter2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str4, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test349");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        boolean boolean2 = cSVFormat1.isCommentMarkerSet();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test350");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test351");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setRecordSeparator('#');
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setRecordSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str16 = cSVFormat15.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode17 = cSVFormat15.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str22 = cSVFormat21.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder23 = cSVFormat21.builder();
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder23.setHeaderComments(objArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.sql.ResultSetMetaData resultSetMetaData33 = null;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withHeader(resultSetMetaData33);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (byte) 10, objArray24, cSVFormat29, cSVFormat34 };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat15.withHeaderComments(objArray35);
        org.apache.commons.csv.QuoteMode quoteMode37 = cSVFormat15.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder38 = builder12.setQuoteMode(quoteMode37);
        org.apache.commons.csv.CSVFormat.Builder builder40 = builder12.setMaxRows((long) (byte) -1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "," + "'", str16, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode17 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode17.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "," + "'", str22, ",");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10, [], Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + quoteMode37 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode37.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test352");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withCommentMarker((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test353");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        boolean boolean8 = cSVFormat6.equals((java.lang.Object) 10);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withTrailingDelimiter(true);
        java.io.Reader reader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser19 = cSVFormat15.parse(reader18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test354");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = builder4.build();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder4.setCommentMarker(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test355");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('4');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withEscape((java.lang.Character) ',');
        boolean boolean5 = cSVFormat1.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test356");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreEmptyLines();
        boolean boolean9 = cSVFormat7.getTrailingData();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test357");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreEmptyLines(false);
        boolean boolean6 = cSVFormat5.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test358");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        boolean boolean7 = cSVFormat6.getAutoFlush();
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat6.printer();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker('#');
        long long13 = cSVFormat12.getMaxRows();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test359");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowDuplicateHeaderNames(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test360");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker('#');
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = cSVFormat5.parse(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test361");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase(true);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSet7);
        boolean boolean9 = cSVFormat8.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVPrinter4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test362");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withTrim(false);
        java.lang.String[] strArray15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withNullString("\n");
        org.apache.commons.csv.QuoteMode quoteMode22 = cSVFormat18.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder10.setQuoteMode(quoteMode22);
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder23.setRecordSeparator("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + quoteMode22 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode22.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test363");
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
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withIgnoreSurroundingSpaces(false);
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
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test364");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        boolean boolean7 = cSVFormat6.getAutoFlush();
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat6.printer();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withEscape((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test365");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        long long8 = cSVFormat7.getMaxRows();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test366");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setNullString("Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test367");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.ORACLE;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat9.isQuoteCharacterSet();
        boolean boolean11 = cSVFormat5.equals((java.lang.Object) cSVFormat9);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withSystemRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test368");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str12 = cSVFormat11.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder13 = cSVFormat11.builder();
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setHeaderComments(objArray14);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder10.setHeaderComments(objArray14);
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder16.setIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "," + "'", str12, ",");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test369");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str1 = cSVFormat0.toString();
        java.lang.String str2 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVPrinter cSVPrinter3 = cSVFormat0.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str1, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(cSVPrinter3);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test370");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat.Builder builder8 = cSVFormat7.builder();
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setCommentMarker('a');
        java.sql.ResultSet resultSet15 = null;
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setHeader(resultSet15);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test371");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withNullString("\n");
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat7.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat7.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        java.lang.Character char16 = cSVFormat15.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + quoteMode11 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode11.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\"' + "'", char16 == '\"');
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test372");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withEscape('a');
        boolean boolean8 = cSVFormat7.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test373");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode9 = cSVFormat8.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode9 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode9.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test374");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setTrailingDelimiter(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test375");
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
        boolean boolean23 = cSVFormat0.getLenientEof();
        java.lang.String str24 = cSVFormat0.getNullString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat0.withEscape(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test376");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.sql.ResultSetMetaData resultSetMetaData1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSetMetaData1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(',');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test377");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = builder10.build();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray16 = cSVFormat13.getHeaderComments();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test378");
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
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withNullString("\r\n");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat24.withQuote(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test379");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder9 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder11.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str17 = cSVFormat16.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder18 = cSVFormat16.builder();
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder18.setDelimiter('#');
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder22.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat.Builder builder25 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder25.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder25.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode32 = null;
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder25.setQuoteMode(quoteMode32);
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder33.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat36 = builder35.build();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode37 = cSVFormat36.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat.Builder builder38 = builder24.setDuplicateHeaderMode(duplicateHeaderMode37);
        org.apache.commons.csv.CSVFormat.Builder builder39 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder39.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder39.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder39.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder47 = builder45.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder49 = builder45.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder51 = builder49.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder53 = builder49.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder54 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder56 = builder54.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder58 = builder56.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder60 = builder56.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder62 = builder56.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder63 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder65 = builder63.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder67 = builder63.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder69 = builder63.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder71 = builder63.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder72 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder74 = builder72.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder76 = builder72.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder78 = builder72.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode79 = null;
        org.apache.commons.csv.CSVFormat.Builder builder80 = builder72.setQuoteMode(quoteMode79);
        org.apache.commons.csv.CSVFormat.Builder builder82 = builder80.setRecordSeparator('a');
        java.lang.String[] strArray83 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder84 = builder80.setHeaderComments(strArray83);
        org.apache.commons.csv.CSVFormat.Builder builder85 = builder63.setHeaderComments(strArray83);
        org.apache.commons.csv.CSVFormat.Builder builder86 = builder62.setHeaderComments(strArray83);
        org.apache.commons.csv.CSVFormat.Builder builder87 = builder49.setHeader(strArray83);
        org.apache.commons.csv.CSVFormat.Builder builder88 = builder38.setHeaderComments(strArray83);
        org.apache.commons.csv.CSVFormat.Builder builder89 = builder15.setHeaderComments(strArray83);
        org.apache.commons.csv.CSVFormat.Builder builder90 = builder8.setHeaderComments((java.lang.Object[]) strArray83);
        org.apache.commons.csv.CSVFormat.Builder builder92 = builder90.setTrailingDelimiter(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "," + "'", str17, ",");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode37 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode37.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertArrayEquals(strArray83, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder92);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test380");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setMaxRows((long) (byte) 10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withTrim(false);
        java.lang.String[] strArray17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withNullString("\n");
        org.apache.commons.csv.QuoteMode quoteMode24 = cSVFormat20.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder8.setQuoteMode(quoteMode24);
        org.apache.commons.csv.CSVFormat.Builder builder26 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder26.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder26.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder30.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder30.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder35 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder35.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder35.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder35.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder41.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder41.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder46 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder46.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder48.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder52 = builder48.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder54 = builder48.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder55 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder57 = builder55.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder59 = builder55.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder61 = builder55.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder63 = builder55.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder64 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder66 = builder64.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder68 = builder64.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder70 = builder64.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode71 = null;
        org.apache.commons.csv.CSVFormat.Builder builder72 = builder64.setQuoteMode(quoteMode71);
        org.apache.commons.csv.CSVFormat.Builder builder74 = builder72.setRecordSeparator('a');
        java.lang.String[] strArray75 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder76 = builder72.setHeaderComments(strArray75);
        org.apache.commons.csv.CSVFormat.Builder builder77 = builder55.setHeaderComments(strArray75);
        org.apache.commons.csv.CSVFormat.Builder builder78 = builder54.setHeaderComments(strArray75);
        org.apache.commons.csv.CSVFormat.Builder builder79 = builder45.setHeader(strArray75);
        org.apache.commons.csv.CSVFormat.Builder builder80 = builder30.setHeaderComments(strArray75);
        org.apache.commons.csv.CSVFormat.Builder builder81 = builder25.setHeader(strArray75);
        org.apache.commons.csv.CSVFormat.Builder builder83 = builder25.setIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat.Builder builder85 = builder83.setAutoFlush(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + quoteMode24 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode24.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
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
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder85);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test381");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test382");
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
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat0.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withTrim();
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
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test383");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = builder10.build();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuote('a');
        boolean boolean14 = cSVFormat11.isQuoteCharacterSet();
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = cSVFormat11.parse(reader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test384");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        boolean boolean2 = cSVFormat1.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test385");
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
        java.lang.String str27 = cSVFormat26.getDelimiterString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "," + "'", str27, ",");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test386");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setDelimiter("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str8 = cSVFormat7.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode9 = cSVFormat7.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setDuplicateHeaderMode(duplicateHeaderMode9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode9 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode9.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test387");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat11 = builder10.get();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test388");
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
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat13.withIgnoreHeaderCase(false);
        boolean boolean28 = cSVFormat27.getIgnoreHeaderCase();
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
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test389");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setMaxRows((long) (byte) 10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withTrim(false);
        java.lang.String[] strArray17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withNullString("\n");
        org.apache.commons.csv.QuoteMode quoteMode24 = cSVFormat20.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder8.setQuoteMode(quoteMode24);
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder25.setAllowDuplicateHeaderNames(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + quoteMode24 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode24.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test390");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test391");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat.Builder builder6 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setAutoFlush(false);
        boolean boolean15 = cSVFormat2.equals((java.lang.Object) builder12);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder12.setTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test392");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        boolean boolean4 = cSVFormat3.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test393");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str7 = cSVFormat6.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder8 = cSVFormat6.builder();
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withNullString("hi!");
        java.lang.String[] strArray14 = cSVFormat3.getHeader();
        long long15 = cSVFormat3.getMaxRows();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test394");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAutoFlush(true);
        java.lang.Appendable appendable10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withTrim();
        boolean boolean14 = cSVFormat13.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str16 = cSVFormat15.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder17 = cSVFormat15.builder();
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setMaxRows((long) (short) 100);
        java.lang.String[] strArray27 = new java.lang.String[] { "", ",", "", ",", "," };
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder19.setHeaderComments(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat13.withHeader(strArray27);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat7.printRecord(appendable10, (java.lang.Object[]) strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(char)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
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
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test395");
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
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withTrim(true);
        java.lang.String str24 = cSVFormat21.getRecordSeparator();
        java.lang.String str25 = cSVFormat21.getDelimiterString();
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
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\r\n" + "'", str24, "\r\n");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "," + "'", str25, ",");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test396");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        java.sql.ResultSet resultSet3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withHeader(resultSet3);
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test397");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) '#');
        boolean boolean6 = cSVFormat3.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat.Builder builder7 = cSVFormat3.builder();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test398");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setMaxRows((long) (byte) 10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withTrim(false);
        java.lang.String[] strArray17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withNullString("\n");
        org.apache.commons.csv.QuoteMode quoteMode24 = cSVFormat20.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder8.setQuoteMode(quoteMode24);
        org.apache.commons.csv.CSVFormat.Builder builder26 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder26.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder26.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder30.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder30.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder35 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder35.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder35.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder35.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder41.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder41.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder46 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder46.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder48.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder52 = builder48.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder54 = builder48.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder55 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder57 = builder55.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder59 = builder55.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder61 = builder55.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder63 = builder55.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder64 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder66 = builder64.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder68 = builder64.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder70 = builder64.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode71 = null;
        org.apache.commons.csv.CSVFormat.Builder builder72 = builder64.setQuoteMode(quoteMode71);
        org.apache.commons.csv.CSVFormat.Builder builder74 = builder72.setRecordSeparator('a');
        java.lang.String[] strArray75 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder76 = builder72.setHeaderComments(strArray75);
        org.apache.commons.csv.CSVFormat.Builder builder77 = builder55.setHeaderComments(strArray75);
        org.apache.commons.csv.CSVFormat.Builder builder78 = builder54.setHeaderComments(strArray75);
        org.apache.commons.csv.CSVFormat.Builder builder79 = builder45.setHeader(strArray75);
        org.apache.commons.csv.CSVFormat.Builder builder80 = builder30.setHeaderComments(strArray75);
        org.apache.commons.csv.CSVFormat.Builder builder81 = builder25.setHeader(strArray75);
        org.apache.commons.csv.CSVFormat.Builder builder83 = builder81.setSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat.Builder builder85 = builder83.setAllowDuplicateHeaderNames(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + quoteMode24 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode24.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
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
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder85);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test399");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSystemRecordSeparator();
        java.lang.Character char4 = cSVFormat3.getEscapeCharacter();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(char4);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test400");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        java.lang.Character char2 = cSVFormat1.getEscapeCharacter();
        java.sql.ResultSet resultSet3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeader(resultSet3);
        boolean boolean5 = cSVFormat4.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape('a');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test401");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreEmptyLines();
        boolean boolean9 = cSVFormat7.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test402");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setAllowDuplicateHeaderNames(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test403");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = builder4.build();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder4.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder4.setMaxRows((long) 100);
        org.apache.commons.csv.CSVFormat cSVFormat12 = builder4.get();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test404");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test405");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char3 = cSVFormat0.getQuoteCharacter();
        boolean boolean4 = cSVFormat0.getAutoFlush();
        java.lang.String str5 = cSVFormat0.getNullString();
        java.lang.String str6 = cSVFormat0.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test406");
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
        boolean boolean14 = cSVFormat12.getIgnoreSurroundingSpaces();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test407");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test408");
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
        java.lang.Character char23 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat0.withNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator('a');
        boolean boolean28 = cSVFormat27.isQuoteCharacterSet();
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
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\"' + "'", char23 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test409");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter3 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat.Builder builder4 = cSVFormat0.builder();
        boolean boolean5 = cSVFormat0.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVPrinter3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test410");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test411");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder4.setQuote((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test412");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setDelimiter('#');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setIgnoreEmptyLines(false);
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder2.setHeader(resultSet9);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str14 = cSVFormat13.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode15 = cSVFormat13.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat27.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withAllowDuplicateHeaderNames(false);
        boolean boolean32 = cSVFormat29.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat.Builder builder37 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder37.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder37.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder37.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode44 = null;
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder37.setQuoteMode(quoteMode44);
        org.apache.commons.csv.CSVFormat.Builder builder47 = builder45.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder49 = builder47.setEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder51 = builder49.setEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        long long53 = cSVFormat52.getMaxRows();
        char char54 = cSVFormat52.getDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode55 = cSVFormat52.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder56 = builder51.setQuoteMode(quoteMode55);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat36.withQuoteMode(quoteMode55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat23.withQuoteMode(quoteMode55);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat18.withQuoteMode(quoteMode55);
        org.apache.commons.csv.CSVFormat.Builder builder60 = builder10.setQuoteMode(quoteMode55);
        org.apache.commons.csv.CSVFormat.Builder builder62 = builder10.setAllowDuplicateHeaderNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode15 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode15.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + char54 + "' != '" + ',' + "'", char54 == ',');
        org.junit.Assert.assertTrue("'" + quoteMode55 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode55.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test413");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat.Builder builder1 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator('a');
        java.lang.String str4 = cSVFormat3.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<a> SkipHeaderRecord:false" + "'", str4, "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<a> SkipHeaderRecord:false");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test414");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setAutoFlush(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setDelimiter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test415");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat0.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withAllowDuplicateHeaderNames(false);
        boolean boolean19 = cSVFormat16.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat.Builder builder24 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder24.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder24.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder24.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode31 = null;
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder24.setQuoteMode(quoteMode31);
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder32.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder34.setEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder38 = builder36.setEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        long long40 = cSVFormat39.getMaxRows();
        char char41 = cSVFormat39.getDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode42 = cSVFormat39.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder38.setQuoteMode(quoteMode42);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat23.withQuoteMode(quoteMode42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat10.withQuoteMode(quoteMode42);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat5.withQuoteMode(quoteMode42);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + ',' + "'", char41 == ',');
        org.junit.Assert.assertTrue("'" + quoteMode42 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode42.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test416");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test417");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str10 = cSVFormat9.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder11 = cSVFormat9.builder();
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setHeaderComments(objArray12);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder11.setDelimiter('#');
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder11.setIgnoreEmptyLines(false);
        java.sql.ResultSet resultSet18 = null;
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder11.setHeader(resultSet18);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str23 = cSVFormat22.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode24 = cSVFormat22.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat32.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat37.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withAllowDuplicateHeaderNames(false);
        boolean boolean41 = cSVFormat38.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat38.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat42.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat.Builder builder46 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder46.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder46.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder52 = builder46.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode53 = null;
        org.apache.commons.csv.CSVFormat.Builder builder54 = builder46.setQuoteMode(quoteMode53);
        org.apache.commons.csv.CSVFormat.Builder builder56 = builder54.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder58 = builder56.setEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder60 = builder58.setEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat61 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        long long62 = cSVFormat61.getMaxRows();
        char char63 = cSVFormat61.getDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode64 = cSVFormat61.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder65 = builder60.setQuoteMode(quoteMode64);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat45.withQuoteMode(quoteMode64);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat32.withQuoteMode(quoteMode64);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat27.withQuoteMode(quoteMode64);
        org.apache.commons.csv.CSVFormat.Builder builder69 = builder19.setQuoteMode(quoteMode64);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat3.withQuoteMode(quoteMode64);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "," + "'", str10, ",");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "," + "'", str23, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode24 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode24.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + char63 + "' != '" + ',' + "'", char63 == ',');
        org.junit.Assert.assertTrue("'" + quoteMode64 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode64.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(cSVFormat70);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test418");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSystemRecordSeparator();
        java.lang.String[] strArray4 = cSVFormat2.getHeaderComments();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test419");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test420");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = builder10.build();
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder10.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder10.setAutoFlush(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test421");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withDelimiter('4');
        org.apache.commons.csv.CSVFormat.Builder builder7 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder7.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder11.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder16 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder16.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder18.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str24 = cSVFormat23.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder25 = cSVFormat23.builder();
        java.lang.Object[] objArray26 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setHeaderComments(objArray26);
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder25.setDelimiter('#');
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder29.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat.Builder builder32 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder32.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder32.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder38 = builder32.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode39 = null;
        org.apache.commons.csv.CSVFormat.Builder builder40 = builder32.setQuoteMode(quoteMode39);
        org.apache.commons.csv.CSVFormat.Builder builder42 = builder40.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat43 = builder42.build();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode44 = cSVFormat43.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder31.setDuplicateHeaderMode(duplicateHeaderMode44);
        org.apache.commons.csv.CSVFormat.Builder builder46 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder46.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder46.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder52 = builder46.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder54 = builder52.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder56 = builder52.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder58 = builder56.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder60 = builder56.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder61 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder63 = builder61.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder65 = builder63.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder67 = builder63.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder69 = builder63.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder70 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder72 = builder70.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder74 = builder70.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder76 = builder70.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder78 = builder70.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder79 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder81 = builder79.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder83 = builder79.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder85 = builder79.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode86 = null;
        org.apache.commons.csv.CSVFormat.Builder builder87 = builder79.setQuoteMode(quoteMode86);
        org.apache.commons.csv.CSVFormat.Builder builder89 = builder87.setRecordSeparator('a');
        java.lang.String[] strArray90 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder91 = builder87.setHeaderComments(strArray90);
        org.apache.commons.csv.CSVFormat.Builder builder92 = builder70.setHeaderComments(strArray90);
        org.apache.commons.csv.CSVFormat.Builder builder93 = builder69.setHeaderComments(strArray90);
        org.apache.commons.csv.CSVFormat.Builder builder94 = builder56.setHeader(strArray90);
        org.apache.commons.csv.CSVFormat.Builder builder95 = builder45.setHeaderComments(strArray90);
        org.apache.commons.csv.CSVFormat.Builder builder96 = builder22.setHeaderComments(strArray90);
        org.apache.commons.csv.CSVFormat.Builder builder97 = builder15.setHeaderComments((java.lang.Object[]) strArray90);
        org.apache.commons.csv.CSVFormat cSVFormat98 = cSVFormat4.withHeaderComments((java.lang.Object[]) strArray90);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "," + "'", str24, ",");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode44 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode44.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNotNull(builder96);
        org.junit.Assert.assertNotNull(builder97);
        org.junit.Assert.assertNotNull(cSVFormat98);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test422");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withRecordSeparator(",");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test423");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat0.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withAllowDuplicateHeaderNames(false);
        boolean boolean19 = cSVFormat16.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat.Builder builder24 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder24.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder24.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder24.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode31 = null;
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder24.setQuoteMode(quoteMode31);
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder32.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder34.setEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder38 = builder36.setEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        long long40 = cSVFormat39.getMaxRows();
        char char41 = cSVFormat39.getDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode42 = cSVFormat39.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder38.setQuoteMode(quoteMode42);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat23.withQuoteMode(quoteMode42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat10.withQuoteMode(quoteMode42);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat5.withQuoteMode(quoteMode42);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withQuote('\"');
        org.apache.commons.csv.CSVPrinter cSVPrinter49 = cSVFormat48.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + ',' + "'", char41 == ',');
        org.junit.Assert.assertTrue("'" + quoteMode42 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode42.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVPrinter49);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test424");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode10 = cSVFormat8.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode10 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode10.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test425");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withDelimiter('a');
        boolean boolean17 = cSVFormat7.equals((java.lang.Object) 'a');
        boolean boolean18 = cSVFormat7.getAllowDuplicateHeaderNames();
        boolean boolean19 = cSVFormat7.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test426");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator(",");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test427");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat0.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test428");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withTrim(false);
        java.lang.String[] strArray15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        java.lang.String str17 = cSVFormat16.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withTrim();
        boolean boolean22 = cSVFormat21.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str24 = cSVFormat23.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder25 = cSVFormat23.builder();
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder27.setMaxRows((long) (short) 100);
        java.lang.String[] strArray35 = new java.lang.String[] { "", ",", "", ",", "," };
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder27.setHeaderComments(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat21.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat18.withHeaderComments((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder8.setHeaderComments(strArray35);
        org.junit.Assert.assertNotNull(builder0);
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
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "," + "'", str24, ",");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", ",", "", ",", "," });
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test429");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = builder4.build();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder4.setIgnoreHeaderCase(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setDelimiter("\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test430");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.sql.ResultSetMetaData resultSetMetaData1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSetMetaData1);
        boolean boolean3 = cSVFormat2.getTrailingData();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test431");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        boolean boolean5 = cSVFormat0.isEscapeCharacterSet();
        boolean boolean6 = cSVFormat0.getTrailingData();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test432");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withAllowDuplicateHeaderNames(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test433");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        long long2 = cSVFormat1.getMaxRows();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test434");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEscape('4');
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test435");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setCommentMarker('4');
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
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test436");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<??> EmptyLines:ignored SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test437");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder9 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder9.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder9.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder18 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder18.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder18.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode25 = null;
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder18.setQuoteMode(quoteMode25);
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder26.setRecordSeparator('a');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder26.setHeaderComments(strArray29);
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder9.setHeaderComments(strArray29);
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder8.setHeaderComments(strArray29);
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder8.setSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test438");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        long long1 = cSVFormat0.getMaxRows();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test439");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        long long16 = cSVFormat15.getMaxRows();
        char char17 = cSVFormat15.getDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode18 = cSVFormat15.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder14.setQuoteMode(quoteMode18);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder14.setNullString("\r\n");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + ',' + "'", char17 == ',');
        org.junit.Assert.assertTrue("'" + quoteMode18 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode18.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test440");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str7 = cSVFormat6.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder8 = cSVFormat6.builder();
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder14 = cSVFormat3.builder();
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setQuote((java.lang.Character) ',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test441");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char3 = cSVFormat0.getQuoteCharacter();
        boolean boolean4 = cSVFormat0.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder9 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder13.setTrailingData(true);
        boolean boolean20 = cSVFormat6.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test442");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        boolean boolean3 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test443");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        boolean boolean6 = cSVFormat0.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test444");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test445");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setMaxRows((long) (byte) 10);
        org.apache.commons.csv.CSVFormat.Builder builder13 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder13.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder19.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder23.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder23.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder28 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder28.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder30.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder30.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder30.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder37 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder37.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder37.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder37.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder37.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder46 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder46.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder46.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder52 = builder46.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode53 = null;
        org.apache.commons.csv.CSVFormat.Builder builder54 = builder46.setQuoteMode(quoteMode53);
        org.apache.commons.csv.CSVFormat.Builder builder56 = builder54.setRecordSeparator('a');
        java.lang.String[] strArray57 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder58 = builder54.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder59 = builder37.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder60 = builder36.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder61 = builder23.setHeader(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder62 = builder12.setHeader(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder64 = builder62.setCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat65 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str66 = cSVFormat65.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode67 = cSVFormat65.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat65.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat71 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str72 = cSVFormat71.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder73 = cSVFormat71.builder();
        java.lang.Object[] objArray74 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder75 = builder73.setHeaderComments(objArray74);
        org.apache.commons.csv.CSVFormat cSVFormat76 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat76.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat76.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat79.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat82 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.sql.ResultSetMetaData resultSetMetaData83 = null;
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat82.withHeader(resultSetMetaData83);
        java.lang.Object[] objArray85 = new java.lang.Object[] { (byte) 10, objArray74, cSVFormat79, cSVFormat84 };
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat65.withHeaderComments(objArray85);
        org.apache.commons.csv.CSVFormat.Builder builder87 = builder62.setHeaderComments(objArray85);
        org.apache.commons.csv.CSVFormat cSVFormat88 = builder87.build();
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
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "," + "'", str66, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode67 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode67.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "," + "'", str72, ",");
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertArrayEquals(objArray74, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNotNull(cSVFormat79);
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertNotNull(cSVFormat84);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[10, [], Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(cSVFormat88);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test446");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        java.lang.Character char2 = cSVFormat1.getEscapeCharacter();
        java.sql.ResultSet resultSet3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeader(resultSet3);
        boolean boolean5 = cSVFormat4.isEscapeCharacterSet();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode6 = cSVFormat4.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(duplicateHeaderMode6);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test447");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat8.printer();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreHeaderCase(true);
        boolean boolean12 = cSVFormat8.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder13 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder13.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder19.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder23.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder23.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder28 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder28.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder30.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder30.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder30.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder37 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder37.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder37.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder37.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder37.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder46 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder46.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder46.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder52 = builder46.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode53 = null;
        org.apache.commons.csv.CSVFormat.Builder builder54 = builder46.setQuoteMode(quoteMode53);
        org.apache.commons.csv.CSVFormat.Builder builder56 = builder54.setRecordSeparator('a');
        java.lang.String[] strArray57 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder58 = builder54.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder59 = builder37.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder60 = builder36.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder61 = builder23.setHeader(strArray57);
        java.lang.String str62 = cSVFormat8.format((java.lang.Object[]) strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder63 = builder0.setHeaderComments(strArray57);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVPrinter9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(builder63);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test448");
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
        org.apache.commons.csv.CSVFormat.Builder builder23 = cSVFormat0.builder();
        java.lang.Appendable appendable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter25 = cSVFormat0.print(appendable24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: appendable");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test449");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withAutoFlush(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test450");
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
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withAllowMissingColumnNames();
        java.io.File file19 = null;
        java.nio.charset.Charset charset20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter21 = cSVFormat17.print(file19, charset20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.toPath()\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test451");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = builder6.build();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder6.setDelimiter('\"');
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder6.setTrim(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test452");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withAutoFlush(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withCommentMarker(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test453");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker((java.lang.Character) 'a');
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
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test454");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char3 = cSVFormat0.getQuoteCharacter();
        boolean boolean4 = cSVFormat0.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.QuoteMode quoteMode9 = cSVFormat8.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrim();
        char char11 = cSVFormat10.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + quoteMode9 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode9.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ',' + "'", char11 == ',');
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test455");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withNullString("\n");
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat7.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        boolean boolean14 = cSVFormat7.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat7.withAutoFlush(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + quoteMode11 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode11.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test456");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat.Builder builder1 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test457");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setRecordSeparator("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder4.setRecordSeparator(',');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder4.setQuote(' ');
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setAllowDuplicateHeaderNames(false);
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
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test458");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str7 = cSVFormat6.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder8 = cSVFormat6.builder();
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withAllowMissingColumnNames(false);
        java.lang.String str16 = cSVFormat15.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test459");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        boolean boolean3 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat.Builder builder5 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder5.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder5.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder5.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode12 = null;
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder5.setQuoteMode(quoteMode12);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = builder15.build();
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder15.setAllowMissingColumnNames(false);
        boolean boolean19 = cSVFormat4.equals((java.lang.Object) false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test460");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withAllowDuplicateHeaderNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test461");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        boolean boolean12 = cSVFormat1.getSkipHeaderRecord();
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
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test462");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setRecordSeparator("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder4.setRecordSeparator(',');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder4.setQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str14 = cSVFormat13.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder15 = cSVFormat13.builder();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withTrim(false);
        org.apache.commons.csv.QuoteMode quoteMode18 = cSVFormat17.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder4.setQuoteMode(quoteMode18);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "," + "'", str14, ",");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + quoteMode18 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode18.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test463");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVPrinter4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test464");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAutoFlush(false);
        boolean boolean12 = cSVFormat9.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test465");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        boolean boolean2 = cSVFormat1.isCommentMarkerSet();
        boolean boolean3 = cSVFormat1.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowDuplicateHeaderNames(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test466");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withRecordSeparator('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test467");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char3 = cSVFormat0.getQuoteCharacter();
        boolean boolean4 = cSVFormat0.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test468");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowDuplicateHeaderNames(false);
        boolean boolean5 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) '4');
        boolean boolean11 = cSVFormat8.getIgnoreEmptyLines();
        boolean boolean12 = cSVFormat8.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test469");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        long long1 = cSVFormat0.getMaxRows();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter(',');
        boolean boolean4 = cSVFormat3.isEscapeCharacterSet();
        boolean boolean5 = cSVFormat3.isNullStringSet();
        boolean boolean6 = cSVFormat3.getLenientEof();
        java.lang.Character char7 = cSVFormat3.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(char7);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test470");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreEmptyLines();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withQuote((java.lang.Character) ',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test471");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        java.lang.String[] strArray9 = cSVFormat8.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test472");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setMaxRows((long) (byte) 10);
        org.apache.commons.csv.CSVFormat.Builder builder13 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder13.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder19.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder23.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder23.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder28 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder28.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder30.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder30.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder30.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder37 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder37.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder37.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder37.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder37.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder46 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder46.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder46.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder52 = builder46.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode53 = null;
        org.apache.commons.csv.CSVFormat.Builder builder54 = builder46.setQuoteMode(quoteMode53);
        org.apache.commons.csv.CSVFormat.Builder builder56 = builder54.setRecordSeparator('a');
        java.lang.String[] strArray57 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat.Builder builder58 = builder54.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder59 = builder37.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder60 = builder36.setHeaderComments(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder61 = builder23.setHeader(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder62 = builder12.setHeader(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder64 = builder62.setCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat65 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str66 = cSVFormat65.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode67 = cSVFormat65.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat65.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat71 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str72 = cSVFormat71.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder73 = cSVFormat71.builder();
        java.lang.Object[] objArray74 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder75 = builder73.setHeaderComments(objArray74);
        org.apache.commons.csv.CSVFormat cSVFormat76 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat76.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat76.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat79.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat82 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.sql.ResultSetMetaData resultSetMetaData83 = null;
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat82.withHeader(resultSetMetaData83);
        java.lang.Object[] objArray85 = new java.lang.Object[] { (byte) 10, objArray74, cSVFormat79, cSVFormat84 };
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat65.withHeaderComments(objArray85);
        org.apache.commons.csv.CSVFormat.Builder builder87 = builder62.setHeaderComments(objArray85);
        org.apache.commons.csv.CSVFormat.Builder builder89 = builder62.setRecordSeparator('a');
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
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "," + "'", str66, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode67 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode67.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "," + "'", str72, ",");
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertArrayEquals(objArray74, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNotNull(cSVFormat79);
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertNotNull(cSVFormat84);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[10, [], Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder89);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test473");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setLenientEof(true);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setDelimiter(",");
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder6.setIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test474");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str12 = cSVFormat11.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder13 = cSVFormat11.builder();
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setHeaderComments(objArray14);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder10.setHeaderComments(objArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withRecordSeparator('a');
        java.lang.String str20 = cSVFormat19.toString();
        boolean boolean21 = cSVFormat19.isCommentMarkerSet();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode22 = cSVFormat19.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder16.setDuplicateHeaderMode(duplicateHeaderMode22);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "," + "'", str12, ",");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false" + "'", str20, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode22 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode22.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test475");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withDelimiter('a');
        java.lang.Character char5 = cSVFormat4.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test476");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = builder10.build();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test477");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = builder10.build();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withEscape((java.lang.Character) 'a');
        java.io.Reader reader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = cSVFormat11.parse(reader16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: origin");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test478");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        boolean boolean9 = cSVFormat8.getIgnoreHeaderCase();
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat8.println(appendable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.Appendable.append(java.lang.CharSequence)\" because \"appendable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVPrinter4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test479");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder0.setCommentMarker(' ');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setLenientEof(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test480");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.CSVFormat.Builder builder2 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrim(false);
        java.lang.String[] strArray7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withAutoFlush(false);
        java.lang.String str15 = cSVFormat14.getRecordSeparator();
        boolean boolean16 = cSVFormat1.equals((java.lang.Object) cSVFormat14);
        boolean boolean17 = cSVFormat14.getTrim();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withQuote(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\r\n" + "'", str15, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test481");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = builder10.build();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuote('a');
        java.lang.Character char14 = cSVFormat13.getCommentMarker();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '#' + "'", char14 == '#');
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test482");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test483");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withTrailingDelimiter(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test484");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowDuplicateHeaderNames(false);
        boolean boolean5 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withSystemRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test485");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.sql.ResultSet resultSet6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSet6);
        java.lang.String str8 = cSVFormat7.getDelimiterString();
        java.lang.Character char9 = cSVFormat7.getEscapeCharacter();
        java.lang.String[] strArray10 = cSVFormat7.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test486");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        boolean boolean8 = cSVFormat6.equals((java.lang.Object) 10);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test487");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test488");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("\r\n");
        java.lang.String[] strArray11 = cSVFormat8.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withQuote((java.lang.Character) ' ');
        boolean boolean17 = cSVFormat13.getLenientEof();
        boolean boolean18 = cSVFormat13.isQuoteCharacterSet();
        boolean boolean19 = cSVFormat12.equals((java.lang.Object) cSVFormat13);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test489");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        long long1 = cSVFormat0.getMaxRows();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter(',');
        boolean boolean4 = cSVFormat3.isEscapeCharacterSet();
        boolean boolean5 = cSVFormat3.isNullStringSet();
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test490");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char3 = cSVFormat0.getQuoteCharacter();
        boolean boolean4 = cSVFormat0.getAutoFlush();
        java.lang.String str5 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test491");
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
        java.lang.Character char23 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat0.withNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat25.withDelimiter('a');
        java.sql.ResultSetMetaData resultSetMetaData30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withHeader(resultSetMetaData30);
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
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\"' + "'", char23 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test492");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSystemRecordSeparator();
        java.lang.String str5 = cSVFormat4.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test493");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withDelimiter('a');
        boolean boolean17 = cSVFormat7.equals((java.lang.Object) 'a');
        boolean boolean18 = cSVFormat7.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test494");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        boolean boolean8 = cSVFormat6.equals((java.lang.Object) 10);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test495");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withAllowMissingColumnNames();
        long long11 = cSVFormat10.getMaxRows();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test496");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = builder6.build();
        long long8 = cSVFormat7.getMaxRows();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test497");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuote('a');
        boolean boolean11 = cSVFormat10.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVPrinter4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test498");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        java.lang.Object[] objArray3 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setIgnoreSurroundingSpaces(true);
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
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test499");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat.Builder builder7 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder7.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder7.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode14 = null;
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder7.setQuoteMode(quoteMode14);
        java.lang.String[] strArray20 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false", "hi!", ",", "\n" };
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder15.setHeaderComments(strArray20);
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder6.setHeader(strArray20);
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder6.setQuote('#');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false", "hi!", ",", "\n" });
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_004_Regression0.test500");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        java.sql.ResultSet resultSet3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSet3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setTrim(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setDelimiter('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder6.setTrim(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }
}

