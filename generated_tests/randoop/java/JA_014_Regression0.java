import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_014_Regression0 {

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
            System.out.format("%n%s%n", "JA_014_Regression0.test001");
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
            System.out.format("%n%s%n", "JA_014_Regression0.test002");
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
            System.out.format("%n%s%n", "JA_014_Regression0.test003");
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
            System.out.format("%n%s%n", "JA_014_Regression0.test004");
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
            System.out.format("%n%s%n", "JA_014_Regression0.test005");
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
            System.out.format("%n%s%n", "JA_014_Regression0.test006");
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
            System.out.format("%n%s%n", "JA_014_Regression0.test007");
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
            System.out.format("%n%s%n", "JA_014_Regression0.test008");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Oracle;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Oracle + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Oracle));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test009");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Excel + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Excel));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test010");
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test011");
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test012");
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
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test013");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MySQL + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MySQL));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test014");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.TDF;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.TDF + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.TDF));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test015");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test016");
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test017");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test018");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        long long1 = cSVFormat0.getMaxRows();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test019");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Default + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Default));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test020");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat8.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test021");
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test022");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test023");
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test024");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<,> QuoteChar=<\"> RecordSeparator=<??> SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test025");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test026");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test027");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnload;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnload + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnload));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test028");
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
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test029");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        java.lang.String str3 = cSVFormat0.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test030");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test031");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        boolean boolean5 = cSVFormat0.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test032");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n" + "'", str1, "\n");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test033");
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test034");
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
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test035");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat.Builder builder6 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test036");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char3 = cSVFormat0.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test037");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test038");
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test039");
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
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test040");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test041");
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test042");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test043");
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
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test044");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf(",");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.,");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test045");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_TSV;
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test046");
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
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test047");
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
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test048");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setRecordSeparator('a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test049");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test050");
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
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test051");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test052");
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
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test053");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test054");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        java.sql.ResultSet resultSet4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withHeader(resultSet4);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test055");
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
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test056");
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
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test057");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setNullString(",");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test058");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setCommentMarker((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test059");
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test060");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('4');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test061");
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test062");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setDelimiter(',');
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder0.setAllowDuplicateHeaderNames(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test063");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withNullString("\n");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withSkipHeaderRecord(true);
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test064");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode2 = cSVFormat0.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode2 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode2.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test065");
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
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test066");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = cSVFormat0.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(quoteMode1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test067");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setRecordSeparator('#');
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setRecordSeparator("\r\n");
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test068");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test069");
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
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test070");
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test071");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowDuplicateHeaderNames(false);
        boolean boolean5 = cSVFormat2.getIgnoreEmptyLines();
        java.lang.String str6 = cSVFormat2.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test072");
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
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test073");
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
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test074");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        boolean boolean3 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test075");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setMaxRows((long) (byte) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test076");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str1 = cSVFormat0.toString();
        java.lang.String str2 = cSVFormat0.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str1, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test077");
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
        org.apache.commons.csv.QuoteMode quoteMode22 = cSVFormat0.getQuoteMode();
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
        org.junit.Assert.assertTrue("'" + quoteMode22 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode22.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test078");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAutoFlush(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        java.lang.String str9 = cSVFormat8.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test080");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreEmptyLines();
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test081");
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
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test082");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test083");
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
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test084");
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
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test085");
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
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test086");
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
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test087");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setRecordSeparator("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setCommentMarker('4');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setIgnoreHeaderCase(false);
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
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test088");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        java.lang.String str3 = cSVFormat2.toString();
        boolean boolean4 = cSVFormat2.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false" + "'", str3, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setCommentMarker((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test090");
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
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test091");
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
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test092");
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
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test093");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        java.lang.String[] strArray5 = cSVFormat0.getHeader();
        boolean boolean6 = cSVFormat0.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test094");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withSystemRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test095");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setLenientEof(true);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setDelimiter(",");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test096");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setRecordSeparator("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test097");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        long long1 = cSVFormat0.getMaxRows();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter(',');
        boolean boolean4 = cSVFormat3.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test098");
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
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test099");
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
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test100");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setAutoFlush(true);
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
        org.apache.commons.csv.CSVFormat.Builder builder44 = builder10.setHeader(strArray40);
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
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test101");
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
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test102");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test103");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test104");
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
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test105");
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
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test106");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowDuplicateHeaderNames(false);
        boolean boolean5 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test107");
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
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test108");
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
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test109");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.sql.ResultSetMetaData resultSetMetaData1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSetMetaData1);
        boolean boolean3 = cSVFormat0.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test110");
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
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test111");
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
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test112");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test113");
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
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test114");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        boolean boolean2 = cSVFormat1.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test115");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withEscape('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test116");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\"' + "'", char1 == '\"');
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test117");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreEmptyLines();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode12 = cSVFormat8.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode12 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode12.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test118");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuote('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVPrinter4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test119");
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
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test120");
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
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test121");
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
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test122");
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
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test123");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat.Builder builder1 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test124");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.Character char6 = cSVFormat2.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test125");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withTrailingDelimiter(true);
        boolean boolean10 = cSVFormat9.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test126");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(false);
        java.lang.String str6 = cSVFormat3.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test127");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.sql.ResultSet resultSet6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSet6);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test128");
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
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test129");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setDelimiter("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test130");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.ORACLE;
        boolean boolean1 = cSVFormat0.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test131");
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
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test132");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.CSVFormat.Builder builder2 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat1);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setTrailingData(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test133");
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
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test134");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setRecordSeparator('#');
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder8.setQuote((java.lang.Character) ' ');
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
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test135");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        java.sql.ResultSet resultSet3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSet3);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test136");
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
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test137");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test138");
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
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test139");
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
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test140");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test141");
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
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test142");
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
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test143");
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
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test144");
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
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test145");
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
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test146");
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
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test147");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        long long1 = cSVFormat0.getMaxRows();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test148");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withTrailingDelimiter(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test149");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        boolean boolean2 = cSVFormat0.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test150");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char3 = cSVFormat0.getQuoteCharacter();
        boolean boolean4 = cSVFormat0.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withSystemRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test151");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter3 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat.Builder builder4 = cSVFormat0.builder();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVPrinter3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test152");
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
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test153");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setRecordSeparator("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder4.setRecordSeparator(',');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder4.setQuote(' ');
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
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test154");
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
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test155");
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
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test156");
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test157");
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
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test158");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setTrailingDelimiter(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test159");
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
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test160");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withDelimiter('a');
        boolean boolean5 = cSVFormat4.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test161");
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
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test162");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat.Builder builder1 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder3 = builder1.setNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder5 = builder1.setAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test163");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setAllowDuplicateHeaderNames(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test164");
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
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test165");
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
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test166");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSystemRecordSeparator();
        boolean boolean4 = cSVFormat1.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test167");
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
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test168");
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
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test169");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setRecordSeparator(' ');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test170");
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
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test171");
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
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test172");
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
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test173");
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
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test174");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = cSVFormat1.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test175");
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
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test176");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("\r\n");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test177");
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
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test178");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat.Builder builder8 = cSVFormat7.builder();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test179");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test180");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        boolean boolean6 = cSVFormat1.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test181");
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
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test182");
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
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test183");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrim(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setTrailingDelimiter(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test184");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        boolean boolean5 = cSVFormat4.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test185");
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
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test186");
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
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test187");
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
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test188");
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
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test189");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test190");
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
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test191");
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
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test192");
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
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test193");
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
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test194");
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
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test195");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase(true);
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        java.lang.String str8 = cSVFormat3.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVPrinter4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str8, "Delimiter=<,> Escape=<\"> QuoteChar=< > QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test196");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVPrinter cSVPrinter2 = cSVFormat1.printer();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVPrinter2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test197");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        boolean boolean8 = cSVFormat6.equals((java.lang.Object) 10);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test198");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean4 = cSVFormat0.getLenientEof();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat6.getSkipHeaderRecord();
        java.lang.String str10 = cSVFormat6.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\r\n" + "'", str10, "\r\n");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test199");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setDelimiter("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setHeader(resultSetMetaData7);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test200");
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
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test201");
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
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test202");
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
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test203");
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
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test204");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test205");
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
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test206");
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
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test207");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        boolean boolean2 = cSVFormat1.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder5 = cSVFormat3.builder();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder5.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setMaxRows((long) (short) 100);
        java.lang.String[] strArray15 = new java.lang.String[] { "", ",", "", ",", "," };
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder7.setHeaderComments(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat1.withHeader(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "," + "'", str4, ",");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", ",", "", ",", "," });
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test208");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder15 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder17.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder17.setAllowMissingColumnNames(true);
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
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder10.setHeader(strArray44);
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
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test209");
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
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test210");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test211");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat.Builder builder1 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withDelimiter('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test212");
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
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test213");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingData(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker('#');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuoteMode(quoteMode7);
        java.lang.String[] strArray13 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false", "hi!", ",", "\n" };
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder8.setHeaderComments(strArray13);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false", "hi!", ",", "\n" });
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test214");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(resultSetMetaData6);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test215");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char3 = cSVFormat0.getQuoteCharacter();
        boolean boolean4 = cSVFormat0.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.QuoteMode quoteMode9 = cSVFormat8.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\"' + "'", char3 == '\"');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + quoteMode9 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode9.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test216");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrim(false);
        java.lang.String[] strArray4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(strArray4);
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAutoFlush(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test217");
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
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test218");
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
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test219");
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
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test220");
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
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test221");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test222");
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
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test223");
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
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test224");
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
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test225");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withRecordSeparator('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test226");
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
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test227");
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
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test228");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
        boolean boolean2 = cSVFormat1.isCommentMarkerSet();
        boolean boolean3 = cSVFormat1.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test229");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat.Builder builder2 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setRecordSeparator("");
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setHeader(resultSet9);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setAllowMissingColumnNames(false);
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
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test230");
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
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test231");
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
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test232");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat.Builder builder1 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder3 = builder1.setRecordSeparator('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_014_Regression0.test233");
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
}

