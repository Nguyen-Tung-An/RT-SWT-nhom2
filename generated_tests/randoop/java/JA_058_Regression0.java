import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_058_Regression0 {

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
            System.out.format("%n%s%n", "JA_058_Regression0.test001");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test002");
        java.lang.String str0 = org.jsoup.helper.HttpConnection.MULTIPART_FORM_DATA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "multipart/form-data" + "'", str0, "multipart/form-data");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test004");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal5 = keyVal2.contentType("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: String must not be empty");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test005");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        java.lang.String str4 = keyVal2.key();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test006");
        java.lang.String str0 = org.jsoup.helper.HttpConnection.FORM_URL_ENCODED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/x-www-form-urlencoded" + "'", str0, "application/x-www-form-urlencoded");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test007");
        java.lang.String str0 = org.jsoup.helper.HttpConnection.CONTENT_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Content-Type" + "'", str0, "Content-Type");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test008");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal4 = keyVal2.contentType("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: String must not be empty");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test009");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection2 = httpConnection0.newRequest("Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Content-Type', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test010");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection4 = httpConnection0.data(strMap3);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test011");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection2 = httpConnection0.data(strMap1);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test012");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection4 = httpConnection0.url("Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Content-Type', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test013");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection4 = httpConnection0.postDataCharset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test014");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection4 = httpConnection0.cookies(strMap3);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test015");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response3 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test016");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test017");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test018");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Content-Type', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test019");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        java.net.URL uRL3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection4 = connection2.newRequest(uRL3);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test020");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test021");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test022");
        java.lang.String str0 = org.jsoup.helper.HttpConnection.CONTENT_ENCODING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Content-Encoding" + "'", str0, "Content-Encoding");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test023");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test024");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.postDataCharset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test025");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect(uRL0);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test026");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection6 = connection4.newRequest(uRL5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test027");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "multipart/form-data" + "'", str3, "multipart/form-data");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test028");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test029");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Connection connection9 = httpConnection0.userAgent("hi!=");
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.method(method10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test030");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test031");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test032");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.postDataCharset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test033");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.timeout((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Timeout milliseconds must be 0 (infinite) or greater");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test034");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        java.lang.Class<?> wildcardClass11 = httpConnection0.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test035");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test036");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test037");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test038");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Connection connection9 = httpConnection0.userAgent("hi!=");
        org.jsoup.Connection connection12 = httpConnection0.header("Content-Encoding", "multipart/form-data");
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.data("Content-Type", "multipart/form-data", inputStream15, "");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: String must not be empty");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test039");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.timeout(1);
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection6 = httpConnection0.newRequest(uRL5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test040");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.lang.Class<?> wildcardClass5 = keyVal2.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test041");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection6 = connection4.newRequest("hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!=', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test042");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.newRequest("application/x-www-form-urlencoded=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'application/x-www-form-urlencoded=multipart/form-data', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test043");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'multipart/form-data', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test044");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        org.jsoup.Connection connection12 = httpConnection0.sslSocketFactory(sSLSocketFactory11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = httpConnection0.postDataCharset("hi!=");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!=");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test045");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslContext(sSLContext5);
        org.jsoup.Connection connection8 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.method(method9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test046");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = httpConnection0.url(uRL13);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test047");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("application/x-www-form-urlencoded=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'application/x-www-form-urlencoded=multipart/form-data', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test048");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection6 = httpConnection0.cookies(strMap5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test049");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = connection9.newRequest(uRL10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test050");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test051");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test052");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.newRequest("application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'application/x-www-form-urlencoded', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test053");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection6 = httpConnection0.maxBodySize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: maxSize must be 0 (unlimited) or larger");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test054");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.userAgent("");
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection9.proxy(proxy12);
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection9.data("multipart/form-data");
        org.jsoup.Connection connection17 = httpConnection9.maxBodySize((int) '#');
        org.jsoup.Connection connection19 = httpConnection9.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress20 = null;
        org.jsoup.Connection connection21 = httpConnection9.onResponseProgress(responseProgress20);
        org.jsoup.Connection.Request request22 = httpConnection9.request();
        org.jsoup.Connection connection23 = httpConnection0.request(request22);
        org.jsoup.parser.Parser parser24 = null;
        org.jsoup.Connection connection25 = httpConnection0.parser(parser24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection27 = httpConnection0.maxBodySize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: maxSize must be 0 (unlimited) or larger");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test055");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("hi!");
        org.jsoup.Connection.Request request7 = httpConnection0.request();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(request7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test056");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Type");
        java.lang.Class<?> wildcardClass5 = keyVal2.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test057");
        java.lang.String str0 = org.jsoup.helper.HttpConnection.DEFAULT_UA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36" + "'", str0, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test058");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.Connection.KeyVal keyVal7 = keyVal5.contentType("multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test059");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslContext(sSLContext5);
        org.jsoup.Connection connection8 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response9 = null;
        org.jsoup.Connection connection10 = httpConnection0.response(response9);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = connection10.newRequest(uRL11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test060");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "Content-Type=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test061");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = httpConnection0.url("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test062");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection5 = httpConnection0.cookie("Content-Type", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext7 = null;
        org.jsoup.Connection connection8 = httpConnection6.sslContext(sSLContext7);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.userAgent("");
        org.jsoup.Connection connection13 = httpConnection9.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection9.data("hi!");
        org.jsoup.Connection.Request request16 = httpConnection9.request();
        org.jsoup.Connection connection17 = httpConnection6.request(request16);
        org.jsoup.Connection connection18 = httpConnection0.request(request16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection20 = httpConnection0.postDataCharset("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Content-Encoding");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test063");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        java.lang.Class<?> wildcardClass7 = connection6.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test064");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("multipart/form-data=Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'multipart/form-data=Content-Type', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test065");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        org.jsoup.Connection.Request request13 = httpConnection0.request();
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress14 = null;
        org.jsoup.Connection connection15 = httpConnection0.onResponseProgress(responseProgress14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.data(strMap16);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test066");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection2 = httpConnection0.newRequest("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'url' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test067");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = connection14.newRequest("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test068");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection6 = httpConnection0.cookies(strMap5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test069");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = httpConnection0.data("", "hi!=", inputStream12, "application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test070");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection8 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection connection11 = httpConnection0.cookie("application/x-www-form-urlencoded=multipart/form-data", "hi!=");
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.url(uRL12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test071");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.jsoup.Connection connection11 = httpConnection0.data(strArray10);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = connection11.newRequest(uRL12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test072");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.net.CookieStore cookieStore10 = httpConnection0.cookieStore();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = httpConnection0.headers(strMap11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(cookieStore10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test073");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslContext(sSLContext5);
        org.jsoup.Connection connection8 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test074");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext8 = null;
        org.jsoup.Connection connection9 = httpConnection7.sslContext(sSLContext8);
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection12 = httpConnection10.userAgent("");
        org.jsoup.Connection connection14 = httpConnection10.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal16 = httpConnection10.data("hi!");
        org.jsoup.Connection.Request request17 = httpConnection10.request();
        org.jsoup.Connection connection18 = httpConnection7.request(request17);
        org.jsoup.Connection connection19 = httpConnection0.request(request17);
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection21 = httpConnection0.method(method20);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNull(keyVal16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test075");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection5 = httpConnection3.userAgent("");
        org.jsoup.Connection connection7 = httpConnection3.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal9 = httpConnection3.data("hi!");
        org.jsoup.Connection.Request request10 = httpConnection3.request();
        org.jsoup.Connection connection11 = httpConnection0.request(request10);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.newRequest(uRL12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNull(keyVal9);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test076");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslContext(sSLContext5);
        org.jsoup.Connection connection8 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection connection11 = httpConnection0.proxy("", (int) (byte) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.data(strMap12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test077");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Type");
        org.jsoup.Connection.KeyVal keyVal7 = keyVal5.contentType("application/x-www-form-urlencoded");
        java.lang.String str8 = keyVal5.toString();
        org.jsoup.Connection.KeyVal keyVal10 = keyVal5.contentType("multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Type=" + "'", str8, "Content-Type=");
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test078");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.method(method7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test079");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection6 = httpConnection0.data(strMap5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test080");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection5 = httpConnection0.cookie("Content-Type", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext7 = null;
        org.jsoup.Connection connection8 = httpConnection6.sslContext(sSLContext7);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.userAgent("");
        org.jsoup.Connection connection13 = httpConnection9.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection9.data("hi!");
        org.jsoup.Connection.Request request16 = httpConnection9.request();
        org.jsoup.Connection connection17 = httpConnection6.request(request16);
        org.jsoup.Connection connection18 = httpConnection0.request(request16);
        org.jsoup.parser.Parser parser19 = null;
        org.jsoup.Connection connection20 = httpConnection0.parser(parser19);
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection22 = httpConnection0.method(method21);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test081");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        java.lang.String str7 = keyVal6.key();
        java.io.InputStream inputStream8 = keyVal6.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=" + "'", str7, "hi!=");
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test082");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Connection connection11 = httpConnection0.newRequest();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.cookies(strMap12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test083");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test084");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = httpConnection0.url("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test085");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        org.jsoup.Connection.Request request13 = httpConnection0.request();
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress14 = null;
        org.jsoup.Connection connection15 = httpConnection0.onResponseProgress(responseProgress14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.url("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Content-Encoding', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test086");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.net.URL uRL3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection4 = httpConnection0.url(uRL3);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test087");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.followRedirects(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test088");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator10 = null;
        org.jsoup.Connection connection11 = httpConnection0.auth(requestAuthenticator10);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.cookies(strMap12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test089");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection6 = httpConnection0.url("application/x-www-form-urlencoded=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'application/x-www-form-urlencoded=multipart/form-data', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test090");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("multipart/form-data=multipart/form-data");
        java.lang.Class<?> wildcardClass9 = keyVal6.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test091");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test092");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test093");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        org.jsoup.Connection connection15 = httpConnection11.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal17 = httpConnection11.data("hi!");
        org.jsoup.Connection.Request request18 = httpConnection11.request();
        org.jsoup.Connection connection19 = httpConnection0.request(request18);
        java.io.InputStream inputStream22 = null;
        org.jsoup.Connection connection23 = httpConnection0.data("application/x-www-form-urlencoded", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection25 = httpConnection0.maxBodySize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: maxSize must be 0 (unlimited) or larger");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(keyVal17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test094");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.userAgent("");
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection9.proxy(proxy12);
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection9.data("multipart/form-data");
        org.jsoup.Connection connection17 = httpConnection9.maxBodySize((int) '#');
        org.jsoup.Connection connection19 = httpConnection9.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress20 = null;
        org.jsoup.Connection connection21 = httpConnection9.onResponseProgress(responseProgress20);
        org.jsoup.Connection.Request request22 = httpConnection9.request();
        org.jsoup.Connection connection23 = httpConnection0.request(request22);
        org.jsoup.parser.Parser parser24 = null;
        org.jsoup.Connection connection25 = httpConnection0.parser(parser24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection26 = httpConnection0.newRequest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.parser.Parser.newInstance()\" because \"copy.parser\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test095");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "Content-Encoding");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test096");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection9 = httpConnection0.data(strMap8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test097");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test098");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator10 = null;
        org.jsoup.Connection connection11 = httpConnection0.auth(requestAuthenticator10);
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection0.proxy(proxy12);
        org.jsoup.Connection connection15 = httpConnection0.userAgent("application/x-www-form-urlencoded=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test099");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test100");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.requestBodyStream(inputStream13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test101");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection9 = connection7.newRequest("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'url' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test102");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection connection8 = httpConnection0.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.method(method9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test103");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        java.io.InputStream inputStream4 = keyVal2.inputStream();
        boolean boolean5 = keyVal2.hasInputStream();
        org.jsoup.Connection.KeyVal keyVal7 = keyVal2.contentType("Content-Type=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test104");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext8 = null;
        org.jsoup.Connection connection9 = httpConnection7.sslContext(sSLContext8);
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection12 = httpConnection10.userAgent("");
        org.jsoup.Connection connection14 = httpConnection10.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal16 = httpConnection10.data("hi!");
        org.jsoup.Connection.Request request17 = httpConnection10.request();
        org.jsoup.Connection connection18 = httpConnection7.request(request17);
        org.jsoup.Connection connection19 = httpConnection0.request(request17);
        org.jsoup.Connection connection22 = httpConnection0.proxy("multipart/form-data", 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection24 = connection22.newRequest("hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!=', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNull(keyVal16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection22);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test105");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslContext(sSLContext5);
        org.jsoup.Connection connection8 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress9 = null;
        org.jsoup.Connection connection10 = httpConnection0.onResponseProgress(responseProgress9);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test106");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test107");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.timeout(1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test108");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data=Content-Type", "");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test109");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.timeout(1);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection6 = httpConnection0.data(strMap5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test110");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        org.jsoup.Connection.Request request13 = httpConnection0.request();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.cookie("", "multipart/form-data");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'name' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test111");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Type");
        java.lang.String str5 = keyVal4.toString();
        java.lang.String str6 = keyVal4.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "multipart/form-data=Content-Type" + "'", str5, "multipart/form-data=Content-Type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Type" + "'", str6, "Content-Type");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test112");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator10 = null;
        org.jsoup.Connection connection11 = httpConnection0.auth(requestAuthenticator10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.postDataCharset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test113");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.cookies(strMap9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test114");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test115");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection19 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!");
        java.io.InputStream inputStream22 = null;
        org.jsoup.Connection connection24 = httpConnection0.data("application/x-www-form-urlencoded=multipart/form-data", "Content-Type=", inputStream22, "multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection27 = httpConnection0.proxy("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection24);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test116");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection.KeyVal keyVal11 = httpConnection0.data("Content-Type");
        org.jsoup.Connection connection13 = httpConnection0.requestBody("Content-Encoding");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNull(keyVal11);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test117");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("hi!");
        org.jsoup.Connection.Request request7 = httpConnection0.request();
        org.jsoup.helper.RequestAuthenticator requestAuthenticator8 = null;
        org.jsoup.Connection connection9 = httpConnection0.auth(requestAuthenticator8);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test118");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.postDataCharset("multipart/form-data=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: multipart/form-data=multipart/form-data");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test119");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.Connection connection12 = httpConnection0.requestBodyStream(inputStream11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection15 = httpConnection0.proxy("Content-Type", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test120");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test121");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("application/x-www-form-urlencoded=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal8 = keyVal2.contentType("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: String must not be empty");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test122");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        org.jsoup.Connection connection15 = httpConnection11.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal17 = httpConnection11.data("hi!");
        org.jsoup.Connection.Request request18 = httpConnection11.request();
        org.jsoup.Connection connection19 = httpConnection0.request(request18);
        org.jsoup.Connection connection21 = httpConnection0.maxBodySize(1);
        java.io.InputStream inputStream22 = null;
        org.jsoup.Connection connection23 = httpConnection0.requestBodyStream(inputStream22);
        org.jsoup.Connection.Method method24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection25 = httpConnection0.method(method24);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(keyVal17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test123");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator10 = null;
        org.jsoup.Connection connection11 = httpConnection0.auth(requestAuthenticator10);
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection0.proxy(proxy12);
        javax.net.ssl.SSLContext sSLContext14 = null;
        org.jsoup.Connection connection15 = httpConnection0.sslContext(sSLContext14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.headers(strMap16);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test124");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("multipart/form-data=multipart/form-data");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test125");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.URL uRL3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection4 = httpConnection0.url(uRL3);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test126");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        java.lang.Class<?> wildcardClass7 = httpConnection0.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test127");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.helper.RequestAuthenticator requestAuthenticator11 = null;
        org.jsoup.Connection connection12 = httpConnection0.auth(requestAuthenticator11);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator13 = null;
        org.jsoup.Connection connection14 = httpConnection0.auth(requestAuthenticator13);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test128");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext11 = null;
        org.jsoup.Connection connection12 = httpConnection10.sslContext(sSLContext11);
        org.jsoup.helper.HttpConnection httpConnection13 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection15 = httpConnection13.userAgent("");
        org.jsoup.Connection connection17 = httpConnection13.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal19 = httpConnection13.data("hi!");
        org.jsoup.Connection.Request request20 = httpConnection13.request();
        org.jsoup.Connection connection21 = httpConnection10.request(request20);
        org.jsoup.Connection connection22 = httpConnection0.request(request20);
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext24 = null;
        org.jsoup.Connection connection25 = httpConnection23.sslContext(sSLContext24);
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection28 = httpConnection26.userAgent("");
        org.jsoup.Connection connection30 = httpConnection26.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal32 = httpConnection26.data("hi!");
        org.jsoup.Connection.Request request33 = httpConnection26.request();
        org.jsoup.Connection connection34 = httpConnection23.request(request33);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory35 = null;
        org.jsoup.Connection connection36 = httpConnection23.sslSocketFactory(sSLSocketFactory35);
        org.jsoup.helper.HttpConnection httpConnection37 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection39 = httpConnection37.followRedirects(true);
        java.io.InputStream inputStream42 = null;
        org.jsoup.Connection connection44 = httpConnection37.data("application/x-www-form-urlencoded", "Content-Type", inputStream42, "multipart/form-data");
        java.net.Proxy proxy45 = null;
        org.jsoup.Connection connection46 = httpConnection37.proxy(proxy45);
        java.net.CookieStore cookieStore47 = httpConnection37.cookieStore();
        org.jsoup.Connection connection48 = httpConnection23.cookieStore(cookieStore47);
        org.jsoup.Connection connection49 = httpConnection0.cookieStore(cookieStore47);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document50 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNull(keyVal19);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNull(keyVal32);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(cookieStore47);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection49);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test129");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection6 = connection4.newRequest(uRL5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test130");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        org.jsoup.Connection connection14 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection16 = httpConnection0.referrer("hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection19 = httpConnection0.cookie("", "multipart/form-data=Content-Type");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'name' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test131");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        org.jsoup.Connection connection15 = httpConnection11.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal17 = httpConnection11.data("hi!");
        org.jsoup.Connection.Request request18 = httpConnection11.request();
        org.jsoup.Connection connection19 = httpConnection0.request(request18);
        org.jsoup.Connection connection22 = httpConnection0.cookie("multipart/form-data=Content-Type", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(keyVal17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection22);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test132");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test133");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection5 = httpConnection0.cookie("Content-Type", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext7 = null;
        org.jsoup.Connection connection8 = httpConnection6.sslContext(sSLContext7);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.userAgent("");
        org.jsoup.Connection connection13 = httpConnection9.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection9.data("hi!");
        org.jsoup.Connection.Request request16 = httpConnection9.request();
        org.jsoup.Connection connection17 = httpConnection6.request(request16);
        org.jsoup.Connection connection18 = httpConnection0.request(request16);
        org.jsoup.parser.Parser parser19 = null;
        org.jsoup.Connection connection20 = httpConnection0.parser(parser19);
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection22 = httpConnection0.newRequest(uRL21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.parser.Parser.newInstance()\" because \"copy.parser\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test134");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection19 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!");
        org.jsoup.Connection connection21 = httpConnection0.maxBodySize((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection23 = httpConnection0.url("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'url' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test135");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.headers(strMap10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test136");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection6 = httpConnection0.userAgent("Content-Type");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test137");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Connection connection9 = httpConnection0.userAgent("hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test138");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test139");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.referrer("application/x-www-form-urlencoded");
        java.lang.String[] strArray15 = new java.lang.String[] { "Content-Type=", "hi!=", "application/x-www-form-urlencoded=multipart/form-data" };
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.data(strArray15);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Must supply an even number of key value pairs");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "Content-Type=", "hi!=", "application/x-www-form-urlencoded=multipart/form-data" });
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test140");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "application/x-www-form-urlencoded", inputStream2);
        java.lang.String str4 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Encoding" + "'", str4, "Content-Encoding");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test141");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test142");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Type");
        java.io.InputStream inputStream7 = keyVal2.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test143");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = connection8.newRequest("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'url' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test144");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection.KeyVal keyVal11 = httpConnection0.data("Content-Type");
        org.jsoup.Connection connection13 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream16 = null;
        org.jsoup.Connection connection17 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!=", inputStream16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection19 = httpConnection0.postDataCharset("multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: multipart/form-data");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNull(keyVal11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test145");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        java.net.CookieStore cookieStore13 = httpConnection0.cookieStore();
        java.lang.Class<?> wildcardClass14 = httpConnection0.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(cookieStore13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test146");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection6 = httpConnection0.postDataCharset("multipart/form-data=Content-Type");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: multipart/form-data=Content-Type");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test147");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        org.jsoup.Connection connection14 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection16 = httpConnection0.referrer("hi!=");
        java.io.InputStream inputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection21 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "", inputStream19, "");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: String must not be empty");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test148");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Type");
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.inputStream(inputStream5);
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("Content-Type=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test149");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.method(method9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test150");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection8 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection connection11 = httpConnection0.cookie("application/x-www-form-urlencoded=multipart/form-data", "hi!=");
        org.jsoup.Connection connection13 = httpConnection0.timeout((int) (byte) 10);
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection15 = httpConnection0.url(uRL14);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test151");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        org.jsoup.Connection connection15 = httpConnection11.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal17 = httpConnection11.data("hi!");
        org.jsoup.Connection.Request request18 = httpConnection11.request();
        org.jsoup.Connection connection19 = httpConnection0.request(request18);
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection21 = httpConnection0.method(method20);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(keyVal17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test152");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.referrer("application/x-www-form-urlencoded");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.cookies(strMap12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test153");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection9 = httpConnection0.cookie("Content-Type", "multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.url("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test154");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Type");
        java.lang.String str7 = keyVal6.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Type=" + "'", str7, "Content-Type=");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test155");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Type");
        org.jsoup.Connection.KeyVal keyVal7 = keyVal5.contentType("application/x-www-form-urlencoded");
        boolean boolean8 = keyVal5.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test156");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection19 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection21 = httpConnection0.data(strMap20);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test157");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Type=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Content-Type=', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test158");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("Content-Encoding");
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test159");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Connection connection12 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection14 = httpConnection0.followRedirects(true);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test160");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("multipart/form-data=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal10 = keyVal8.contentType("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: String must not be empty");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test161");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.requestBodyStream(inputStream13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.postDataCharset("Content-Type");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Content-Type");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test162");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.net.CookieStore cookieStore10 = httpConnection0.cookieStore();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.cookie("", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'name' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(cookieStore10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test163");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection.Request request3 = null;
        org.jsoup.Connection connection4 = httpConnection0.request(request3);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection7 = httpConnection5.userAgent("");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection5.proxy(proxy8);
        org.jsoup.Connection.KeyVal keyVal11 = httpConnection5.data("multipart/form-data");
        org.jsoup.Connection connection14 = httpConnection5.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext16 = null;
        org.jsoup.Connection connection17 = httpConnection15.sslContext(sSLContext16);
        org.jsoup.helper.HttpConnection httpConnection18 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection20 = httpConnection18.userAgent("");
        org.jsoup.Connection connection22 = httpConnection18.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal24 = httpConnection18.data("hi!");
        org.jsoup.Connection.Request request25 = httpConnection18.request();
        org.jsoup.Connection connection26 = httpConnection15.request(request25);
        org.jsoup.Connection connection27 = httpConnection5.request(request25);
        org.jsoup.helper.HttpConnection httpConnection28 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext29 = null;
        org.jsoup.Connection connection30 = httpConnection28.sslContext(sSLContext29);
        org.jsoup.helper.HttpConnection httpConnection31 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection33 = httpConnection31.userAgent("");
        org.jsoup.Connection connection35 = httpConnection31.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal37 = httpConnection31.data("hi!");
        org.jsoup.Connection.Request request38 = httpConnection31.request();
        org.jsoup.Connection connection39 = httpConnection28.request(request38);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory40 = null;
        org.jsoup.Connection connection41 = httpConnection28.sslSocketFactory(sSLSocketFactory40);
        org.jsoup.helper.HttpConnection httpConnection42 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection44 = httpConnection42.followRedirects(true);
        java.io.InputStream inputStream47 = null;
        org.jsoup.Connection connection49 = httpConnection42.data("application/x-www-form-urlencoded", "Content-Type", inputStream47, "multipart/form-data");
        java.net.Proxy proxy50 = null;
        org.jsoup.Connection connection51 = httpConnection42.proxy(proxy50);
        java.net.CookieStore cookieStore52 = httpConnection42.cookieStore();
        org.jsoup.Connection connection53 = httpConnection28.cookieStore(cookieStore52);
        org.jsoup.Connection connection54 = httpConnection5.cookieStore(cookieStore52);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection55 = httpConnection0.cookieStore(cookieStore52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"cookieManager\" because \"x0\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNull(keyVal11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNull(keyVal24);
        org.junit.Assert.assertNotNull(request25);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNull(keyVal37);
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(cookieStore52);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(connection54);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test164");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.userAgent("hi!=");
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.url(uRL7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test165");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        org.jsoup.Connection connection16 = httpConnection0.sslSocketFactory(sSLSocketFactory15);
        org.jsoup.Connection connection18 = httpConnection0.maxBodySize(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection20 = httpConnection0.postDataCharset("multipart/form-data=Content-Type");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: multipart/form-data=Content-Type");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test166");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = connection12.newRequest("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test167");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        java.io.InputStream inputStream4 = keyVal2.inputStream();
        boolean boolean5 = keyVal2.hasInputStream();
        org.jsoup.Connection.KeyVal keyVal7 = keyVal2.contentType("multipart/form-data=Content-Type");
        java.lang.String str8 = keyVal2.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "multipart/form-data=Content-Type" + "'", str8, "multipart/form-data=Content-Type");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test168");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream13);
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.userAgent("");
        java.net.Proxy proxy18 = null;
        org.jsoup.Connection connection19 = httpConnection15.proxy(proxy18);
        org.jsoup.Connection connection21 = httpConnection15.followRedirects(false);
        org.jsoup.Connection connection23 = httpConnection15.timeout((int) ' ');
        org.jsoup.Connection.Request request24 = httpConnection15.request();
        org.jsoup.Connection connection25 = httpConnection0.request(request24);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(connection25);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test169");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        org.jsoup.Connection connection12 = httpConnection0.sslSocketFactory(sSLSocketFactory11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = httpConnection0.timeout((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Timeout milliseconds must be 0 (infinite) or greater");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test170");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.postDataCharset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test171");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.value();
        java.lang.String str4 = keyVal2.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "multipart/form-data" + "'", str3, "multipart/form-data");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test172");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection.KeyVal keyVal11 = httpConnection0.data("Content-Type");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNull(keyVal11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test173");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.helper.RequestAuthenticator requestAuthenticator11 = null;
        org.jsoup.Connection connection12 = httpConnection0.auth(requestAuthenticator11);
        org.jsoup.Connection connection15 = httpConnection0.cookie("application/x-www-form-urlencoded", "");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test174");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator10 = null;
        org.jsoup.Connection connection11 = httpConnection0.auth(requestAuthenticator10);
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection0.proxy(proxy12);
        org.jsoup.Connection connection15 = httpConnection0.userAgent("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress16 = null;
        org.jsoup.Connection connection17 = httpConnection0.onResponseProgress(responseProgress16);
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection19 = httpConnection0.url(uRL18);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test175");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.referrer("multipart/form-data=Content-Type");
        org.jsoup.Connection connection6 = httpConnection0.maxBodySize((int) (byte) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.data(strMap7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test176");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection19 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!");
        org.jsoup.helper.HttpConnection httpConnection20 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection22 = httpConnection20.userAgent("");
        org.jsoup.Connection connection24 = httpConnection20.requestBody("hi!");
        org.jsoup.Connection connection27 = httpConnection20.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress28 = null;
        org.jsoup.Connection connection29 = httpConnection20.onResponseProgress(responseProgress28);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.jsoup.Connection connection31 = httpConnection20.data(strArray30);
        org.jsoup.Connection connection32 = httpConnection0.data(strArray30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response33 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection32);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test177");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("hi!");
        org.jsoup.Connection.KeyVal keyVal8 = httpConnection0.data("Content-Encoding");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNull(keyVal8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test178");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.referrer("");
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection12 = httpConnection10.userAgent("");
        java.net.Proxy proxy13 = null;
        org.jsoup.Connection connection14 = httpConnection10.proxy(proxy13);
        org.jsoup.Connection.KeyVal keyVal16 = httpConnection10.data("multipart/form-data");
        org.jsoup.Connection connection18 = httpConnection10.maxBodySize((int) '#');
        org.jsoup.Connection connection20 = httpConnection10.timeout((int) '4');
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection24 = httpConnection10.data(strArray23);
        org.jsoup.Connection connection25 = httpConnection0.data(strArray23);
        org.jsoup.Connection.Response response26 = null;
        org.jsoup.Connection connection27 = httpConnection0.response(response26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response28 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNull(keyVal16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test179");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal2.contentType();
        java.io.InputStream inputStream7 = keyVal2.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test180");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("application/x-www-form-urlencoded=multipart/form-data");
        java.lang.String str7 = keyVal6.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=application/x-www-form-urlencoded=multipart/form-data" + "'", str7, "hi!=application/x-www-form-urlencoded=multipart/form-data");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test181");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection19 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!");
        java.io.InputStream inputStream22 = null;
        org.jsoup.Connection connection24 = httpConnection0.data("application/x-www-form-urlencoded=multipart/form-data", "Content-Type=", inputStream22, "multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection25 = new org.jsoup.helper.HttpConnection();
        java.net.Proxy proxy26 = null;
        org.jsoup.Connection connection27 = httpConnection25.proxy(proxy26);
        java.net.CookieStore cookieStore28 = httpConnection25.cookieStore();
        org.jsoup.Connection connection29 = httpConnection0.cookieStore(cookieStore28);
        java.net.URL uRL30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection31 = httpConnection0.newRequest(uRL30);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(cookieStore28);
        org.junit.Assert.assertNotNull(connection29);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test182");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Type");
        java.lang.String str5 = keyVal4.toString();
        java.io.InputStream inputStream6 = keyVal4.inputStream();
        org.jsoup.Connection.KeyVal keyVal8 = keyVal4.contentType("Content-Type");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "multipart/form-data=Content-Type" + "'", str5, "multipart/form-data=Content-Type");
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test183");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.net.Proxy proxy11 = null;
        org.jsoup.Connection connection12 = httpConnection0.proxy(proxy11);
        org.jsoup.Connection.KeyVal keyVal14 = httpConnection0.data("Content-Type=");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNull(keyVal14);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test184");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.referrer("application/x-www-form-urlencoded");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.newRequest("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test185");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslContext(sSLContext5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.data(strMap7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test186");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.Connection connection12 = httpConnection0.requestBodyStream(inputStream11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection15 = httpConnection0.header("", "hi!=");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'name' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test187");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test188");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("hi!");
        org.jsoup.Connection.Request request7 = httpConnection0.request();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection9 = httpConnection0.cookies(strMap8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(request7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test189");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Connection connection9 = httpConnection0.userAgent("hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.newRequest("multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'multipart/form-data', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test190");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.requestBodyStream(inputStream13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.headers(strMap15);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test191");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        java.lang.String str7 = keyVal6.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.key("application/x-www-form-urlencoded");
        java.lang.Class<?> wildcardClass10 = keyVal9.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=" + "'", str7, "hi!=");
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test192");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "Content-Type=");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test193");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.jsoup.Connection connection11 = httpConnection0.data(strArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test194");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection5 = httpConnection0.cookie("Content-Type", "Content-Encoding");
        java.net.Proxy proxy6 = null;
        org.jsoup.Connection connection7 = httpConnection0.proxy(proxy6);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.data("Content-Type", "Content-Encoding", inputStream10);
        org.jsoup.Connection connection13 = httpConnection0.userAgent("application/x-www-form-urlencoded");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test195");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response1 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test196");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.timeout(1);
        org.jsoup.Connection.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection6 = httpConnection0.method(method5);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test197");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Connection connection12 = httpConnection0.ignoreHttpErrors(false);
        java.io.InputStream inputStream15 = null;
        org.jsoup.Connection connection16 = httpConnection0.data("hi!", "application/x-www-form-urlencoded=multipart/form-data", inputStream15);
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = httpConnection0.method(method17);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test198");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection9 = httpConnection7.userAgent("");
        java.net.Proxy proxy10 = null;
        org.jsoup.Connection connection11 = httpConnection7.proxy(proxy10);
        org.jsoup.Connection connection13 = httpConnection7.followRedirects(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection17 = httpConnection7.data(strArray16);
        java.io.InputStream inputStream18 = null;
        org.jsoup.Connection connection19 = httpConnection7.requestBodyStream(inputStream18);
        java.net.CookieStore cookieStore20 = httpConnection7.cookieStore();
        org.jsoup.Connection connection21 = httpConnection0.cookieStore(cookieStore20);
        java.io.InputStream inputStream24 = null;
        org.jsoup.Connection connection26 = httpConnection0.data("application/x-www-form-urlencoded", "multipart/form-data", inputStream24, "Content-Type=");
        org.jsoup.Connection connection28 = httpConnection0.maxBodySize(10);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(cookieStore20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test199");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.userAgent("hi!=");
        java.io.InputStream inputStream7 = null;
        org.jsoup.Connection connection8 = httpConnection0.requestBodyStream(inputStream7);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test200");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.requestBodyStream(inputStream13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test201");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("application/x-www-form-urlencoded", "multipart/form-data", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.value("Content-Encoding");
        org.jsoup.Connection.KeyVal keyVal8 = keyVal3.contentType("Content-Type=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "application/x-www-form-urlencoded=multipart/form-data" + "'", str4, "application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test202");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.Connection.KeyVal keyVal4 = keyVal2.contentType("Content-Type=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test203");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.userAgent("hi!=");
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.headers(strMap9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test204");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator10 = null;
        org.jsoup.Connection connection11 = httpConnection0.auth(requestAuthenticator10);
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection0.proxy(proxy12);
        javax.net.ssl.SSLContext sSLContext14 = null;
        org.jsoup.Connection connection15 = httpConnection0.sslContext(sSLContext14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.newRequest("application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'application/x-www-form-urlencoded', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test205");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.requestBodyStream(inputStream13);
        org.jsoup.Connection connection17 = httpConnection0.data("hi!", "multipart/form-data=multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test206");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator10 = null;
        org.jsoup.Connection connection11 = httpConnection0.auth(requestAuthenticator10);
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection0.proxy(proxy12);
        org.jsoup.Connection connection15 = httpConnection0.userAgent("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress16 = null;
        org.jsoup.Connection connection17 = httpConnection0.onResponseProgress(responseProgress16);
        org.jsoup.Connection connection20 = httpConnection0.proxy("Content-Encoding", (int) '#');
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection22 = httpConnection0.method(method21);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test207");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator11 = null;
        org.jsoup.Connection connection12 = httpConnection0.auth(requestAuthenticator11);
        org.jsoup.Connection connection14 = httpConnection0.ignoreContentType(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test208");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection8 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection connection11 = httpConnection0.cookie("application/x-www-form-urlencoded=multipart/form-data", "hi!=");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.cookies(strMap12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test209");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        org.jsoup.Connection connection14 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection16 = httpConnection0.referrer("application/x-www-form-urlencoded");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test210");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.jsoup.Connection connection11 = httpConnection0.data(strArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test211");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("multipart/form-data=multipart/form-data");
        boolean boolean9 = keyVal6.hasInputStream();
        java.lang.String str10 = keyVal6.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=" + "'", str10, "hi!=");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test212");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslContext(sSLContext5);
        org.jsoup.Connection connection8 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response9 = null;
        org.jsoup.Connection connection10 = httpConnection0.response(response9);
        org.jsoup.Connection connection12 = httpConnection0.userAgent("application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test213");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        org.jsoup.Connection connection15 = httpConnection11.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal17 = httpConnection11.data("hi!");
        org.jsoup.Connection.Request request18 = httpConnection11.request();
        org.jsoup.Connection connection19 = httpConnection0.request(request18);
        org.jsoup.Connection connection21 = httpConnection0.ignoreHttpErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(keyVal17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test214");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream12 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("hi!", "application/x-www-form-urlencoded", inputStream12, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.jsoup.Connection connection15 = httpConnection0.newRequest();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.postDataCharset("multipart/form-data=Content-Type");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: multipart/form-data=Content-Type");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test215");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = keyVal4.inputStream();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.inputStream(inputStream6);
        java.lang.String str8 = keyVal4.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=" + "'", str8, "hi!=");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test216");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator10 = null;
        org.jsoup.Connection connection11 = httpConnection0.auth(requestAuthenticator10);
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection0.proxy(proxy12);
        org.jsoup.Connection connection15 = httpConnection0.followRedirects(true);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test217");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslSocketFactory(sSLSocketFactory5);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection7.proxy(proxy8);
        java.net.CookieStore cookieStore10 = httpConnection7.cookieStore();
        org.jsoup.Connection connection11 = httpConnection0.cookieStore(cookieStore10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal13 = httpConnection0.data("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(cookieStore10);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test218");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection19 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!");
        java.io.InputStream inputStream22 = null;
        org.jsoup.Connection connection24 = httpConnection0.data("application/x-www-form-urlencoded=multipart/form-data", "Content-Type=", inputStream22, "multipart/form-data");
        org.jsoup.Connection connection26 = httpConnection0.timeout((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document27 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test219");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslSocketFactory(sSLSocketFactory5);
        org.jsoup.Connection connection9 = httpConnection0.cookie("hi!=application/x-www-form-urlencoded=multipart/form-data", "application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test220");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection19 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!");
        java.io.InputStream inputStream22 = null;
        org.jsoup.Connection connection24 = httpConnection0.data("application/x-www-form-urlencoded=multipart/form-data", "Content-Type=", inputStream22, "multipart/form-data");
        org.jsoup.Connection connection27 = httpConnection0.header("multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.jsoup.Connection connection29 = httpConnection0.ignoreHttpErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document30 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test221");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Type");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("application/x-www-form-urlencoded");
        java.lang.String str9 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "application/x-www-form-urlencoded" + "'", str9, "application/x-www-form-urlencoded");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test222");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream12 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("hi!", "application/x-www-form-urlencoded", inputStream12, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test223");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection5 = httpConnection0.cookie("Content-Type", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext7 = null;
        org.jsoup.Connection connection8 = httpConnection6.sslContext(sSLContext7);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.userAgent("");
        org.jsoup.Connection connection13 = httpConnection9.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection9.data("hi!");
        org.jsoup.Connection.Request request16 = httpConnection9.request();
        org.jsoup.Connection connection17 = httpConnection6.request(request16);
        org.jsoup.Connection connection18 = httpConnection0.request(request16);
        org.jsoup.Connection connection20 = httpConnection0.referrer("hi!");
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection22 = httpConnection0.method(method21);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test224");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.referrer("application/x-www-form-urlencoded");
        java.io.InputStream inputStream12 = null;
        org.jsoup.Connection connection13 = httpConnection0.requestBodyStream(inputStream12);
        org.jsoup.Connection connection15 = httpConnection0.requestBody("Content-Type");
        org.jsoup.Connection connection17 = httpConnection0.requestBody("");
        org.jsoup.Connection connection19 = httpConnection0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection21 = httpConnection0.headers(strMap20);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test225");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection.KeyVal keyVal11 = httpConnection0.data("Content-Type");
        org.jsoup.Connection connection13 = httpConnection0.ignoreContentType(true);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection15 = httpConnection0.headers(strMap14);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNull(keyVal11);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test226");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        org.jsoup.Connection connection15 = httpConnection11.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal17 = httpConnection11.data("hi!");
        org.jsoup.Connection.Request request18 = httpConnection11.request();
        org.jsoup.Connection connection19 = httpConnection0.request(request18);
        org.jsoup.Connection connection21 = httpConnection0.maxBodySize(1);
        java.io.InputStream inputStream22 = null;
        org.jsoup.Connection connection23 = httpConnection0.requestBodyStream(inputStream22);
        org.jsoup.Connection connection24 = httpConnection0.newRequest();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(keyVal17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection24);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test227");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.jsoup.Connection connection11 = httpConnection0.data(strArray10);
        org.jsoup.Connection connection14 = httpConnection0.cookie("multipart/form-data=Content-Type", "application/x-www-form-urlencoded=multipart/form-data");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        org.jsoup.Connection connection16 = httpConnection0.sslSocketFactory(sSLSocketFactory15);
        org.jsoup.Connection connection18 = httpConnection0.referrer("multipart/form-data=multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test228");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.referrer("application/x-www-form-urlencoded");
        java.io.InputStream inputStream12 = null;
        org.jsoup.Connection connection13 = httpConnection0.requestBodyStream(inputStream12);
        org.jsoup.Connection connection15 = httpConnection0.timeout((int) 'a');
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.url(uRL16);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test229");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        boolean boolean3 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test230");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext4 = null;
        org.jsoup.Connection connection5 = httpConnection3.sslContext(sSLContext4);
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection8 = httpConnection6.userAgent("");
        org.jsoup.Connection connection10 = httpConnection6.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal12 = httpConnection6.data("hi!");
        org.jsoup.Connection.Request request13 = httpConnection6.request();
        org.jsoup.Connection connection14 = httpConnection3.request(request13);
        org.jsoup.Connection connection15 = httpConnection0.request(request13);
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection18 = httpConnection16.userAgent("");
        org.jsoup.Connection connection20 = httpConnection16.requestBody("hi!");
        org.jsoup.Connection.Response response21 = null;
        org.jsoup.Connection connection22 = httpConnection16.response(response21);
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection25 = httpConnection23.userAgent("");
        java.net.Proxy proxy26 = null;
        org.jsoup.Connection connection27 = httpConnection23.proxy(proxy26);
        org.jsoup.Connection connection29 = httpConnection23.followRedirects(false);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection33 = httpConnection23.data(strArray32);
        java.io.InputStream inputStream34 = null;
        org.jsoup.Connection connection35 = httpConnection23.requestBodyStream(inputStream34);
        java.net.CookieStore cookieStore36 = httpConnection23.cookieStore();
        org.jsoup.Connection connection37 = httpConnection16.cookieStore(cookieStore36);
        org.jsoup.helper.HttpConnection httpConnection38 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection40 = httpConnection38.userAgent("");
        java.net.Proxy proxy41 = null;
        org.jsoup.Connection connection42 = httpConnection38.proxy(proxy41);
        org.jsoup.Connection.KeyVal keyVal44 = httpConnection38.data("multipart/form-data");
        org.jsoup.Connection connection47 = httpConnection38.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection48 = httpConnection38.newRequest();
        org.jsoup.helper.HttpConnection httpConnection49 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection51 = httpConnection49.userAgent("");
        org.jsoup.Connection connection53 = httpConnection49.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal55 = httpConnection49.data("hi!");
        org.jsoup.Connection.Request request56 = httpConnection49.request();
        org.jsoup.Connection connection57 = httpConnection38.request(request56);
        org.jsoup.helper.HttpConnection httpConnection58 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection60 = httpConnection58.followRedirects(true);
        java.io.InputStream inputStream63 = null;
        org.jsoup.Connection connection65 = httpConnection58.data("application/x-www-form-urlencoded", "Content-Type", inputStream63, "multipart/form-data");
        java.net.Proxy proxy66 = null;
        org.jsoup.Connection connection67 = httpConnection58.proxy(proxy66);
        java.net.CookieStore cookieStore68 = httpConnection58.cookieStore();
        org.jsoup.Connection connection69 = httpConnection38.cookieStore(cookieStore68);
        org.jsoup.Connection connection70 = httpConnection16.cookieStore(cookieStore68);
        org.jsoup.Connection connection71 = httpConnection0.cookieStore(cookieStore68);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNull(keyVal12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(cookieStore36);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNull(keyVal44);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNull(keyVal55);
        org.junit.Assert.assertNotNull(request56);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(connection65);
        org.junit.Assert.assertNotNull(connection67);
        org.junit.Assert.assertNotNull(cookieStore68);
        org.junit.Assert.assertNotNull(connection69);
        org.junit.Assert.assertNotNull(connection70);
        org.junit.Assert.assertNotNull(connection71);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test231");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext8 = null;
        org.jsoup.Connection connection9 = httpConnection7.sslContext(sSLContext8);
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection12 = httpConnection10.userAgent("");
        org.jsoup.Connection connection14 = httpConnection10.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal16 = httpConnection10.data("hi!");
        org.jsoup.Connection.Request request17 = httpConnection10.request();
        org.jsoup.Connection connection18 = httpConnection7.request(request17);
        org.jsoup.Connection connection19 = httpConnection0.request(request17);
        java.lang.Class<?> wildcardClass20 = httpConnection0.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNull(keyVal16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test232");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext4 = null;
        org.jsoup.Connection connection5 = httpConnection3.sslContext(sSLContext4);
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection8 = httpConnection6.userAgent("");
        org.jsoup.Connection connection10 = httpConnection6.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal12 = httpConnection6.data("hi!");
        org.jsoup.Connection.Request request13 = httpConnection6.request();
        org.jsoup.Connection connection14 = httpConnection3.request(request13);
        org.jsoup.Connection connection15 = httpConnection0.request(request13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNull(keyVal12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test233");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext11 = null;
        org.jsoup.Connection connection12 = httpConnection10.sslContext(sSLContext11);
        org.jsoup.helper.HttpConnection httpConnection13 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection15 = httpConnection13.userAgent("");
        org.jsoup.Connection connection17 = httpConnection13.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal19 = httpConnection13.data("hi!");
        org.jsoup.Connection.Request request20 = httpConnection13.request();
        org.jsoup.Connection connection21 = httpConnection10.request(request20);
        org.jsoup.Connection connection22 = httpConnection0.request(request20);
        org.jsoup.Connection connection24 = httpConnection0.referrer("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection26 = httpConnection0.url("multipart/form-data=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'multipart/form-data=multipart/form-data', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNull(keyVal19);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test234");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext4 = null;
        org.jsoup.Connection connection5 = httpConnection3.sslContext(sSLContext4);
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection8 = httpConnection6.userAgent("");
        org.jsoup.Connection connection10 = httpConnection6.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal12 = httpConnection6.data("hi!");
        org.jsoup.Connection.Request request13 = httpConnection6.request();
        org.jsoup.Connection connection14 = httpConnection3.request(request13);
        org.jsoup.Connection connection15 = httpConnection0.request(request13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.postDataCharset("application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: application/x-www-form-urlencoded");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNull(keyVal12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test235");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.referrer("application/x-www-form-urlencoded");
        java.io.InputStream inputStream12 = null;
        org.jsoup.Connection connection13 = httpConnection0.requestBodyStream(inputStream12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection15 = httpConnection0.headers(strMap14);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test236");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection5 = httpConnection3.userAgent("");
        org.jsoup.Connection connection7 = httpConnection3.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal9 = httpConnection3.data("hi!");
        org.jsoup.Connection.Request request10 = httpConnection3.request();
        org.jsoup.Connection connection11 = httpConnection0.request(request10);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress12 = null;
        org.jsoup.Connection connection13 = httpConnection0.onResponseProgress(responseProgress12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNull(keyVal9);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test237");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection5 = httpConnection3.userAgent("");
        org.jsoup.Connection connection7 = httpConnection3.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal9 = httpConnection3.data("hi!");
        org.jsoup.Connection.Request request10 = httpConnection3.request();
        org.jsoup.Connection connection11 = httpConnection0.request(request10);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress12 = null;
        org.jsoup.Connection connection13 = httpConnection0.onResponseProgress(responseProgress12);
        java.lang.String[] strArray15 = new java.lang.String[] { "multipart/form-data" };
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.data(strArray15);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Must supply an even number of key value pairs");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNull(keyVal9);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "multipart/form-data" });
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test238");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        org.jsoup.Connection connection15 = httpConnection11.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal17 = httpConnection11.data("hi!");
        org.jsoup.Connection.Request request18 = httpConnection11.request();
        org.jsoup.Connection connection19 = httpConnection0.request(request18);
        org.jsoup.Connection connection22 = httpConnection0.cookie("multipart/form-data=Content-Type", "");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection24 = httpConnection0.headers(strMap23);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(keyVal17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection22);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test239");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection5 = httpConnection0.cookie("Content-Type", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext7 = null;
        org.jsoup.Connection connection8 = httpConnection6.sslContext(sSLContext7);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.userAgent("");
        org.jsoup.Connection connection13 = httpConnection9.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection9.data("hi!");
        org.jsoup.Connection.Request request16 = httpConnection9.request();
        org.jsoup.Connection connection17 = httpConnection6.request(request16);
        org.jsoup.Connection connection18 = httpConnection0.request(request16);
        org.jsoup.Connection connection20 = httpConnection0.referrer("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection22 = httpConnection0.timeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Timeout milliseconds must be 0 (infinite) or greater");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test240");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Connection connection12 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection15 = httpConnection0.proxy("application/x-www-form-urlencoded", (int) (byte) 10);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test241");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection19 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!");
        java.net.Proxy proxy20 = null;
        org.jsoup.Connection connection21 = httpConnection0.proxy(proxy20);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test242");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        java.net.CookieStore cookieStore9 = httpConnection0.cookieStore();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.postDataCharset("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(cookieStore9);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test243");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection6 = httpConnection0.requestBody("");
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = connection8.newRequest("Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Content-Type', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test244");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        org.jsoup.Connection connection12 = httpConnection0.sslSocketFactory(sSLSocketFactory11);
        org.jsoup.helper.HttpConnection httpConnection13 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection15 = httpConnection13.userAgent("");
        java.net.Proxy proxy16 = null;
        org.jsoup.Connection connection17 = httpConnection13.proxy(proxy16);
        org.jsoup.Connection connection19 = httpConnection13.followRedirects(false);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection23 = httpConnection13.data(strArray22);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress24 = null;
        org.jsoup.Connection connection25 = httpConnection13.onResponseProgress(responseProgress24);
        java.net.CookieStore cookieStore26 = httpConnection13.cookieStore();
        org.jsoup.Connection connection27 = httpConnection0.cookieStore(cookieStore26);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(cookieStore26);
        org.junit.Assert.assertNotNull(connection27);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test245");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Type");
        java.lang.String str5 = keyVal4.toString();
        java.io.InputStream inputStream6 = keyVal4.inputStream();
        java.lang.String str7 = keyVal4.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "multipart/form-data=Content-Type" + "'", str5, "multipart/form-data=Content-Type");
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multipart/form-data=Content-Type" + "'", str7, "multipart/form-data=Content-Type");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test246");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext8 = null;
        org.jsoup.Connection connection9 = httpConnection7.sslContext(sSLContext8);
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection12 = httpConnection10.userAgent("");
        org.jsoup.Connection connection14 = httpConnection10.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal16 = httpConnection10.data("hi!");
        org.jsoup.Connection.Request request17 = httpConnection10.request();
        org.jsoup.Connection connection18 = httpConnection7.request(request17);
        org.jsoup.Connection connection19 = httpConnection0.request(request17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection21 = httpConnection0.postDataCharset("application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: application/x-www-form-urlencoded");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNull(keyVal16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test247");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        org.jsoup.Connection connection12 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection14 = httpConnection0.referrer("application/x-www-form-urlencoded=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.postDataCharset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test248");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test249");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslSocketFactory(sSLSocketFactory5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.headers(strMap7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test250");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext11 = null;
        org.jsoup.Connection connection12 = httpConnection10.sslContext(sSLContext11);
        org.jsoup.helper.HttpConnection httpConnection13 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection15 = httpConnection13.userAgent("");
        org.jsoup.Connection connection17 = httpConnection13.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal19 = httpConnection13.data("hi!");
        org.jsoup.Connection.Request request20 = httpConnection13.request();
        org.jsoup.Connection connection21 = httpConnection10.request(request20);
        org.jsoup.Connection connection22 = httpConnection0.request(request20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection24 = httpConnection0.cookies(strMap23);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNull(keyVal19);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection22);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test251");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.Connection connection12 = httpConnection0.data("hi!", "hi!");
        org.jsoup.parser.Parser parser13 = null;
        org.jsoup.Connection connection14 = httpConnection0.parser(parser13);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test252");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.followRedirects(false);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.headers(strMap12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test253");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.timeout(1);
        org.jsoup.Connection connection6 = httpConnection0.requestBody("Content-Type");
        org.jsoup.Connection connection8 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection.Response response9 = null;
        org.jsoup.Connection connection10 = httpConnection0.response(response9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test254");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator11 = null;
        org.jsoup.Connection connection12 = httpConnection0.auth(requestAuthenticator11);
        org.jsoup.Connection connection14 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection connection16 = httpConnection0.timeout((int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext18 = null;
        org.jsoup.Connection connection19 = httpConnection17.sslContext(sSLContext18);
        org.jsoup.Connection connection21 = httpConnection17.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext22 = null;
        org.jsoup.Connection connection23 = httpConnection17.sslContext(sSLContext22);
        org.jsoup.Connection connection25 = httpConnection17.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response26 = null;
        org.jsoup.Connection connection27 = httpConnection17.response(response26);
        org.jsoup.helper.HttpConnection httpConnection28 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection30 = httpConnection28.userAgent("");
        java.net.Proxy proxy31 = null;
        org.jsoup.Connection connection32 = httpConnection28.proxy(proxy31);
        org.jsoup.Connection connection34 = httpConnection28.followRedirects(false);
        org.jsoup.Connection connection36 = httpConnection28.timeout((int) ' ');
        org.jsoup.Connection connection39 = httpConnection28.cookie("application/x-www-form-urlencoded=multipart/form-data", "hi!=");
        org.jsoup.Connection connection41 = httpConnection28.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal44 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal46 = keyVal44.key("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal49 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str50 = keyVal49.contentType();
        java.io.InputStream inputStream51 = keyVal49.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray52 = new org.jsoup.Connection.KeyVal[] { keyVal44, keyVal49 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList53 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList53, keyValArray52);
        org.jsoup.Connection connection55 = httpConnection28.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList53);
        org.jsoup.Connection connection56 = httpConnection17.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList53);
        org.jsoup.Connection connection57 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList53);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(keyVal44);
        org.junit.Assert.assertNotNull(keyVal46);
        org.junit.Assert.assertNotNull(keyVal49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(inputStream51);
        org.junit.Assert.assertNotNull(keyValArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(connection55);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNotNull(connection57);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test255");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        org.jsoup.Connection connection12 = httpConnection0.sslSocketFactory(sSLSocketFactory11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = httpConnection0.newRequest("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test256");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection.KeyVal keyVal11 = httpConnection0.data("Content-Type");
        org.jsoup.Connection connection13 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream16 = null;
        org.jsoup.Connection connection17 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!=", inputStream16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNull(keyVal11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test257");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator10 = null;
        org.jsoup.Connection connection11 = httpConnection0.auth(requestAuthenticator10);
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection0.proxy(proxy12);
        org.jsoup.Connection connection15 = httpConnection0.userAgent("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress16 = null;
        org.jsoup.Connection connection17 = httpConnection0.onResponseProgress(responseProgress16);
        org.jsoup.Connection connection20 = httpConnection0.proxy("Content-Encoding", (int) '#');
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection22 = httpConnection0.cookies(strMap21);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test258");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test259");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("hi!");
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection9 = httpConnection7.userAgent("");
        java.net.Proxy proxy10 = null;
        org.jsoup.Connection connection11 = httpConnection7.proxy(proxy10);
        org.jsoup.Connection.KeyVal keyVal13 = httpConnection7.data("multipart/form-data");
        org.jsoup.Connection connection15 = httpConnection7.maxBodySize((int) '#');
        org.jsoup.Connection connection17 = httpConnection7.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress18 = null;
        org.jsoup.Connection connection19 = httpConnection7.onResponseProgress(responseProgress18);
        org.jsoup.Connection.Request request20 = httpConnection7.request();
        org.jsoup.Connection connection21 = httpConnection0.request(request20);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNull(keyVal13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test260");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Connection connection12 = httpConnection0.ignoreHttpErrors(false);
        java.io.InputStream inputStream15 = null;
        org.jsoup.Connection connection17 = httpConnection0.data("Content-Encoding", "Content-Encoding", inputStream15, "hi!=application/x-www-form-urlencoded=multipart/form-data");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection19 = httpConnection0.headers(strMap18);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test261");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        java.io.InputStream inputStream7 = null;
        org.jsoup.Connection connection8 = httpConnection0.requestBodyStream(inputStream7);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test262");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        org.jsoup.Connection connection16 = httpConnection0.sslSocketFactory(sSLSocketFactory15);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress17 = null;
        org.jsoup.Connection connection18 = httpConnection0.onResponseProgress(responseProgress17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection20 = httpConnection0.cookies(strMap19);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test263");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator10 = null;
        org.jsoup.Connection connection11 = httpConnection0.auth(requestAuthenticator10);
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection0.proxy(proxy12);
        org.jsoup.Connection connection15 = httpConnection0.userAgent("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection18 = httpConnection16.userAgent("");
        org.jsoup.Connection connection20 = httpConnection16.requestBody("hi!");
        org.jsoup.Connection.Response response21 = null;
        org.jsoup.Connection connection22 = httpConnection16.response(response21);
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection25 = httpConnection23.userAgent("");
        java.net.Proxy proxy26 = null;
        org.jsoup.Connection connection27 = httpConnection23.proxy(proxy26);
        org.jsoup.Connection connection29 = httpConnection23.followRedirects(false);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection33 = httpConnection23.data(strArray32);
        java.io.InputStream inputStream34 = null;
        org.jsoup.Connection connection35 = httpConnection23.requestBodyStream(inputStream34);
        java.net.CookieStore cookieStore36 = httpConnection23.cookieStore();
        org.jsoup.Connection connection37 = httpConnection16.cookieStore(cookieStore36);
        org.jsoup.helper.HttpConnection httpConnection38 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection40 = httpConnection38.userAgent("");
        java.net.Proxy proxy41 = null;
        org.jsoup.Connection connection42 = httpConnection38.proxy(proxy41);
        org.jsoup.Connection.KeyVal keyVal44 = httpConnection38.data("multipart/form-data");
        org.jsoup.Connection connection47 = httpConnection38.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection48 = httpConnection38.newRequest();
        org.jsoup.helper.HttpConnection httpConnection49 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection51 = httpConnection49.userAgent("");
        org.jsoup.Connection connection53 = httpConnection49.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal55 = httpConnection49.data("hi!");
        org.jsoup.Connection.Request request56 = httpConnection49.request();
        org.jsoup.Connection connection57 = httpConnection38.request(request56);
        org.jsoup.helper.HttpConnection httpConnection58 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection60 = httpConnection58.followRedirects(true);
        java.io.InputStream inputStream63 = null;
        org.jsoup.Connection connection65 = httpConnection58.data("application/x-www-form-urlencoded", "Content-Type", inputStream63, "multipart/form-data");
        java.net.Proxy proxy66 = null;
        org.jsoup.Connection connection67 = httpConnection58.proxy(proxy66);
        java.net.CookieStore cookieStore68 = httpConnection58.cookieStore();
        org.jsoup.Connection connection69 = httpConnection38.cookieStore(cookieStore68);
        org.jsoup.Connection connection70 = httpConnection16.cookieStore(cookieStore68);
        org.jsoup.Connection connection71 = httpConnection0.cookieStore(cookieStore68);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection73 = connection71.newRequest("multipart/form-data=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'multipart/form-data=multipart/form-data', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(cookieStore36);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNull(keyVal44);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNull(keyVal55);
        org.junit.Assert.assertNotNull(request56);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(connection65);
        org.junit.Assert.assertNotNull(connection67);
        org.junit.Assert.assertNotNull(cookieStore68);
        org.junit.Assert.assertNotNull(connection69);
        org.junit.Assert.assertNotNull(connection70);
        org.junit.Assert.assertNotNull(connection71);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test264");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        org.jsoup.Connection connection14 = httpConnection0.followRedirects(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = connection14.newRequest("Content-Type=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Content-Type=', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test265");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        org.jsoup.Connection connection15 = httpConnection11.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal17 = httpConnection11.data("hi!");
        org.jsoup.Connection.Request request18 = httpConnection11.request();
        org.jsoup.Connection connection19 = httpConnection0.request(request18);
        org.jsoup.Connection connection21 = httpConnection0.maxBodySize(1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection23 = httpConnection0.newRequest("hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!=', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(keyVal17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test266");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection9 = httpConnection0.newRequest(uRL8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test267");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test268");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection8 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection.Request request9 = httpConnection0.request();
        org.jsoup.Connection connection11 = httpConnection0.referrer("Content-Type");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test269");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection.Request request3 = null;
        org.jsoup.Connection connection4 = httpConnection0.request(request3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.cookie("Content-Type=", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.helper.HttpConnection$Request.cookie(String, String)\" because \"this.req\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(request5);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test270");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection19 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!");
        java.io.InputStream inputStream22 = null;
        org.jsoup.Connection connection24 = httpConnection0.data("application/x-www-form-urlencoded=multipart/form-data", "Content-Type=", inputStream22, "multipart/form-data");
        org.jsoup.Connection connection27 = httpConnection0.header("multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.jsoup.Connection connection29 = httpConnection0.ignoreHttpErrors(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response30 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test271");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        org.jsoup.Connection.Request request11 = httpConnection0.request();
        org.jsoup.Connection connection14 = httpConnection0.data("application/x-www-form-urlencoded", "multipart/form-data=Content-Type");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test272");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection5 = httpConnection0.cookie("Content-Type", "Content-Encoding");
        java.net.Proxy proxy6 = null;
        org.jsoup.Connection connection7 = httpConnection0.proxy(proxy6);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.data("Content-Type", "Content-Encoding", inputStream10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test273");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection.KeyVal keyVal11 = httpConnection0.data("Content-Type");
        org.jsoup.Connection connection13 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream16 = null;
        org.jsoup.Connection connection17 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!=", inputStream16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection19 = httpConnection0.newRequest("Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Content-Type', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNull(keyVal11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test274");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test275");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection7 = httpConnection0.url("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test276");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection8 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection.Request request9 = httpConnection0.request();
        org.jsoup.Connection connection11 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection connection14 = httpConnection0.cookie("Content-Encoding", "multipart/form-data=Content-Type");
        org.jsoup.Connection connection17 = httpConnection0.data("Content-Type=", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection19 = httpConnection0.timeout((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Timeout milliseconds must be 0 (infinite) or greater");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test277");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("application/x-www-form-urlencoded=multipart/form-data");
        boolean boolean7 = keyVal6.hasInputStream();
        java.lang.String str8 = keyVal6.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test278");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        org.jsoup.Connection connection13 = httpConnection0.data("hi!=", "multipart/form-data=Content-Type");
        org.jsoup.Connection connection16 = httpConnection0.data("multipart/form-data", "Content-Encoding");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test279");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        javax.net.ssl.SSLContext sSLContext9 = null;
        org.jsoup.Connection connection10 = httpConnection0.sslContext(sSLContext9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = httpConnection0.headers(strMap11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test280");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection9 = httpConnection7.userAgent("");
        java.net.Proxy proxy10 = null;
        org.jsoup.Connection connection11 = httpConnection7.proxy(proxy10);
        org.jsoup.Connection connection13 = httpConnection7.followRedirects(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection17 = httpConnection7.data(strArray16);
        java.io.InputStream inputStream18 = null;
        org.jsoup.Connection connection19 = httpConnection7.requestBodyStream(inputStream18);
        java.net.CookieStore cookieStore20 = httpConnection7.cookieStore();
        org.jsoup.Connection connection21 = httpConnection0.cookieStore(cookieStore20);
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection24 = httpConnection22.userAgent("");
        java.net.Proxy proxy25 = null;
        org.jsoup.Connection connection26 = httpConnection22.proxy(proxy25);
        org.jsoup.Connection.KeyVal keyVal28 = httpConnection22.data("multipart/form-data");
        org.jsoup.Connection connection31 = httpConnection22.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection32 = httpConnection22.newRequest();
        org.jsoup.helper.HttpConnection httpConnection33 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection35 = httpConnection33.userAgent("");
        org.jsoup.Connection connection37 = httpConnection33.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal39 = httpConnection33.data("hi!");
        org.jsoup.Connection.Request request40 = httpConnection33.request();
        org.jsoup.Connection connection41 = httpConnection22.request(request40);
        org.jsoup.helper.HttpConnection httpConnection42 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection44 = httpConnection42.followRedirects(true);
        java.io.InputStream inputStream47 = null;
        org.jsoup.Connection connection49 = httpConnection42.data("application/x-www-form-urlencoded", "Content-Type", inputStream47, "multipart/form-data");
        java.net.Proxy proxy50 = null;
        org.jsoup.Connection connection51 = httpConnection42.proxy(proxy50);
        java.net.CookieStore cookieStore52 = httpConnection42.cookieStore();
        org.jsoup.Connection connection53 = httpConnection22.cookieStore(cookieStore52);
        org.jsoup.Connection connection54 = httpConnection0.cookieStore(cookieStore52);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection56 = connection54.newRequest("hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!=', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(cookieStore20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNull(keyVal28);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNull(keyVal39);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(cookieStore52);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(connection54);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test281");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator10 = null;
        org.jsoup.Connection connection11 = httpConnection0.auth(requestAuthenticator10);
        org.jsoup.Connection connection12 = httpConnection0.newRequest();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test282");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext4 = null;
        org.jsoup.Connection connection5 = httpConnection3.sslContext(sSLContext4);
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection8 = httpConnection6.userAgent("");
        org.jsoup.Connection connection10 = httpConnection6.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal12 = httpConnection6.data("hi!");
        org.jsoup.Connection.Request request13 = httpConnection6.request();
        org.jsoup.Connection connection14 = httpConnection3.request(request13);
        org.jsoup.Connection connection15 = httpConnection0.request(request13);
        org.jsoup.Connection.Response response16 = null;
        org.jsoup.Connection connection17 = httpConnection0.response(response16);
        org.jsoup.parser.Parser parser18 = null;
        org.jsoup.Connection connection19 = httpConnection0.parser(parser18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNull(keyVal12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test283");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("hi!");
        org.jsoup.Connection.Request request7 = httpConnection0.request();
        org.jsoup.helper.HttpConnection httpConnection8 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection10 = httpConnection8.userAgent("");
        java.net.Proxy proxy11 = null;
        org.jsoup.Connection connection12 = httpConnection8.proxy(proxy11);
        org.jsoup.Connection.KeyVal keyVal14 = httpConnection8.data("multipart/form-data");
        org.jsoup.Connection connection17 = httpConnection8.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection18 = httpConnection8.newRequest();
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection21 = httpConnection19.userAgent("");
        org.jsoup.Connection connection23 = httpConnection19.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal25 = httpConnection19.data("hi!");
        org.jsoup.Connection.Request request26 = httpConnection19.request();
        org.jsoup.Connection connection27 = httpConnection8.request(request26);
        org.jsoup.Connection connection28 = httpConnection0.request(request26);
        java.net.Proxy proxy29 = null;
        org.jsoup.Connection connection30 = httpConnection0.proxy(proxy29);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection32 = httpConnection0.data(strMap31);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNull(keyVal14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNull(keyVal25);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test284");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection7 = httpConnection5.userAgent("");
        org.jsoup.Connection connection9 = httpConnection5.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal11 = httpConnection5.data("hi!");
        org.jsoup.Connection.Request request12 = httpConnection5.request();
        org.jsoup.Connection connection13 = httpConnection0.request(request12);
        org.jsoup.Connection.Response response14 = null;
        org.jsoup.Connection connection15 = httpConnection0.response(response14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNull(keyVal11);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test285");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Type");
        org.jsoup.Connection.KeyVal keyVal7 = keyVal5.contentType("application/x-www-form-urlencoded");
        java.lang.String str8 = keyVal5.toString();
        java.lang.String str9 = keyVal5.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Type=" + "'", str8, "Content-Type=");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Content-Type" + "'", str9, "Content-Type");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test286");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "hi!=application/x-www-form-urlencoded=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test287");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.cookies(strMap9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test288");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = httpConnection0.cookies(strMap17);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test289");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.referrer("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test290");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        org.jsoup.Connection connection16 = httpConnection0.sslSocketFactory(sSLSocketFactory15);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress17 = null;
        org.jsoup.Connection connection18 = httpConnection0.onResponseProgress(responseProgress17);
        org.jsoup.Connection.Request request19 = httpConnection0.request();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(request19);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test291");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Content-Encoding', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test292");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.requestBodyStream(inputStream10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test293");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.net.Proxy proxy11 = null;
        org.jsoup.Connection connection12 = httpConnection0.proxy(proxy11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = httpConnection0.postDataCharset("application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: application/x-www-form-urlencoded");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test294");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        org.jsoup.Connection connection16 = httpConnection0.sslSocketFactory(sSLSocketFactory15);
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = connection16.newRequest(uRL17);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test295");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        org.jsoup.Connection connection16 = httpConnection0.sslSocketFactory(sSLSocketFactory15);
        org.jsoup.Connection connection18 = httpConnection0.maxBodySize(0);
        java.net.Proxy proxy19 = null;
        org.jsoup.Connection connection20 = httpConnection0.proxy(proxy19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection22 = httpConnection0.url("multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'multipart/form-data', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test296");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'application/x-www-form-urlencoded', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test297");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslSocketFactory(sSLSocketFactory5);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection7.proxy(proxy8);
        java.net.CookieStore cookieStore10 = httpConnection7.cookieStore();
        org.jsoup.Connection connection11 = httpConnection0.cookieStore(cookieStore10);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.newRequest(uRL12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(cookieStore10);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test298");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator10 = null;
        org.jsoup.Connection connection11 = httpConnection0.auth(requestAuthenticator10);
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection0.proxy(proxy12);
        org.jsoup.Connection connection15 = httpConnection0.userAgent("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress16 = null;
        org.jsoup.Connection connection17 = httpConnection0.onResponseProgress(responseProgress16);
        org.jsoup.helper.HttpConnection httpConnection18 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext19 = null;
        org.jsoup.Connection connection20 = httpConnection18.sslContext(sSLContext19);
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection23 = httpConnection21.userAgent("");
        org.jsoup.Connection connection25 = httpConnection21.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal27 = httpConnection21.data("hi!");
        org.jsoup.Connection.Request request28 = httpConnection21.request();
        org.jsoup.Connection connection29 = httpConnection18.request(request28);
        org.jsoup.Connection connection30 = httpConnection0.request(request28);
        java.io.InputStream inputStream33 = null;
        org.jsoup.Connection connection35 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "multipart/form-data", inputStream33, "application/x-www-form-urlencoded");
        org.jsoup.Connection connection37 = httpConnection0.requestBody("hi!=application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNull(keyVal27);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection37);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test299");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslContext(sSLContext5);
        org.jsoup.Connection connection8 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response9 = null;
        org.jsoup.Connection connection10 = httpConnection0.response(response9);
        org.jsoup.Connection connection12 = httpConnection0.requestBody("Content-Type");
        org.jsoup.helper.HttpConnection httpConnection13 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection15 = httpConnection13.userAgent("");
        java.net.Proxy proxy16 = null;
        org.jsoup.Connection connection17 = httpConnection13.proxy(proxy16);
        org.jsoup.Connection.KeyVal keyVal19 = httpConnection13.data("multipart/form-data");
        org.jsoup.Connection connection21 = httpConnection13.maxBodySize((int) '#');
        org.jsoup.Connection connection23 = httpConnection13.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress24 = null;
        org.jsoup.Connection connection25 = httpConnection13.onResponseProgress(responseProgress24);
        org.jsoup.Connection.Request request26 = httpConnection13.request();
        org.jsoup.Connection.Request request27 = httpConnection13.request();
        org.jsoup.Connection connection28 = httpConnection0.request(request27);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNull(keyVal19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(connection28);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test300");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        org.jsoup.Connection.KeyVal keyVal8 = httpConnection0.data("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNull(keyVal8);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test301");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.userAgent("");
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection9.proxy(proxy12);
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection9.data("multipart/form-data");
        org.jsoup.Connection connection17 = httpConnection9.maxBodySize((int) '#');
        org.jsoup.Connection connection19 = httpConnection9.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress20 = null;
        org.jsoup.Connection connection21 = httpConnection9.onResponseProgress(responseProgress20);
        org.jsoup.Connection.Request request22 = httpConnection9.request();
        org.jsoup.Connection connection23 = httpConnection0.request(request22);
        org.jsoup.parser.Parser parser24 = null;
        org.jsoup.Connection connection25 = httpConnection0.parser(parser24);
        javax.net.ssl.SSLContext sSLContext26 = null;
        org.jsoup.Connection connection27 = httpConnection0.sslContext(sSLContext26);
        org.jsoup.Connection connection29 = httpConnection0.followRedirects(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document30 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test302");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        org.jsoup.Connection connection13 = httpConnection0.data("hi!=", "multipart/form-data=Content-Type");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test303");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.contentType();
        boolean boolean5 = keyVal2.hasInputStream();
        java.io.InputStream inputStream6 = keyVal2.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test304");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "application/x-www-form-urlencoded");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test305");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.userAgent("");
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection9.proxy(proxy12);
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection9.data("multipart/form-data");
        org.jsoup.Connection connection17 = httpConnection9.maxBodySize((int) '#');
        org.jsoup.Connection connection19 = httpConnection9.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress20 = null;
        org.jsoup.Connection connection21 = httpConnection9.onResponseProgress(responseProgress20);
        org.jsoup.Connection.Request request22 = httpConnection9.request();
        org.jsoup.Connection connection23 = httpConnection0.request(request22);
        org.jsoup.parser.Parser parser24 = null;
        org.jsoup.Connection connection25 = httpConnection0.parser(parser24);
        org.jsoup.Connection connection27 = httpConnection0.maxBodySize((int) (short) 1);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!", "Content-Encoding" };
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection32 = httpConnection0.data(strArray31);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Must supply an even number of key value pairs");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "hi!", "Content-Encoding" });
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test306");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection connection4 = httpConnection0.timeout((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection6 = httpConnection0.postDataCharset("application/x-www-form-urlencoded=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: application/x-www-form-urlencoded=multipart/form-data");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test307");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator10 = null;
        org.jsoup.Connection connection11 = httpConnection0.auth(requestAuthenticator10);
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection0.proxy(proxy12);
        org.jsoup.Connection connection15 = httpConnection0.userAgent("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress16 = null;
        org.jsoup.Connection connection17 = httpConnection0.onResponseProgress(responseProgress16);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress18 = null;
        org.jsoup.Connection connection19 = httpConnection0.onResponseProgress(responseProgress18);
        org.jsoup.Connection.Response response20 = null;
        org.jsoup.Connection connection21 = httpConnection0.response(response20);
        org.jsoup.Connection connection23 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test308");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext4 = null;
        org.jsoup.Connection connection5 = httpConnection3.sslContext(sSLContext4);
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection8 = httpConnection6.userAgent("");
        org.jsoup.Connection connection10 = httpConnection6.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal12 = httpConnection6.data("hi!");
        org.jsoup.Connection.Request request13 = httpConnection6.request();
        org.jsoup.Connection connection14 = httpConnection3.request(request13);
        org.jsoup.Connection connection15 = httpConnection0.request(request13);
        org.jsoup.Connection connection17 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection httpConnection18 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection20 = httpConnection18.userAgent("");
        java.net.Proxy proxy21 = null;
        org.jsoup.Connection connection22 = httpConnection18.proxy(proxy21);
        org.jsoup.Connection.KeyVal keyVal24 = httpConnection18.data("multipart/form-data");
        org.jsoup.Connection connection27 = httpConnection18.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection28 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext29 = null;
        org.jsoup.Connection connection30 = httpConnection28.sslContext(sSLContext29);
        org.jsoup.helper.HttpConnection httpConnection31 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection33 = httpConnection31.userAgent("");
        org.jsoup.Connection connection35 = httpConnection31.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal37 = httpConnection31.data("hi!");
        org.jsoup.Connection.Request request38 = httpConnection31.request();
        org.jsoup.Connection connection39 = httpConnection28.request(request38);
        org.jsoup.Connection connection40 = httpConnection18.request(request38);
        org.jsoup.helper.HttpConnection httpConnection41 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext42 = null;
        org.jsoup.Connection connection43 = httpConnection41.sslContext(sSLContext42);
        org.jsoup.helper.HttpConnection httpConnection44 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection46 = httpConnection44.userAgent("");
        org.jsoup.Connection connection48 = httpConnection44.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal50 = httpConnection44.data("hi!");
        org.jsoup.Connection.Request request51 = httpConnection44.request();
        org.jsoup.Connection connection52 = httpConnection41.request(request51);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory53 = null;
        org.jsoup.Connection connection54 = httpConnection41.sslSocketFactory(sSLSocketFactory53);
        org.jsoup.helper.HttpConnection httpConnection55 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection57 = httpConnection55.followRedirects(true);
        java.io.InputStream inputStream60 = null;
        org.jsoup.Connection connection62 = httpConnection55.data("application/x-www-form-urlencoded", "Content-Type", inputStream60, "multipart/form-data");
        java.net.Proxy proxy63 = null;
        org.jsoup.Connection connection64 = httpConnection55.proxy(proxy63);
        java.net.CookieStore cookieStore65 = httpConnection55.cookieStore();
        org.jsoup.Connection connection66 = httpConnection41.cookieStore(cookieStore65);
        org.jsoup.Connection connection67 = httpConnection18.cookieStore(cookieStore65);
        org.jsoup.Connection connection68 = httpConnection0.cookieStore(cookieStore65);
        org.jsoup.Connection connection71 = httpConnection0.proxy("multipart/form-data=multipart/form-data", (int) (short) 100);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNull(keyVal12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNull(keyVal24);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNull(keyVal37);
        org.junit.Assert.assertNotNull(request38);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNull(keyVal50);
        org.junit.Assert.assertNotNull(request51);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(connection54);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNotNull(connection62);
        org.junit.Assert.assertNotNull(connection64);
        org.junit.Assert.assertNotNull(cookieStore65);
        org.junit.Assert.assertNotNull(connection66);
        org.junit.Assert.assertNotNull(connection67);
        org.junit.Assert.assertNotNull(connection68);
        org.junit.Assert.assertNotNull(connection71);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test309");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.referrer("application/x-www-form-urlencoded");
        java.io.InputStream inputStream12 = null;
        org.jsoup.Connection connection13 = httpConnection0.requestBodyStream(inputStream12);
        org.jsoup.Connection connection15 = httpConnection0.requestBody("Content-Type");
        org.jsoup.Connection connection17 = httpConnection0.requestBody("");
        org.jsoup.Connection connection19 = httpConnection0.followRedirects(true);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection21 = httpConnection0.cookies(strMap20);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test310");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test311");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection9 = httpConnection7.userAgent("");
        java.net.Proxy proxy10 = null;
        org.jsoup.Connection connection11 = httpConnection7.proxy(proxy10);
        org.jsoup.Connection connection13 = httpConnection7.followRedirects(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection17 = httpConnection7.data(strArray16);
        java.io.InputStream inputStream18 = null;
        org.jsoup.Connection connection19 = httpConnection7.requestBodyStream(inputStream18);
        java.net.CookieStore cookieStore20 = httpConnection7.cookieStore();
        org.jsoup.Connection connection21 = httpConnection0.cookieStore(cookieStore20);
        org.jsoup.Connection.Response response22 = null;
        org.jsoup.Connection connection23 = httpConnection0.response(response22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection25 = httpConnection0.url("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'url' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(cookieStore20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test312");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.userAgent("hi!=");
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.cookies(strMap9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test313");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.data("Content-Encoding", "");
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test314");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        org.jsoup.Connection.Request request11 = httpConnection0.request();
        org.jsoup.Connection connection14 = httpConnection0.data("application/x-www-form-urlencoded", "multipart/form-data=Content-Type");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.cookies(strMap15);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test315");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("application/x-www-form-urlencoded=multipart/form-data");
        java.lang.String str5 = keyVal2.value();
        java.lang.String str6 = keyVal2.value();
        java.lang.String str7 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "multipart/form-data" + "'", str5, "multipart/form-data");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "multipart/form-data" + "'", str6, "multipart/form-data");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multipart/form-data" + "'", str7, "multipart/form-data");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test316");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.userAgent("hi!=");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.data(keyValCollection7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test317");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("application/x-www-form-urlencoded=multipart/form-data");
        java.lang.String str5 = keyVal2.value();
        org.jsoup.Connection.KeyVal keyVal7 = keyVal2.contentType("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "multipart/form-data" + "'", str5, "multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test318");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        org.jsoup.Connection.Request request11 = httpConnection0.request();
        org.jsoup.Connection connection14 = httpConnection0.data("application/x-www-form-urlencoded", "multipart/form-data=Content-Type");
        javax.net.ssl.SSLContext sSLContext15 = null;
        org.jsoup.Connection connection16 = httpConnection0.sslContext(sSLContext15);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test319");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslContext(sSLContext5);
        org.jsoup.Connection connection8 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response9 = null;
        org.jsoup.Connection connection10 = httpConnection0.response(response9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = httpConnection0.timeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Timeout milliseconds must be 0 (infinite) or greater");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test320");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator11 = null;
        org.jsoup.Connection connection12 = httpConnection0.auth(requestAuthenticator11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test321");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.Connection connection12 = httpConnection0.requestBodyStream(inputStream11);
        java.net.CookieStore cookieStore13 = httpConnection0.cookieStore();
        org.jsoup.Connection connection16 = httpConnection0.cookie("hi!=", "multipart/form-data=Content-Type");
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress17 = null;
        org.jsoup.Connection connection18 = httpConnection0.onResponseProgress(responseProgress17);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(cookieStore13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test322");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection11 = httpConnection0.data("application/x-www-form-urlencoded=multipart/form-data", "", inputStream9, "multipart/form-data=Content-Type");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test323");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection9 = httpConnection7.userAgent("");
        java.net.Proxy proxy10 = null;
        org.jsoup.Connection connection11 = httpConnection7.proxy(proxy10);
        org.jsoup.Connection connection13 = httpConnection7.followRedirects(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection17 = httpConnection7.data(strArray16);
        java.io.InputStream inputStream18 = null;
        org.jsoup.Connection connection19 = httpConnection7.requestBodyStream(inputStream18);
        java.net.CookieStore cookieStore20 = httpConnection7.cookieStore();
        org.jsoup.Connection connection21 = httpConnection0.cookieStore(cookieStore20);
        java.io.InputStream inputStream24 = null;
        org.jsoup.Connection connection26 = httpConnection0.data("application/x-www-form-urlencoded", "multipart/form-data", inputStream24, "Content-Type=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection28 = httpConnection0.url("multipart/form-data=Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'multipart/form-data=Content-Type', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(cookieStore20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection26);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test324");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Type", "application/x-www-form-urlencoded", inputStream2);
        org.jsoup.Connection.KeyVal keyVal5 = keyVal3.contentType("Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test325");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection9 = httpConnection0.cookies(strMap8);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test326");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection5 = httpConnection0.cookie("Content-Type", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext7 = null;
        org.jsoup.Connection connection8 = httpConnection6.sslContext(sSLContext7);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.userAgent("");
        org.jsoup.Connection connection13 = httpConnection9.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection9.data("hi!");
        org.jsoup.Connection.Request request16 = httpConnection9.request();
        org.jsoup.Connection connection17 = httpConnection6.request(request16);
        org.jsoup.Connection connection18 = httpConnection0.request(request16);
        org.jsoup.Connection connection21 = httpConnection0.cookie("hi!=", "hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test327");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.net.Proxy proxy11 = null;
        org.jsoup.Connection connection12 = httpConnection0.proxy(proxy11);
        org.jsoup.Connection connection14 = httpConnection0.requestBody("multipart/form-data=Content-Type");
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.userAgent("");
        org.jsoup.Connection connection19 = httpConnection15.requestBody("hi!");
        org.jsoup.Connection.Response response20 = null;
        org.jsoup.Connection connection21 = httpConnection15.response(response20);
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection24 = httpConnection22.userAgent("");
        java.net.Proxy proxy25 = null;
        org.jsoup.Connection connection26 = httpConnection22.proxy(proxy25);
        org.jsoup.Connection connection28 = httpConnection22.followRedirects(false);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection32 = httpConnection22.data(strArray31);
        java.io.InputStream inputStream33 = null;
        org.jsoup.Connection connection34 = httpConnection22.requestBodyStream(inputStream33);
        java.net.CookieStore cookieStore35 = httpConnection22.cookieStore();
        org.jsoup.Connection connection36 = httpConnection15.cookieStore(cookieStore35);
        org.jsoup.Connection connection37 = httpConnection0.cookieStore(cookieStore35);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection40 = httpConnection0.proxy("Content-Encoding", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(cookieStore35);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection37);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test328");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        org.jsoup.Connection.Request request13 = httpConnection0.request();
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress14 = null;
        org.jsoup.Connection connection15 = httpConnection0.onResponseProgress(responseProgress14);
        org.jsoup.Connection.Request request16 = httpConnection0.request();
        java.lang.Class<?> wildcardClass17 = httpConnection0.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test329");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        java.io.InputStream inputStream4 = keyVal2.inputStream();
        java.io.InputStream inputStream5 = keyVal2.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("multipart/form-data");
        boolean boolean8 = keyVal7.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test330");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        org.jsoup.Connection connection15 = httpConnection11.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal17 = httpConnection11.data("hi!");
        org.jsoup.Connection.Request request18 = httpConnection11.request();
        org.jsoup.Connection connection19 = httpConnection0.request(request18);
        org.jsoup.Connection connection22 = httpConnection0.cookie("multipart/form-data=Content-Type", "");
        org.jsoup.Connection connection24 = httpConnection0.maxBodySize((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal26 = httpConnection0.data("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(keyVal17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test331");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        java.util.Map<java.lang.String, java.lang.String> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection2 = httpConnection0.cookies(strMap1);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test332");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.Connection connection12 = httpConnection0.requestBodyStream(inputStream11);
        java.net.CookieStore cookieStore13 = httpConnection0.cookieStore();
        org.jsoup.parser.Parser parser14 = null;
        org.jsoup.Connection connection15 = httpConnection0.parser(parser14);
        org.jsoup.Connection connection18 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection20 = connection18.newRequest("application/x-www-form-urlencoded=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.parser.Parser.newInstance()\" because \"copy.parser\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(cookieStore13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test333");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection19 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!");
        java.io.InputStream inputStream22 = null;
        org.jsoup.Connection connection24 = httpConnection0.data("application/x-www-form-urlencoded=multipart/form-data", "Content-Type=", inputStream22, "multipart/form-data");
        org.jsoup.Connection connection27 = httpConnection0.header("multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory28 = null;
        org.jsoup.Connection connection29 = httpConnection0.sslSocketFactory(sSLSocketFactory28);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test334");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=application/x-www-form-urlencoded=multipart/form-data", "multipart/form-data=multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test335");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("multipart/form-data=multipart/form-data");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.inputStream(inputStream9);
        org.jsoup.Connection.KeyVal keyVal12 = keyVal6.contentType("hi!=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test336");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        org.jsoup.Connection connection16 = httpConnection0.sslSocketFactory(sSLSocketFactory15);
        javax.net.ssl.SSLContext sSLContext17 = null;
        org.jsoup.Connection connection18 = httpConnection0.sslContext(sSLContext17);
        org.jsoup.Connection connection21 = httpConnection0.proxy("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", 100);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test337");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection connection9 = httpConnection0.data("hi!", "Content-Type=");
        org.jsoup.Connection connection11 = httpConnection0.ignoreHttpErrors(false);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.data(strMap12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test338");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "hi!", inputStream2);
        java.lang.String str4 = keyVal3.key();
        java.lang.String str5 = keyVal3.contentType();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "multipart/form-data" + "'", str4, "multipart/form-data");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test339");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.userAgent("");
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection9.proxy(proxy12);
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection9.data("multipart/form-data");
        org.jsoup.Connection connection17 = httpConnection9.maxBodySize((int) '#');
        org.jsoup.Connection connection19 = httpConnection9.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress20 = null;
        org.jsoup.Connection connection21 = httpConnection9.onResponseProgress(responseProgress20);
        org.jsoup.Connection.Request request22 = httpConnection9.request();
        org.jsoup.Connection connection23 = httpConnection0.request(request22);
        org.jsoup.parser.Parser parser24 = null;
        org.jsoup.Connection connection25 = httpConnection0.parser(parser24);
        org.jsoup.Connection connection27 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection29 = httpConnection0.followRedirects(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection30 = httpConnection0.newRequest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.parser.Parser.newInstance()\" because \"copy.parser\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test340");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        org.jsoup.Connection connection16 = httpConnection0.sslSocketFactory(sSLSocketFactory15);
        org.jsoup.Connection connection18 = httpConnection0.maxBodySize(0);
        org.jsoup.Connection.Response response19 = null;
        org.jsoup.Connection connection20 = httpConnection0.response(response19);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test341");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        org.jsoup.Connection connection12 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection14 = httpConnection0.referrer("application/x-www-form-urlencoded=multipart/form-data");
        java.io.InputStream inputStream17 = null;
        org.jsoup.Connection connection19 = httpConnection0.data("multipart/form-data", "multipart/form-data=multipart/form-data", inputStream17, "Content-Encoding");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test342");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.requestBodyStream(inputStream10);
        org.jsoup.Connection connection14 = httpConnection0.cookie("Content-Encoding", "");
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.userAgent("");
        java.net.Proxy proxy18 = null;
        org.jsoup.Connection connection19 = httpConnection15.proxy(proxy18);
        org.jsoup.Connection connection21 = httpConnection15.followRedirects(false);
        org.jsoup.Connection connection23 = httpConnection15.timeout((int) ' ');
        org.jsoup.Connection connection26 = httpConnection15.cookie("application/x-www-form-urlencoded=multipart/form-data", "hi!=");
        org.jsoup.Connection connection28 = httpConnection15.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal31 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal33 = keyVal31.key("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal36 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str37 = keyVal36.contentType();
        java.io.InputStream inputStream38 = keyVal36.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray39 = new org.jsoup.Connection.KeyVal[] { keyVal31, keyVal36 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList40 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList40, keyValArray39);
        org.jsoup.Connection connection42 = httpConnection15.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList40);
        org.jsoup.Connection connection43 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList40);
        org.jsoup.Connection connection45 = httpConnection0.referrer("multipart/form-data=multipart/form-data");
        java.net.URL uRL46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection47 = httpConnection0.url(uRL46);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(keyVal31);
        org.junit.Assert.assertNotNull(keyVal33);
        org.junit.Assert.assertNotNull(keyVal36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(inputStream38);
        org.junit.Assert.assertNotNull(keyValArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection45);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test343");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        java.lang.String str4 = keyVal2.toString();
        java.lang.String str5 = keyVal2.contentType();
        org.jsoup.Connection.KeyVal keyVal7 = keyVal2.contentType("multipart/form-data=Content-Type");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "multipart/form-data=multipart/form-data" + "'", str4, "multipart/form-data=multipart/form-data");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test344");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!=', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test345");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.referrer("multipart/form-data=Content-Type");
        org.jsoup.Connection connection6 = httpConnection0.maxBodySize(100);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test346");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        org.jsoup.Connection connection15 = httpConnection11.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal17 = httpConnection11.data("hi!");
        org.jsoup.Connection.Request request18 = httpConnection11.request();
        org.jsoup.Connection connection19 = httpConnection0.request(request18);
        org.jsoup.Connection connection21 = httpConnection0.maxBodySize(1);
        org.jsoup.Connection connection23 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection26 = httpConnection0.cookie("multipart/form-data=Content-Type", "multipart/form-data=multipart/form-data");
        org.jsoup.Connection connection28 = httpConnection0.timeout((int) (short) 0);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(keyVal17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test347");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator17 = null;
        org.jsoup.Connection connection18 = httpConnection0.auth(requestAuthenticator17);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test348");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "application/x-www-form-urlencoded=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test349");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Type");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.inputStream(inputStream7);
        java.lang.String str9 = keyVal2.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.key("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test350");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        java.io.InputStream inputStream4 = keyVal2.inputStream();
        java.io.InputStream inputStream5 = keyVal2.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("multipart/form-data");
        java.lang.String str8 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "multipart/form-data" + "'", str8, "multipart/form-data");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test351");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.net.Proxy proxy11 = null;
        org.jsoup.Connection connection12 = httpConnection0.proxy(proxy11);
        org.jsoup.Connection connection14 = httpConnection0.requestBody("multipart/form-data=Content-Type");
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.userAgent("");
        org.jsoup.Connection connection19 = httpConnection15.requestBody("hi!");
        org.jsoup.Connection.Response response20 = null;
        org.jsoup.Connection connection21 = httpConnection15.response(response20);
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection24 = httpConnection22.userAgent("");
        java.net.Proxy proxy25 = null;
        org.jsoup.Connection connection26 = httpConnection22.proxy(proxy25);
        org.jsoup.Connection connection28 = httpConnection22.followRedirects(false);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection32 = httpConnection22.data(strArray31);
        java.io.InputStream inputStream33 = null;
        org.jsoup.Connection connection34 = httpConnection22.requestBodyStream(inputStream33);
        java.net.CookieStore cookieStore35 = httpConnection22.cookieStore();
        org.jsoup.Connection connection36 = httpConnection15.cookieStore(cookieStore35);
        org.jsoup.Connection connection37 = httpConnection0.cookieStore(cookieStore35);
        java.net.CookieStore cookieStore38 = null;
        org.jsoup.Connection connection39 = httpConnection0.cookieStore(cookieStore38);
        java.lang.Class<?> wildcardClass40 = httpConnection0.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(cookieStore35);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test352");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.referrer("application/x-www-form-urlencoded");
        java.io.InputStream inputStream12 = null;
        org.jsoup.Connection connection13 = httpConnection0.requestBodyStream(inputStream12);
        org.jsoup.Connection connection15 = httpConnection0.requestBody("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection18 = httpConnection16.userAgent("");
        java.net.Proxy proxy19 = null;
        org.jsoup.Connection connection20 = httpConnection16.proxy(proxy19);
        org.jsoup.Connection.KeyVal keyVal22 = httpConnection16.data("multipart/form-data");
        org.jsoup.Connection connection25 = httpConnection16.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext27 = null;
        org.jsoup.Connection connection28 = httpConnection26.sslContext(sSLContext27);
        org.jsoup.helper.HttpConnection httpConnection29 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection31 = httpConnection29.userAgent("");
        org.jsoup.Connection connection33 = httpConnection29.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal35 = httpConnection29.data("hi!");
        org.jsoup.Connection.Request request36 = httpConnection29.request();
        org.jsoup.Connection connection37 = httpConnection26.request(request36);
        org.jsoup.Connection connection38 = httpConnection16.request(request36);
        org.jsoup.helper.HttpConnection httpConnection39 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext40 = null;
        org.jsoup.Connection connection41 = httpConnection39.sslContext(sSLContext40);
        org.jsoup.helper.HttpConnection httpConnection42 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection44 = httpConnection42.userAgent("");
        org.jsoup.Connection connection46 = httpConnection42.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal48 = httpConnection42.data("hi!");
        org.jsoup.Connection.Request request49 = httpConnection42.request();
        org.jsoup.Connection connection50 = httpConnection39.request(request49);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory51 = null;
        org.jsoup.Connection connection52 = httpConnection39.sslSocketFactory(sSLSocketFactory51);
        org.jsoup.helper.HttpConnection httpConnection53 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection55 = httpConnection53.followRedirects(true);
        java.io.InputStream inputStream58 = null;
        org.jsoup.Connection connection60 = httpConnection53.data("application/x-www-form-urlencoded", "Content-Type", inputStream58, "multipart/form-data");
        java.net.Proxy proxy61 = null;
        org.jsoup.Connection connection62 = httpConnection53.proxy(proxy61);
        java.net.CookieStore cookieStore63 = httpConnection53.cookieStore();
        org.jsoup.Connection connection64 = httpConnection39.cookieStore(cookieStore63);
        org.jsoup.Connection connection65 = httpConnection16.cookieStore(cookieStore63);
        org.jsoup.Connection connection66 = httpConnection0.cookieStore(cookieStore63);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document67 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNull(keyVal22);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNull(keyVal35);
        org.junit.Assert.assertNotNull(request36);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNull(keyVal48);
        org.junit.Assert.assertNotNull(request49);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(connection55);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(connection62);
        org.junit.Assert.assertNotNull(cookieStore63);
        org.junit.Assert.assertNotNull(connection64);
        org.junit.Assert.assertNotNull(connection65);
        org.junit.Assert.assertNotNull(connection66);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test353");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        org.jsoup.Connection.Request request11 = httpConnection0.request();
        org.jsoup.Connection connection14 = httpConnection0.data("application/x-www-form-urlencoded", "multipart/form-data=Content-Type");
        org.jsoup.Connection connection16 = httpConnection0.ignoreContentType(false);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test354");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        org.jsoup.Connection.Request request11 = httpConnection0.request();
        org.jsoup.Connection connection14 = httpConnection0.data("application/x-www-form-urlencoded", "multipart/form-data=Content-Type");
        java.io.InputStream inputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = httpConnection0.data("", "", inputStream17);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test355");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("multipart/form-data=Content-Type");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.inputStream(inputStream7);
        java.lang.String str9 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "multipart/form-data=Content-Type" + "'", str9, "multipart/form-data=Content-Type");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test356");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.parser.Parser parser7 = null;
        org.jsoup.Connection connection8 = httpConnection0.parser(parser7);
        org.jsoup.Connection connection10 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection connection12 = httpConnection0.followRedirects(true);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test357");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        java.net.CookieStore cookieStore13 = httpConnection0.cookieStore();
        org.jsoup.Connection connection15 = httpConnection0.followRedirects(false);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(cookieStore13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test358");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=application/x-www-form-urlencoded=multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.contentType();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test359");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection9 = httpConnection7.userAgent("");
        java.net.Proxy proxy10 = null;
        org.jsoup.Connection connection11 = httpConnection7.proxy(proxy10);
        org.jsoup.Connection connection13 = httpConnection7.followRedirects(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection17 = httpConnection7.data(strArray16);
        java.io.InputStream inputStream18 = null;
        org.jsoup.Connection connection19 = httpConnection7.requestBodyStream(inputStream18);
        java.net.CookieStore cookieStore20 = httpConnection7.cookieStore();
        org.jsoup.Connection connection21 = httpConnection0.cookieStore(cookieStore20);
        java.io.InputStream inputStream24 = null;
        org.jsoup.Connection connection26 = httpConnection0.data("application/x-www-form-urlencoded", "multipart/form-data", inputStream24, "Content-Type=");
        javax.net.ssl.SSLContext sSLContext27 = null;
        org.jsoup.Connection connection28 = httpConnection0.sslContext(sSLContext27);
        org.jsoup.Connection connection30 = httpConnection0.ignoreHttpErrors(true);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(cookieStore20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test360");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Type");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.inputStream(inputStream7);
        java.lang.String str9 = keyVal2.contentType();
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.value("");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test361");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.inputStream(inputStream5);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test362");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Connection connection12 = httpConnection0.ignoreHttpErrors(false);
        java.io.InputStream inputStream15 = null;
        org.jsoup.Connection connection16 = httpConnection0.data("hi!", "application/x-www-form-urlencoded=multipart/form-data", inputStream15);
        java.io.InputStream inputStream19 = null;
        org.jsoup.Connection connection20 = httpConnection0.data("application/x-www-form-urlencoded", "hi!=application/x-www-form-urlencoded=multipart/form-data", inputStream19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection22 = httpConnection0.url("Content-Type=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Content-Type=', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test363");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        java.lang.String str8 = keyVal2.value();
        java.lang.String str9 = keyVal2.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test364");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        org.jsoup.Connection connection14 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection16 = httpConnection0.referrer("hi!=");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = httpConnection0.cookies(strMap17);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test365");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslContext(sSLContext5);
        org.jsoup.Connection connection8 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response9 = null;
        org.jsoup.Connection connection10 = httpConnection0.response(response9);
        org.jsoup.Connection connection13 = httpConnection0.data("multipart/form-data", "");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test366");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        java.net.CookieStore cookieStore13 = httpConnection0.cookieStore();
        org.jsoup.Connection connection16 = httpConnection0.header("application/x-www-form-urlencoded", "Content-Encoding");
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = httpConnection0.url(uRL17);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(cookieStore13);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test367");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=application/x-www-form-urlencoded=multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36" + "'", str6, "hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test368");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection8 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection connection11 = httpConnection0.cookie("application/x-www-form-urlencoded=multipart/form-data", "hi!=");
        org.jsoup.Connection connection13 = httpConnection0.timeout((int) (byte) 10);
        java.io.InputStream inputStream16 = null;
        org.jsoup.Connection connection17 = httpConnection0.data("multipart/form-data=multipart/form-data", "", inputStream16);
        org.jsoup.helper.HttpConnection httpConnection18 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection20 = httpConnection18.followRedirects(true);
        java.io.InputStream inputStream23 = null;
        org.jsoup.Connection connection25 = httpConnection18.data("application/x-www-form-urlencoded", "Content-Type", inputStream23, "multipart/form-data");
        java.net.Proxy proxy26 = null;
        org.jsoup.Connection connection27 = httpConnection18.proxy(proxy26);
        java.io.InputStream inputStream28 = null;
        org.jsoup.Connection connection29 = httpConnection18.requestBodyStream(inputStream28);
        org.jsoup.helper.HttpConnection httpConnection30 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection32 = httpConnection30.userAgent("");
        java.net.Proxy proxy33 = null;
        org.jsoup.Connection connection34 = httpConnection30.proxy(proxy33);
        org.jsoup.Connection.KeyVal keyVal36 = httpConnection30.data("multipart/form-data");
        org.jsoup.Connection connection39 = httpConnection30.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection40 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext41 = null;
        org.jsoup.Connection connection42 = httpConnection40.sslContext(sSLContext41);
        org.jsoup.helper.HttpConnection httpConnection43 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection45 = httpConnection43.userAgent("");
        org.jsoup.Connection connection47 = httpConnection43.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal49 = httpConnection43.data("hi!");
        org.jsoup.Connection.Request request50 = httpConnection43.request();
        org.jsoup.Connection connection51 = httpConnection40.request(request50);
        org.jsoup.Connection connection52 = httpConnection30.request(request50);
        org.jsoup.helper.HttpConnection httpConnection53 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext54 = null;
        org.jsoup.Connection connection55 = httpConnection53.sslContext(sSLContext54);
        org.jsoup.Connection connection57 = httpConnection53.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext58 = null;
        org.jsoup.Connection connection59 = httpConnection53.sslContext(sSLContext58);
        org.jsoup.Connection connection61 = httpConnection53.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response62 = null;
        org.jsoup.Connection connection63 = httpConnection53.response(response62);
        org.jsoup.helper.HttpConnection httpConnection64 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection66 = httpConnection64.userAgent("");
        java.net.Proxy proxy67 = null;
        org.jsoup.Connection connection68 = httpConnection64.proxy(proxy67);
        org.jsoup.Connection connection70 = httpConnection64.followRedirects(false);
        org.jsoup.Connection connection72 = httpConnection64.timeout((int) ' ');
        org.jsoup.Connection connection75 = httpConnection64.cookie("application/x-www-form-urlencoded=multipart/form-data", "hi!=");
        org.jsoup.Connection connection77 = httpConnection64.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal80 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal82 = keyVal80.key("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal85 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str86 = keyVal85.contentType();
        java.io.InputStream inputStream87 = keyVal85.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray88 = new org.jsoup.Connection.KeyVal[] { keyVal80, keyVal85 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList89 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList89, keyValArray88);
        org.jsoup.Connection connection91 = httpConnection64.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList89);
        org.jsoup.Connection connection92 = httpConnection53.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList89);
        org.jsoup.Connection connection93 = httpConnection30.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList89);
        org.jsoup.Connection connection94 = httpConnection18.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList89);
        org.jsoup.Connection connection95 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList89);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNull(keyVal36);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNull(keyVal49);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(connection55);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNotNull(connection59);
        org.junit.Assert.assertNotNull(connection61);
        org.junit.Assert.assertNotNull(connection63);
        org.junit.Assert.assertNotNull(connection66);
        org.junit.Assert.assertNotNull(connection68);
        org.junit.Assert.assertNotNull(connection70);
        org.junit.Assert.assertNotNull(connection72);
        org.junit.Assert.assertNotNull(connection75);
        org.junit.Assert.assertNotNull(connection77);
        org.junit.Assert.assertNotNull(keyVal80);
        org.junit.Assert.assertNotNull(keyVal82);
        org.junit.Assert.assertNotNull(keyVal85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNull(inputStream87);
        org.junit.Assert.assertNotNull(keyValArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(connection91);
        org.junit.Assert.assertNotNull(connection92);
        org.junit.Assert.assertNotNull(connection93);
        org.junit.Assert.assertNotNull(connection94);
        org.junit.Assert.assertNotNull(connection95);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test369");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.parser.Parser parser7 = null;
        org.jsoup.Connection connection8 = httpConnection0.parser(parser7);
        org.jsoup.Connection connection10 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy14 = null;
        org.jsoup.Connection connection15 = httpConnection11.proxy(proxy14);
        org.jsoup.Connection.Response response16 = null;
        org.jsoup.Connection connection17 = httpConnection11.response(response16);
        java.io.InputStream inputStream20 = null;
        org.jsoup.Connection connection21 = httpConnection11.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream20);
        org.jsoup.Connection.Request request22 = httpConnection11.request();
        org.jsoup.Connection connection23 = httpConnection0.request(request22);
        org.jsoup.Connection connection26 = httpConnection0.header("Content-Type", "application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection26);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test370");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.requestBodyStream(inputStream10);
        org.jsoup.parser.Parser parser12 = null;
        org.jsoup.Connection connection13 = httpConnection0.parser(parser12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection15 = httpConnection0.postDataCharset("multipart/form-data=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: multipart/form-data=multipart/form-data");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test371");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Connection connection12 = httpConnection0.ignoreHttpErrors(false);
        java.io.InputStream inputStream15 = null;
        org.jsoup.Connection connection16 = httpConnection0.data("hi!", "application/x-www-form-urlencoded=multipart/form-data", inputStream15);
        java.io.InputStream inputStream19 = null;
        org.jsoup.Connection connection20 = httpConnection0.data("application/x-www-form-urlencoded", "hi!=application/x-www-form-urlencoded=multipart/form-data", inputStream19);
        java.io.InputStream inputStream23 = null;
        org.jsoup.Connection connection25 = httpConnection0.data("hi!=", "multipart/form-data=multipart/form-data", inputStream23, "application/x-www-form-urlencoded");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection25);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test372");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("hi!");
        org.jsoup.Connection.Request request7 = httpConnection0.request();
        org.jsoup.Connection connection9 = httpConnection0.ignoreContentType(true);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.cookies(strMap10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test373");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        java.lang.Class<?> wildcardClass5 = httpConnection0.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test374");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.net.Proxy proxy11 = null;
        org.jsoup.Connection connection12 = httpConnection0.proxy(proxy11);
        org.jsoup.Connection connection15 = httpConnection0.proxy("multipart/form-data", 1);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.headers(strMap16);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test375");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test376");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection6 = httpConnection0.maxBodySize((int) (short) 10);
        javax.net.ssl.SSLContext sSLContext7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslContext(sSLContext7);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test377");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.url("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test378");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.Connection connection12 = httpConnection0.referrer("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = connection12.newRequest("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'url' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test379");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.postDataCharset("Content-Type=");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Content-Type=");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test380");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator10 = null;
        org.jsoup.Connection connection11 = httpConnection0.auth(requestAuthenticator10);
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection0.proxy(proxy12);
        org.jsoup.Connection connection15 = httpConnection0.userAgent("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress16 = null;
        org.jsoup.Connection connection17 = httpConnection0.onResponseProgress(responseProgress16);
        org.jsoup.helper.HttpConnection httpConnection18 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext19 = null;
        org.jsoup.Connection connection20 = httpConnection18.sslContext(sSLContext19);
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection23 = httpConnection21.userAgent("");
        org.jsoup.Connection connection25 = httpConnection21.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal27 = httpConnection21.data("hi!");
        org.jsoup.Connection.Request request28 = httpConnection21.request();
        org.jsoup.Connection connection29 = httpConnection18.request(request28);
        org.jsoup.Connection connection30 = httpConnection0.request(request28);
        java.io.InputStream inputStream33 = null;
        org.jsoup.Connection connection35 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "multipart/form-data", inputStream33, "application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection httpConnection36 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection38 = httpConnection36.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy39 = null;
        org.jsoup.Connection connection40 = httpConnection36.proxy(proxy39);
        org.jsoup.Connection.Response response41 = null;
        org.jsoup.Connection connection42 = httpConnection36.response(response41);
        java.io.InputStream inputStream45 = null;
        org.jsoup.Connection connection46 = httpConnection36.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream45);
        org.jsoup.Connection.Request request47 = httpConnection36.request();
        java.net.CookieStore cookieStore48 = httpConnection36.cookieStore();
        org.jsoup.Connection connection49 = httpConnection0.cookieStore(cookieStore48);
        java.io.InputStream inputStream50 = null;
        org.jsoup.Connection connection51 = httpConnection0.requestBodyStream(inputStream50);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNull(keyVal27);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertNotNull(cookieStore48);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection51);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test381");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslContext(sSLContext5);
        org.jsoup.Connection connection8 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response9 = null;
        org.jsoup.Connection connection10 = httpConnection0.response(response9);
        java.net.Proxy proxy11 = null;
        org.jsoup.Connection connection12 = httpConnection0.proxy(proxy11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test382");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("application/x-www-form-urlencoded", "multipart/form-data", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        boolean boolean5 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "application/x-www-form-urlencoded=multipart/form-data" + "'", str4, "application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test383");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection5 = httpConnection0.cookie("Content-Type", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext7 = null;
        org.jsoup.Connection connection8 = httpConnection6.sslContext(sSLContext7);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.userAgent("");
        org.jsoup.Connection connection13 = httpConnection9.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection9.data("hi!");
        org.jsoup.Connection.Request request16 = httpConnection9.request();
        org.jsoup.Connection connection17 = httpConnection6.request(request16);
        org.jsoup.Connection connection18 = httpConnection0.request(request16);
        org.jsoup.parser.Parser parser19 = null;
        org.jsoup.Connection connection20 = httpConnection0.parser(parser19);
        java.io.InputStream inputStream23 = null;
        org.jsoup.Connection connection24 = httpConnection0.data("hi!=application/x-www-form-urlencoded=multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream23);
        java.net.CookieStore cookieStore25 = httpConnection0.cookieStore();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory26 = null;
        org.jsoup.Connection connection27 = httpConnection0.sslSocketFactory(sSLSocketFactory26);
        java.net.URL uRL28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection29 = httpConnection0.url(uRL28);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(cookieStore25);
        org.junit.Assert.assertNotNull(connection27);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test384");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        org.jsoup.Connection.Request request11 = httpConnection0.request();
        java.net.CookieStore cookieStore12 = httpConnection0.cookieStore();
        org.jsoup.Connection.KeyVal keyVal14 = httpConnection0.data("multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(cookieStore12);
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test385");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("application/x-www-form-urlencoded=multipart/form-data");
        boolean boolean7 = keyVal6.hasInputStream();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal6.inputStream(inputStream8);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test386");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection6 = httpConnection0.maxBodySize((int) (short) 10);
        org.jsoup.parser.Parser parser7 = null;
        org.jsoup.Connection connection8 = httpConnection0.parser(parser7);
        java.io.InputStream inputStream11 = null;
        org.jsoup.Connection connection12 = httpConnection0.data("multipart/form-data=Content-Type", "", inputStream11);
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = httpConnection0.method(method13);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test387");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection7 = httpConnection5.followRedirects(true);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection12 = httpConnection5.data("application/x-www-form-urlencoded", "Content-Type", inputStream10, "multipart/form-data");
        java.net.Proxy proxy13 = null;
        org.jsoup.Connection connection14 = httpConnection5.proxy(proxy13);
        org.jsoup.Connection connection16 = httpConnection5.referrer("application/x-www-form-urlencoded");
        java.io.InputStream inputStream17 = null;
        org.jsoup.Connection connection18 = httpConnection5.requestBodyStream(inputStream17);
        org.jsoup.Connection connection20 = httpConnection5.requestBody("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection23 = httpConnection21.userAgent("");
        java.net.Proxy proxy24 = null;
        org.jsoup.Connection connection25 = httpConnection21.proxy(proxy24);
        org.jsoup.Connection.KeyVal keyVal27 = httpConnection21.data("multipart/form-data");
        org.jsoup.Connection connection30 = httpConnection21.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection31 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext32 = null;
        org.jsoup.Connection connection33 = httpConnection31.sslContext(sSLContext32);
        org.jsoup.helper.HttpConnection httpConnection34 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection36 = httpConnection34.userAgent("");
        org.jsoup.Connection connection38 = httpConnection34.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal40 = httpConnection34.data("hi!");
        org.jsoup.Connection.Request request41 = httpConnection34.request();
        org.jsoup.Connection connection42 = httpConnection31.request(request41);
        org.jsoup.Connection connection43 = httpConnection21.request(request41);
        org.jsoup.helper.HttpConnection httpConnection44 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext45 = null;
        org.jsoup.Connection connection46 = httpConnection44.sslContext(sSLContext45);
        org.jsoup.helper.HttpConnection httpConnection47 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection49 = httpConnection47.userAgent("");
        org.jsoup.Connection connection51 = httpConnection47.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal53 = httpConnection47.data("hi!");
        org.jsoup.Connection.Request request54 = httpConnection47.request();
        org.jsoup.Connection connection55 = httpConnection44.request(request54);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory56 = null;
        org.jsoup.Connection connection57 = httpConnection44.sslSocketFactory(sSLSocketFactory56);
        org.jsoup.helper.HttpConnection httpConnection58 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection60 = httpConnection58.followRedirects(true);
        java.io.InputStream inputStream63 = null;
        org.jsoup.Connection connection65 = httpConnection58.data("application/x-www-form-urlencoded", "Content-Type", inputStream63, "multipart/form-data");
        java.net.Proxy proxy66 = null;
        org.jsoup.Connection connection67 = httpConnection58.proxy(proxy66);
        java.net.CookieStore cookieStore68 = httpConnection58.cookieStore();
        org.jsoup.Connection connection69 = httpConnection44.cookieStore(cookieStore68);
        org.jsoup.Connection connection70 = httpConnection21.cookieStore(cookieStore68);
        org.jsoup.Connection connection71 = httpConnection5.cookieStore(cookieStore68);
        org.jsoup.Connection connection72 = httpConnection0.cookieStore(cookieStore68);
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "hi!", "hi!=application/x-www-form-urlencoded=multipart/form-data" };
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection77 = httpConnection0.data(strArray76);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Must supply an even number of key value pairs");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNull(keyVal27);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNull(keyVal40);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNull(keyVal53);
        org.junit.Assert.assertNotNull(request54);
        org.junit.Assert.assertNotNull(connection55);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(connection65);
        org.junit.Assert.assertNotNull(connection67);
        org.junit.Assert.assertNotNull(cookieStore68);
        org.junit.Assert.assertNotNull(connection69);
        org.junit.Assert.assertNotNull(connection70);
        org.junit.Assert.assertNotNull(connection71);
        org.junit.Assert.assertNotNull(connection72);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "hi!", "hi!", "hi!=application/x-www-form-urlencoded=multipart/form-data" });
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test388");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        java.net.CookieStore cookieStore9 = httpConnection0.cookieStore();
        org.jsoup.Connection connection11 = httpConnection0.timeout((int) (short) 0);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(cookieStore9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test389");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.value("application/x-www-form-urlencoded=multipart/form-data");
        boolean boolean7 = keyVal6.hasInputStream();
        org.jsoup.Connection.KeyVal keyVal9 = keyVal6.contentType("Content-Type");
        java.lang.String str10 = keyVal6.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Content-Type" + "'", str10, "Content-Type");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test390");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        org.jsoup.Connection connection15 = httpConnection11.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal17 = httpConnection11.data("hi!");
        org.jsoup.Connection.Request request18 = httpConnection11.request();
        org.jsoup.Connection connection19 = httpConnection0.request(request18);
        org.jsoup.Connection connection22 = httpConnection0.cookie("multipart/form-data=Content-Type", "");
        org.jsoup.Connection connection24 = httpConnection0.maxBodySize((int) (short) 100);
        java.io.InputStream inputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection29 = httpConnection0.data("", "multipart/form-data", inputStream27, "multipart/form-data=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(keyVal17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test391");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        java.lang.Class<?> wildcardClass9 = httpConnection0.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test392");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        org.jsoup.Connection connection13 = httpConnection0.data("hi!=", "multipart/form-data=Content-Type");
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection15 = httpConnection0.url(uRL14);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test393");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.requestBodyStream(inputStream10);
        org.jsoup.Connection connection14 = httpConnection0.cookie("Content-Encoding", "");
        org.jsoup.Connection connection16 = httpConnection0.userAgent("");
        java.net.Proxy proxy17 = null;
        org.jsoup.Connection connection18 = httpConnection0.proxy(proxy17);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test394");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection5 = httpConnection0.cookie("Content-Type", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext7 = null;
        org.jsoup.Connection connection8 = httpConnection6.sslContext(sSLContext7);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.userAgent("");
        org.jsoup.Connection connection13 = httpConnection9.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection9.data("hi!");
        org.jsoup.Connection.Request request16 = httpConnection9.request();
        org.jsoup.Connection connection17 = httpConnection6.request(request16);
        org.jsoup.Connection connection18 = httpConnection0.request(request16);
        org.jsoup.parser.Parser parser19 = null;
        org.jsoup.Connection connection20 = httpConnection0.parser(parser19);
        java.io.InputStream inputStream23 = null;
        org.jsoup.Connection connection24 = httpConnection0.data("hi!=application/x-www-form-urlencoded=multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream23);
        org.jsoup.Connection connection26 = httpConnection0.userAgent("Content-Type=");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test395");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.userAgent("");
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection9.proxy(proxy12);
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection9.data("multipart/form-data");
        org.jsoup.Connection connection17 = httpConnection9.maxBodySize((int) '#');
        org.jsoup.Connection connection19 = httpConnection9.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress20 = null;
        org.jsoup.Connection connection21 = httpConnection9.onResponseProgress(responseProgress20);
        org.jsoup.Connection.Request request22 = httpConnection9.request();
        org.jsoup.Connection connection23 = httpConnection0.request(request22);
        org.jsoup.parser.Parser parser24 = null;
        org.jsoup.Connection connection25 = httpConnection0.parser(parser24);
        javax.net.ssl.SSLContext sSLContext26 = null;
        org.jsoup.Connection connection27 = httpConnection0.sslContext(sSLContext26);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory28 = null;
        org.jsoup.Connection connection29 = httpConnection0.sslSocketFactory(sSLSocketFactory28);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test396");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.data("", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test397");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Type");
        java.lang.String str5 = keyVal4.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Type" + "'", str5, "Content-Type");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test398");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(false);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test399");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("application/x-www-form-urlencoded=multipart/form-data");
        java.lang.String str5 = keyVal2.value();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        java.lang.String str8 = keyVal7.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "multipart/form-data" + "'", str5, "multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test400");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Type=", "application/x-www-form-urlencoded=multipart/form-data", inputStream2);
        java.lang.String str4 = keyVal3.contentType();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test401");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection19 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!");
        org.jsoup.helper.HttpConnection httpConnection20 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection22 = httpConnection20.userAgent("");
        org.jsoup.Connection connection24 = httpConnection20.requestBody("hi!");
        org.jsoup.Connection connection27 = httpConnection20.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress28 = null;
        org.jsoup.Connection connection29 = httpConnection20.onResponseProgress(responseProgress28);
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.jsoup.Connection connection31 = httpConnection20.data(strArray30);
        org.jsoup.Connection connection32 = httpConnection0.data(strArray30);
        java.io.InputStream inputStream33 = null;
        org.jsoup.Connection connection34 = httpConnection0.requestBodyStream(inputStream33);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test402");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.timeout(1);
        org.jsoup.Connection connection6 = httpConnection0.requestBody("Content-Type");
        org.jsoup.Connection connection8 = httpConnection0.followRedirects(true);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test403");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.Connection connection12 = httpConnection0.requestBodyStream(inputStream11);
        java.net.CookieStore cookieStore13 = httpConnection0.cookieStore();
        org.jsoup.Connection connection16 = httpConnection0.proxy("application/x-www-form-urlencoded=multipart/form-data", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = httpConnection0.data(strMap17);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(cookieStore13);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test404");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.Connection connection12 = httpConnection0.requestBodyStream(inputStream11);
        java.net.CookieStore cookieStore13 = httpConnection0.cookieStore();
        org.jsoup.parser.Parser parser14 = null;
        org.jsoup.Connection connection15 = httpConnection0.parser(parser14);
        org.jsoup.Connection connection18 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded");
        org.jsoup.Connection connection20 = httpConnection0.ignoreContentType(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection21 = httpConnection0.newRequest();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.parser.Parser.newInstance()\" because \"copy.parser\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(cookieStore13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test405");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection12 = httpConnection10.userAgent("");
        java.net.Proxy proxy13 = null;
        org.jsoup.Connection connection14 = httpConnection10.proxy(proxy13);
        org.jsoup.Connection connection16 = httpConnection10.followRedirects(false);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection20 = httpConnection10.data(strArray19);
        org.jsoup.Connection connection21 = httpConnection0.data(strArray19);
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection23 = httpConnection0.url(uRL22);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test406");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "multipart/form-data" + "'", str3, "multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test407");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.referrer("");
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection12 = httpConnection10.userAgent("");
        java.net.Proxy proxy13 = null;
        org.jsoup.Connection connection14 = httpConnection10.proxy(proxy13);
        org.jsoup.Connection.KeyVal keyVal16 = httpConnection10.data("multipart/form-data");
        org.jsoup.Connection connection18 = httpConnection10.maxBodySize((int) '#');
        org.jsoup.Connection connection20 = httpConnection10.timeout((int) '4');
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection24 = httpConnection10.data(strArray23);
        org.jsoup.Connection connection25 = httpConnection0.data(strArray23);
        org.jsoup.Connection.Response response26 = null;
        org.jsoup.Connection connection27 = httpConnection0.response(response26);
        org.jsoup.Connection connection30 = httpConnection0.proxy("multipart/form-data=multipart/form-data", (int) (short) 0);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNull(keyVal16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection30);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test408");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        java.net.Proxy proxy1 = null;
        org.jsoup.Connection connection2 = httpConnection0.proxy(proxy1);
        org.jsoup.Connection.Method method3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection4 = httpConnection0.method(method3);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test409");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection5 = httpConnection0.cookie("Content-Type", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext7 = null;
        org.jsoup.Connection connection8 = httpConnection6.sslContext(sSLContext7);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.userAgent("");
        org.jsoup.Connection connection13 = httpConnection9.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection9.data("hi!");
        org.jsoup.Connection.Request request16 = httpConnection9.request();
        org.jsoup.Connection connection17 = httpConnection6.request(request16);
        org.jsoup.Connection connection18 = httpConnection0.request(request16);
        org.jsoup.parser.Parser parser19 = null;
        org.jsoup.Connection connection20 = httpConnection0.parser(parser19);
        java.io.InputStream inputStream23 = null;
        org.jsoup.Connection connection24 = httpConnection0.data("hi!=application/x-www-form-urlencoded=multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection26 = connection24.newRequest("application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.parser.Parser.newInstance()\" because \"copy.parser\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection24);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test410");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection8 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection connection11 = httpConnection0.cookie("application/x-www-form-urlencoded=multipart/form-data", "hi!=");
        org.jsoup.Connection connection13 = httpConnection0.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal18 = keyVal16.key("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal21 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str22 = keyVal21.contentType();
        java.io.InputStream inputStream23 = keyVal21.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray24 = new org.jsoup.Connection.KeyVal[] { keyVal16, keyVal21 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList25 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList25, keyValArray24);
        org.jsoup.Connection connection27 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection29 = httpConnection0.postDataCharset("application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: application/x-www-form-urlencoded");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(keyVal16);
        org.junit.Assert.assertNotNull(keyVal18);
        org.junit.Assert.assertNotNull(keyVal21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNotNull(keyValArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(connection27);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test411");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator10 = null;
        org.jsoup.Connection connection11 = httpConnection0.auth(requestAuthenticator10);
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection0.proxy(proxy12);
        org.jsoup.Connection connection15 = httpConnection0.userAgent("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress16 = null;
        org.jsoup.Connection connection17 = httpConnection0.onResponseProgress(responseProgress16);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress18 = null;
        org.jsoup.Connection connection19 = httpConnection0.onResponseProgress(responseProgress18);
        org.jsoup.Connection connection21 = httpConnection0.ignoreContentType(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection23 = httpConnection0.postDataCharset("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test412");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection19 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!");
        java.io.InputStream inputStream22 = null;
        org.jsoup.Connection connection24 = httpConnection0.data("application/x-www-form-urlencoded=multipart/form-data", "Content-Type=", inputStream22, "multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document25 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection24);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test413");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        org.jsoup.Connection connection12 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection14 = httpConnection0.userAgent("");
        org.jsoup.parser.Parser parser15 = null;
        org.jsoup.Connection connection16 = httpConnection0.parser(parser15);
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection19 = httpConnection17.userAgent("");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator20 = null;
        org.jsoup.Connection connection21 = httpConnection17.auth(requestAuthenticator20);
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection24 = httpConnection22.userAgent("");
        java.net.Proxy proxy25 = null;
        org.jsoup.Connection connection26 = httpConnection22.proxy(proxy25);
        org.jsoup.Connection connection28 = httpConnection22.followRedirects(false);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection32 = httpConnection22.data(strArray31);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress33 = null;
        org.jsoup.Connection connection34 = httpConnection22.onResponseProgress(responseProgress33);
        java.net.CookieStore cookieStore35 = httpConnection22.cookieStore();
        org.jsoup.Connection connection36 = httpConnection17.cookieStore(cookieStore35);
        org.jsoup.Connection connection37 = httpConnection0.cookieStore(cookieStore35);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(cookieStore35);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection37);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test414");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "application/x-www-form-urlencoded", inputStream2);
        org.jsoup.Connection.KeyVal keyVal5 = keyVal3.contentType("application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test415");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.referrer("application/x-www-form-urlencoded");
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.newRequest(uRL12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test416");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection11 = httpConnection0.header("hi!=application/x-www-form-urlencoded=multipart/form-data", "Content-Type=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = connection11.newRequest("multipart/form-data=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'multipart/form-data=multipart/form-data', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test417");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        org.jsoup.Connection connection12 = httpConnection0.followRedirects(false);
        org.jsoup.Connection.KeyVal keyVal14 = httpConnection0.data("application/x-www-form-urlencoded=multipart/form-data");
        javax.net.ssl.SSLContext sSLContext15 = null;
        org.jsoup.Connection connection16 = httpConnection0.sslContext(sSLContext15);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNull(keyVal14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test418");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslSocketFactory(sSLSocketFactory5);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection7.proxy(proxy8);
        java.net.CookieStore cookieStore10 = httpConnection7.cookieStore();
        org.jsoup.Connection connection11 = httpConnection0.cookieStore(cookieStore10);
        org.jsoup.helper.HttpConnection httpConnection12 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection14 = httpConnection12.userAgent("");
        java.net.Proxy proxy15 = null;
        org.jsoup.Connection connection16 = httpConnection12.proxy(proxy15);
        org.jsoup.Connection.KeyVal keyVal18 = httpConnection12.data("multipart/form-data");
        org.jsoup.Connection connection21 = httpConnection12.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext23 = null;
        org.jsoup.Connection connection24 = httpConnection22.sslContext(sSLContext23);
        org.jsoup.helper.HttpConnection httpConnection25 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection27 = httpConnection25.userAgent("");
        org.jsoup.Connection connection29 = httpConnection25.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal31 = httpConnection25.data("hi!");
        org.jsoup.Connection.Request request32 = httpConnection25.request();
        org.jsoup.Connection connection33 = httpConnection22.request(request32);
        org.jsoup.Connection connection34 = httpConnection12.request(request32);
        org.jsoup.helper.HttpConnection httpConnection35 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext36 = null;
        org.jsoup.Connection connection37 = httpConnection35.sslContext(sSLContext36);
        org.jsoup.Connection connection39 = httpConnection35.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext40 = null;
        org.jsoup.Connection connection41 = httpConnection35.sslContext(sSLContext40);
        org.jsoup.Connection connection43 = httpConnection35.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response44 = null;
        org.jsoup.Connection connection45 = httpConnection35.response(response44);
        org.jsoup.helper.HttpConnection httpConnection46 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection48 = httpConnection46.userAgent("");
        java.net.Proxy proxy49 = null;
        org.jsoup.Connection connection50 = httpConnection46.proxy(proxy49);
        org.jsoup.Connection connection52 = httpConnection46.followRedirects(false);
        org.jsoup.Connection connection54 = httpConnection46.timeout((int) ' ');
        org.jsoup.Connection connection57 = httpConnection46.cookie("application/x-www-form-urlencoded=multipart/form-data", "hi!=");
        org.jsoup.Connection connection59 = httpConnection46.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal62 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal64 = keyVal62.key("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal67 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str68 = keyVal67.contentType();
        java.io.InputStream inputStream69 = keyVal67.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray70 = new org.jsoup.Connection.KeyVal[] { keyVal62, keyVal67 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList71 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList71, keyValArray70);
        org.jsoup.Connection connection73 = httpConnection46.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList71);
        org.jsoup.Connection connection74 = httpConnection35.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList71);
        org.jsoup.Connection connection75 = httpConnection12.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList71);
        org.jsoup.Connection connection76 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList71);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(cookieStore10);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNull(keyVal18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNull(keyVal31);
        org.junit.Assert.assertNotNull(request32);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(connection54);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNotNull(connection59);
        org.junit.Assert.assertNotNull(keyVal62);
        org.junit.Assert.assertNotNull(keyVal64);
        org.junit.Assert.assertNotNull(keyVal67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(inputStream69);
        org.junit.Assert.assertNotNull(keyValArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(connection73);
        org.junit.Assert.assertNotNull(connection74);
        org.junit.Assert.assertNotNull(connection75);
        org.junit.Assert.assertNotNull(connection76);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test419");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Type");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.value("Content-Encoding");
        org.jsoup.Connection.KeyVal keyVal8 = keyVal4.contentType("hi!=application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test420");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("application/x-www-form-urlencoded=multipart/form-data");
        boolean boolean5 = keyVal2.hasInputStream();
        java.lang.String str6 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "application/x-www-form-urlencoded=multipart/form-data" + "'", str6, "application/x-www-form-urlencoded=multipart/form-data");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test421");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.lang.String str5 = keyVal4.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test422");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection6 = httpConnection0.maxBodySize((int) (short) 10);
        org.jsoup.parser.Parser parser7 = null;
        org.jsoup.Connection connection8 = httpConnection0.parser(parser7);
        org.jsoup.Connection.KeyVal keyVal10 = httpConnection0.data("multipart/form-data=multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNull(keyVal10);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test423");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=application/x-www-form-urlencoded=multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal5.key("application/x-www-form-urlencoded");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test424");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext4 = null;
        org.jsoup.Connection connection5 = httpConnection3.sslContext(sSLContext4);
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection8 = httpConnection6.userAgent("");
        org.jsoup.Connection connection10 = httpConnection6.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal12 = httpConnection6.data("hi!");
        org.jsoup.Connection.Request request13 = httpConnection6.request();
        org.jsoup.Connection connection14 = httpConnection3.request(request13);
        org.jsoup.Connection connection15 = httpConnection0.request(request13);
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.url(uRL16);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNull(keyVal12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test425");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.requestBodyStream(inputStream10);
        org.jsoup.parser.Parser parser12 = null;
        org.jsoup.Connection connection13 = httpConnection0.parser(parser12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test426");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.referrer("");
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection12 = httpConnection10.userAgent("");
        java.net.Proxy proxy13 = null;
        org.jsoup.Connection connection14 = httpConnection10.proxy(proxy13);
        org.jsoup.Connection.KeyVal keyVal16 = httpConnection10.data("multipart/form-data");
        org.jsoup.Connection connection18 = httpConnection10.maxBodySize((int) '#');
        org.jsoup.Connection connection20 = httpConnection10.timeout((int) '4');
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection24 = httpConnection10.data(strArray23);
        org.jsoup.Connection connection25 = httpConnection0.data(strArray23);
        org.jsoup.Connection.Response response26 = null;
        org.jsoup.Connection connection27 = httpConnection0.response(response26);
        org.jsoup.Connection connection29 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection32 = httpConnection0.header("multipart/form-data=multipart/form-data", "");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator33 = null;
        org.jsoup.Connection connection34 = httpConnection0.auth(requestAuthenticator33);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNull(keyVal16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test427");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=application/x-www-form-urlencoded=multipart/form-data", "Content-Type", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test428");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection9 = httpConnection0.cookie("Content-Type", "multipart/form-data");
        org.jsoup.Connection connection11 = httpConnection0.ignoreHttpErrors(true);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test429");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection6 = httpConnection0.requestBody("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection9 = httpConnection0.cookie("", "Content-Type=");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'name' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test430");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        java.net.CookieStore cookieStore13 = httpConnection0.cookieStore();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection15 = httpConnection0.url("multipart/form-data=Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'multipart/form-data=Content-Type', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(cookieStore13);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test431");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        java.lang.String str7 = keyVal6.value();
        java.lang.String str8 = keyVal6.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multipart/form-data" + "'", str7, "multipart/form-data");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test432");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator10 = null;
        org.jsoup.Connection connection11 = httpConnection0.auth(requestAuthenticator10);
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection0.proxy(proxy12);
        org.jsoup.Connection connection15 = httpConnection0.userAgent("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress16 = null;
        org.jsoup.Connection connection17 = httpConnection0.onResponseProgress(responseProgress16);
        org.jsoup.helper.HttpConnection httpConnection18 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext19 = null;
        org.jsoup.Connection connection20 = httpConnection18.sslContext(sSLContext19);
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection23 = httpConnection21.userAgent("");
        org.jsoup.Connection connection25 = httpConnection21.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal27 = httpConnection21.data("hi!");
        org.jsoup.Connection.Request request28 = httpConnection21.request();
        org.jsoup.Connection connection29 = httpConnection18.request(request28);
        org.jsoup.Connection connection30 = httpConnection0.request(request28);
        java.io.InputStream inputStream33 = null;
        org.jsoup.Connection connection35 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "multipart/form-data", inputStream33, "application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection httpConnection36 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection38 = httpConnection36.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy39 = null;
        org.jsoup.Connection connection40 = httpConnection36.proxy(proxy39);
        org.jsoup.Connection.Response response41 = null;
        org.jsoup.Connection connection42 = httpConnection36.response(response41);
        java.io.InputStream inputStream45 = null;
        org.jsoup.Connection connection46 = httpConnection36.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream45);
        org.jsoup.Connection.Request request47 = httpConnection36.request();
        java.net.CookieStore cookieStore48 = httpConnection36.cookieStore();
        org.jsoup.Connection connection49 = httpConnection0.cookieStore(cookieStore48);
        java.lang.Class<?> wildcardClass50 = connection49.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNull(keyVal27);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertNotNull(cookieStore48);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test433");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext11 = null;
        org.jsoup.Connection connection12 = httpConnection10.sslContext(sSLContext11);
        org.jsoup.helper.HttpConnection httpConnection13 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection15 = httpConnection13.userAgent("");
        org.jsoup.Connection connection17 = httpConnection13.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal19 = httpConnection13.data("hi!");
        org.jsoup.Connection.Request request20 = httpConnection13.request();
        org.jsoup.Connection connection21 = httpConnection10.request(request20);
        org.jsoup.Connection connection22 = httpConnection0.request(request20);
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext24 = null;
        org.jsoup.Connection connection25 = httpConnection23.sslContext(sSLContext24);
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection28 = httpConnection26.userAgent("");
        org.jsoup.Connection connection30 = httpConnection26.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal32 = httpConnection26.data("hi!");
        org.jsoup.Connection.Request request33 = httpConnection26.request();
        org.jsoup.Connection connection34 = httpConnection23.request(request33);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory35 = null;
        org.jsoup.Connection connection36 = httpConnection23.sslSocketFactory(sSLSocketFactory35);
        org.jsoup.helper.HttpConnection httpConnection37 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection39 = httpConnection37.followRedirects(true);
        java.io.InputStream inputStream42 = null;
        org.jsoup.Connection connection44 = httpConnection37.data("application/x-www-form-urlencoded", "Content-Type", inputStream42, "multipart/form-data");
        java.net.Proxy proxy45 = null;
        org.jsoup.Connection connection46 = httpConnection37.proxy(proxy45);
        java.net.CookieStore cookieStore47 = httpConnection37.cookieStore();
        org.jsoup.Connection connection48 = httpConnection23.cookieStore(cookieStore47);
        org.jsoup.Connection connection49 = httpConnection0.cookieStore(cookieStore47);
        org.jsoup.Connection connection51 = httpConnection0.timeout((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document52 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNull(keyVal19);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNull(keyVal32);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(cookieStore47);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection51);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test434");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.net.Proxy proxy11 = null;
        org.jsoup.Connection connection12 = httpConnection0.proxy(proxy11);
        org.jsoup.Connection connection14 = httpConnection0.requestBody("multipart/form-data=Content-Type");
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.userAgent("");
        org.jsoup.Connection connection19 = httpConnection15.requestBody("hi!");
        org.jsoup.Connection.Response response20 = null;
        org.jsoup.Connection connection21 = httpConnection15.response(response20);
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection24 = httpConnection22.userAgent("");
        java.net.Proxy proxy25 = null;
        org.jsoup.Connection connection26 = httpConnection22.proxy(proxy25);
        org.jsoup.Connection connection28 = httpConnection22.followRedirects(false);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection32 = httpConnection22.data(strArray31);
        java.io.InputStream inputStream33 = null;
        org.jsoup.Connection connection34 = httpConnection22.requestBodyStream(inputStream33);
        java.net.CookieStore cookieStore35 = httpConnection22.cookieStore();
        org.jsoup.Connection connection36 = httpConnection15.cookieStore(cookieStore35);
        org.jsoup.Connection connection37 = httpConnection0.cookieStore(cookieStore35);
        java.net.CookieStore cookieStore38 = null;
        org.jsoup.Connection connection39 = httpConnection0.cookieStore(cookieStore38);
        java.util.Map<java.lang.String, java.lang.String> strMap40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection41 = httpConnection0.headers(strMap40);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(cookieStore35);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection39);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test435");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.inputStream(inputStream10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal11.value("Content-Encoding");
        boolean boolean14 = keyVal11.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertNotNull(keyVal13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test436");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext8 = null;
        org.jsoup.Connection connection9 = httpConnection7.sslContext(sSLContext8);
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection12 = httpConnection10.userAgent("");
        org.jsoup.Connection connection14 = httpConnection10.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal16 = httpConnection10.data("hi!");
        org.jsoup.Connection.Request request17 = httpConnection10.request();
        org.jsoup.Connection connection18 = httpConnection7.request(request17);
        org.jsoup.Connection connection19 = httpConnection0.request(request17);
        org.jsoup.Connection connection22 = httpConnection0.proxy("multipart/form-data", 10);
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection24 = httpConnection0.url(uRL23);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNull(keyVal16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection22);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test437");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal2.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test438");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.data(strMap7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test439");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream12 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("hi!", "application/x-www-form-urlencoded", inputStream12, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.jsoup.Connection connection15 = httpConnection0.newRequest();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.newRequest("application/x-www-form-urlencoded=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'application/x-www-form-urlencoded=multipart/form-data', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test440");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.helper.RequestAuthenticator requestAuthenticator11 = null;
        org.jsoup.Connection connection12 = httpConnection0.auth(requestAuthenticator11);
        org.jsoup.Connection.KeyVal keyVal14 = httpConnection0.data("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNull(keyVal14);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test441");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection9 = httpConnection7.userAgent("");
        java.net.Proxy proxy10 = null;
        org.jsoup.Connection connection11 = httpConnection7.proxy(proxy10);
        org.jsoup.Connection connection13 = httpConnection7.followRedirects(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection17 = httpConnection7.data(strArray16);
        java.io.InputStream inputStream18 = null;
        org.jsoup.Connection connection19 = httpConnection7.requestBodyStream(inputStream18);
        java.net.CookieStore cookieStore20 = httpConnection7.cookieStore();
        org.jsoup.Connection connection21 = httpConnection0.cookieStore(cookieStore20);
        java.io.InputStream inputStream24 = null;
        org.jsoup.Connection connection26 = httpConnection0.data("application/x-www-form-urlencoded", "multipart/form-data", inputStream24, "Content-Type=");
        javax.net.ssl.SSLContext sSLContext27 = null;
        org.jsoup.Connection connection28 = httpConnection0.sslContext(sSLContext27);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator29 = null;
        org.jsoup.Connection connection30 = httpConnection0.auth(requestAuthenticator29);
        org.jsoup.Connection connection32 = httpConnection0.ignoreHttpErrors(true);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(cookieStore20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test442");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection12 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection13 = httpConnection0.newRequest();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test443");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = keyVal4.inputStream();
        java.lang.String str6 = keyVal4.key();
        java.io.InputStream inputStream7 = keyVal4.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test444");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = keyVal4.inputStream();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.inputStream(inputStream6);
        java.io.InputStream inputStream8 = keyVal7.inputStream();
        org.jsoup.Connection.KeyVal keyVal10 = keyVal7.contentType("Content-Type=");
        java.lang.Class<?> wildcardClass11 = keyVal7.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test445");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator11 = null;
        org.jsoup.Connection connection12 = httpConnection0.auth(requestAuthenticator11);
        org.jsoup.Connection connection14 = httpConnection0.ignoreContentType(true);
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.url(uRL15);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test446");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection11 = httpConnection0.cookie("hi!=", "Content-Encoding");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator12 = null;
        org.jsoup.Connection connection13 = httpConnection0.auth(requestAuthenticator12);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test447");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.referrer("application/x-www-form-urlencoded");
        java.io.InputStream inputStream12 = null;
        org.jsoup.Connection connection13 = httpConnection0.requestBodyStream(inputStream12);
        org.jsoup.Connection connection15 = httpConnection0.requestBody("Content-Type");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator16 = null;
        org.jsoup.Connection connection17 = httpConnection0.auth(requestAuthenticator16);
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection19 = httpConnection0.newRequest(uRL18);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test448");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        org.jsoup.Connection connection16 = httpConnection0.sslSocketFactory(sSLSocketFactory15);
        javax.net.ssl.SSLContext sSLContext17 = null;
        org.jsoup.Connection connection18 = httpConnection0.sslContext(sSLContext17);
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection21 = httpConnection19.userAgent("");
        org.jsoup.Connection connection23 = httpConnection19.requestBody("hi!");
        org.jsoup.Connection connection26 = httpConnection19.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress27 = null;
        org.jsoup.Connection connection28 = httpConnection19.onResponseProgress(responseProgress27);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator29 = null;
        org.jsoup.Connection connection30 = httpConnection19.auth(requestAuthenticator29);
        java.net.Proxy proxy31 = null;
        org.jsoup.Connection connection32 = httpConnection19.proxy(proxy31);
        org.jsoup.Connection connection34 = httpConnection19.userAgent("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress35 = null;
        org.jsoup.Connection connection36 = httpConnection19.onResponseProgress(responseProgress35);
        org.jsoup.helper.HttpConnection httpConnection37 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext38 = null;
        org.jsoup.Connection connection39 = httpConnection37.sslContext(sSLContext38);
        org.jsoup.helper.HttpConnection httpConnection40 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection42 = httpConnection40.userAgent("");
        org.jsoup.Connection connection44 = httpConnection40.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal46 = httpConnection40.data("hi!");
        org.jsoup.Connection.Request request47 = httpConnection40.request();
        org.jsoup.Connection connection48 = httpConnection37.request(request47);
        org.jsoup.Connection connection49 = httpConnection19.request(request47);
        java.io.InputStream inputStream52 = null;
        org.jsoup.Connection connection54 = httpConnection19.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "multipart/form-data", inputStream52, "application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection httpConnection55 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection57 = httpConnection55.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy58 = null;
        org.jsoup.Connection connection59 = httpConnection55.proxy(proxy58);
        org.jsoup.Connection.Response response60 = null;
        org.jsoup.Connection connection61 = httpConnection55.response(response60);
        java.io.InputStream inputStream64 = null;
        org.jsoup.Connection connection65 = httpConnection55.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream64);
        org.jsoup.Connection.Request request66 = httpConnection55.request();
        java.net.CookieStore cookieStore67 = httpConnection55.cookieStore();
        org.jsoup.Connection connection68 = httpConnection19.cookieStore(cookieStore67);
        org.jsoup.Connection connection69 = httpConnection0.cookieStore(cookieStore67);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNull(keyVal46);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection54);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNotNull(connection59);
        org.junit.Assert.assertNotNull(connection61);
        org.junit.Assert.assertNotNull(connection65);
        org.junit.Assert.assertNotNull(request66);
        org.junit.Assert.assertNotNull(cookieStore67);
        org.junit.Assert.assertNotNull(connection68);
        org.junit.Assert.assertNotNull(connection69);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test449");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.requestBodyStream(inputStream10);
        org.jsoup.Connection connection14 = httpConnection0.cookie("Content-Encoding", "");
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.userAgent("");
        java.net.Proxy proxy18 = null;
        org.jsoup.Connection connection19 = httpConnection15.proxy(proxy18);
        org.jsoup.Connection connection21 = httpConnection15.followRedirects(false);
        org.jsoup.Connection connection23 = httpConnection15.timeout((int) ' ');
        org.jsoup.Connection connection26 = httpConnection15.cookie("application/x-www-form-urlencoded=multipart/form-data", "hi!=");
        org.jsoup.Connection connection28 = httpConnection15.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal31 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal33 = keyVal31.key("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal36 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str37 = keyVal36.contentType();
        java.io.InputStream inputStream38 = keyVal36.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray39 = new org.jsoup.Connection.KeyVal[] { keyVal31, keyVal36 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList40 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList40, keyValArray39);
        org.jsoup.Connection connection42 = httpConnection15.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList40);
        org.jsoup.Connection connection43 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList40);
        org.jsoup.Connection connection44 = httpConnection0.newRequest();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(keyVal31);
        org.junit.Assert.assertNotNull(keyVal33);
        org.junit.Assert.assertNotNull(keyVal36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(inputStream38);
        org.junit.Assert.assertNotNull(keyValArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection44);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test450");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection11 = httpConnection0.cookie("hi!=", "Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test451");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection.KeyVal keyVal8 = httpConnection0.data("multipart/form-data=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNull(keyVal8);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test452");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.headers(strMap9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test453");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        org.jsoup.Connection connection12 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection14 = httpConnection0.referrer("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Connection connection16 = httpConnection0.maxBodySize((int) (byte) 10);
        org.jsoup.Connection.KeyVal keyVal18 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNull(keyVal18);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test454");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        java.io.InputStream inputStream4 = keyVal2.inputStream();
        java.lang.String str5 = keyVal2.key();
        java.lang.String str6 = keyVal2.contentType();
        boolean boolean7 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test455");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection19 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!");
        java.io.InputStream inputStream22 = null;
        org.jsoup.Connection connection24 = httpConnection0.data("application/x-www-form-urlencoded=multipart/form-data", "Content-Type=", inputStream22, "multipart/form-data");
        org.jsoup.parser.Parser parser25 = null;
        org.jsoup.Connection connection26 = httpConnection0.parser(parser25);
        org.jsoup.Connection.KeyVal keyVal28 = httpConnection0.data("multipart/form-data=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document29 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNull(keyVal28);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test456");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.timeout(1);
        org.jsoup.Connection connection6 = httpConnection0.requestBody("Content-Type");
        org.jsoup.Connection connection8 = httpConnection0.ignoreContentType(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.url("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Content-Encoding', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test457");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection5 = httpConnection0.cookie("Content-Type", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext7 = null;
        org.jsoup.Connection connection8 = httpConnection6.sslContext(sSLContext7);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.userAgent("");
        org.jsoup.Connection connection13 = httpConnection9.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection9.data("hi!");
        org.jsoup.Connection.Request request16 = httpConnection9.request();
        org.jsoup.Connection connection17 = httpConnection6.request(request16);
        org.jsoup.Connection connection18 = httpConnection0.request(request16);
        org.jsoup.Connection.KeyVal keyVal20 = httpConnection0.data("application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNull(keyVal20);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test458");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Connection connection11 = httpConnection0.newRequest();
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection0.proxy(proxy12);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test459");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.helper.HttpConnection httpConnection9 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection11 = httpConnection9.userAgent("");
        java.net.Proxy proxy12 = null;
        org.jsoup.Connection connection13 = httpConnection9.proxy(proxy12);
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection9.data("multipart/form-data");
        org.jsoup.Connection connection17 = httpConnection9.maxBodySize((int) '#');
        org.jsoup.Connection connection19 = httpConnection9.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress20 = null;
        org.jsoup.Connection connection21 = httpConnection9.onResponseProgress(responseProgress20);
        org.jsoup.Connection.Request request22 = httpConnection9.request();
        org.jsoup.Connection connection23 = httpConnection0.request(request22);
        org.jsoup.parser.Parser parser24 = null;
        org.jsoup.Connection connection25 = httpConnection0.parser(parser24);
        org.jsoup.Connection.Request request26 = httpConnection0.request();
        org.jsoup.helper.HttpConnection httpConnection27 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection29 = httpConnection27.userAgent("");
        org.jsoup.Connection connection31 = httpConnection27.requestBody("hi!");
        org.jsoup.Connection connection34 = httpConnection27.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress35 = null;
        org.jsoup.Connection connection36 = httpConnection27.onResponseProgress(responseProgress35);
        org.jsoup.Connection connection39 = httpConnection27.data("hi!", "hi!");
        org.jsoup.helper.HttpConnection httpConnection40 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection42 = httpConnection40.userAgent("");
        java.net.Proxy proxy43 = null;
        org.jsoup.Connection connection44 = httpConnection40.proxy(proxy43);
        org.jsoup.Connection.KeyVal keyVal46 = httpConnection40.data("multipart/form-data");
        org.jsoup.Connection connection48 = httpConnection40.maxBodySize((int) '#');
        org.jsoup.Connection connection50 = httpConnection40.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress51 = null;
        org.jsoup.Connection connection52 = httpConnection40.onResponseProgress(responseProgress51);
        org.jsoup.Connection.Request request53 = httpConnection40.request();
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress54 = null;
        org.jsoup.Connection connection55 = httpConnection40.onResponseProgress(responseProgress54);
        org.jsoup.Connection.Request request56 = httpConnection40.request();
        org.jsoup.Connection connection58 = httpConnection40.referrer("hi!=application/x-www-form-urlencoded=multipart/form-data");
        java.net.CookieStore cookieStore59 = httpConnection40.cookieStore();
        org.jsoup.Connection connection60 = httpConnection27.cookieStore(cookieStore59);
        org.jsoup.Connection connection61 = httpConnection0.cookieStore(cookieStore59);
        java.util.Map<java.lang.String, java.lang.String> strMap62 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection63 = httpConnection0.cookies(strMap62);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(request26);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNull(keyVal46);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(request53);
        org.junit.Assert.assertNotNull(connection55);
        org.junit.Assert.assertNotNull(request56);
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNotNull(cookieStore59);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(connection61);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test460");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.key("application/x-www-form-urlencoded=multipart/form-data");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.inputStream(inputStream7);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test461");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("hi!");
        org.jsoup.Connection.Request request7 = httpConnection0.request();
        org.jsoup.Connection connection10 = httpConnection0.cookie("Content-Type", "Content-Encoding");
        java.lang.Class<?> wildcardClass11 = connection10.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test462");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection5 = httpConnection0.cookie("multipart/form-data=multipart/form-data", "multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection7 = connection5.newRequest("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Content-Encoding', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test463");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.referrer("application/x-www-form-urlencoded");
        org.jsoup.Connection connection13 = httpConnection0.followRedirects(false);
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection15 = httpConnection0.url(uRL14);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test464");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!=" + "'", str5, "hi!=");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test465");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        java.io.InputStream inputStream17 = null;
        org.jsoup.Connection connection18 = httpConnection0.requestBodyStream(inputStream17);
        java.net.Proxy proxy19 = null;
        org.jsoup.Connection connection20 = httpConnection0.proxy(proxy19);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test466");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        javax.net.ssl.SSLContext sSLContext8 = null;
        org.jsoup.Connection connection9 = httpConnection0.sslContext(sSLContext8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.url("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test467");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection19 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!");
        java.io.InputStream inputStream22 = null;
        org.jsoup.Connection connection24 = httpConnection0.data("application/x-www-form-urlencoded=multipart/form-data", "Content-Type=", inputStream22, "multipart/form-data");
        org.jsoup.Connection connection26 = httpConnection0.timeout((int) (byte) 1);
        java.net.CookieStore cookieStore27 = httpConnection0.cookieStore();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(cookieStore27);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test468");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.jsoup.Connection connection11 = httpConnection0.data(strArray10);
        org.jsoup.Connection connection14 = httpConnection0.cookie("multipart/form-data=Content-Type", "application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator15 = null;
        org.jsoup.Connection connection16 = httpConnection0.auth(requestAuthenticator15);
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection19 = httpConnection17.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy20 = null;
        org.jsoup.Connection connection21 = httpConnection17.proxy(proxy20);
        org.jsoup.Connection.Response response22 = null;
        org.jsoup.Connection connection23 = httpConnection17.response(response22);
        java.io.InputStream inputStream26 = null;
        org.jsoup.Connection connection27 = httpConnection17.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream26);
        org.jsoup.Connection.Request request28 = httpConnection17.request();
        org.jsoup.Connection connection29 = httpConnection0.request(request28);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(connection29);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test469");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.headers(strMap7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test470");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Type");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.inputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal8.inputStream(inputStream11);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test471");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Connection connection9 = httpConnection0.userAgent("hi!=");
        org.jsoup.Connection connection12 = httpConnection0.header("Content-Encoding", "multipart/form-data");
        org.jsoup.Connection connection14 = httpConnection0.userAgent("multipart/form-data");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.cookies(strMap15);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test472");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("multipart/form-data=Content-Type");
        java.lang.String str7 = keyVal2.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test473");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        java.lang.String str4 = keyVal2.contentType();
        java.lang.String str5 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "multipart/form-data" + "'", str5, "multipart/form-data");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test474");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("");
        java.lang.String str8 = keyVal2.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test475");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        org.jsoup.Connection.Request request13 = httpConnection0.request();
        org.jsoup.Connection connection16 = httpConnection0.data("Content-Encoding", "application/x-www-form-urlencoded");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = httpConnection0.postDataCharset("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test476");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection17 = httpConnection0.header("multipart/form-data=multipart/form-data", "application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection18 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection20 = httpConnection18.userAgent("");
        java.net.Proxy proxy21 = null;
        org.jsoup.Connection connection22 = httpConnection18.proxy(proxy21);
        org.jsoup.Connection connection24 = httpConnection18.followRedirects(false);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection28 = httpConnection18.data(strArray27);
        java.io.InputStream inputStream29 = null;
        org.jsoup.Connection connection30 = httpConnection18.requestBodyStream(inputStream29);
        java.net.CookieStore cookieStore31 = httpConnection18.cookieStore();
        org.jsoup.Connection connection32 = httpConnection0.cookieStore(cookieStore31);
        java.net.Proxy proxy33 = null;
        org.jsoup.Connection connection34 = httpConnection0.proxy(proxy33);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(cookieStore31);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test477");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection8 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection.Request request9 = httpConnection0.request();
        org.jsoup.Connection connection11 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection connection14 = httpConnection0.cookie("Content-Encoding", "multipart/form-data=Content-Type");
        org.jsoup.Connection connection17 = httpConnection0.data("multipart/form-data=Content-Type", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test478");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslSocketFactory(sSLSocketFactory1);
        org.jsoup.Connection connection4 = httpConnection0.timeout((int) '#');
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("hi!");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test479");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection19 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!");
        java.io.InputStream inputStream22 = null;
        org.jsoup.Connection connection24 = httpConnection0.data("application/x-www-form-urlencoded=multipart/form-data", "Content-Type=", inputStream22, "multipart/form-data");
        org.jsoup.Connection connection26 = httpConnection0.timeout((int) (byte) 1);
        org.jsoup.Connection connection28 = httpConnection0.ignoreContentType(false);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test480");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.referrer("application/x-www-form-urlencoded");
        java.io.InputStream inputStream12 = null;
        org.jsoup.Connection connection13 = httpConnection0.requestBodyStream(inputStream12);
        org.jsoup.Connection connection15 = httpConnection0.requestBody("Content-Type");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.headers(strMap16);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test481");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        org.jsoup.Connection connection9 = httpConnection0.data("Content-Encoding", "hi!=application/x-www-form-urlencoded=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test482");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("application/x-www-form-urlencoded=multipart/form-data", "Content-Type=", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test483");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection7 = httpConnection5.followRedirects(true);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection12 = httpConnection5.data("application/x-www-form-urlencoded", "Content-Type", inputStream10, "multipart/form-data");
        java.net.Proxy proxy13 = null;
        org.jsoup.Connection connection14 = httpConnection5.proxy(proxy13);
        org.jsoup.Connection connection16 = httpConnection5.referrer("application/x-www-form-urlencoded");
        java.io.InputStream inputStream17 = null;
        org.jsoup.Connection connection18 = httpConnection5.requestBodyStream(inputStream17);
        org.jsoup.Connection connection20 = httpConnection5.requestBody("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection23 = httpConnection21.userAgent("");
        java.net.Proxy proxy24 = null;
        org.jsoup.Connection connection25 = httpConnection21.proxy(proxy24);
        org.jsoup.Connection.KeyVal keyVal27 = httpConnection21.data("multipart/form-data");
        org.jsoup.Connection connection30 = httpConnection21.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection31 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext32 = null;
        org.jsoup.Connection connection33 = httpConnection31.sslContext(sSLContext32);
        org.jsoup.helper.HttpConnection httpConnection34 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection36 = httpConnection34.userAgent("");
        org.jsoup.Connection connection38 = httpConnection34.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal40 = httpConnection34.data("hi!");
        org.jsoup.Connection.Request request41 = httpConnection34.request();
        org.jsoup.Connection connection42 = httpConnection31.request(request41);
        org.jsoup.Connection connection43 = httpConnection21.request(request41);
        org.jsoup.helper.HttpConnection httpConnection44 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext45 = null;
        org.jsoup.Connection connection46 = httpConnection44.sslContext(sSLContext45);
        org.jsoup.helper.HttpConnection httpConnection47 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection49 = httpConnection47.userAgent("");
        org.jsoup.Connection connection51 = httpConnection47.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal53 = httpConnection47.data("hi!");
        org.jsoup.Connection.Request request54 = httpConnection47.request();
        org.jsoup.Connection connection55 = httpConnection44.request(request54);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory56 = null;
        org.jsoup.Connection connection57 = httpConnection44.sslSocketFactory(sSLSocketFactory56);
        org.jsoup.helper.HttpConnection httpConnection58 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection60 = httpConnection58.followRedirects(true);
        java.io.InputStream inputStream63 = null;
        org.jsoup.Connection connection65 = httpConnection58.data("application/x-www-form-urlencoded", "Content-Type", inputStream63, "multipart/form-data");
        java.net.Proxy proxy66 = null;
        org.jsoup.Connection connection67 = httpConnection58.proxy(proxy66);
        java.net.CookieStore cookieStore68 = httpConnection58.cookieStore();
        org.jsoup.Connection connection69 = httpConnection44.cookieStore(cookieStore68);
        org.jsoup.Connection connection70 = httpConnection21.cookieStore(cookieStore68);
        org.jsoup.Connection connection71 = httpConnection5.cookieStore(cookieStore68);
        org.jsoup.Connection connection72 = httpConnection0.cookieStore(cookieStore68);
        org.jsoup.Connection connection74 = httpConnection0.ignoreContentType(true);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNull(keyVal27);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNull(keyVal40);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNull(keyVal53);
        org.junit.Assert.assertNotNull(request54);
        org.junit.Assert.assertNotNull(connection55);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(connection65);
        org.junit.Assert.assertNotNull(connection67);
        org.junit.Assert.assertNotNull(cookieStore68);
        org.junit.Assert.assertNotNull(connection69);
        org.junit.Assert.assertNotNull(connection70);
        org.junit.Assert.assertNotNull(connection71);
        org.junit.Assert.assertNotNull(connection72);
        org.junit.Assert.assertNotNull(connection74);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test484");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        org.jsoup.Connection.Request request13 = httpConnection0.request();
        org.jsoup.helper.HttpConnection httpConnection14 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection16 = httpConnection14.userAgent("");
        org.jsoup.Connection connection18 = httpConnection14.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal20 = httpConnection14.data("hi!");
        org.jsoup.Connection.Request request21 = httpConnection14.request();
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection24 = httpConnection22.userAgent("");
        java.net.Proxy proxy25 = null;
        org.jsoup.Connection connection26 = httpConnection22.proxy(proxy25);
        org.jsoup.Connection.KeyVal keyVal28 = httpConnection22.data("multipart/form-data");
        org.jsoup.Connection connection31 = httpConnection22.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection32 = httpConnection22.newRequest();
        org.jsoup.helper.HttpConnection httpConnection33 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection35 = httpConnection33.userAgent("");
        org.jsoup.Connection connection37 = httpConnection33.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal39 = httpConnection33.data("hi!");
        org.jsoup.Connection.Request request40 = httpConnection33.request();
        org.jsoup.Connection connection41 = httpConnection22.request(request40);
        org.jsoup.Connection connection42 = httpConnection14.request(request40);
        java.net.Proxy proxy43 = null;
        org.jsoup.Connection connection44 = httpConnection14.proxy(proxy43);
        org.jsoup.helper.HttpConnection httpConnection45 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection47 = httpConnection45.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy48 = null;
        org.jsoup.Connection connection49 = httpConnection45.proxy(proxy48);
        org.jsoup.Connection.Response response50 = null;
        org.jsoup.Connection connection51 = httpConnection45.response(response50);
        java.io.InputStream inputStream54 = null;
        org.jsoup.Connection connection55 = httpConnection45.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream54);
        org.jsoup.Connection.Request request56 = httpConnection45.request();
        java.net.CookieStore cookieStore57 = httpConnection45.cookieStore();
        org.jsoup.helper.HttpConnection httpConnection58 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection60 = httpConnection58.userAgent("");
        java.net.Proxy proxy61 = null;
        org.jsoup.Connection connection62 = httpConnection58.proxy(proxy61);
        org.jsoup.Connection.KeyVal keyVal64 = httpConnection58.data("multipart/form-data");
        org.jsoup.Connection connection67 = httpConnection58.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection68 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection70 = httpConnection68.userAgent("");
        java.net.Proxy proxy71 = null;
        org.jsoup.Connection connection72 = httpConnection68.proxy(proxy71);
        org.jsoup.Connection connection74 = httpConnection68.followRedirects(false);
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection78 = httpConnection68.data(strArray77);
        org.jsoup.Connection connection79 = httpConnection58.data(strArray77);
        org.jsoup.Connection connection80 = httpConnection45.data(strArray77);
        org.jsoup.Connection connection81 = httpConnection14.data(strArray77);
        org.jsoup.Connection connection82 = httpConnection0.data(strArray77);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNull(keyVal20);
        org.junit.Assert.assertNotNull(request21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNull(keyVal28);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNull(keyVal39);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(connection55);
        org.junit.Assert.assertNotNull(request56);
        org.junit.Assert.assertNotNull(cookieStore57);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(connection62);
        org.junit.Assert.assertNull(keyVal64);
        org.junit.Assert.assertNotNull(connection67);
        org.junit.Assert.assertNotNull(connection70);
        org.junit.Assert.assertNotNull(connection72);
        org.junit.Assert.assertNotNull(connection74);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection78);
        org.junit.Assert.assertNotNull(connection79);
        org.junit.Assert.assertNotNull(connection80);
        org.junit.Assert.assertNotNull(connection81);
        org.junit.Assert.assertNotNull(connection82);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test485");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        org.jsoup.Connection connection16 = httpConnection0.sslSocketFactory(sSLSocketFactory15);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress17 = null;
        org.jsoup.Connection connection18 = httpConnection0.onResponseProgress(responseProgress17);
        java.lang.Class<?> wildcardClass19 = httpConnection0.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test486");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Connection connection12 = httpConnection0.ignoreHttpErrors(false);
        java.io.InputStream inputStream15 = null;
        org.jsoup.Connection connection16 = httpConnection0.data("hi!", "application/x-www-form-urlencoded=multipart/form-data", inputStream15);
        org.jsoup.Connection.KeyVal keyVal18 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.jsoup.Connection connection21 = httpConnection0.data("Content-Type", "Content-Type");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNull(keyVal18);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test487");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        org.jsoup.Connection.Request request11 = httpConnection0.request();
        org.jsoup.Connection connection14 = httpConnection0.data("application/x-www-form-urlencoded", "multipart/form-data=Content-Type");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator15 = null;
        org.jsoup.Connection connection16 = httpConnection0.auth(requestAuthenticator15);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test488");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("multipart/form-data=multipart/form-data");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.inputStream(inputStream9);
        java.lang.String str11 = keyVal6.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "multipart/form-data=multipart/form-data" + "'", str11, "multipart/form-data=multipart/form-data");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test489");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection11 = httpConnection0.cookie("hi!=", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection12 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection14 = httpConnection12.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy15 = null;
        org.jsoup.Connection connection16 = httpConnection12.proxy(proxy15);
        org.jsoup.Connection.Response response17 = null;
        org.jsoup.Connection connection18 = httpConnection12.response(response17);
        java.io.InputStream inputStream21 = null;
        org.jsoup.Connection connection22 = httpConnection12.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream21);
        org.jsoup.Connection.Request request23 = httpConnection12.request();
        org.jsoup.Connection connection24 = httpConnection0.request(request23);
        org.jsoup.Connection.Method method25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection26 = httpConnection0.method(method25);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(connection24);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test490");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.userAgent("hi!=");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = httpConnection0.data(strMap7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test491");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        org.jsoup.Connection connection15 = httpConnection11.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal17 = httpConnection11.data("hi!");
        org.jsoup.Connection.Request request18 = httpConnection11.request();
        org.jsoup.Connection connection19 = httpConnection0.request(request18);
        org.jsoup.Connection connection21 = httpConnection0.maxBodySize(1);
        java.io.InputStream inputStream22 = null;
        org.jsoup.Connection connection23 = httpConnection0.requestBodyStream(inputStream22);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!=application/x-www-form-urlencoded=multipart/form-data" };
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection26 = httpConnection0.data(strArray25);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: Must supply an even number of key value pairs");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(keyVal17);
        org.junit.Assert.assertNotNull(request18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!=application/x-www-form-urlencoded=multipart/form-data" });
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test492");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Type=", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.key("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test493");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.referrer("multipart/form-data=Content-Type");
        org.jsoup.Connection connection6 = httpConnection0.maxBodySize((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test494");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Type=", "application/x-www-form-urlencoded=multipart/form-data", inputStream2);
        java.lang.String str4 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Type=" + "'", str4, "Content-Type=");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test495");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection9 = httpConnection0.cookie("Content-Type", "multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.url("multipart/form-data=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'multipart/form-data=multipart/form-data', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test496");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection14 = httpConnection0.data(strArray13);
        org.jsoup.Connection connection16 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection18 = httpConnection0.requestBody("multipart/form-data=multipart/form-data");
        org.jsoup.parser.Parser parser19 = null;
        org.jsoup.Connection connection20 = httpConnection0.parser(parser19);
        java.io.InputStream inputStream23 = null;
        org.jsoup.Connection connection24 = httpConnection0.data("Content-Encoding", "application/x-www-form-urlencoded=multipart/form-data", inputStream23);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection24);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test497");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection8 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection.Request request9 = httpConnection0.request();
        org.jsoup.Connection connection11 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection connection14 = httpConnection0.cookie("Content-Encoding", "multipart/form-data=Content-Type");
        java.lang.Class<?> wildcardClass15 = httpConnection0.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test498");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection.KeyVal keyVal8 = httpConnection0.data("multipart/form-data=multipart/form-data");
        org.jsoup.Connection connection10 = httpConnection0.referrer("multipart/form-data");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = httpConnection0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNull(keyVal8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test499");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection8 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection.Request request9 = httpConnection0.request();
        org.jsoup.Connection connection11 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection connection14 = httpConnection0.cookie("Content-Encoding", "multipart/form-data=Content-Type");
        org.jsoup.Connection connection17 = httpConnection0.data("Content-Type=", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection19 = connection17.newRequest("hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!=', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression0.test500");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.Connection.KeyVal keyVal4 = keyVal2.contentType("application/x-www-form-urlencoded");
        java.lang.String str5 = keyVal2.value();
        java.lang.String str6 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }
}

