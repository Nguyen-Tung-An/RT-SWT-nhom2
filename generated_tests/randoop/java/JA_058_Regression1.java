import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JA_058_Regression1 {

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
            System.out.format("%n%s%n", "JA_058_Regression1.test501");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection6 = httpConnection0.requestBody("");
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        java.net.CookieStore cookieStore9 = httpConnection0.cookieStore();
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
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(cookieStore9);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test502");
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
        org.jsoup.Connection connection28 = httpConnection0.timeout((int) (byte) 100);
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
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test503");
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
        org.jsoup.Connection connection16 = httpConnection0.timeout((int) (byte) 10);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress17 = null;
        org.jsoup.Connection connection18 = httpConnection0.onResponseProgress(responseProgress17);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test504");
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
        org.jsoup.Connection.Response response22 = null;
        org.jsoup.Connection connection23 = httpConnection0.response(response22);
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
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test505");
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
        org.jsoup.parser.Parser parser30 = null;
        org.jsoup.Connection connection31 = httpConnection0.parser(parser30);
        java.io.InputStream inputStream32 = null;
        org.jsoup.Connection connection33 = httpConnection0.requestBodyStream(inputStream32);
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
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection33);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test506");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data=Content-Type", "application/x-www-form-urlencoded");
        java.lang.String str3 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "multipart/form-data=Content-Type" + "'", str3, "multipart/form-data=Content-Type");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test507");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        javax.net.ssl.SSLContext sSLContext9 = null;
        org.jsoup.Connection connection10 = httpConnection0.sslContext(sSLContext9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = httpConnection0.postDataCharset("hi!=application/x-www-form-urlencoded=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!=application/x-www-form-urlencoded=multipart/form-data");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test508");
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
        org.jsoup.Connection connection15 = httpConnection0.newRequest();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test509");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection25 = httpConnection0.newRequest("hi!=");
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
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test510");
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
        org.jsoup.Connection connection15 = httpConnection0.ignoreContentType(true);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test511");
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
        org.jsoup.Connection connection27 = httpConnection25.userAgent("");
        java.net.Proxy proxy28 = null;
        org.jsoup.Connection connection29 = httpConnection25.proxy(proxy28);
        org.jsoup.Connection.KeyVal keyVal31 = httpConnection25.data("multipart/form-data");
        org.jsoup.Connection connection33 = httpConnection25.maxBodySize((int) '#');
        org.jsoup.Connection connection35 = httpConnection25.timeout((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection39 = httpConnection25.data(strArray38);
        org.jsoup.Connection connection40 = httpConnection0.data(strArray38);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document41 = httpConnection0.get();
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
        org.junit.Assert.assertNull(keyVal31);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection40);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test512");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.key("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test513");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "application/x-www-form-urlencoded", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        java.lang.String str6 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "application/x-www-form-urlencoded" + "'", str6, "application/x-www-form-urlencoded");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test514");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        org.jsoup.Connection connection13 = httpConnection0.cookie("multipart/form-data=Content-Type", "application/x-www-form-urlencoded=multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test515");
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
        org.jsoup.Connection connection17 = httpConnection0.maxBodySize(0);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test516");
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
        org.jsoup.Connection connection18 = httpConnection11.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress19 = null;
        org.jsoup.Connection connection20 = httpConnection11.onResponseProgress(responseProgress19);
        org.jsoup.Connection connection23 = httpConnection11.data("hi!", "hi!");
        org.jsoup.Connection connection26 = httpConnection11.cookie("Content-Type=", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection27 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection29 = httpConnection27.followRedirects(true);
        java.io.InputStream inputStream32 = null;
        org.jsoup.Connection connection34 = httpConnection27.data("application/x-www-form-urlencoded", "Content-Type", inputStream32, "multipart/form-data");
        org.jsoup.Connection connection36 = httpConnection27.referrer("");
        org.jsoup.helper.HttpConnection httpConnection37 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection39 = httpConnection37.userAgent("");
        java.net.Proxy proxy40 = null;
        org.jsoup.Connection connection41 = httpConnection37.proxy(proxy40);
        org.jsoup.Connection.KeyVal keyVal43 = httpConnection37.data("multipart/form-data");
        org.jsoup.Connection connection45 = httpConnection37.maxBodySize((int) '#');
        org.jsoup.Connection connection47 = httpConnection37.timeout((int) '4');
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection51 = httpConnection37.data(strArray50);
        org.jsoup.Connection connection52 = httpConnection27.data(strArray50);
        org.jsoup.Connection connection53 = httpConnection11.data(strArray50);
        org.jsoup.Connection connection54 = httpConnection0.data(strArray50);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection56 = httpConnection0.cookies(strMap55);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
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
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNull(keyVal43);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(connection54);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test517");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=application/x-www-form-urlencoded=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!=application/x-www-form-urlencoded=multipart/form-data', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test518");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response31 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
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
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test519");
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
        org.jsoup.Connection.KeyVal keyVal20 = httpConnection0.data("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
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
        org.junit.Assert.assertNull(keyVal20);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test520");
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
        org.jsoup.helper.HttpConnection httpConnection33 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection35 = httpConnection33.userAgent("");
        org.jsoup.Connection connection37 = httpConnection33.requestBody("hi!");
        org.jsoup.Connection connection40 = httpConnection33.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress41 = null;
        org.jsoup.Connection connection42 = httpConnection33.onResponseProgress(responseProgress41);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator43 = null;
        org.jsoup.Connection connection44 = httpConnection33.auth(requestAuthenticator43);
        java.net.Proxy proxy45 = null;
        org.jsoup.Connection connection46 = httpConnection33.proxy(proxy45);
        org.jsoup.Connection connection48 = httpConnection33.userAgent("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress49 = null;
        org.jsoup.Connection connection50 = httpConnection33.onResponseProgress(responseProgress49);
        org.jsoup.helper.HttpConnection httpConnection51 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext52 = null;
        org.jsoup.Connection connection53 = httpConnection51.sslContext(sSLContext52);
        org.jsoup.helper.HttpConnection httpConnection54 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection56 = httpConnection54.userAgent("");
        org.jsoup.Connection connection58 = httpConnection54.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal60 = httpConnection54.data("hi!");
        org.jsoup.Connection.Request request61 = httpConnection54.request();
        org.jsoup.Connection connection62 = httpConnection51.request(request61);
        org.jsoup.Connection connection63 = httpConnection33.request(request61);
        java.io.InputStream inputStream66 = null;
        org.jsoup.Connection connection68 = httpConnection33.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "multipart/form-data", inputStream66, "application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection httpConnection69 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection71 = httpConnection69.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy72 = null;
        org.jsoup.Connection connection73 = httpConnection69.proxy(proxy72);
        org.jsoup.Connection.Response response74 = null;
        org.jsoup.Connection connection75 = httpConnection69.response(response74);
        java.io.InputStream inputStream78 = null;
        org.jsoup.Connection connection79 = httpConnection69.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream78);
        org.jsoup.Connection.Request request80 = httpConnection69.request();
        java.net.CookieStore cookieStore81 = httpConnection69.cookieStore();
        org.jsoup.Connection connection82 = httpConnection33.cookieStore(cookieStore81);
        org.jsoup.Connection connection83 = httpConnection19.cookieStore(cookieStore81);
        org.jsoup.Connection connection84 = httpConnection0.cookieStore(cookieStore81);
        java.util.Map<java.lang.String, java.lang.String> strMap85 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection86 = httpConnection0.data(strMap85);
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
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNull(keyVal60);
        org.junit.Assert.assertNotNull(request61);
        org.junit.Assert.assertNotNull(connection62);
        org.junit.Assert.assertNotNull(connection63);
        org.junit.Assert.assertNotNull(connection68);
        org.junit.Assert.assertNotNull(connection71);
        org.junit.Assert.assertNotNull(connection73);
        org.junit.Assert.assertNotNull(connection75);
        org.junit.Assert.assertNotNull(connection79);
        org.junit.Assert.assertNotNull(request80);
        org.junit.Assert.assertNotNull(cookieStore81);
        org.junit.Assert.assertNotNull(connection82);
        org.junit.Assert.assertNotNull(connection83);
        org.junit.Assert.assertNotNull(connection84);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test521");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Type");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("multipart/form-data=Content-Type");
        java.io.InputStream inputStream10 = keyVal9.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNull(inputStream10);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test522");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        java.net.CookieStore cookieStore13 = null;
        org.jsoup.Connection connection14 = httpConnection0.cookieStore(cookieStore13);
        org.jsoup.Connection connection16 = httpConnection0.timeout((int) (byte) 10);
        org.jsoup.Connection connection18 = httpConnection0.maxBodySize(1);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test523");
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
        org.jsoup.Connection connection18 = httpConnection0.requestBody("hi!=");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test524");
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
        org.jsoup.Connection.Response response15 = null;
        org.jsoup.Connection connection16 = httpConnection0.response(response15);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test525");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream13);
        org.jsoup.Connection connection17 = httpConnection0.header("Content-Encoding", "Content-Type");
        org.jsoup.Connection connection19 = httpConnection0.maxBodySize((int) ' ');
        org.jsoup.Connection connection22 = httpConnection0.cookie("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection22);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test526");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory24 = null;
        org.jsoup.Connection connection25 = httpConnection0.sslSocketFactory(sSLSocketFactory24);
        org.jsoup.Connection.KeyVal keyVal27 = httpConnection0.data("hi!=application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Connection connection29 = httpConnection0.maxBodySize((int) 'a');
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
        org.junit.Assert.assertNull(keyVal27);
        org.junit.Assert.assertNotNull(connection29);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test527");
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
            org.jsoup.Connection.Response response15 = httpConnection0.response();
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
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test528");
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
        org.jsoup.Connection connection20 = httpConnection0.ignoreHttpErrors(false);
        java.io.InputStream inputStream23 = null;
        org.jsoup.Connection connection25 = httpConnection0.data("hi!=", "Content-Encoding", inputStream23, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection25);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test529");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!=");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.inputStream(inputStream5);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test530");
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
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test531");
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
        org.jsoup.Connection connection18 = httpConnection0.userAgent("Content-Type");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test532");
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
        org.jsoup.Connection connection20 = httpConnection0.proxy("multipart/form-data=Content-Type", (int) '#');
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test533");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.userAgent("hi!");
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = connection11.newRequest(uRL12);
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
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test534");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("application/x-www-form-urlencoded=multipart/form-data");
        java.lang.String str11 = keyVal8.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test535");
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
            org.jsoup.nodes.Document document28 = httpConnection0.post();
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
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test536");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test537");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection.Request request3 = null;
        org.jsoup.Connection connection4 = httpConnection0.request(request3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection.Response response6 = null;
        org.jsoup.Connection connection7 = httpConnection0.response(response6);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test538");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        org.jsoup.Connection.KeyVal keyVal9 = keyVal2.contentType("application/x-www-form-urlencoded");
        java.lang.String str10 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=" + "'", str10, "hi!=");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test539");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection5 = httpConnection0.cookie("multipart/form-data=multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection6 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection8 = httpConnection6.userAgent("");
        java.net.Proxy proxy9 = null;
        org.jsoup.Connection connection10 = httpConnection6.proxy(proxy9);
        org.jsoup.Connection.KeyVal keyVal12 = httpConnection6.data("multipart/form-data");
        org.jsoup.Connection connection14 = httpConnection6.maxBodySize((int) '#');
        org.jsoup.Connection connection16 = httpConnection6.timeout((int) '4');
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection20 = httpConnection6.data(strArray19);
        org.jsoup.Connection connection22 = httpConnection6.ignoreHttpErrors(true);
        org.jsoup.Connection connection25 = httpConnection6.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!");
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection28 = httpConnection26.userAgent("");
        org.jsoup.Connection connection30 = httpConnection26.requestBody("hi!");
        org.jsoup.Connection connection33 = httpConnection26.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress34 = null;
        org.jsoup.Connection connection35 = httpConnection26.onResponseProgress(responseProgress34);
        java.lang.String[] strArray36 = new java.lang.String[] {};
        org.jsoup.Connection connection37 = httpConnection26.data(strArray36);
        org.jsoup.Connection connection38 = httpConnection6.data(strArray36);
        org.jsoup.Connection connection39 = httpConnection0.data(strArray36);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNull(keyVal12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection39);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test540");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslContext(sSLContext5);
        org.jsoup.Connection connection8 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response9 = null;
        org.jsoup.Connection connection10 = httpConnection0.response(response9);
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        java.net.Proxy proxy14 = null;
        org.jsoup.Connection connection15 = httpConnection11.proxy(proxy14);
        org.jsoup.Connection connection17 = httpConnection11.followRedirects(false);
        org.jsoup.Connection connection19 = httpConnection11.timeout((int) ' ');
        org.jsoup.Connection connection22 = httpConnection11.cookie("application/x-www-form-urlencoded=multipart/form-data", "hi!=");
        org.jsoup.Connection connection24 = httpConnection11.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal27 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal29 = keyVal27.key("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal32 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str33 = keyVal32.contentType();
        java.io.InputStream inputStream34 = keyVal32.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray35 = new org.jsoup.Connection.KeyVal[] { keyVal27, keyVal32 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList36 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList36, keyValArray35);
        org.jsoup.Connection connection38 = httpConnection11.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList36);
        org.jsoup.Connection connection39 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList36);
        javax.net.ssl.SSLContext sSLContext40 = null;
        org.jsoup.Connection connection41 = httpConnection0.sslContext(sSLContext40);
        org.jsoup.Connection connection42 = httpConnection0.newRequest();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(keyVal27);
        org.junit.Assert.assertNotNull(keyVal29);
        org.junit.Assert.assertNotNull(keyVal32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(inputStream34);
        org.junit.Assert.assertNotNull(keyValArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection42);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test541");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.Connection connection12 = httpConnection0.data("hi!", "hi!");
        org.jsoup.Connection connection15 = httpConnection0.cookie("Content-Type=", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection18 = httpConnection16.followRedirects(true);
        java.io.InputStream inputStream21 = null;
        org.jsoup.Connection connection23 = httpConnection16.data("application/x-www-form-urlencoded", "Content-Type", inputStream21, "multipart/form-data");
        org.jsoup.Connection connection25 = httpConnection16.referrer("");
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection28 = httpConnection26.userAgent("");
        java.net.Proxy proxy29 = null;
        org.jsoup.Connection connection30 = httpConnection26.proxy(proxy29);
        org.jsoup.Connection.KeyVal keyVal32 = httpConnection26.data("multipart/form-data");
        org.jsoup.Connection connection34 = httpConnection26.maxBodySize((int) '#');
        org.jsoup.Connection connection36 = httpConnection26.timeout((int) '4');
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection40 = httpConnection26.data(strArray39);
        org.jsoup.Connection connection41 = httpConnection16.data(strArray39);
        org.jsoup.Connection connection42 = httpConnection0.data(strArray39);
        org.jsoup.Connection connection44 = httpConnection0.ignoreContentType(false);
        java.io.InputStream inputStream47 = null;
        org.jsoup.Connection connection49 = httpConnection0.data("hi!=", "multipart/form-data", inputStream47, "Content-Type=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response50 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNull(keyVal32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection49);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test542");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Type");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.inputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        boolean boolean11 = keyVal10.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.value("");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test543");
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
        org.jsoup.Connection connection23 = httpConnection0.requestBody("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection25 = httpConnection0.postDataCharset("application/x-www-form-urlencoded=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: application/x-www-form-urlencoded=multipart/form-data");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test544");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection27 = httpConnection0.newRequest("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
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
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test545");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "application/x-www-form-urlencoded", inputStream2);
        java.lang.String str4 = keyVal3.contentType();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test546");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test547");
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
        java.io.InputStream inputStream31 = null;
        org.jsoup.Connection connection32 = httpConnection0.requestBodyStream(inputStream31);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection34 = httpConnection0.url("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
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
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test548");
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
        org.jsoup.Connection connection23 = httpConnection0.ignoreContentType(false);
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
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test549");
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
        java.io.InputStream inputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection20 = httpConnection0.data("", "application/x-www-form-urlencoded", inputStream19);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
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
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test550");
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
        org.jsoup.Connection.Response response15 = null;
        org.jsoup.Connection connection16 = httpConnection0.response(response15);
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
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test551");
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
        org.jsoup.Connection connection17 = httpConnection0.timeout(10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection19 = httpConnection0.newRequest("application/x-www-form-urlencoded");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'application/x-www-form-urlencoded', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
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
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test552");
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
        org.jsoup.Connection connection23 = httpConnection0.header("hi!", "multipart/form-data=Content-Type");
        java.net.Proxy proxy24 = null;
        org.jsoup.Connection connection25 = httpConnection0.proxy(proxy24);
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
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test553");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        java.lang.String str4 = keyVal2.contentType();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Type");
        java.lang.String str7 = keyVal6.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Content-Type" + "'", str7, "Content-Type");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test554");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection9 = httpConnection7.userAgent("");
        java.net.Proxy proxy10 = null;
        org.jsoup.Connection connection11 = httpConnection7.proxy(proxy10);
        org.jsoup.Connection connection13 = httpConnection7.followRedirects(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection17 = httpConnection7.data(strArray16);
        org.jsoup.Connection connection18 = httpConnection0.data(strArray16);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress19 = null;
        org.jsoup.Connection connection20 = httpConnection0.onResponseProgress(responseProgress19);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test555");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document28 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
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
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(cookieStore25);
        org.junit.Assert.assertNotNull(connection27);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test556");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("multipart/form-data=Content-Type");
        java.io.InputStream inputStream7 = keyVal6.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test557");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.timeout(1);
        org.jsoup.Connection connection6 = httpConnection0.requestBody("Content-Type");
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
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test558");
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
        org.jsoup.helper.HttpConnection httpConnection25 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection27 = httpConnection25.userAgent("");
        org.jsoup.Connection connection29 = httpConnection25.requestBody("hi!");
        org.jsoup.Connection.Response response30 = null;
        org.jsoup.Connection connection31 = httpConnection25.response(response30);
        org.jsoup.helper.HttpConnection httpConnection32 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection34 = httpConnection32.userAgent("");
        java.net.Proxy proxy35 = null;
        org.jsoup.Connection connection36 = httpConnection32.proxy(proxy35);
        org.jsoup.Connection connection38 = httpConnection32.followRedirects(false);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection42 = httpConnection32.data(strArray41);
        java.io.InputStream inputStream43 = null;
        org.jsoup.Connection connection44 = httpConnection32.requestBodyStream(inputStream43);
        java.net.CookieStore cookieStore45 = httpConnection32.cookieStore();
        org.jsoup.Connection connection46 = httpConnection25.cookieStore(cookieStore45);
        org.jsoup.helper.HttpConnection httpConnection47 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection49 = httpConnection47.userAgent("");
        java.net.Proxy proxy50 = null;
        org.jsoup.Connection connection51 = httpConnection47.proxy(proxy50);
        org.jsoup.Connection.KeyVal keyVal53 = httpConnection47.data("multipart/form-data");
        org.jsoup.Connection connection56 = httpConnection47.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection57 = httpConnection47.newRequest();
        org.jsoup.helper.HttpConnection httpConnection58 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection60 = httpConnection58.userAgent("");
        org.jsoup.Connection connection62 = httpConnection58.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal64 = httpConnection58.data("hi!");
        org.jsoup.Connection.Request request65 = httpConnection58.request();
        org.jsoup.Connection connection66 = httpConnection47.request(request65);
        org.jsoup.helper.HttpConnection httpConnection67 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection69 = httpConnection67.followRedirects(true);
        java.io.InputStream inputStream72 = null;
        org.jsoup.Connection connection74 = httpConnection67.data("application/x-www-form-urlencoded", "Content-Type", inputStream72, "multipart/form-data");
        java.net.Proxy proxy75 = null;
        org.jsoup.Connection connection76 = httpConnection67.proxy(proxy75);
        java.net.CookieStore cookieStore77 = httpConnection67.cookieStore();
        org.jsoup.Connection connection78 = httpConnection47.cookieStore(cookieStore77);
        org.jsoup.Connection connection79 = httpConnection25.cookieStore(cookieStore77);
        org.jsoup.Connection.Request request80 = httpConnection25.request();
        org.jsoup.Connection connection81 = httpConnection0.request(request80);
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
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(cookieStore45);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNull(keyVal53);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(connection62);
        org.junit.Assert.assertNull(keyVal64);
        org.junit.Assert.assertNotNull(request65);
        org.junit.Assert.assertNotNull(connection66);
        org.junit.Assert.assertNotNull(connection69);
        org.junit.Assert.assertNotNull(connection74);
        org.junit.Assert.assertNotNull(connection76);
        org.junit.Assert.assertNotNull(cookieStore77);
        org.junit.Assert.assertNotNull(connection78);
        org.junit.Assert.assertNotNull(connection79);
        org.junit.Assert.assertNotNull(request80);
        org.junit.Assert.assertNotNull(connection81);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test559");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "Content-Type", inputStream2);
        boolean boolean4 = keyVal3.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test560");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        org.jsoup.Connection connection14 = httpConnection0.ignoreHttpErrors(false);
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
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test561");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "application/x-www-form-urlencoded=multipart/form-data", inputStream5, "Content-Encoding");
        org.jsoup.Connection connection10 = httpConnection0.proxy("application/x-www-form-urlencoded", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = httpConnection0.postDataCharset("multipart/form-data=Content-Type");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: multipart/form-data=Content-Type");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test562");
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
        java.net.Proxy proxy15 = null;
        org.jsoup.Connection connection16 = httpConnection0.proxy(proxy15);
        java.io.InputStream inputStream19 = null;
        org.jsoup.Connection connection20 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type=", inputStream19);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test563");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection6 = httpConnection0.requestBody("");
        org.jsoup.Connection connection8 = httpConnection0.requestBody("multipart/form-data=Content-Type");
        org.jsoup.Connection connection9 = httpConnection0.newRequest();
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.requestBodyStream(inputStream10);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test564");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = httpConnection0.cookies(strMap13);
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
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test565");
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
        org.jsoup.Connection connection18 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection21 = httpConnection19.followRedirects(true);
        java.io.InputStream inputStream24 = null;
        org.jsoup.Connection connection26 = httpConnection19.data("application/x-www-form-urlencoded", "Content-Type", inputStream24, "multipart/form-data");
        java.net.Proxy proxy27 = null;
        org.jsoup.Connection connection28 = httpConnection19.proxy(proxy27);
        java.io.InputStream inputStream29 = null;
        org.jsoup.Connection connection30 = httpConnection19.requestBodyStream(inputStream29);
        org.jsoup.helper.HttpConnection httpConnection31 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection33 = httpConnection31.userAgent("");
        java.net.Proxy proxy34 = null;
        org.jsoup.Connection connection35 = httpConnection31.proxy(proxy34);
        org.jsoup.Connection.KeyVal keyVal37 = httpConnection31.data("multipart/form-data");
        org.jsoup.Connection connection40 = httpConnection31.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection41 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext42 = null;
        org.jsoup.Connection connection43 = httpConnection41.sslContext(sSLContext42);
        org.jsoup.helper.HttpConnection httpConnection44 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection46 = httpConnection44.userAgent("");
        org.jsoup.Connection connection48 = httpConnection44.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal50 = httpConnection44.data("hi!");
        org.jsoup.Connection.Request request51 = httpConnection44.request();
        org.jsoup.Connection connection52 = httpConnection41.request(request51);
        org.jsoup.Connection connection53 = httpConnection31.request(request51);
        org.jsoup.helper.HttpConnection httpConnection54 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext55 = null;
        org.jsoup.Connection connection56 = httpConnection54.sslContext(sSLContext55);
        org.jsoup.Connection connection58 = httpConnection54.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext59 = null;
        org.jsoup.Connection connection60 = httpConnection54.sslContext(sSLContext59);
        org.jsoup.Connection connection62 = httpConnection54.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response63 = null;
        org.jsoup.Connection connection64 = httpConnection54.response(response63);
        org.jsoup.helper.HttpConnection httpConnection65 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection67 = httpConnection65.userAgent("");
        java.net.Proxy proxy68 = null;
        org.jsoup.Connection connection69 = httpConnection65.proxy(proxy68);
        org.jsoup.Connection connection71 = httpConnection65.followRedirects(false);
        org.jsoup.Connection connection73 = httpConnection65.timeout((int) ' ');
        org.jsoup.Connection connection76 = httpConnection65.cookie("application/x-www-form-urlencoded=multipart/form-data", "hi!=");
        org.jsoup.Connection connection78 = httpConnection65.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal81 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal83 = keyVal81.key("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal86 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str87 = keyVal86.contentType();
        java.io.InputStream inputStream88 = keyVal86.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray89 = new org.jsoup.Connection.KeyVal[] { keyVal81, keyVal86 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList90 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList90, keyValArray89);
        org.jsoup.Connection connection92 = httpConnection65.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList90);
        org.jsoup.Connection connection93 = httpConnection54.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList90);
        org.jsoup.Connection connection94 = httpConnection31.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList90);
        org.jsoup.Connection connection95 = httpConnection19.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList90);
        org.jsoup.Connection connection96 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList90);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response97 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNull(keyVal37);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNull(keyVal50);
        org.junit.Assert.assertNotNull(request51);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(connection62);
        org.junit.Assert.assertNotNull(connection64);
        org.junit.Assert.assertNotNull(connection67);
        org.junit.Assert.assertNotNull(connection69);
        org.junit.Assert.assertNotNull(connection71);
        org.junit.Assert.assertNotNull(connection73);
        org.junit.Assert.assertNotNull(connection76);
        org.junit.Assert.assertNotNull(connection78);
        org.junit.Assert.assertNotNull(keyVal81);
        org.junit.Assert.assertNotNull(keyVal83);
        org.junit.Assert.assertNotNull(keyVal86);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertNull(inputStream88);
        org.junit.Assert.assertNotNull(keyValArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(connection92);
        org.junit.Assert.assertNotNull(connection93);
        org.junit.Assert.assertNotNull(connection94);
        org.junit.Assert.assertNotNull(connection95);
        org.junit.Assert.assertNotNull(connection96);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test566");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        org.jsoup.Connection connection18 = httpConnection0.sslSocketFactory(sSLSocketFactory17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection20 = httpConnection0.newRequest("Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Content-Type', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
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
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test567");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        org.jsoup.Connection connection9 = httpConnection0.proxy("Content-Type=", (int) (byte) 0);
        org.jsoup.Connection connection12 = httpConnection0.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "application/x-www-form-urlencoded");
        org.jsoup.Connection.KeyVal keyVal14 = httpConnection0.data("hi!=");
        org.jsoup.Connection connection15 = httpConnection0.newRequest();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNull(keyVal14);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test568");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection6 = httpConnection0.requestBody("");
        org.jsoup.Connection connection8 = httpConnection0.requestBody("multipart/form-data=Content-Type");
        org.jsoup.Connection connection9 = httpConnection0.newRequest();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        org.jsoup.Connection connection11 = httpConnection0.sslSocketFactory(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test569");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        org.jsoup.Connection connection9 = httpConnection0.proxy("Content-Type=", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = httpConnection0.data("", "multipart/form-data=Content-Type");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test570");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        org.jsoup.Connection connection13 = httpConnection0.cookie("multipart/form-data=Content-Type", "application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Connection connection16 = httpConnection0.cookie("application/x-www-form-urlencoded=multipart/form-data", "");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test571");
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
        org.jsoup.Connection connection25 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection28 = httpConnection0.proxy("multipart/form-data", (int) (short) 100);
        org.jsoup.Connection connection30 = httpConnection0.maxBodySize((int) '4');
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
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test572");
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
        org.jsoup.Connection.KeyVal keyVal20 = httpConnection0.data("hi!=");
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection23 = httpConnection21.userAgent("");
        org.jsoup.Connection connection25 = httpConnection21.requestBody("hi!");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator26 = null;
        org.jsoup.Connection connection27 = httpConnection21.auth(requestAuthenticator26);
        org.jsoup.Connection.Request request28 = httpConnection21.request();
        org.jsoup.Connection connection29 = httpConnection0.request(request28);
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
        org.junit.Assert.assertNotNull(keyVal20);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(connection29);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test573");
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
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = connection14.newRequest(uRL15);
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
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test574");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "multipart/form-data", inputStream2);
        java.lang.Class<?> wildcardClass4 = keyVal3.getClass();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test575");
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
        java.io.InputStream inputStream28 = null;
        org.jsoup.Connection connection29 = httpConnection0.requestBodyStream(inputStream28);
        java.net.Proxy proxy30 = null;
        org.jsoup.Connection connection31 = httpConnection0.proxy(proxy30);
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
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection31);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test576");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "hi!", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test577");
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
        java.net.CookieStore cookieStore16 = httpConnection0.cookieStore();
        org.jsoup.Connection connection19 = httpConnection0.cookie("Content-Type=", "multipart/form-data=multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(cookieStore16);
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test578");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=application/x-www-form-urlencoded=multipart/form-data", "hi!=application/x-www-form-urlencoded=multipart/form-data");
        java.lang.String str3 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=application/x-www-form-urlencoded=multipart/form-data" + "'", str3, "hi!=application/x-www-form-urlencoded=multipart/form-data");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test579");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        org.jsoup.Connection connection9 = httpConnection0.proxy("Content-Type=", (int) (byte) 0);
        org.jsoup.Connection connection12 = httpConnection0.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "application/x-www-form-urlencoded");
        java.net.CookieStore cookieStore13 = httpConnection0.cookieStore();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(cookieStore13);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test580");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.Connection.KeyVal keyVal6 = keyVal2.contentType("Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test581");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.Connection.KeyVal keyVal4 = keyVal2.contentType("application/x-www-form-urlencoded");
        java.lang.String str5 = keyVal2.contentType();
        java.lang.String str6 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "application/x-www-form-urlencoded" + "'", str5, "application/x-www-form-urlencoded");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test582");
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
        org.jsoup.Connection connection19 = httpConnection0.cookie("Content-Type", "multipart/form-data");
        java.net.Proxy proxy20 = null;
        org.jsoup.Connection connection21 = httpConnection0.proxy(proxy20);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test583");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test584");
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
        org.jsoup.Connection connection20 = httpConnection0.referrer("application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection23 = httpConnection21.userAgent("");
        org.jsoup.Connection connection25 = httpConnection21.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal27 = httpConnection21.data("hi!");
        org.jsoup.Connection.Request request28 = httpConnection21.request();
        org.jsoup.helper.HttpConnection httpConnection29 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection31 = httpConnection29.userAgent("");
        java.net.Proxy proxy32 = null;
        org.jsoup.Connection connection33 = httpConnection29.proxy(proxy32);
        org.jsoup.Connection.KeyVal keyVal35 = httpConnection29.data("multipart/form-data");
        org.jsoup.Connection connection38 = httpConnection29.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection39 = httpConnection29.newRequest();
        org.jsoup.helper.HttpConnection httpConnection40 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection42 = httpConnection40.userAgent("");
        org.jsoup.Connection connection44 = httpConnection40.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal46 = httpConnection40.data("hi!");
        org.jsoup.Connection.Request request47 = httpConnection40.request();
        org.jsoup.Connection connection48 = httpConnection29.request(request47);
        org.jsoup.Connection connection49 = httpConnection21.request(request47);
        java.net.Proxy proxy50 = null;
        org.jsoup.Connection connection51 = httpConnection21.proxy(proxy50);
        org.jsoup.helper.HttpConnection httpConnection52 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection54 = httpConnection52.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy55 = null;
        org.jsoup.Connection connection56 = httpConnection52.proxy(proxy55);
        org.jsoup.Connection.Response response57 = null;
        org.jsoup.Connection connection58 = httpConnection52.response(response57);
        java.io.InputStream inputStream61 = null;
        org.jsoup.Connection connection62 = httpConnection52.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream61);
        org.jsoup.Connection.Request request63 = httpConnection52.request();
        java.net.CookieStore cookieStore64 = httpConnection52.cookieStore();
        org.jsoup.helper.HttpConnection httpConnection65 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection67 = httpConnection65.userAgent("");
        java.net.Proxy proxy68 = null;
        org.jsoup.Connection connection69 = httpConnection65.proxy(proxy68);
        org.jsoup.Connection.KeyVal keyVal71 = httpConnection65.data("multipart/form-data");
        org.jsoup.Connection connection74 = httpConnection65.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection75 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection77 = httpConnection75.userAgent("");
        java.net.Proxy proxy78 = null;
        org.jsoup.Connection connection79 = httpConnection75.proxy(proxy78);
        org.jsoup.Connection connection81 = httpConnection75.followRedirects(false);
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection85 = httpConnection75.data(strArray84);
        org.jsoup.Connection connection86 = httpConnection65.data(strArray84);
        org.jsoup.Connection connection87 = httpConnection52.data(strArray84);
        org.jsoup.Connection connection88 = httpConnection21.data(strArray84);
        org.jsoup.Connection connection89 = httpConnection0.data(strArray84);
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
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNull(keyVal27);
        org.junit.Assert.assertNotNull(request28);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNull(keyVal35);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNull(keyVal46);
        org.junit.Assert.assertNotNull(request47);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(connection54);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNotNull(connection62);
        org.junit.Assert.assertNotNull(request63);
        org.junit.Assert.assertNotNull(cookieStore64);
        org.junit.Assert.assertNotNull(connection67);
        org.junit.Assert.assertNotNull(connection69);
        org.junit.Assert.assertNull(keyVal71);
        org.junit.Assert.assertNotNull(connection74);
        org.junit.Assert.assertNotNull(connection77);
        org.junit.Assert.assertNotNull(connection79);
        org.junit.Assert.assertNotNull(connection81);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection85);
        org.junit.Assert.assertNotNull(connection86);
        org.junit.Assert.assertNotNull(connection87);
        org.junit.Assert.assertNotNull(connection88);
        org.junit.Assert.assertNotNull(connection89);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test585");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.maxBodySize((int) (byte) 0);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test586");
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
        javax.net.ssl.SSLContext sSLContext15 = null;
        org.jsoup.Connection connection16 = httpConnection0.sslContext(sSLContext15);
        org.jsoup.Connection connection19 = httpConnection0.cookie("Content-Type", "Content-Encoding");
        org.jsoup.Connection connection21 = httpConnection0.referrer("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test587");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection8 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection connection11 = httpConnection0.cookie("application/x-www-form-urlencoded=multipart/form-data", "hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.postDataCharset("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test588");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = keyVal4.inputStream();
        java.lang.String str6 = keyVal4.key();
        java.lang.String str7 = keyVal4.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=" + "'", str7, "hi!=");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test589");
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
        org.jsoup.Connection.Request request14 = httpConnection0.request();
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
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(request14);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test590");
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
            org.jsoup.nodes.Document document22 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
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
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test591");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory24 = null;
        org.jsoup.Connection connection25 = httpConnection0.sslSocketFactory(sSLSocketFactory24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection27 = httpConnection0.url("multipart/form-data=Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'multipart/form-data=Content-Type', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
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
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test592");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        org.jsoup.Connection connection9 = httpConnection0.proxy("Content-Type=", (int) (byte) 0);
        org.jsoup.Connection connection12 = httpConnection0.header("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "application/x-www-form-urlencoded");
        org.jsoup.Connection connection14 = httpConnection0.userAgent("Content-Encoding");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test593");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data=Content-Type", "application/x-www-form-urlencoded", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test594");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.timeout(1);
        org.jsoup.Connection connection6 = httpConnection0.requestBody("Content-Type");
        org.jsoup.Connection connection8 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection connection10 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection12 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test595");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection6 = httpConnection0.requestBody("");
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
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test596");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test597");
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
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = httpConnection0.method(method17);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test598");
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
        org.jsoup.Connection connection29 = httpConnection0.newRequest();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection31 = connection29.newRequest("");
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
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection29);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test599");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.helper.RequestAuthenticator requestAuthenticator11 = null;
        org.jsoup.Connection connection12 = httpConnection0.auth(requestAuthenticator11);
        org.jsoup.Connection connection15 = httpConnection0.proxy("Content-Type=", 0);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test600");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.requestBodyStream(inputStream10);
        org.jsoup.Connection connection14 = httpConnection0.cookie("Content-Encoding", "");
        java.io.InputStream inputStream17 = null;
        org.jsoup.Connection connection19 = httpConnection0.data("multipart/form-data=Content-Type", "multipart/form-data=Content-Type", inputStream17, "application/x-www-form-urlencoded=multipart/form-data");
        java.net.CookieStore cookieStore20 = httpConnection0.cookieStore();
        org.jsoup.helper.RequestAuthenticator requestAuthenticator21 = null;
        org.jsoup.Connection connection22 = httpConnection0.auth(requestAuthenticator21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection24 = httpConnection0.postDataCharset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(cookieStore20);
        org.junit.Assert.assertNotNull(connection22);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test601");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection8 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection connection11 = httpConnection0.cookie("application/x-www-form-urlencoded=multipart/form-data", "hi!=");
        javax.net.ssl.SSLContext sSLContext12 = null;
        org.jsoup.Connection connection13 = httpConnection0.sslContext(sSLContext12);
        org.jsoup.Connection.Response response14 = null;
        org.jsoup.Connection connection15 = httpConnection0.response(response14);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test602");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream13);
        java.net.CookieStore cookieStore15 = httpConnection0.cookieStore();
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection18 = httpConnection16.followRedirects(true);
        java.io.InputStream inputStream21 = null;
        org.jsoup.Connection connection23 = httpConnection16.data("application/x-www-form-urlencoded", "Content-Type", inputStream21, "multipart/form-data");
        java.net.Proxy proxy24 = null;
        org.jsoup.Connection connection25 = httpConnection16.proxy(proxy24);
        java.io.InputStream inputStream26 = null;
        org.jsoup.Connection connection27 = httpConnection16.requestBodyStream(inputStream26);
        org.jsoup.Connection connection30 = httpConnection16.cookie("Content-Encoding", "");
        org.jsoup.Connection connection32 = httpConnection16.userAgent("");
        org.jsoup.Connection connection34 = httpConnection16.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection httpConnection35 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection37 = httpConnection35.userAgent("");
        java.net.Proxy proxy38 = null;
        org.jsoup.Connection connection39 = httpConnection35.proxy(proxy38);
        org.jsoup.Connection.KeyVal keyVal41 = httpConnection35.data("multipart/form-data");
        org.jsoup.Connection connection44 = httpConnection35.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection45 = httpConnection35.newRequest();
        org.jsoup.helper.HttpConnection httpConnection46 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection48 = httpConnection46.userAgent("");
        org.jsoup.Connection connection50 = httpConnection46.requestBody("hi!");
        org.jsoup.Connection connection53 = httpConnection46.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress54 = null;
        org.jsoup.Connection connection55 = httpConnection46.onResponseProgress(responseProgress54);
        org.jsoup.Connection connection58 = httpConnection46.data("hi!", "hi!");
        org.jsoup.Connection connection61 = httpConnection46.cookie("Content-Type=", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection62 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection64 = httpConnection62.followRedirects(true);
        java.io.InputStream inputStream67 = null;
        org.jsoup.Connection connection69 = httpConnection62.data("application/x-www-form-urlencoded", "Content-Type", inputStream67, "multipart/form-data");
        org.jsoup.Connection connection71 = httpConnection62.referrer("");
        org.jsoup.helper.HttpConnection httpConnection72 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection74 = httpConnection72.userAgent("");
        java.net.Proxy proxy75 = null;
        org.jsoup.Connection connection76 = httpConnection72.proxy(proxy75);
        org.jsoup.Connection.KeyVal keyVal78 = httpConnection72.data("multipart/form-data");
        org.jsoup.Connection connection80 = httpConnection72.maxBodySize((int) '#');
        org.jsoup.Connection connection82 = httpConnection72.timeout((int) '4');
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection86 = httpConnection72.data(strArray85);
        org.jsoup.Connection connection87 = httpConnection62.data(strArray85);
        org.jsoup.Connection connection88 = httpConnection46.data(strArray85);
        org.jsoup.Connection connection89 = httpConnection35.data(strArray85);
        org.jsoup.Connection connection90 = httpConnection16.data(strArray85);
        org.jsoup.Connection connection91 = httpConnection0.data(strArray85);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(cookieStore15);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNull(keyVal41);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(connection55);
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNotNull(connection61);
        org.junit.Assert.assertNotNull(connection64);
        org.junit.Assert.assertNotNull(connection69);
        org.junit.Assert.assertNotNull(connection71);
        org.junit.Assert.assertNotNull(connection74);
        org.junit.Assert.assertNotNull(connection76);
        org.junit.Assert.assertNull(keyVal78);
        org.junit.Assert.assertNotNull(connection80);
        org.junit.Assert.assertNotNull(connection82);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection86);
        org.junit.Assert.assertNotNull(connection87);
        org.junit.Assert.assertNotNull(connection88);
        org.junit.Assert.assertNotNull(connection89);
        org.junit.Assert.assertNotNull(connection90);
        org.junit.Assert.assertNotNull(connection91);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test603");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.lang.String str10 = keyVal2.value();
        java.lang.String str11 = keyVal2.key();
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal2.inputStream(inputStream12);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test604");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection9 = httpConnection0.cookie("Content-Type", "multipart/form-data");
        org.jsoup.Connection connection11 = httpConnection0.userAgent("multipart/form-data=Content-Type");
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
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test605");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        java.lang.String str4 = keyVal2.toString();
        java.lang.String str5 = keyVal2.value();
        boolean boolean6 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "multipart/form-data=multipart/form-data" + "'", str4, "multipart/form-data=multipart/form-data");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "multipart/form-data" + "'", str5, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test606");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.helper.RequestAuthenticator requestAuthenticator11 = null;
        org.jsoup.Connection connection12 = httpConnection0.auth(requestAuthenticator11);
        org.jsoup.helper.HttpConnection httpConnection13 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection15 = httpConnection13.userAgent("");
        org.jsoup.Connection connection17 = httpConnection13.requestBody("hi!");
        org.jsoup.Connection.Response response18 = null;
        org.jsoup.Connection connection19 = httpConnection13.response(response18);
        org.jsoup.helper.HttpConnection httpConnection20 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection22 = httpConnection20.userAgent("");
        java.net.Proxy proxy23 = null;
        org.jsoup.Connection connection24 = httpConnection20.proxy(proxy23);
        org.jsoup.Connection connection26 = httpConnection20.followRedirects(false);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection30 = httpConnection20.data(strArray29);
        java.io.InputStream inputStream31 = null;
        org.jsoup.Connection connection32 = httpConnection20.requestBodyStream(inputStream31);
        java.net.CookieStore cookieStore33 = httpConnection20.cookieStore();
        org.jsoup.Connection connection34 = httpConnection13.cookieStore(cookieStore33);
        org.jsoup.helper.HttpConnection httpConnection35 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection37 = httpConnection35.userAgent("");
        java.net.Proxy proxy38 = null;
        org.jsoup.Connection connection39 = httpConnection35.proxy(proxy38);
        org.jsoup.Connection.KeyVal keyVal41 = httpConnection35.data("multipart/form-data");
        org.jsoup.Connection connection44 = httpConnection35.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection45 = httpConnection35.newRequest();
        org.jsoup.helper.HttpConnection httpConnection46 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection48 = httpConnection46.userAgent("");
        org.jsoup.Connection connection50 = httpConnection46.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal52 = httpConnection46.data("hi!");
        org.jsoup.Connection.Request request53 = httpConnection46.request();
        org.jsoup.Connection connection54 = httpConnection35.request(request53);
        org.jsoup.helper.HttpConnection httpConnection55 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection57 = httpConnection55.followRedirects(true);
        java.io.InputStream inputStream60 = null;
        org.jsoup.Connection connection62 = httpConnection55.data("application/x-www-form-urlencoded", "Content-Type", inputStream60, "multipart/form-data");
        java.net.Proxy proxy63 = null;
        org.jsoup.Connection connection64 = httpConnection55.proxy(proxy63);
        java.net.CookieStore cookieStore65 = httpConnection55.cookieStore();
        org.jsoup.Connection connection66 = httpConnection35.cookieStore(cookieStore65);
        org.jsoup.Connection connection67 = httpConnection13.cookieStore(cookieStore65);
        org.jsoup.Connection connection68 = httpConnection0.cookieStore(cookieStore65);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document69 = httpConnection0.post();
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
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(cookieStore33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNull(keyVal41);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNull(keyVal52);
        org.junit.Assert.assertNotNull(request53);
        org.junit.Assert.assertNotNull(connection54);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNotNull(connection62);
        org.junit.Assert.assertNotNull(connection64);
        org.junit.Assert.assertNotNull(cookieStore65);
        org.junit.Assert.assertNotNull(connection66);
        org.junit.Assert.assertNotNull(connection67);
        org.junit.Assert.assertNotNull(connection68);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test607");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.Connection connection12 = httpConnection0.data("hi!", "hi!");
        org.jsoup.Connection connection15 = httpConnection0.cookie("Content-Type=", "Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test608");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        boolean boolean5 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test609");
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
            org.jsoup.nodes.Document document14 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
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
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test610");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Connection connection12 = httpConnection0.ignoreHttpErrors(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection14 = httpConnection0.postDataCharset("hi!=application/x-www-form-urlencoded=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!=application/x-www-form-urlencoded=multipart/form-data");
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
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test611");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "Content-Encoding");
        java.lang.String str3 = keyVal2.contentType();
        org.jsoup.Connection.KeyVal keyVal5 = keyVal2.contentType("multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test612");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.net.Proxy proxy11 = null;
        org.jsoup.Connection connection12 = httpConnection0.proxy(proxy11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        org.jsoup.Connection connection14 = httpConnection0.sslSocketFactory(sSLSocketFactory13);
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = connection14.newRequest(uRL15);
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
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test613");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        java.lang.String str7 = keyVal6.value();
        java.io.InputStream inputStream8 = keyVal6.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multipart/form-data" + "'", str7, "multipart/form-data");
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test614");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection8 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection connection11 = httpConnection0.cookie("application/x-www-form-urlencoded=multipart/form-data", "hi!=");
        javax.net.ssl.SSLContext sSLContext12 = null;
        org.jsoup.Connection connection13 = httpConnection0.sslContext(sSLContext12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        org.jsoup.Connection connection15 = httpConnection0.sslSocketFactory(sSLSocketFactory14);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test615");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("application/x-www-form-urlencoded=multipart/form-data");
        java.io.InputStream inputStream5 = keyVal4.inputStream();
        boolean boolean6 = keyVal4.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test616");
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
        org.jsoup.Connection connection21 = httpConnection0.data("application/x-www-form-urlencoded=multipart/form-data", "multipart/form-data", inputStream19, "multipart/form-data=Content-Type");
        java.net.Proxy proxy22 = null;
        org.jsoup.Connection connection23 = httpConnection0.proxy(proxy22);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test617");
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
        org.jsoup.Connection connection25 = httpConnection0.newRequest();
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
        org.junit.Assert.assertNotNull(connection25);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test618");
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
        org.jsoup.helper.HttpConnection httpConnection31 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection33 = httpConnection31.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy34 = null;
        org.jsoup.Connection connection35 = httpConnection31.proxy(proxy34);
        org.jsoup.Connection.Response response36 = null;
        org.jsoup.Connection connection37 = httpConnection31.response(response36);
        java.io.InputStream inputStream40 = null;
        org.jsoup.Connection connection41 = httpConnection31.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream40);
        org.jsoup.Connection.Request request42 = httpConnection31.request();
        java.net.CookieStore cookieStore43 = httpConnection31.cookieStore();
        org.jsoup.helper.HttpConnection httpConnection44 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection46 = httpConnection44.userAgent("");
        java.net.Proxy proxy47 = null;
        org.jsoup.Connection connection48 = httpConnection44.proxy(proxy47);
        org.jsoup.Connection.KeyVal keyVal50 = httpConnection44.data("multipart/form-data");
        org.jsoup.Connection connection53 = httpConnection44.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection54 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection56 = httpConnection54.userAgent("");
        java.net.Proxy proxy57 = null;
        org.jsoup.Connection connection58 = httpConnection54.proxy(proxy57);
        org.jsoup.Connection connection60 = httpConnection54.followRedirects(false);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection64 = httpConnection54.data(strArray63);
        org.jsoup.Connection connection65 = httpConnection44.data(strArray63);
        org.jsoup.Connection connection66 = httpConnection31.data(strArray63);
        org.jsoup.Connection connection67 = httpConnection0.data(strArray63);
        org.jsoup.Connection connection70 = httpConnection0.data("multipart/form-data=Content-Type", "Content-Type=");
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
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(request42);
        org.junit.Assert.assertNotNull(cookieStore43);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNull(keyVal50);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection64);
        org.junit.Assert.assertNotNull(connection65);
        org.junit.Assert.assertNotNull(connection66);
        org.junit.Assert.assertNotNull(connection67);
        org.junit.Assert.assertNotNull(connection70);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test619");
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
            org.jsoup.Connection connection13 = httpConnection0.url("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
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
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test620");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory24 = null;
        org.jsoup.Connection connection25 = httpConnection0.sslSocketFactory(sSLSocketFactory24);
        org.jsoup.Connection.KeyVal keyVal27 = httpConnection0.data("hi!=application/x-www-form-urlencoded=multipart/form-data");
        java.net.Proxy proxy28 = null;
        org.jsoup.Connection connection29 = httpConnection0.proxy(proxy28);
        java.io.InputStream inputStream30 = null;
        org.jsoup.Connection connection31 = httpConnection0.requestBodyStream(inputStream30);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection33 = httpConnection0.cookies(strMap32);
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
        org.junit.Assert.assertNull(keyVal27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection31);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test621");
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
        java.net.CookieStore cookieStore30 = null;
        org.jsoup.Connection connection31 = httpConnection0.cookieStore(cookieStore30);
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
        org.junit.Assert.assertNotNull(connection31);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test622");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Type");
        java.io.InputStream inputStream5 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.inputStream(inputStream5);
        java.lang.String str7 = keyVal6.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test623");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.Connection connection12 = httpConnection0.data("hi!", "hi!");
        org.jsoup.Connection connection15 = httpConnection0.cookie("Content-Type=", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection18 = httpConnection16.followRedirects(true);
        java.io.InputStream inputStream21 = null;
        org.jsoup.Connection connection23 = httpConnection16.data("application/x-www-form-urlencoded", "Content-Type", inputStream21, "multipart/form-data");
        org.jsoup.Connection connection25 = httpConnection16.referrer("");
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection28 = httpConnection26.userAgent("");
        java.net.Proxy proxy29 = null;
        org.jsoup.Connection connection30 = httpConnection26.proxy(proxy29);
        org.jsoup.Connection.KeyVal keyVal32 = httpConnection26.data("multipart/form-data");
        org.jsoup.Connection connection34 = httpConnection26.maxBodySize((int) '#');
        org.jsoup.Connection connection36 = httpConnection26.timeout((int) '4');
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection40 = httpConnection26.data(strArray39);
        org.jsoup.Connection connection41 = httpConnection16.data(strArray39);
        org.jsoup.Connection connection42 = httpConnection0.data(strArray39);
        org.jsoup.Connection connection44 = httpConnection0.ignoreContentType(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response45 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNull(keyVal32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection44);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test624");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream12 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("hi!", "application/x-www-form-urlencoded", inputStream12, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.jsoup.parser.Parser parser15 = null;
        org.jsoup.Connection connection16 = httpConnection0.parser(parser15);
        java.net.Proxy proxy17 = null;
        org.jsoup.Connection connection18 = httpConnection0.proxy(proxy17);
        org.jsoup.Connection connection20 = httpConnection0.maxBodySize((int) 'a');
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test625");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        java.net.Proxy proxy14 = null;
        org.jsoup.Connection connection15 = httpConnection11.proxy(proxy14);
        org.jsoup.Connection.KeyVal keyVal17 = httpConnection11.data("multipart/form-data");
        org.jsoup.Connection connection20 = httpConnection11.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection21 = httpConnection11.newRequest();
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection24 = httpConnection22.userAgent("");
        org.jsoup.Connection connection26 = httpConnection22.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal28 = httpConnection22.data("hi!");
        org.jsoup.Connection.Request request29 = httpConnection22.request();
        org.jsoup.Connection connection30 = httpConnection11.request(request29);
        org.jsoup.Connection connection31 = httpConnection0.request(request29);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response32 = httpConnection0.execute();
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
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(keyVal17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNull(keyVal28);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection31);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test626");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection.KeyVal keyVal8 = httpConnection0.data("application/x-www-form-urlencoded");
        org.jsoup.Connection connection10 = httpConnection0.ignoreContentType(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = connection10.newRequest("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNull(keyVal8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test627");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Type");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("application/x-www-form-urlencoded");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test628");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.jsoup.Connection connection11 = httpConnection0.data(strArray10);
        java.lang.Class<?> wildcardClass12 = connection11.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test629");
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
            org.jsoup.Connection connection16 = httpConnection0.newRequest("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Content-Encoding', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
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
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test630");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Connection connection9 = httpConnection0.userAgent("hi!=");
        org.jsoup.Connection connection12 = httpConnection0.header("Content-Encoding", "multipart/form-data");
        org.jsoup.Connection connection14 = httpConnection0.userAgent("multipart/form-data");
        org.jsoup.Connection connection16 = httpConnection0.requestBody("Content-Encoding");
        java.io.InputStream inputStream19 = null;
        org.jsoup.Connection connection21 = httpConnection0.data("application/x-www-form-urlencoded", "hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream19, "Content-Encoding");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test631");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.timeout(1);
        org.jsoup.Connection connection6 = httpConnection0.requestBody("Content-Type");
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection8 = connection6.newRequest(uRL7);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test632");
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
        java.io.InputStream inputStream17 = null;
        org.jsoup.Connection connection18 = httpConnection0.requestBodyStream(inputStream17);
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection21 = httpConnection19.userAgent("");
        java.net.Proxy proxy22 = null;
        org.jsoup.Connection connection23 = httpConnection19.proxy(proxy22);
        org.jsoup.Connection connection25 = httpConnection19.followRedirects(false);
        org.jsoup.parser.Parser parser26 = null;
        org.jsoup.Connection connection27 = httpConnection19.parser(parser26);
        org.jsoup.Connection connection29 = httpConnection19.referrer("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection30 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection32 = httpConnection30.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy33 = null;
        org.jsoup.Connection connection34 = httpConnection30.proxy(proxy33);
        org.jsoup.Connection.Response response35 = null;
        org.jsoup.Connection connection36 = httpConnection30.response(response35);
        java.io.InputStream inputStream39 = null;
        org.jsoup.Connection connection40 = httpConnection30.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream39);
        org.jsoup.Connection.Request request41 = httpConnection30.request();
        org.jsoup.Connection connection42 = httpConnection19.request(request41);
        org.jsoup.Connection connection43 = httpConnection0.request(request41);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(request41);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection43);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test633");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection5 = httpConnection3.userAgent("");
        org.jsoup.Connection connection7 = httpConnection3.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal9 = httpConnection3.data("hi!");
        org.jsoup.Connection.Request request10 = httpConnection3.request();
        org.jsoup.Connection connection11 = httpConnection0.request(request10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        org.jsoup.Connection connection13 = httpConnection0.sslSocketFactory(sSLSocketFactory12);
        org.jsoup.helper.HttpConnection httpConnection14 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection16 = httpConnection14.followRedirects(true);
        java.io.InputStream inputStream19 = null;
        org.jsoup.Connection connection21 = httpConnection14.data("application/x-www-form-urlencoded", "Content-Type", inputStream19, "multipart/form-data");
        java.net.Proxy proxy22 = null;
        org.jsoup.Connection connection23 = httpConnection14.proxy(proxy22);
        java.net.CookieStore cookieStore24 = httpConnection14.cookieStore();
        org.jsoup.Connection connection25 = httpConnection0.cookieStore(cookieStore24);
        org.jsoup.Connection connection27 = httpConnection0.timeout(1);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNull(keyVal9);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(cookieStore24);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test634");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection11 = httpConnection0.cookie("hi!=", "Content-Encoding");
        javax.net.ssl.SSLContext sSLContext12 = null;
        org.jsoup.Connection connection13 = httpConnection0.sslContext(sSLContext12);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test635");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        javax.net.ssl.SSLContext sSLContext7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslContext(sSLContext7);
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
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test636");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory24 = null;
        org.jsoup.Connection connection25 = httpConnection0.sslSocketFactory(sSLSocketFactory24);
        org.jsoup.Connection.KeyVal keyVal27 = httpConnection0.data("hi!=application/x-www-form-urlencoded=multipart/form-data");
        java.net.Proxy proxy28 = null;
        org.jsoup.Connection connection29 = httpConnection0.proxy(proxy28);
        java.io.InputStream inputStream30 = null;
        org.jsoup.Connection connection31 = httpConnection0.requestBodyStream(inputStream30);
        java.lang.Class<?> wildcardClass32 = httpConnection0.getClass();
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
        org.junit.Assert.assertNull(keyVal27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test637");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = keyVal4.inputStream();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.inputStream(inputStream6);
        java.io.InputStream inputStream8 = keyVal7.inputStream();
        org.jsoup.Connection.KeyVal keyVal10 = keyVal7.contentType("application/x-www-form-urlencoded=multipart/form-data");
        java.lang.String str11 = keyVal7.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test638");
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
            org.jsoup.Connection.Response response21 = httpConnection0.response();
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
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test639");
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
        java.lang.Class<?> wildcardClass18 = connection17.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test640");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.Connection.Response response10 = null;
        org.jsoup.Connection connection11 = httpConnection0.response(response10);
        org.jsoup.Connection connection14 = httpConnection0.data("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test641");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator7 = null;
        org.jsoup.Connection connection8 = httpConnection0.auth(requestAuthenticator7);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = httpConnection0.newRequest(uRL9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test642");
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
        org.jsoup.Connection connection28 = httpConnection0.data("hi!=application/x-www-form-urlencoded=multipart/form-data", "");
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
        org.junit.Assert.assertNotNull(connection28);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test643");
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
        org.jsoup.Connection connection23 = httpConnection0.requestBody("hi!");
        java.net.URL uRL24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection25 = httpConnection0.url(uRL24);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
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
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test644");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document28 = httpConnection0.post();
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
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test645");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        org.jsoup.Connection connection14 = httpConnection0.timeout((int) (short) 0);
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.method(method15);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
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
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test646");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.timeout(1);
        org.jsoup.parser.Parser parser5 = null;
        org.jsoup.Connection connection6 = httpConnection0.parser(parser5);
        org.jsoup.Connection connection9 = httpConnection0.data("Content-Type", "");
        org.jsoup.Connection connection11 = httpConnection0.requestBody("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test647");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "Content-Type=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.value("Content-Type=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.key("multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test648");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=", "application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test649");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.ignoreHttpErrors(true);
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("application/x-www-form-urlencoded", "hi!=application/x-www-form-urlencoded=multipart/form-data", inputStream13);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test650");
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
        org.jsoup.Connection connection16 = httpConnection0.timeout((int) (byte) 10);
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
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test651");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection6 = httpConnection0.requestBody("");
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        javax.net.ssl.SSLContext sSLContext9 = null;
        org.jsoup.Connection connection10 = httpConnection0.sslContext(sSLContext9);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test652");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.Connection.KeyVal keyVal6 = keyVal2.contentType("multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test653");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        java.lang.String str7 = keyVal6.key();
        boolean boolean8 = keyVal6.hasInputStream();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.inputStream(inputStream9);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=" + "'", str7, "hi!=");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test654");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("", "multipart/form-data");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test655");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("multipart/form-data=multipart/form-data");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.inputStream(inputStream9);
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.value("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal14 = keyVal12.value("Content-Encoding");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test656");
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
        org.jsoup.helper.HttpConnection httpConnection31 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection33 = httpConnection31.userAgent("");
        java.net.Proxy proxy34 = null;
        org.jsoup.Connection connection35 = httpConnection31.proxy(proxy34);
        org.jsoup.Connection.KeyVal keyVal37 = httpConnection31.data("multipart/form-data");
        org.jsoup.Connection connection39 = httpConnection31.maxBodySize((int) '#');
        org.jsoup.Connection connection41 = httpConnection31.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress42 = null;
        org.jsoup.Connection connection43 = httpConnection31.onResponseProgress(responseProgress42);
        org.jsoup.Connection.Request request44 = httpConnection31.request();
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress45 = null;
        org.jsoup.Connection connection46 = httpConnection31.onResponseProgress(responseProgress45);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator47 = null;
        org.jsoup.Connection connection48 = httpConnection31.auth(requestAuthenticator47);
        java.net.CookieStore cookieStore49 = httpConnection31.cookieStore();
        org.jsoup.Connection connection50 = httpConnection0.cookieStore(cookieStore49);
        org.jsoup.Connection.KeyVal keyVal52 = httpConnection0.data("hi!");
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
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNull(keyVal37);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(request44);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(cookieStore49);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNull(keyVal52);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test657");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal4.key("application/x-www-form-urlencoded=multipart/form-data");
        java.io.InputStream inputStream7 = keyVal4.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test658");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = httpConnection0.get();
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
        org.junit.Assert.assertNotNull(cookieStore13);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test659");
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
        javax.net.ssl.SSLContext sSLContext19 = null;
        org.jsoup.Connection connection20 = httpConnection0.sslContext(sSLContext19);
        org.jsoup.Connection connection21 = httpConnection0.newRequest();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test660");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test661");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection connection7 = httpConnection0.newRequest();
        org.jsoup.helper.HttpConnection httpConnection8 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection10 = httpConnection8.followRedirects(true);
        org.jsoup.Connection connection13 = httpConnection8.cookie("Content-Type", "Content-Encoding");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "application/x-www-form-urlencoded=multipart/form-data" };
        org.jsoup.Connection connection17 = httpConnection8.data(strArray16);
        org.jsoup.Connection connection18 = httpConnection0.data(strArray16);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "application/x-www-form-urlencoded=multipart/form-data" });
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test662");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Type=", "");
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
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test663");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection46 = httpConnection0.data("", "application/x-www-form-urlencoded=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
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
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test664");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.inputStream(inputStream10);
        boolean boolean12 = keyVal11.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test665");
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
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection23 = httpConnection21.userAgent("");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator24 = null;
        org.jsoup.Connection connection25 = httpConnection21.auth(requestAuthenticator24);
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection28 = httpConnection26.userAgent("");
        java.net.Proxy proxy29 = null;
        org.jsoup.Connection connection30 = httpConnection26.proxy(proxy29);
        org.jsoup.Connection.KeyVal keyVal32 = httpConnection26.data("multipart/form-data");
        org.jsoup.Connection connection34 = httpConnection26.maxBodySize((int) '#');
        org.jsoup.Connection connection36 = httpConnection26.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress37 = null;
        org.jsoup.Connection connection38 = httpConnection26.onResponseProgress(responseProgress37);
        org.jsoup.Connection.Request request39 = httpConnection26.request();
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress40 = null;
        org.jsoup.Connection connection41 = httpConnection26.onResponseProgress(responseProgress40);
        org.jsoup.Connection.Request request42 = httpConnection26.request();
        org.jsoup.Connection connection43 = httpConnection21.request(request42);
        org.jsoup.Connection connection44 = httpConnection0.request(request42);
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
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNull(keyVal32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(request42);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection44);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test666");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory24 = null;
        org.jsoup.Connection connection25 = httpConnection0.sslSocketFactory(sSLSocketFactory24);
        org.jsoup.Connection.KeyVal keyVal27 = httpConnection0.data("hi!=application/x-www-form-urlencoded=multipart/form-data");
        java.net.Proxy proxy28 = null;
        org.jsoup.Connection connection29 = httpConnection0.proxy(proxy28);
        java.io.InputStream inputStream32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection33 = httpConnection0.data("", "hi!=", inputStream32);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
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
        org.junit.Assert.assertNull(keyVal27);
        org.junit.Assert.assertNotNull(connection29);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test667");
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
        org.jsoup.Connection connection22 = httpConnection0.referrer("multipart/form-data");
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
        org.junit.Assert.assertNotNull(connection22);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test668");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "Content-Type", inputStream2);
        java.lang.String str4 = keyVal3.value();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Type" + "'", str4, "Content-Type");
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test669");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        java.net.Proxy proxy14 = null;
        org.jsoup.Connection connection15 = httpConnection11.proxy(proxy14);
        org.jsoup.Connection.KeyVal keyVal17 = httpConnection11.data("multipart/form-data");
        org.jsoup.Connection connection20 = httpConnection11.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection21 = httpConnection11.newRequest();
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection24 = httpConnection22.userAgent("");
        org.jsoup.Connection connection26 = httpConnection22.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal28 = httpConnection22.data("hi!");
        org.jsoup.Connection.Request request29 = httpConnection22.request();
        org.jsoup.Connection connection30 = httpConnection11.request(request29);
        org.jsoup.Connection connection31 = httpConnection0.request(request29);
        org.jsoup.Connection connection33 = httpConnection0.referrer("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(keyVal17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNull(keyVal28);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection33);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test670");
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
        org.jsoup.Connection connection25 = httpConnection0.maxBodySize((int) '4');
        java.lang.Class<?> wildcardClass26 = httpConnection0.getClass();
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
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test671");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection9 = httpConnection7.userAgent("");
        java.net.Proxy proxy10 = null;
        org.jsoup.Connection connection11 = httpConnection7.proxy(proxy10);
        org.jsoup.Connection.KeyVal keyVal13 = httpConnection7.data("multipart/form-data");
        org.jsoup.Connection connection16 = httpConnection7.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection17 = httpConnection7.newRequest();
        org.jsoup.helper.HttpConnection httpConnection18 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection20 = httpConnection18.userAgent("");
        org.jsoup.Connection connection22 = httpConnection18.requestBody("hi!");
        org.jsoup.Connection connection25 = httpConnection18.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress26 = null;
        org.jsoup.Connection connection27 = httpConnection18.onResponseProgress(responseProgress26);
        org.jsoup.Connection connection30 = httpConnection18.data("hi!", "hi!");
        org.jsoup.Connection connection33 = httpConnection18.cookie("Content-Type=", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection34 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection36 = httpConnection34.followRedirects(true);
        java.io.InputStream inputStream39 = null;
        org.jsoup.Connection connection41 = httpConnection34.data("application/x-www-form-urlencoded", "Content-Type", inputStream39, "multipart/form-data");
        org.jsoup.Connection connection43 = httpConnection34.referrer("");
        org.jsoup.helper.HttpConnection httpConnection44 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection46 = httpConnection44.userAgent("");
        java.net.Proxy proxy47 = null;
        org.jsoup.Connection connection48 = httpConnection44.proxy(proxy47);
        org.jsoup.Connection.KeyVal keyVal50 = httpConnection44.data("multipart/form-data");
        org.jsoup.Connection connection52 = httpConnection44.maxBodySize((int) '#');
        org.jsoup.Connection connection54 = httpConnection44.timeout((int) '4');
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection58 = httpConnection44.data(strArray57);
        org.jsoup.Connection connection59 = httpConnection34.data(strArray57);
        org.jsoup.Connection connection60 = httpConnection18.data(strArray57);
        org.jsoup.Connection connection61 = httpConnection7.data(strArray57);
        org.jsoup.Connection connection62 = httpConnection0.data(strArray57);
        java.util.Map<java.lang.String, java.lang.String> strMap63 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection64 = httpConnection0.headers(strMap63);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNull(keyVal13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNull(keyVal50);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(connection54);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNotNull(connection59);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(connection61);
        org.junit.Assert.assertNotNull(connection62);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test672");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection8 = httpConnection0.userAgent("");
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress9 = null;
        org.jsoup.Connection connection10 = httpConnection0.onResponseProgress(responseProgress9);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test673");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test674");
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
        java.net.Proxy proxy15 = null;
        org.jsoup.Connection connection16 = httpConnection0.proxy(proxy15);
        org.jsoup.Connection.Response response17 = null;
        org.jsoup.Connection connection18 = httpConnection0.response(response17);
        org.jsoup.Connection connection19 = httpConnection0.newRequest();
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
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test675");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator3 = null;
        org.jsoup.Connection connection4 = httpConnection0.auth(requestAuthenticator3);
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection7 = httpConnection5.userAgent("");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection5.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection5.followRedirects(false);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection15 = httpConnection5.data(strArray14);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress16 = null;
        org.jsoup.Connection connection17 = httpConnection5.onResponseProgress(responseProgress16);
        java.net.CookieStore cookieStore18 = httpConnection5.cookieStore();
        org.jsoup.Connection connection19 = httpConnection0.cookieStore(cookieStore18);
        org.jsoup.Connection connection21 = httpConnection0.ignoreHttpErrors(false);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(cookieStore18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test676");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "application/x-www-form-urlencoded=multipart/form-data", inputStream5, "Content-Encoding");
        org.jsoup.Connection connection10 = httpConnection0.proxy("application/x-www-form-urlencoded", (int) '#');
        org.jsoup.Connection connection12 = httpConnection0.ignoreHttpErrors(false);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test677");
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
        org.jsoup.Connection.KeyVal keyVal15 = httpConnection0.data("hi!=");
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.method(method16);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
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
        org.junit.Assert.assertNull(keyVal15);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test678");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.parser.Parser parser7 = null;
        org.jsoup.Connection connection8 = httpConnection0.parser(parser7);
        org.jsoup.Connection connection10 = httpConnection0.referrer("multipart/form-data");
        org.jsoup.Connection connection12 = httpConnection0.maxBodySize((int) (byte) 100);
        org.jsoup.Connection connection14 = httpConnection0.followRedirects(true);
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.newRequest(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.parser.Parser.newInstance()\" because \"copy.parser\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test679");
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
        org.jsoup.Connection connection17 = httpConnection0.referrer("hi!=");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test680");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("application/x-www-form-urlencoded", "multipart/form-data", inputStream2);
        java.lang.String str4 = keyVal3.toString();
        java.lang.String str5 = keyVal3.value();
        java.lang.String str6 = keyVal3.key();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "application/x-www-form-urlencoded=multipart/form-data" + "'", str4, "application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "multipart/form-data" + "'", str5, "multipart/form-data");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "application/x-www-form-urlencoded" + "'", str6, "application/x-www-form-urlencoded");
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test681");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.value("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("hi!=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.KeyVal keyVal12 = keyVal8.contentType("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: String must not be empty");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test682");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        java.io.InputStream inputStream4 = keyVal2.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test683");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream13);
        org.jsoup.Connection connection17 = httpConnection0.header("Content-Encoding", "Content-Type");
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
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test684");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream13);
        org.jsoup.Connection connection17 = httpConnection0.header("Content-Encoding", "Content-Type");
        org.jsoup.Connection connection19 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection connection21 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection.KeyVal keyVal23 = httpConnection0.data("hi!");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNull(keyVal23);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test685");
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
        org.jsoup.Connection.Request request22 = httpConnection0.request();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection24 = httpConnection0.data(strMap23);
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
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(request22);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test686");
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
        org.jsoup.Connection connection25 = httpConnection0.maxBodySize((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection27 = connection25.newRequest("hi!=application/x-www-form-urlencoded=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!=application/x-www-form-urlencoded=multipart/form-data', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
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
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test687");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Type");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("multipart/form-data=multipart/form-data");
        boolean boolean8 = keyVal7.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test688");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.requestBodyStream(inputStream10);
        org.jsoup.Connection connection14 = httpConnection0.cookie("Content-Encoding", "");
        javax.net.ssl.SSLContext sSLContext15 = null;
        org.jsoup.Connection connection16 = httpConnection0.sslContext(sSLContext15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = connection16.newRequest("Content-Type=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'Content-Type=', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test689");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.value("multipart/form-data=Content-Type");
        java.lang.Class<?> wildcardClass6 = keyVal2.getClass();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test690");
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
        java.util.Map<java.lang.String, java.lang.String> strMap25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection26 = httpConnection0.data(strMap25);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
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
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test691");
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
        org.jsoup.Connection.Request request17 = httpConnection0.request();
        org.jsoup.Connection connection20 = httpConnection0.header("Content-Encoding", "hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test692");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.referrer("multipart/form-data=Content-Type");
        org.jsoup.Connection connection6 = httpConnection0.maxBodySize((int) (byte) 0);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection11 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Encoding", inputStream9, "hi!");
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.method(method12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test693");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.data("Content-Encoding", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = httpConnection0.header("", "hi!=application/x-www-form-urlencoded=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'name' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test694");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        org.jsoup.Connection connection13 = httpConnection0.data("hi!=", "multipart/form-data=Content-Type");
        org.jsoup.Connection connection15 = httpConnection0.ignoreContentType(true);
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.newRequest(uRL16);
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
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test695");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream13);
        org.jsoup.Connection connection17 = httpConnection0.header("Content-Encoding", "Content-Type");
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection19 = connection17.newRequest(uRL18);
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
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test696");
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
        org.jsoup.Connection connection27 = httpConnection25.userAgent("");
        java.net.Proxy proxy28 = null;
        org.jsoup.Connection connection29 = httpConnection25.proxy(proxy28);
        org.jsoup.Connection.KeyVal keyVal31 = httpConnection25.data("multipart/form-data");
        org.jsoup.Connection connection33 = httpConnection25.maxBodySize((int) '#');
        org.jsoup.Connection connection35 = httpConnection25.timeout((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection39 = httpConnection25.data(strArray38);
        org.jsoup.Connection connection40 = httpConnection0.data(strArray38);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document41 = httpConnection0.post();
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
        org.junit.Assert.assertNull(keyVal31);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection40);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test697");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection6 = httpConnection0.maxBodySize((int) (short) 10);
        org.jsoup.parser.Parser parser7 = null;
        org.jsoup.Connection connection8 = httpConnection0.parser(parser7);
        org.jsoup.Connection connection11 = httpConnection0.data("Content-Type", "Content-Encoding");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test698");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        org.jsoup.Connection connection9 = httpConnection0.data("Content-Encoding", "hi!=application/x-www-form-urlencoded=multipart/form-data");
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.newRequest(uRL10);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test699");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Type", "application/x-www-form-urlencoded", inputStream2);
        java.lang.String str4 = keyVal3.key();
        java.lang.String str5 = keyVal3.key();
        java.lang.String str6 = keyVal3.key();
        java.io.InputStream inputStream7 = keyVal3.inputStream();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Type" + "'", str4, "Content-Type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Type" + "'", str5, "Content-Type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Type" + "'", str6, "Content-Type");
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test700");
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
        org.jsoup.Connection.Request request14 = httpConnection0.request();
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
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(request14);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test701");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.referrer("multipart/form-data=Content-Type");
        org.jsoup.Connection connection6 = httpConnection0.maxBodySize((int) (byte) 0);
        org.jsoup.Connection.Request request7 = httpConnection0.request();
        org.jsoup.Connection connection9 = httpConnection0.timeout((int) '#');
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test702");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.lang.String str5 = keyVal2.value();
        java.lang.String str6 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=" + "'", str6, "hi!=");
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test703");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = httpConnection0.execute();
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
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test704");
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
            org.jsoup.Connection connection16 = connection14.newRequest("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
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
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test705");
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
        org.jsoup.helper.HttpConnection httpConnection13 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext14 = null;
        org.jsoup.Connection connection15 = httpConnection13.sslContext(sSLContext14);
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection18 = httpConnection16.userAgent("");
        org.jsoup.Connection connection20 = httpConnection16.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal22 = httpConnection16.data("hi!");
        org.jsoup.Connection.Request request23 = httpConnection16.request();
        org.jsoup.Connection connection24 = httpConnection13.request(request23);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory25 = null;
        org.jsoup.Connection connection26 = httpConnection13.sslSocketFactory(sSLSocketFactory25);
        java.net.CookieStore cookieStore27 = httpConnection13.cookieStore();
        org.jsoup.Connection connection28 = httpConnection0.cookieStore(cookieStore27);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(cookieStore12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNull(keyVal22);
        org.junit.Assert.assertNotNull(request23);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(cookieStore27);
        org.junit.Assert.assertNotNull(connection28);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test706");
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
        org.jsoup.Connection connection25 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection27 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection30 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        java.io.InputStream inputStream31 = null;
        org.jsoup.Connection connection32 = httpConnection0.requestBodyStream(inputStream31);
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
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test707");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory24 = null;
        org.jsoup.Connection connection25 = httpConnection0.sslSocketFactory(sSLSocketFactory24);
        org.jsoup.Connection.Request request26 = httpConnection0.request();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection28 = httpConnection0.postDataCharset("multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: multipart/form-data");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(request26);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test708");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.helper.HttpConnection httpConnection8 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection10 = httpConnection8.userAgent("");
        org.jsoup.Connection connection12 = httpConnection8.requestBody("hi!");
        org.jsoup.Connection connection15 = httpConnection8.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress16 = null;
        org.jsoup.Connection connection17 = httpConnection8.onResponseProgress(responseProgress16);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator18 = null;
        org.jsoup.Connection connection19 = httpConnection8.auth(requestAuthenticator18);
        java.net.Proxy proxy20 = null;
        org.jsoup.Connection connection21 = httpConnection8.proxy(proxy20);
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection24 = httpConnection22.userAgent("");
        org.jsoup.Connection connection26 = httpConnection22.requestBody("hi!");
        org.jsoup.Connection connection29 = httpConnection22.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress30 = null;
        org.jsoup.Connection connection31 = httpConnection22.onResponseProgress(responseProgress30);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator32 = null;
        org.jsoup.Connection connection33 = httpConnection22.auth(requestAuthenticator32);
        java.net.Proxy proxy34 = null;
        org.jsoup.Connection connection35 = httpConnection22.proxy(proxy34);
        org.jsoup.Connection connection37 = httpConnection22.userAgent("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress38 = null;
        org.jsoup.Connection connection39 = httpConnection22.onResponseProgress(responseProgress38);
        org.jsoup.helper.HttpConnection httpConnection40 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext41 = null;
        org.jsoup.Connection connection42 = httpConnection40.sslContext(sSLContext41);
        org.jsoup.helper.HttpConnection httpConnection43 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection45 = httpConnection43.userAgent("");
        org.jsoup.Connection connection47 = httpConnection43.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal49 = httpConnection43.data("hi!");
        org.jsoup.Connection.Request request50 = httpConnection43.request();
        org.jsoup.Connection connection51 = httpConnection40.request(request50);
        org.jsoup.Connection connection52 = httpConnection22.request(request50);
        java.io.InputStream inputStream55 = null;
        org.jsoup.Connection connection57 = httpConnection22.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "multipart/form-data", inputStream55, "application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection httpConnection58 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection60 = httpConnection58.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy61 = null;
        org.jsoup.Connection connection62 = httpConnection58.proxy(proxy61);
        org.jsoup.Connection.Response response63 = null;
        org.jsoup.Connection connection64 = httpConnection58.response(response63);
        java.io.InputStream inputStream67 = null;
        org.jsoup.Connection connection68 = httpConnection58.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream67);
        org.jsoup.Connection.Request request69 = httpConnection58.request();
        java.net.CookieStore cookieStore70 = httpConnection58.cookieStore();
        org.jsoup.Connection connection71 = httpConnection22.cookieStore(cookieStore70);
        org.jsoup.Connection connection72 = httpConnection8.cookieStore(cookieStore70);
        org.jsoup.Connection connection73 = httpConnection0.cookieStore(cookieStore70);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNull(keyVal49);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(connection62);
        org.junit.Assert.assertNotNull(connection64);
        org.junit.Assert.assertNotNull(connection68);
        org.junit.Assert.assertNotNull(request69);
        org.junit.Assert.assertNotNull(cookieStore70);
        org.junit.Assert.assertNotNull(connection71);
        org.junit.Assert.assertNotNull(connection72);
        org.junit.Assert.assertNotNull(connection73);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test709");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory33 = null;
        org.jsoup.Connection connection34 = httpConnection0.sslSocketFactory(sSLSocketFactory33);
        org.jsoup.Connection connection37 = httpConnection0.proxy("hi!", (int) '4');
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
        org.junit.Assert.assertNotNull(connection37);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test710");
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
        org.jsoup.Connection connection18 = httpConnection0.newRequest();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test711");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.userAgent("hi!=");
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
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test712");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        java.net.Proxy proxy1 = null;
        org.jsoup.Connection connection2 = httpConnection0.proxy(proxy1);
        org.jsoup.Connection.Request request3 = httpConnection0.request();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(request3);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test713");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.timeout(1);
        org.jsoup.Connection connection7 = httpConnection0.header("Content-Type", "Content-Type");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test714");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslContext(sSLContext5);
        org.jsoup.Connection connection8 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response9 = null;
        org.jsoup.Connection connection10 = httpConnection0.response(response9);
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        java.net.Proxy proxy14 = null;
        org.jsoup.Connection connection15 = httpConnection11.proxy(proxy14);
        org.jsoup.Connection connection17 = httpConnection11.followRedirects(false);
        org.jsoup.Connection connection19 = httpConnection11.timeout((int) ' ');
        org.jsoup.Connection connection22 = httpConnection11.cookie("application/x-www-form-urlencoded=multipart/form-data", "hi!=");
        org.jsoup.Connection connection24 = httpConnection11.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal27 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal29 = keyVal27.key("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal32 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str33 = keyVal32.contentType();
        java.io.InputStream inputStream34 = keyVal32.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray35 = new org.jsoup.Connection.KeyVal[] { keyVal27, keyVal32 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList36 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList36, keyValArray35);
        org.jsoup.Connection connection38 = httpConnection11.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList36);
        org.jsoup.Connection connection39 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList36);
        javax.net.ssl.SSLContext sSLContext40 = null;
        org.jsoup.Connection connection41 = httpConnection0.sslContext(sSLContext40);
        java.net.Proxy proxy42 = null;
        org.jsoup.Connection connection43 = httpConnection0.proxy(proxy42);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(keyVal27);
        org.junit.Assert.assertNotNull(keyVal29);
        org.junit.Assert.assertNotNull(keyVal32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(inputStream34);
        org.junit.Assert.assertNotNull(keyValArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection43);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test715");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("multipart/form-data=multipart/form-data");
        java.lang.String str9 = keyVal6.key();
        java.io.InputStream inputStream10 = keyVal6.inputStream();
        java.io.InputStream inputStream11 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.inputStream(inputStream11);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "multipart/form-data=multipart/form-data" + "'", str9, "multipart/form-data=multipart/form-data");
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test716");
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
        org.jsoup.Connection connection21 = httpConnection0.requestBody("Content-Type=");
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
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test717");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection connection8 = httpConnection0.userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.jsoup.Connection connection10 = httpConnection0.ignoreHttpErrors(false);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test718");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Type=", "multipart/form-data=Content-Type");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test719");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "Content-Encoding");
        java.lang.String str3 = keyVal2.contentType();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Type");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test720");
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
        org.jsoup.Connection connection46 = httpConnection0.data("application/x-www-form-urlencoded=multipart/form-data", "hi!=application/x-www-form-urlencoded=multipart/form-data");
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
        org.junit.Assert.assertNotNull(connection46);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test721");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.requestBodyStream(inputStream10);
        org.jsoup.Connection connection13 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection15 = httpConnection0.ignoreHttpErrors(false);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test722");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Type", "application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal2);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test723");
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
        javax.net.ssl.SSLContext sSLContext25 = null;
        org.jsoup.Connection connection26 = httpConnection0.sslContext(sSLContext25);
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
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test724");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.userAgent("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = connection11.newRequest("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test725");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream12 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("hi!", "application/x-www-form-urlencoded", inputStream12, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.jsoup.parser.Parser parser15 = null;
        org.jsoup.Connection connection16 = httpConnection0.parser(parser15);
        java.net.Proxy proxy17 = null;
        org.jsoup.Connection connection18 = httpConnection0.proxy(proxy17);
        org.jsoup.Connection.Request request19 = httpConnection0.request();
        org.jsoup.parser.Parser parser20 = null;
        org.jsoup.Connection connection21 = httpConnection0.parser(parser20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection23 = httpConnection0.newRequest("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jsoup.parser.Parser.newInstance()\" because \"copy.parser\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test726");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("multipart/form-data=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'multipart/form-data=multipart/form-data', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test727");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        org.jsoup.Connection.KeyVal keyVal9 = keyVal2.contentType("application/x-www-form-urlencoded");
        boolean boolean10 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test728");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        org.jsoup.Connection.KeyVal keyVal4 = keyVal2.contentType("application/x-www-form-urlencoded");
        java.lang.String str5 = keyVal2.contentType();
        java.lang.String str6 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "application/x-www-form-urlencoded" + "'", str5, "application/x-www-form-urlencoded");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test729");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        org.jsoup.Connection connection13 = httpConnection0.cookie("multipart/form-data=Content-Type", "application/x-www-form-urlencoded=multipart/form-data");
        java.lang.Class<?> wildcardClass14 = httpConnection0.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test730");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Type");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.inputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        boolean boolean11 = keyVal10.hasInputStream();
        java.io.InputStream inputStream12 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal13 = keyVal10.inputStream(inputStream12);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(keyVal13);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test731");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslSocketFactory(sSLSocketFactory5);
        org.jsoup.Connection connection9 = httpConnection0.cookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test732");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.referrer("application/x-www-form-urlencoded");
        java.io.InputStream inputStream14 = null;
        org.jsoup.Connection connection16 = httpConnection0.data("Content-Type=", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream14, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = httpConnection0.cookies(strMap17);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test733");
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
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress27 = null;
        org.jsoup.Connection connection28 = httpConnection0.onResponseProgress(responseProgress27);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress29 = null;
        org.jsoup.Connection connection30 = httpConnection0.onResponseProgress(responseProgress29);
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
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test734");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=application/x-www-form-urlencoded=multipart/form-data", "Content-Type=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("hi!");
        java.lang.String str6 = keyVal5.value();
        org.jsoup.Connection.KeyVal keyVal8 = keyVal5.contentType("application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Type=" + "'", str6, "Content-Type=");
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test735");
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
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection72 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection73 = httpConnection0.data(keyValCollection72);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
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
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test736");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.referrer("");
        java.net.Proxy proxy10 = null;
        org.jsoup.Connection connection11 = httpConnection0.proxy(proxy10);
        org.jsoup.Connection connection13 = httpConnection0.timeout((int) '#');
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test737");
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
        org.jsoup.Connection.KeyVal keyVal23 = httpConnection0.data("application/x-www-form-urlencoded=multipart/form-data");
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
        org.junit.Assert.assertNull(keyVal23);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test738");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.ignoreContentType(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        org.jsoup.Connection connection12 = httpConnection0.sslSocketFactory(sSLSocketFactory11);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test739");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Type");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("multipart/form-data=Content-Type");
        java.lang.String str10 = keyVal7.contentType();
        java.io.InputStream inputStream11 = keyVal7.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test740");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test741");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection.KeyVal keyVal8 = httpConnection0.data("application/x-www-form-urlencoded");
        org.jsoup.Connection connection10 = httpConnection0.ignoreContentType(true);
        java.io.InputStream inputStream11 = null;
        org.jsoup.Connection connection12 = httpConnection0.requestBodyStream(inputStream11);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNull(keyVal8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test742");
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
        java.io.InputStream inputStream26 = null;
        org.jsoup.Connection connection27 = httpConnection0.data("Content-Type", "hi!=application/x-www-form-urlencoded=multipart/form-data", inputStream26);
        org.jsoup.helper.HttpConnection httpConnection28 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection30 = httpConnection28.userAgent("");
        org.jsoup.Connection connection32 = httpConnection28.requestBody("hi!");
        org.jsoup.Connection connection34 = httpConnection28.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory35 = null;
        org.jsoup.Connection connection36 = httpConnection28.sslSocketFactory(sSLSocketFactory35);
        org.jsoup.helper.HttpConnection httpConnection37 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection39 = httpConnection37.userAgent("");
        java.net.Proxy proxy40 = null;
        org.jsoup.Connection connection41 = httpConnection37.proxy(proxy40);
        org.jsoup.Connection.KeyVal keyVal43 = httpConnection37.data("multipart/form-data");
        org.jsoup.Connection connection45 = httpConnection37.maxBodySize((int) '#');
        org.jsoup.Connection connection47 = httpConnection37.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress48 = null;
        org.jsoup.Connection connection49 = httpConnection37.onResponseProgress(responseProgress48);
        org.jsoup.Connection.Request request50 = httpConnection37.request();
        org.jsoup.Connection connection51 = httpConnection28.request(request50);
        org.jsoup.Connection connection52 = httpConnection0.request(request50);
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
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNull(keyVal43);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(request50);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(connection52);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test743");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("application/x-www-form-urlencoded=multipart/form-data");
        java.io.InputStream inputStream5 = keyVal4.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal4.key("multipart/form-data=Content-Type");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test744");
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
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection29 = httpConnection0.data(keyValCollection28);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'data' must not be null.");
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
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test745");
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
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection21 = httpConnection0.cookies(strMap20);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
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
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test746");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = httpConnection0.response();
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
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test747");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        org.jsoup.Connection.KeyVal keyVal9 = keyVal2.contentType("application/x-www-form-urlencoded");
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal2.inputStream(inputStream10);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test748");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.key("application/x-www-form-urlencoded=multipart/form-data");
        java.lang.String str5 = keyVal2.value();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.inputStream(inputStream8);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "multipart/form-data" + "'", str5, "multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test749");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Connection connection9 = httpConnection0.userAgent("hi!=");
        org.jsoup.Connection connection12 = httpConnection0.header("Content-Encoding", "multipart/form-data");
        org.jsoup.Connection.Response response13 = null;
        org.jsoup.Connection connection14 = httpConnection0.response(response13);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test750");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.referrer("application/x-www-form-urlencoded");
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection13 = httpConnection0.method(method12);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test751");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.requestBodyStream(inputStream10);
        org.jsoup.Connection connection14 = httpConnection0.cookie("Content-Encoding", "");
        java.io.InputStream inputStream17 = null;
        org.jsoup.Connection connection19 = httpConnection0.data("multipart/form-data=Content-Type", "multipart/form-data=Content-Type", inputStream17, "application/x-www-form-urlencoded=multipart/form-data");
        java.net.CookieStore cookieStore20 = httpConnection0.cookieStore();
        org.jsoup.Connection.Response response21 = null;
        org.jsoup.Connection connection22 = httpConnection0.response(response21);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(cookieStore20);
        org.junit.Assert.assertNotNull(connection22);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test752");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Type");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.inputStream(inputStream7);
        java.lang.String str9 = keyVal8.value();
        java.lang.String str10 = keyVal8.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Content-Type" + "'", str10, "Content-Type");
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test753");
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
        org.jsoup.Connection connection18 = httpConnection0.referrer("hi!=application/x-www-form-urlencoded=multipart/form-data");
        java.net.CookieStore cookieStore19 = httpConnection0.cookieStore();
        org.jsoup.Connection connection22 = httpConnection0.proxy("Content-Type=", 0);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(cookieStore19);
        org.junit.Assert.assertNotNull(connection22);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test754");
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
        org.jsoup.Connection connection19 = httpConnection0.cookie("Content-Type", "multipart/form-data");
        org.jsoup.Connection connection21 = httpConnection0.ignoreHttpErrors(true);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test755");
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
        org.jsoup.Connection.KeyVal keyVal31 = httpConnection0.data("Content-Encoding");
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
        org.junit.Assert.assertNull(keyVal31);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test756");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection connection7 = httpConnection0.newRequest();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test757");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress9 = null;
        org.jsoup.Connection connection10 = httpConnection0.onResponseProgress(responseProgress9);
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
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test758");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data=multipart/form-data", "", inputStream2);
        org.jsoup.Connection.KeyVal keyVal5 = keyVal3.contentType("Content-Type=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test759");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.requestBodyStream(inputStream10);
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
        org.jsoup.Connection.Response response77 = null;
        org.jsoup.Connection connection78 = httpConnection0.response(response77);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection80 = httpConnection0.newRequest("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
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
        org.junit.Assert.assertNotNull(connection78);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test760");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        java.lang.String str8 = keyVal7.toString();
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal7.inputStream(inputStream9);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!=" + "'", str8, "hi!=");
        org.junit.Assert.assertNotNull(keyVal10);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test761");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.referrer("application/x-www-form-urlencoded");
        java.io.InputStream inputStream14 = null;
        org.jsoup.Connection connection16 = httpConnection0.data("Content-Type=", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream14, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection19 = httpConnection0.proxy("", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test762");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream13);
        org.jsoup.Connection connection17 = httpConnection0.header("Content-Encoding", "Content-Type");
        org.jsoup.Connection connection19 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection connection21 = httpConnection0.ignoreContentType(true);
        org.jsoup.parser.Parser parser22 = null;
        org.jsoup.Connection connection23 = httpConnection0.parser(parser22);
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
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test763");
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
        org.jsoup.helper.HttpConnection httpConnection29 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection31 = httpConnection29.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy32 = null;
        org.jsoup.Connection connection33 = httpConnection29.proxy(proxy32);
        org.jsoup.Connection.Response response34 = null;
        org.jsoup.Connection connection35 = httpConnection29.response(response34);
        java.io.InputStream inputStream38 = null;
        org.jsoup.Connection connection39 = httpConnection29.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream38);
        org.jsoup.Connection.Request request40 = httpConnection29.request();
        java.net.CookieStore cookieStore41 = httpConnection29.cookieStore();
        org.jsoup.helper.HttpConnection httpConnection42 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection44 = httpConnection42.userAgent("");
        java.net.Proxy proxy45 = null;
        org.jsoup.Connection connection46 = httpConnection42.proxy(proxy45);
        org.jsoup.Connection.KeyVal keyVal48 = httpConnection42.data("multipart/form-data");
        org.jsoup.Connection connection51 = httpConnection42.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection52 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection54 = httpConnection52.userAgent("");
        java.net.Proxy proxy55 = null;
        org.jsoup.Connection connection56 = httpConnection52.proxy(proxy55);
        org.jsoup.Connection connection58 = httpConnection52.followRedirects(false);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection62 = httpConnection52.data(strArray61);
        org.jsoup.Connection connection63 = httpConnection42.data(strArray61);
        org.jsoup.Connection connection64 = httpConnection29.data(strArray61);
        org.jsoup.Connection connection65 = httpConnection0.data(strArray61);
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
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(cookieStore41);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNull(keyVal48);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(connection54);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection62);
        org.junit.Assert.assertNotNull(connection63);
        org.junit.Assert.assertNotNull(connection64);
        org.junit.Assert.assertNotNull(connection65);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test764");
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
        org.jsoup.Connection.Response response27 = null;
        org.jsoup.Connection connection28 = httpConnection0.response(response27);
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
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test765");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = httpConnection0.get();
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
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test766");
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
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection19 = httpConnection17.userAgent("");
        org.jsoup.Connection connection21 = httpConnection17.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal23 = httpConnection17.data("hi!");
        org.jsoup.Connection.Request request24 = httpConnection17.request();
        org.jsoup.Connection connection25 = httpConnection0.request(request24);
        org.jsoup.Connection connection27 = httpConnection0.requestBody("Content-Type");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNull(keyVal23);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test767");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        org.jsoup.Connection connection9 = httpConnection0.data("hi!", "Content-Type=");
        java.net.CookieStore cookieStore10 = httpConnection0.cookieStore();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(cookieStore10);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test768");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.referrer("application/x-www-form-urlencoded");
        org.jsoup.Connection connection13 = httpConnection0.followRedirects(false);
        org.jsoup.parser.Parser parser14 = null;
        org.jsoup.Connection connection15 = httpConnection0.parser(parser14);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test769");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) 'a');
        java.io.InputStream inputStream13 = null;
        org.jsoup.Connection connection14 = httpConnection0.data("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream13);
        org.jsoup.Connection connection17 = httpConnection0.header("Content-Encoding", "Content-Type");
        org.jsoup.helper.HttpConnection httpConnection18 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection20 = httpConnection18.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext22 = null;
        org.jsoup.Connection connection23 = httpConnection21.sslContext(sSLContext22);
        org.jsoup.helper.HttpConnection httpConnection24 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection26 = httpConnection24.userAgent("");
        org.jsoup.Connection connection28 = httpConnection24.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal30 = httpConnection24.data("hi!");
        org.jsoup.Connection.Request request31 = httpConnection24.request();
        org.jsoup.Connection connection32 = httpConnection21.request(request31);
        org.jsoup.Connection connection33 = httpConnection18.request(request31);
        org.jsoup.Connection connection35 = httpConnection18.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection httpConnection36 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection38 = httpConnection36.userAgent("");
        java.net.Proxy proxy39 = null;
        org.jsoup.Connection connection40 = httpConnection36.proxy(proxy39);
        org.jsoup.Connection.KeyVal keyVal42 = httpConnection36.data("multipart/form-data");
        org.jsoup.Connection connection45 = httpConnection36.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection46 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext47 = null;
        org.jsoup.Connection connection48 = httpConnection46.sslContext(sSLContext47);
        org.jsoup.helper.HttpConnection httpConnection49 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection51 = httpConnection49.userAgent("");
        org.jsoup.Connection connection53 = httpConnection49.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal55 = httpConnection49.data("hi!");
        org.jsoup.Connection.Request request56 = httpConnection49.request();
        org.jsoup.Connection connection57 = httpConnection46.request(request56);
        org.jsoup.Connection connection58 = httpConnection36.request(request56);
        org.jsoup.helper.HttpConnection httpConnection59 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext60 = null;
        org.jsoup.Connection connection61 = httpConnection59.sslContext(sSLContext60);
        org.jsoup.helper.HttpConnection httpConnection62 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection64 = httpConnection62.userAgent("");
        org.jsoup.Connection connection66 = httpConnection62.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal68 = httpConnection62.data("hi!");
        org.jsoup.Connection.Request request69 = httpConnection62.request();
        org.jsoup.Connection connection70 = httpConnection59.request(request69);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory71 = null;
        org.jsoup.Connection connection72 = httpConnection59.sslSocketFactory(sSLSocketFactory71);
        org.jsoup.helper.HttpConnection httpConnection73 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection75 = httpConnection73.followRedirects(true);
        java.io.InputStream inputStream78 = null;
        org.jsoup.Connection connection80 = httpConnection73.data("application/x-www-form-urlencoded", "Content-Type", inputStream78, "multipart/form-data");
        java.net.Proxy proxy81 = null;
        org.jsoup.Connection connection82 = httpConnection73.proxy(proxy81);
        java.net.CookieStore cookieStore83 = httpConnection73.cookieStore();
        org.jsoup.Connection connection84 = httpConnection59.cookieStore(cookieStore83);
        org.jsoup.Connection connection85 = httpConnection36.cookieStore(cookieStore83);
        org.jsoup.Connection connection86 = httpConnection18.cookieStore(cookieStore83);
        org.jsoup.Connection connection87 = httpConnection0.cookieStore(cookieStore83);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNull(keyVal30);
        org.junit.Assert.assertNotNull(request31);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNull(keyVal42);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNull(keyVal55);
        org.junit.Assert.assertNotNull(request56);
        org.junit.Assert.assertNotNull(connection57);
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNotNull(connection61);
        org.junit.Assert.assertNotNull(connection64);
        org.junit.Assert.assertNotNull(connection66);
        org.junit.Assert.assertNull(keyVal68);
        org.junit.Assert.assertNotNull(request69);
        org.junit.Assert.assertNotNull(connection70);
        org.junit.Assert.assertNotNull(connection72);
        org.junit.Assert.assertNotNull(connection75);
        org.junit.Assert.assertNotNull(connection80);
        org.junit.Assert.assertNotNull(connection82);
        org.junit.Assert.assertNotNull(cookieStore83);
        org.junit.Assert.assertNotNull(connection84);
        org.junit.Assert.assertNotNull(connection85);
        org.junit.Assert.assertNotNull(connection86);
        org.junit.Assert.assertNotNull(connection87);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test770");
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
        org.jsoup.Connection connection27 = httpConnection25.userAgent("");
        java.net.Proxy proxy28 = null;
        org.jsoup.Connection connection29 = httpConnection25.proxy(proxy28);
        org.jsoup.Connection.KeyVal keyVal31 = httpConnection25.data("multipart/form-data");
        org.jsoup.Connection connection33 = httpConnection25.maxBodySize((int) '#');
        org.jsoup.Connection connection35 = httpConnection25.timeout((int) '4');
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection39 = httpConnection25.data(strArray38);
        org.jsoup.Connection connection40 = httpConnection0.data(strArray38);
        org.jsoup.Connection.Method method41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection42 = httpConnection0.method(method41);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
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
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNull(keyVal31);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection40);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test771");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        javax.net.ssl.SSLContext sSLContext7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslContext(sSLContext7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test772");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test773");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.referrer("multipart/form-data=Content-Type");
        org.jsoup.Connection connection6 = httpConnection0.referrer("hi!");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test774");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.inputStream(inputStream3);
        java.io.InputStream inputStream5 = keyVal4.inputStream();
        boolean boolean6 = keyVal4.hasInputStream();
        java.io.InputStream inputStream7 = keyVal4.inputStream();
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal4.inputStream(inputStream8);
        java.lang.String str10 = keyVal4.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test775");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        java.net.Proxy proxy1 = null;
        org.jsoup.Connection connection2 = httpConnection0.proxy(proxy1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection4 = httpConnection0.url("hi!=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!=', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test776");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.jsoup.Connection connection11 = httpConnection0.data(strArray10);
        org.jsoup.Connection connection14 = httpConnection0.cookie("multipart/form-data=Content-Type", "application/x-www-form-urlencoded=multipart/form-data");
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.newRequest(uRL15);
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
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test777");
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
        org.jsoup.parser.Parser parser36 = null;
        org.jsoup.Connection connection37 = httpConnection22.parser(parser36);
        org.jsoup.Connection connection40 = httpConnection22.data("multipart/form-data", "application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection httpConnection41 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext42 = null;
        org.jsoup.Connection connection43 = httpConnection41.sslContext(sSLContext42);
        org.jsoup.Connection connection45 = httpConnection41.followRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory46 = null;
        org.jsoup.Connection connection47 = httpConnection41.sslSocketFactory(sSLSocketFactory46);
        org.jsoup.helper.HttpConnection httpConnection48 = new org.jsoup.helper.HttpConnection();
        java.net.Proxy proxy49 = null;
        org.jsoup.Connection connection50 = httpConnection48.proxy(proxy49);
        java.net.CookieStore cookieStore51 = httpConnection48.cookieStore();
        org.jsoup.Connection connection52 = httpConnection41.cookieStore(cookieStore51);
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
        org.jsoup.Connection connection93 = httpConnection41.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList89);
        org.jsoup.Connection connection94 = httpConnection22.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList89);
        org.jsoup.Connection connection95 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList89);
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
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(cookieStore35);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(cookieStore51);
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
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test778");
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
        org.jsoup.helper.HttpConnection httpConnection14 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection16 = httpConnection14.userAgent("");
        org.jsoup.Connection connection18 = httpConnection14.requestBody("hi!");
        org.jsoup.Connection connection21 = httpConnection14.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress22 = null;
        org.jsoup.Connection connection23 = httpConnection14.onResponseProgress(responseProgress22);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator24 = null;
        org.jsoup.Connection connection25 = httpConnection14.auth(requestAuthenticator24);
        java.net.Proxy proxy26 = null;
        org.jsoup.Connection connection27 = httpConnection14.proxy(proxy26);
        org.jsoup.Connection connection29 = httpConnection14.userAgent("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress30 = null;
        org.jsoup.Connection connection31 = httpConnection14.onResponseProgress(responseProgress30);
        org.jsoup.helper.HttpConnection httpConnection32 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext33 = null;
        org.jsoup.Connection connection34 = httpConnection32.sslContext(sSLContext33);
        org.jsoup.helper.HttpConnection httpConnection35 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection37 = httpConnection35.userAgent("");
        org.jsoup.Connection connection39 = httpConnection35.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal41 = httpConnection35.data("hi!");
        org.jsoup.Connection.Request request42 = httpConnection35.request();
        org.jsoup.Connection connection43 = httpConnection32.request(request42);
        org.jsoup.Connection connection44 = httpConnection14.request(request42);
        java.io.InputStream inputStream47 = null;
        org.jsoup.Connection connection49 = httpConnection14.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "multipart/form-data", inputStream47, "application/x-www-form-urlencoded");
        org.jsoup.helper.HttpConnection httpConnection50 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection52 = httpConnection50.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy53 = null;
        org.jsoup.Connection connection54 = httpConnection50.proxy(proxy53);
        org.jsoup.Connection.Response response55 = null;
        org.jsoup.Connection connection56 = httpConnection50.response(response55);
        java.io.InputStream inputStream59 = null;
        org.jsoup.Connection connection60 = httpConnection50.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream59);
        org.jsoup.Connection.Request request61 = httpConnection50.request();
        java.net.CookieStore cookieStore62 = httpConnection50.cookieStore();
        org.jsoup.Connection connection63 = httpConnection14.cookieStore(cookieStore62);
        org.jsoup.Connection connection64 = httpConnection0.cookieStore(cookieStore62);
        java.net.CookieStore cookieStore65 = httpConnection0.cookieStore();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response66 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNull(keyVal41);
        org.junit.Assert.assertNotNull(request42);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection52);
        org.junit.Assert.assertNotNull(connection54);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(request61);
        org.junit.Assert.assertNotNull(cookieStore62);
        org.junit.Assert.assertNotNull(connection63);
        org.junit.Assert.assertNotNull(connection64);
        org.junit.Assert.assertNotNull(cookieStore65);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test779");
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
        org.jsoup.helper.RequestAuthenticator requestAuthenticator16 = null;
        org.jsoup.Connection connection17 = httpConnection0.auth(requestAuthenticator16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection19 = connection17.newRequest("multipart/form-data=Content-Type");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'multipart/form-data=Content-Type', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
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
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test780");
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
        org.jsoup.Connection connection56 = httpConnection0.referrer("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
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
        org.junit.Assert.assertNotNull(connection56);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test781");
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
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress20 = null;
        org.jsoup.Connection connection21 = httpConnection0.onResponseProgress(responseProgress20);
        org.jsoup.parser.Parser parser22 = null;
        org.jsoup.Connection connection23 = httpConnection0.parser(parser22);
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
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNull(keyVal16);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test782");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=application/x-www-form-urlencoded=multipart/form-data", "Content-Type=", inputStream2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.key("hi!");
        java.lang.String str6 = keyVal5.value();
        java.lang.String str7 = keyVal5.toString();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Content-Type=" + "'", str6, "Content-Type=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=Content-Type=" + "'", str7, "hi!=Content-Type=");
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test783");
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
        org.jsoup.Connection connection18 = httpConnection0.referrer("hi!=application/x-www-form-urlencoded=multipart/form-data");
        java.net.CookieStore cookieStore19 = httpConnection0.cookieStore();
        org.jsoup.Connection connection21 = httpConnection0.userAgent("hi!=");
        org.jsoup.Connection connection23 = httpConnection0.requestBody("application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(cookieStore19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test784");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        java.lang.String str4 = keyVal2.toString();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("application/x-www-form-urlencoded");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "multipart/form-data=multipart/form-data" + "'", str4, "multipart/form-data=multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal6);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test785");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        org.jsoup.Connection connection9 = httpConnection0.proxy("multipart/form-data", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection11 = httpConnection0.postDataCharset("hi!=");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!=");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test786");
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
        org.jsoup.Connection connection32 = httpConnection0.data("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "application/x-www-form-urlencoded");
        org.jsoup.Connection connection35 = httpConnection0.data("application/x-www-form-urlencoded=multipart/form-data", "application/x-www-form-urlencoded");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection36 = httpConnection0.newRequest();
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
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection35);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test787");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Connection connection12 = httpConnection0.requestBody("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.jsoup.Connection connection15 = httpConnection0.header("Content-Type", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = httpConnection0.cookie("", "hi!=application/x-www-form-urlencoded=multipart/form-data");
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
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test788");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal4 = keyVal2.value("Content-Type");
        boolean boolean5 = keyVal2.hasInputStream();
        boolean boolean6 = keyVal2.hasInputStream();
        java.lang.String str7 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNotNull(keyVal4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multipart/form-data=Content-Type" + "'", str7, "multipart/form-data=Content-Type");
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test789");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = keyVal5.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal5.value("application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNotNull(keyVal8);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test790");
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
        org.jsoup.Connection connection22 = httpConnection0.timeout((int) '#');
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection22);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test791");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Type", "application/x-www-form-urlencoded", inputStream2);
        java.lang.String str4 = keyVal3.key();
        java.lang.String str5 = keyVal3.key();
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.value("hi!=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Content-Type" + "'", str4, "Content-Type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Content-Type" + "'", str5, "Content-Type");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test792");
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
        java.io.InputStream inputStream26 = null;
        org.jsoup.Connection connection28 = httpConnection0.data("Content-Type=", "Content-Encoding", inputStream26, "Content-Type=");
        java.net.URL uRL29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection30 = httpConnection0.url(uRL29);
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
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection28);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test793");
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
        org.jsoup.Connection connection23 = httpConnection0.referrer("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        java.io.InputStream inputStream26 = null;
        org.jsoup.Connection connection27 = httpConnection0.data("multipart/form-data", "multipart/form-data=Content-Type", inputStream26);
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
        org.junit.Assert.assertNotNull(connection27);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test794");
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
        java.io.InputStream inputStream29 = null;
        org.jsoup.Connection connection30 = httpConnection0.requestBodyStream(inputStream29);
        org.jsoup.Connection connection32 = httpConnection0.followRedirects(false);
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
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test795");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.Connection connection12 = httpConnection0.data("hi!", "hi!");
        org.jsoup.Connection connection15 = httpConnection0.cookie("Content-Type=", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection18 = httpConnection16.followRedirects(true);
        java.io.InputStream inputStream21 = null;
        org.jsoup.Connection connection23 = httpConnection16.data("application/x-www-form-urlencoded", "Content-Type", inputStream21, "multipart/form-data");
        org.jsoup.Connection connection25 = httpConnection16.referrer("");
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection28 = httpConnection26.userAgent("");
        java.net.Proxy proxy29 = null;
        org.jsoup.Connection connection30 = httpConnection26.proxy(proxy29);
        org.jsoup.Connection.KeyVal keyVal32 = httpConnection26.data("multipart/form-data");
        org.jsoup.Connection connection34 = httpConnection26.maxBodySize((int) '#');
        org.jsoup.Connection connection36 = httpConnection26.timeout((int) '4');
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection40 = httpConnection26.data(strArray39);
        org.jsoup.Connection connection41 = httpConnection16.data(strArray39);
        org.jsoup.Connection connection42 = httpConnection0.data(strArray39);
        org.jsoup.Connection connection45 = httpConnection0.data("Content-Type=", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNull(keyVal32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection45);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test796");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Type");
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.key("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal7.key("multipart/form-data");
        java.lang.String str10 = keyVal9.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test797");
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
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test798");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection29 = httpConnection0.url("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
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
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test799");
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
        org.jsoup.Connection connection30 = httpConnection0.timeout(10);
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
        org.junit.Assert.assertNotNull(connection30);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test800");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection8 = httpConnection0.timeout((int) ' ');
        org.jsoup.Connection.Request request9 = httpConnection0.request();
        org.jsoup.helper.HttpConnection httpConnection10 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection12 = httpConnection10.userAgent("");
        java.net.Proxy proxy13 = null;
        org.jsoup.Connection connection14 = httpConnection10.proxy(proxy13);
        org.jsoup.Connection.KeyVal keyVal16 = httpConnection10.data("multipart/form-data");
        org.jsoup.Connection connection18 = httpConnection10.maxBodySize((int) '#');
        org.jsoup.Connection connection20 = httpConnection10.timeout((int) '4');
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection24 = httpConnection10.data(strArray23);
        org.jsoup.Connection connection27 = httpConnection10.header("multipart/form-data=multipart/form-data", "application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.helper.HttpConnection httpConnection28 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection30 = httpConnection28.userAgent("");
        java.net.Proxy proxy31 = null;
        org.jsoup.Connection connection32 = httpConnection28.proxy(proxy31);
        org.jsoup.Connection connection34 = httpConnection28.followRedirects(false);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection38 = httpConnection28.data(strArray37);
        java.io.InputStream inputStream39 = null;
        org.jsoup.Connection connection40 = httpConnection28.requestBodyStream(inputStream39);
        java.net.CookieStore cookieStore41 = httpConnection28.cookieStore();
        org.jsoup.Connection connection42 = httpConnection10.cookieStore(cookieStore41);
        org.jsoup.Connection connection43 = httpConnection0.cookieStore(cookieStore41);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNull(keyVal16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(cookieStore41);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection43);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test801");
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
        org.jsoup.Connection connection18 = httpConnection0.referrer("hi!=application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Connection connection20 = httpConnection0.followRedirects(false);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test802");
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
        org.jsoup.Connection connection23 = httpConnection0.referrer("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator24 = null;
        org.jsoup.Connection connection25 = httpConnection0.auth(requestAuthenticator24);
        org.jsoup.parser.Parser parser26 = null;
        org.jsoup.Connection connection27 = httpConnection0.parser(parser26);
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
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test803");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("Content-Type=", "", inputStream2);
        org.junit.Assert.assertNotNull(keyVal3);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test804");
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
        org.jsoup.helper.RequestAuthenticator requestAuthenticator16 = null;
        org.jsoup.Connection connection17 = httpConnection0.auth(requestAuthenticator16);
        org.jsoup.Connection connection19 = httpConnection0.referrer("application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test805");
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
        java.net.CookieStore cookieStore18 = httpConnection0.cookieStore();
        org.jsoup.Connection connection20 = httpConnection0.requestBody("multipart/form-data");
        javax.net.ssl.SSLContext sSLContext21 = null;
        org.jsoup.Connection connection22 = httpConnection0.sslContext(sSLContext21);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(cookieStore18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection22);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test806");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.referrer("multipart/form-data=Content-Type");
        org.jsoup.Connection connection6 = httpConnection0.maxBodySize((int) (byte) 0);
        org.jsoup.Connection connection8 = httpConnection0.ignoreHttpErrors(true);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection10 = connection8.newRequest(uRL9);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test807");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.inputStream(inputStream6);
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.value("");
        java.lang.String str10 = keyVal9.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test808");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        java.lang.Class<?> wildcardClass11 = connection10.getClass();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test809");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
        org.jsoup.Connection connection12 = httpConnection0.referrer("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.jsoup.Connection connection15 = httpConnection0.proxy("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", (int) 'a');
        org.jsoup.Connection connection18 = httpConnection0.cookie("multipart/form-data=Content-Type", "multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test810");
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
        java.io.InputStream inputStream17 = null;
        org.jsoup.Connection connection18 = httpConnection0.requestBodyStream(inputStream17);
        org.jsoup.Connection connection21 = httpConnection0.proxy("", (int) 'a');
        org.jsoup.Connection connection22 = httpConnection0.newRequest();
        java.io.InputStream inputStream25 = null;
        org.jsoup.Connection connection26 = httpConnection0.data("hi!=application/x-www-form-urlencoded=multipart/form-data=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "multipart/form-data", inputStream25);
        org.jsoup.Connection connection28 = httpConnection0.userAgent("Content-Encoding");
        org.jsoup.Connection.Method method29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection30 = httpConnection0.method(method29);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
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
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test811");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection11 = httpConnection0.cookie("hi!=", "Content-Encoding");
        org.jsoup.Connection.Request request12 = httpConnection0.request();
        java.io.InputStream inputStream15 = null;
        org.jsoup.Connection connection17 = httpConnection0.data("Content-Type", "Content-Type", inputStream15, "Content-Encoding");
        org.jsoup.Connection connection19 = httpConnection0.ignoreContentType(false);
        org.jsoup.helper.HttpConnection httpConnection20 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection22 = httpConnection20.userAgent("");
        java.net.Proxy proxy23 = null;
        org.jsoup.Connection connection24 = httpConnection20.proxy(proxy23);
        org.jsoup.Connection connection26 = httpConnection20.followRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory27 = null;
        org.jsoup.Connection connection28 = httpConnection20.sslSocketFactory(sSLSocketFactory27);
        org.jsoup.Connection connection31 = httpConnection20.cookie("hi!=", "Content-Encoding");
        org.jsoup.Connection.Request request32 = httpConnection20.request();
        org.jsoup.Connection connection33 = httpConnection0.request(request32);
        org.jsoup.Connection.Request request34 = httpConnection0.request();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(request32);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(request34);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test812");
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
        org.jsoup.Connection.Request request55 = httpConnection0.request();
        org.jsoup.Connection connection58 = httpConnection0.proxy("multipart/form-data", (int) 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap59 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection60 = httpConnection0.headers(strMap59);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'headers' must not be null.");
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
        org.junit.Assert.assertNotNull(request55);
        org.junit.Assert.assertNotNull(connection58);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test813");
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
        java.net.CookieStore cookieStore17 = httpConnection0.cookieStore();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(cookieStore17);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test814");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.key("Content-Type");
        java.lang.String str6 = keyVal5.contentType();
        java.lang.String str7 = keyVal5.contentType();
        java.lang.String str8 = keyVal5.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Content-Type" + "'", str8, "Content-Type");
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test815");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "Content-Type");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "multipart/form-data=Content-Type" + "'", str3, "multipart/form-data=Content-Type");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test816");
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
        org.jsoup.Connection.Request request22 = httpConnection0.request();
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection25 = httpConnection23.followRedirects(true);
        org.jsoup.Connection connection27 = httpConnection23.followRedirects(false);
        org.jsoup.Connection connection29 = httpConnection23.requestBody("");
        org.jsoup.Connection.Response response30 = null;
        org.jsoup.Connection connection31 = httpConnection23.response(response30);
        java.net.CookieStore cookieStore32 = httpConnection23.cookieStore();
        org.jsoup.Connection connection33 = httpConnection0.cookieStore(cookieStore32);
        java.net.Proxy proxy34 = null;
        org.jsoup.Connection connection35 = httpConnection0.proxy(proxy34);
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
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(cookieStore32);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test817");
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
            org.jsoup.Connection connection19 = httpConnection0.postDataCharset("hi!=Content-Type=");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!=Content-Type=");
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
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test818");
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
        javax.net.ssl.SSLContext sSLContext15 = null;
        org.jsoup.Connection connection16 = httpConnection0.sslContext(sSLContext15);
        org.jsoup.Connection connection19 = httpConnection0.cookie("Content-Type", "Content-Encoding");
        java.net.CookieStore cookieStore20 = httpConnection0.cookieStore();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(cookieStore20);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test819");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = null;
        org.jsoup.Connection connection21 = httpConnection0.sslSocketFactory(sSLSocketFactory20);
        org.jsoup.Connection connection24 = httpConnection0.header("hi!=", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
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
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test820");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.requestBodyStream(inputStream10);
        org.jsoup.Connection connection14 = httpConnection0.cookie("Content-Encoding", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.postDataCharset("Content-Encoding");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: Content-Encoding");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test821");
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
            org.jsoup.nodes.Document document14 = httpConnection0.get();
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
        org.junit.Assert.assertNotNull(request13);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test822");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data=Content-Type", "hi!=", inputStream2);
        java.lang.String str4 = keyVal3.contentType();
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test823");
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
        org.jsoup.Connection connection14 = httpConnection0.newRequest();
        org.jsoup.Connection connection16 = httpConnection0.userAgent("application/x-www-form-urlencoded=multipart/form-data");
        java.net.CookieStore cookieStore17 = httpConnection0.cookieStore();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(cookieStore17);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test824");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.io.InputStream inputStream6 = keyVal5.inputStream();
        java.io.InputStream inputStream7 = keyVal5.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test825");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress9 = null;
        org.jsoup.Connection connection10 = httpConnection0.onResponseProgress(responseProgress9);
        java.net.CookieStore cookieStore11 = httpConnection0.cookieStore();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(cookieStore11);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test826");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection12 = httpConnection0.cookies(strMap11);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'cookies' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test827");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = httpConnection0.response();
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
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test828");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        java.io.InputStream inputStream4 = keyVal2.inputStream();
        boolean boolean5 = keyVal2.hasInputStream();
        java.lang.String str6 = keyVal2.toString();
        boolean boolean7 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=" + "'", str6, "hi!=");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test829");
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
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext20 = null;
        org.jsoup.Connection connection21 = httpConnection19.sslContext(sSLContext20);
        org.jsoup.Connection connection23 = httpConnection19.followRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory24 = null;
        org.jsoup.Connection connection25 = httpConnection19.sslSocketFactory(sSLSocketFactory24);
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        java.net.Proxy proxy27 = null;
        org.jsoup.Connection connection28 = httpConnection26.proxy(proxy27);
        java.net.CookieStore cookieStore29 = httpConnection26.cookieStore();
        org.jsoup.Connection connection30 = httpConnection19.cookieStore(cookieStore29);
        org.jsoup.helper.HttpConnection httpConnection31 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext32 = null;
        org.jsoup.Connection connection33 = httpConnection31.sslContext(sSLContext32);
        org.jsoup.Connection connection35 = httpConnection31.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext36 = null;
        org.jsoup.Connection connection37 = httpConnection31.sslContext(sSLContext36);
        org.jsoup.Connection connection39 = httpConnection31.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection.Response response40 = null;
        org.jsoup.Connection connection41 = httpConnection31.response(response40);
        org.jsoup.helper.HttpConnection httpConnection42 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection44 = httpConnection42.userAgent("");
        java.net.Proxy proxy45 = null;
        org.jsoup.Connection connection46 = httpConnection42.proxy(proxy45);
        org.jsoup.Connection connection48 = httpConnection42.followRedirects(false);
        org.jsoup.Connection connection50 = httpConnection42.timeout((int) ' ');
        org.jsoup.Connection connection53 = httpConnection42.cookie("application/x-www-form-urlencoded=multipart/form-data", "hi!=");
        org.jsoup.Connection connection55 = httpConnection42.timeout((int) (byte) 10);
        org.jsoup.helper.HttpConnection.KeyVal keyVal58 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal60 = keyVal58.key("multipart/form-data=multipart/form-data");
        org.jsoup.helper.HttpConnection.KeyVal keyVal63 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str64 = keyVal63.contentType();
        java.io.InputStream inputStream65 = keyVal63.inputStream();
        org.jsoup.Connection.KeyVal[] keyValArray66 = new org.jsoup.Connection.KeyVal[] { keyVal58, keyVal63 };
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList67 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList67, keyValArray66);
        org.jsoup.Connection connection69 = httpConnection42.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList67);
        org.jsoup.Connection connection70 = httpConnection31.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList67);
        org.jsoup.Connection connection71 = httpConnection19.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList67);
        org.jsoup.Connection connection72 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList67);
        org.jsoup.Connection connection74 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection77 = httpConnection0.data("multipart/form-data=Content-Type", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
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
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(cookieStore29);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(connection55);
        org.junit.Assert.assertNotNull(keyVal58);
        org.junit.Assert.assertNotNull(keyVal60);
        org.junit.Assert.assertNotNull(keyVal63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(inputStream65);
        org.junit.Assert.assertNotNull(keyValArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(connection69);
        org.junit.Assert.assertNotNull(connection70);
        org.junit.Assert.assertNotNull(connection71);
        org.junit.Assert.assertNotNull(connection72);
        org.junit.Assert.assertNotNull(connection74);
        org.junit.Assert.assertNotNull(connection77);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test830");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        java.io.InputStream inputStream6 = null;
        org.jsoup.Connection connection7 = httpConnection0.requestBodyStream(inputStream6);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(connection7);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test831");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Type");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.inputStream(inputStream7);
        java.lang.String str9 = keyVal8.contentType();
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal8.inputStream(inputStream10);
        java.lang.String str12 = keyVal11.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(keyVal11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Content-Type" + "'", str12, "Content-Type");
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test832");
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
        org.jsoup.Connection connection19 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Connection connection21 = httpConnection0.requestBody("hi!=");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test833");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator11 = null;
        org.jsoup.Connection connection12 = httpConnection0.auth(requestAuthenticator11);
        org.jsoup.helper.HttpConnection httpConnection13 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection15 = httpConnection13.userAgent("");
        java.net.Proxy proxy16 = null;
        org.jsoup.Connection connection17 = httpConnection13.proxy(proxy16);
        org.jsoup.Connection connection19 = httpConnection13.followRedirects(false);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection23 = httpConnection13.data(strArray22);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator24 = null;
        org.jsoup.Connection connection25 = httpConnection13.auth(requestAuthenticator24);
        org.jsoup.Connection connection27 = httpConnection13.ignoreContentType(true);
        org.jsoup.helper.HttpConnection httpConnection28 = new org.jsoup.helper.HttpConnection();
        java.net.Proxy proxy29 = null;
        org.jsoup.Connection connection30 = httpConnection28.proxy(proxy29);
        java.net.CookieStore cookieStore31 = httpConnection28.cookieStore();
        org.jsoup.Connection connection32 = httpConnection13.cookieStore(cookieStore31);
        org.jsoup.Connection connection33 = httpConnection0.cookieStore(cookieStore31);
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
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(cookieStore31);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection33);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test834");
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
        org.jsoup.Connection connection24 = httpConnection0.cookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "hi!=application/x-www-form-urlencoded=multipart/form-data");
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
        org.junit.Assert.assertNotNull(connection24);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test835");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection7 = httpConnection5.userAgent("");
        org.jsoup.Connection connection9 = httpConnection5.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal11 = httpConnection5.data("hi!");
        org.jsoup.Connection.Request request12 = httpConnection5.request();
        org.jsoup.Connection connection13 = httpConnection0.request(request12);
        org.jsoup.Connection connection16 = httpConnection0.cookie("hi!=", "Content-Type=");
        org.jsoup.Connection.KeyVal keyVal18 = httpConnection0.data("Content-Encoding");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNull(keyVal11);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNull(keyVal18);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test836");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.timeout(1);
        org.jsoup.Connection connection5 = httpConnection0.newRequest();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection5);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test837");
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
        java.io.InputStream inputStream17 = null;
        org.jsoup.Connection connection18 = httpConnection0.requestBodyStream(inputStream17);
        org.jsoup.Connection connection21 = httpConnection0.proxy("", (int) 'a');
        org.jsoup.Connection connection23 = httpConnection0.userAgent("application/x-www-form-urlencoded");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test838");
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
        java.net.URL uRL27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection28 = httpConnection0.url(uRL27);
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
        org.junit.Assert.assertNull(keyVal15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(request22);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(request26);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test839");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        org.jsoup.Connection connection12 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection14 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection.Request request15 = httpConnection0.request();
        javax.net.ssl.SSLContext sSLContext16 = null;
        org.jsoup.Connection connection17 = httpConnection0.sslContext(sSLContext16);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(request15);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test840");
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
        java.io.InputStream inputStream17 = null;
        org.jsoup.Connection connection18 = httpConnection0.requestBodyStream(inputStream17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = httpConnection0.execute();
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
        org.junit.Assert.assertNotNull(cookieStore13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test841");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        org.jsoup.Connection connection13 = httpConnection0.sslSocketFactory(sSLSocketFactory12);
        java.io.InputStream inputStream14 = null;
        org.jsoup.Connection connection15 = httpConnection0.requestBodyStream(inputStream14);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(cookieStore10);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test842");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        java.net.Proxy proxy7 = null;
        org.jsoup.Connection connection8 = httpConnection0.proxy(proxy7);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test843");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator3 = null;
        org.jsoup.Connection connection4 = httpConnection0.auth(requestAuthenticator3);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress5 = null;
        org.jsoup.Connection connection6 = httpConnection0.onResponseProgress(responseProgress5);
        org.jsoup.Connection connection8 = httpConnection0.requestBody("multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test844");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        java.io.InputStream inputStream4 = keyVal2.inputStream();
        boolean boolean5 = keyVal2.hasInputStream();
        java.io.InputStream inputStream6 = keyVal2.inputStream();
        java.lang.String str7 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=" + "'", str7, "hi!=");
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test845");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        java.net.Proxy proxy11 = null;
        org.jsoup.Connection connection12 = httpConnection0.proxy(proxy11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        org.jsoup.Connection connection14 = httpConnection0.sslSocketFactory(sSLSocketFactory13);
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
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test846");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "Content-Type");
        java.lang.String str3 = keyVal2.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Content-Type" + "'", str3, "Content-Type");
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test847");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Request request5 = httpConnection0.request();
        org.jsoup.Connection.Response response6 = null;
        org.jsoup.Connection connection7 = httpConnection0.response(response6);
        org.jsoup.helper.HttpConnection httpConnection8 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection10 = httpConnection8.followRedirects(true);
        org.jsoup.Connection connection13 = httpConnection8.cookie("Content-Type", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection14 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext15 = null;
        org.jsoup.Connection connection16 = httpConnection14.sslContext(sSLContext15);
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection19 = httpConnection17.userAgent("");
        org.jsoup.Connection connection21 = httpConnection17.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal23 = httpConnection17.data("hi!");
        org.jsoup.Connection.Request request24 = httpConnection17.request();
        org.jsoup.Connection connection25 = httpConnection14.request(request24);
        org.jsoup.Connection connection26 = httpConnection8.request(request24);
        org.jsoup.parser.Parser parser27 = null;
        org.jsoup.Connection connection28 = httpConnection8.parser(parser27);
        java.io.InputStream inputStream31 = null;
        org.jsoup.Connection connection32 = httpConnection8.data("hi!=application/x-www-form-urlencoded=multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream31);
        java.net.CookieStore cookieStore33 = httpConnection8.cookieStore();
        org.jsoup.Connection connection34 = httpConnection0.cookieStore(cookieStore33);
        org.jsoup.Connection.Request request35 = httpConnection0.request();
        java.net.CookieStore cookieStore36 = null;
        org.jsoup.Connection connection37 = httpConnection0.cookieStore(cookieStore36);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNull(keyVal23);
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(cookieStore33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(request35);
        org.junit.Assert.assertNotNull(connection37);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test848");
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
        org.jsoup.Connection connection16 = httpConnection0.timeout((int) (byte) 10);
        java.net.CookieStore cookieStore17 = httpConnection0.cookieStore();
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
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(cookieStore17);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test849");
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
        java.io.InputStream inputStream24 = null;
        org.jsoup.Connection connection26 = httpConnection0.data("multipart/form-data", "hi!=Content-Type=", inputStream24, "hi!=Content-Type=");
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
        org.junit.Assert.assertNotNull(connection26);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test850");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.timeout(1);
        org.jsoup.Connection connection6 = httpConnection0.requestBody("Content-Type");
        org.jsoup.Connection connection8 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection.Response response9 = null;
        org.jsoup.Connection connection10 = httpConnection0.response(response9);
        org.jsoup.Connection.KeyVal keyVal12 = httpConnection0.data("Content-Type");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNull(keyVal12);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test851");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        org.jsoup.Connection connection12 = httpConnection0.sslSocketFactory(sSLSocketFactory11);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress13 = null;
        org.jsoup.Connection connection14 = httpConnection0.onResponseProgress(responseProgress13);
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
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test852");
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
        org.jsoup.Connection connection18 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.Connection connection21 = httpConnection0.header("multipart/form-data=multipart/form-data", "Content-Type=");
        org.jsoup.Connection connection23 = httpConnection0.ignoreContentType(false);
        org.jsoup.Connection.KeyVal keyVal25 = httpConnection0.data("Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection28 = httpConnection26.userAgent("");
        java.net.Proxy proxy29 = null;
        org.jsoup.Connection connection30 = httpConnection26.proxy(proxy29);
        org.jsoup.Connection.KeyVal keyVal32 = httpConnection26.data("multipart/form-data");
        org.jsoup.Connection connection34 = httpConnection26.maxBodySize((int) '#');
        org.jsoup.Connection connection36 = httpConnection26.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress37 = null;
        org.jsoup.Connection connection38 = httpConnection26.onResponseProgress(responseProgress37);
        org.jsoup.Connection.Request request39 = httpConnection26.request();
        org.jsoup.Connection.Request request40 = httpConnection26.request();
        org.jsoup.Connection connection41 = httpConnection0.request(request40);
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
        org.junit.Assert.assertNotNull(keyVal25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNull(keyVal32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(connection41);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test853");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.Response response5 = null;
        org.jsoup.Connection connection6 = httpConnection0.response(response5);
        java.io.InputStream inputStream9 = null;
        org.jsoup.Connection connection10 = httpConnection0.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream9);
        org.jsoup.Connection connection12 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection14 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection connection17 = httpConnection0.cookie("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "Content-Type");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test854");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        java.net.CookieStore cookieStore13 = null;
        org.jsoup.Connection connection14 = httpConnection0.cookieStore(cookieStore13);
        org.jsoup.Connection connection16 = httpConnection0.timeout((int) (byte) 10);
        org.jsoup.Connection connection18 = httpConnection0.followRedirects(false);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test855");
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
        org.jsoup.helper.HttpConnection httpConnection31 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection33 = httpConnection31.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy34 = null;
        org.jsoup.Connection connection35 = httpConnection31.proxy(proxy34);
        org.jsoup.Connection.Response response36 = null;
        org.jsoup.Connection connection37 = httpConnection31.response(response36);
        java.io.InputStream inputStream40 = null;
        org.jsoup.Connection connection41 = httpConnection31.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream40);
        org.jsoup.Connection.Request request42 = httpConnection31.request();
        java.net.CookieStore cookieStore43 = httpConnection31.cookieStore();
        org.jsoup.helper.HttpConnection httpConnection44 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection46 = httpConnection44.userAgent("");
        java.net.Proxy proxy47 = null;
        org.jsoup.Connection connection48 = httpConnection44.proxy(proxy47);
        org.jsoup.Connection.KeyVal keyVal50 = httpConnection44.data("multipart/form-data");
        org.jsoup.Connection connection53 = httpConnection44.proxy("hi!=", (int) (byte) 0);
        org.jsoup.helper.HttpConnection httpConnection54 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection56 = httpConnection54.userAgent("");
        java.net.Proxy proxy57 = null;
        org.jsoup.Connection connection58 = httpConnection54.proxy(proxy57);
        org.jsoup.Connection connection60 = httpConnection54.followRedirects(false);
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection64 = httpConnection54.data(strArray63);
        org.jsoup.Connection connection65 = httpConnection44.data(strArray63);
        org.jsoup.Connection connection66 = httpConnection31.data(strArray63);
        org.jsoup.Connection connection67 = httpConnection0.data(strArray63);
        org.jsoup.Connection connection69 = httpConnection0.timeout((int) (short) 0);
        org.jsoup.Connection connection71 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext72 = null;
        org.jsoup.Connection connection73 = httpConnection0.sslContext(sSLContext72);
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
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(request42);
        org.junit.Assert.assertNotNull(cookieStore43);
        org.junit.Assert.assertNotNull(connection46);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNull(keyVal50);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection64);
        org.junit.Assert.assertNotNull(connection65);
        org.junit.Assert.assertNotNull(connection66);
        org.junit.Assert.assertNotNull(connection67);
        org.junit.Assert.assertNotNull(connection69);
        org.junit.Assert.assertNotNull(connection71);
        org.junit.Assert.assertNotNull(connection73);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test856");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection.KeyVal keyVal8 = httpConnection0.data("multipart/form-data=multipart/form-data");
        org.jsoup.Connection connection10 = httpConnection0.userAgent("multipart/form-data=Content-Type");
        java.io.InputStream inputStream11 = null;
        org.jsoup.Connection connection12 = httpConnection0.requestBodyStream(inputStream11);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNull(keyVal8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test857");
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
        org.jsoup.Connection connection22 = httpConnection0.ignoreHttpErrors(true);
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
        org.junit.Assert.assertNotNull(connection22);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test858");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("hi!=Content-Type=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!=Content-Type=', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test859");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.parser.Parser parser5 = null;
        org.jsoup.Connection connection6 = httpConnection0.parser(parser5);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test860");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.requestBodyStream(inputStream10);
        org.jsoup.Connection connection14 = httpConnection0.cookie("Content-Encoding", "");
        java.io.InputStream inputStream17 = null;
        org.jsoup.Connection connection19 = httpConnection0.data("multipart/form-data=Content-Type", "multipart/form-data=Content-Type", inputStream17, "application/x-www-form-urlencoded=multipart/form-data");
        java.net.CookieStore cookieStore20 = httpConnection0.cookieStore();
        java.io.InputStream inputStream23 = null;
        org.jsoup.Connection connection24 = httpConnection0.data("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", "multipart/form-data", inputStream23);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(cookieStore20);
        org.junit.Assert.assertNotNull(connection24);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test861");
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
        java.io.InputStream inputStream17 = null;
        org.jsoup.Connection connection18 = httpConnection0.requestBodyStream(inputStream17);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress19 = null;
        org.jsoup.Connection connection20 = httpConnection0.onResponseProgress(responseProgress19);
        org.jsoup.helper.HttpConnection httpConnection21 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext22 = null;
        org.jsoup.Connection connection23 = httpConnection21.sslContext(sSLContext22);
        org.jsoup.Connection connection25 = httpConnection21.followRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory26 = null;
        org.jsoup.Connection connection27 = httpConnection21.sslSocketFactory(sSLSocketFactory26);
        org.jsoup.helper.HttpConnection httpConnection28 = new org.jsoup.helper.HttpConnection();
        java.net.Proxy proxy29 = null;
        org.jsoup.Connection connection30 = httpConnection28.proxy(proxy29);
        java.net.CookieStore cookieStore31 = httpConnection28.cookieStore();
        org.jsoup.Connection connection32 = httpConnection21.cookieStore(cookieStore31);
        java.net.CookieStore cookieStore33 = httpConnection21.cookieStore();
        org.jsoup.Connection connection34 = httpConnection0.cookieStore(cookieStore33);
        org.jsoup.helper.HttpConnection httpConnection35 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection37 = httpConnection35.userAgent("");
        java.net.Proxy proxy38 = null;
        org.jsoup.Connection connection39 = httpConnection35.proxy(proxy38);
        org.jsoup.Connection.Request request40 = httpConnection35.request();
        org.jsoup.Connection.Response response41 = null;
        org.jsoup.Connection connection42 = httpConnection35.response(response41);
        org.jsoup.helper.HttpConnection httpConnection43 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection45 = httpConnection43.followRedirects(true);
        org.jsoup.Connection connection48 = httpConnection43.cookie("Content-Type", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection49 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext50 = null;
        org.jsoup.Connection connection51 = httpConnection49.sslContext(sSLContext50);
        org.jsoup.helper.HttpConnection httpConnection52 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection54 = httpConnection52.userAgent("");
        org.jsoup.Connection connection56 = httpConnection52.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal58 = httpConnection52.data("hi!");
        org.jsoup.Connection.Request request59 = httpConnection52.request();
        org.jsoup.Connection connection60 = httpConnection49.request(request59);
        org.jsoup.Connection connection61 = httpConnection43.request(request59);
        org.jsoup.parser.Parser parser62 = null;
        org.jsoup.Connection connection63 = httpConnection43.parser(parser62);
        java.io.InputStream inputStream66 = null;
        org.jsoup.Connection connection67 = httpConnection43.data("hi!=application/x-www-form-urlencoded=multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream66);
        java.net.CookieStore cookieStore68 = httpConnection43.cookieStore();
        org.jsoup.Connection connection69 = httpConnection35.cookieStore(cookieStore68);
        org.jsoup.Connection connection70 = httpConnection0.cookieStore(cookieStore68);
        org.jsoup.Connection connection72 = httpConnection0.ignoreHttpErrors(true);
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
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(cookieStore31);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(cookieStore33);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(request40);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection51);
        org.junit.Assert.assertNotNull(connection54);
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNull(keyVal58);
        org.junit.Assert.assertNotNull(request59);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNotNull(connection61);
        org.junit.Assert.assertNotNull(connection63);
        org.junit.Assert.assertNotNull(connection67);
        org.junit.Assert.assertNotNull(cookieStore68);
        org.junit.Assert.assertNotNull(connection69);
        org.junit.Assert.assertNotNull(connection70);
        org.junit.Assert.assertNotNull(connection72);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test862");
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
        org.jsoup.helper.HttpConnection httpConnection18 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection20 = httpConnection18.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy21 = null;
        org.jsoup.Connection connection22 = httpConnection18.proxy(proxy21);
        org.jsoup.Connection.Response response23 = null;
        org.jsoup.Connection connection24 = httpConnection18.response(response23);
        java.io.InputStream inputStream27 = null;
        org.jsoup.Connection connection28 = httpConnection18.data("multipart/form-data", "application/x-www-form-urlencoded", inputStream27);
        org.jsoup.Connection connection30 = httpConnection18.followRedirects(false);
        org.jsoup.Connection connection32 = httpConnection18.ignoreContentType(true);
        org.jsoup.Connection.Request request33 = httpConnection18.request();
        org.jsoup.Connection connection34 = httpConnection0.request(request33);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(request33);
        org.junit.Assert.assertNotNull(connection34);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test863");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        boolean boolean6 = keyVal2.hasInputStream();
        java.lang.String str7 = keyVal2.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test864");
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
        javax.net.ssl.SSLContext sSLContext31 = null;
        org.jsoup.Connection connection32 = httpConnection0.sslContext(sSLContext31);
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
        org.junit.Assert.assertNotNull(connection32);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test865");
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
        org.jsoup.Connection connection17 = httpConnection0.timeout(10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = httpConnection0.get();
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
        org.junit.Assert.assertNotNull(connection17);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test866");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.toString();
        java.io.InputStream inputStream5 = keyVal2.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("application/x-www-form-urlencoded=multipart/form-data");
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.inputStream(inputStream8);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!=" + "'", str4, "hi!=");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test867");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("multipart/form-data=multipart/form-data");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.inputStream(inputStream9);
        java.lang.String str11 = keyVal10.value();
        java.lang.String str12 = keyVal10.value();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "multipart/form-data" + "'", str11, "multipart/form-data");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "multipart/form-data" + "'", str12, "multipart/form-data");
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test868");
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
        org.jsoup.parser.Parser parser21 = null;
        org.jsoup.Connection connection22 = httpConnection0.parser(parser21);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection22);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test869");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection11 = httpConnection0.header("hi!=application/x-www-form-urlencoded=multipart/form-data", "Content-Type=");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
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
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test870");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.contentType();
        java.io.InputStream inputStream4 = keyVal2.inputStream();
        boolean boolean5 = keyVal2.hasInputStream();
        java.lang.String str6 = keyVal2.toString();
        java.lang.String str7 = keyVal2.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!=" + "'", str6, "hi!=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test871");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        org.jsoup.Connection connection14 = httpConnection0.timeout((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.url("application/x-www-form-urlencoded=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'application/x-www-form-urlencoded=multipart/form-data', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
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
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test872");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        java.lang.String str7 = keyVal2.contentType();
        java.lang.String str8 = keyVal2.value();
        java.lang.String str9 = keyVal2.toString();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "multipart/form-data" + "'", str8, "multipart/form-data");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!==multipart/form-data" + "'", str9, "hi!==multipart/form-data");
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test873");
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
        org.jsoup.Connection connection32 = httpConnection0.requestBody("hi!=");
        org.jsoup.Connection connection34 = httpConnection0.followRedirects(false);
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
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test874");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Type");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.key("application/x-www-form-urlencoded");
        java.lang.String str9 = keyVal8.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "application/x-www-form-urlencoded" + "'", str9, "application/x-www-form-urlencoded");
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test875");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Connection connection12 = httpConnection0.followRedirects(false);
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
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
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
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test876");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory24 = null;
        org.jsoup.Connection connection25 = httpConnection0.sslSocketFactory(sSLSocketFactory24);
        org.jsoup.Connection.KeyVal keyVal27 = httpConnection0.data("hi!=application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Connection.Response response28 = null;
        org.jsoup.Connection connection29 = httpConnection0.response(response28);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator30 = null;
        org.jsoup.Connection connection31 = httpConnection0.auth(requestAuthenticator30);
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
        org.junit.Assert.assertNull(keyVal27);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection31);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test877");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        org.jsoup.Connection connection11 = httpConnection0.referrer("application/x-www-form-urlencoded");
        java.io.InputStream inputStream14 = null;
        org.jsoup.Connection connection16 = httpConnection0.data("Content-Type=", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream14, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.jsoup.Connection connection19 = httpConnection0.proxy("Content-Type=", 10);
        org.jsoup.Connection.Response response20 = null;
        org.jsoup.Connection connection21 = httpConnection0.response(response20);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test878");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        java.lang.String str6 = keyVal5.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test879");
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
        org.jsoup.Connection connection18 = httpConnection0.ignoreHttpErrors(true);
        org.jsoup.helper.HttpConnection httpConnection19 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection21 = httpConnection19.userAgent("");
        java.net.Proxy proxy22 = null;
        org.jsoup.Connection connection23 = httpConnection19.proxy(proxy22);
        org.jsoup.Connection.KeyVal keyVal25 = httpConnection19.data("multipart/form-data");
        org.jsoup.Connection connection28 = httpConnection19.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection29 = httpConnection19.newRequest();
        org.jsoup.helper.HttpConnection httpConnection30 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection32 = httpConnection30.userAgent("");
        org.jsoup.Connection connection34 = httpConnection30.requestBody("hi!");
        org.jsoup.Connection connection37 = httpConnection30.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress38 = null;
        org.jsoup.Connection connection39 = httpConnection30.onResponseProgress(responseProgress38);
        org.jsoup.Connection connection42 = httpConnection30.data("hi!", "hi!");
        org.jsoup.Connection connection45 = httpConnection30.cookie("Content-Type=", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection46 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection48 = httpConnection46.followRedirects(true);
        java.io.InputStream inputStream51 = null;
        org.jsoup.Connection connection53 = httpConnection46.data("application/x-www-form-urlencoded", "Content-Type", inputStream51, "multipart/form-data");
        org.jsoup.Connection connection55 = httpConnection46.referrer("");
        org.jsoup.helper.HttpConnection httpConnection56 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection58 = httpConnection56.userAgent("");
        java.net.Proxy proxy59 = null;
        org.jsoup.Connection connection60 = httpConnection56.proxy(proxy59);
        org.jsoup.Connection.KeyVal keyVal62 = httpConnection56.data("multipart/form-data");
        org.jsoup.Connection connection64 = httpConnection56.maxBodySize((int) '#');
        org.jsoup.Connection connection66 = httpConnection56.timeout((int) '4');
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection70 = httpConnection56.data(strArray69);
        org.jsoup.Connection connection71 = httpConnection46.data(strArray69);
        org.jsoup.Connection connection72 = httpConnection30.data(strArray69);
        org.jsoup.Connection connection73 = httpConnection19.data(strArray69);
        org.jsoup.Connection connection74 = httpConnection0.data(strArray69);
        org.jsoup.Connection.Method method75 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection76 = httpConnection0.method(method75);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'method' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNull(keyVal25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection37);
        org.junit.Assert.assertNotNull(connection39);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(connection48);
        org.junit.Assert.assertNotNull(connection53);
        org.junit.Assert.assertNotNull(connection55);
        org.junit.Assert.assertNotNull(connection58);
        org.junit.Assert.assertNotNull(connection60);
        org.junit.Assert.assertNull(keyVal62);
        org.junit.Assert.assertNotNull(connection64);
        org.junit.Assert.assertNotNull(connection66);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection70);
        org.junit.Assert.assertNotNull(connection71);
        org.junit.Assert.assertNotNull(connection72);
        org.junit.Assert.assertNotNull(connection73);
        org.junit.Assert.assertNotNull(connection74);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test880");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        boolean boolean4 = keyVal2.hasInputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("hi!=");
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.key("multipart/form-data=multipart/form-data");
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal6.inputStream(inputStream9);
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal6.value("application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Connection.KeyVal keyVal14 = keyVal12.contentType("multipart/form-data=multipart/form-data");
        java.io.InputStream inputStream15 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal16 = keyVal12.inputStream(inputStream15);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
        org.junit.Assert.assertNotNull(keyVal14);
        org.junit.Assert.assertNotNull(keyVal16);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test881");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        java.net.Proxy proxy14 = null;
        org.jsoup.Connection connection15 = httpConnection11.proxy(proxy14);
        org.jsoup.Connection.KeyVal keyVal17 = httpConnection11.data("multipart/form-data");
        org.jsoup.Connection connection20 = httpConnection11.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection21 = httpConnection11.newRequest();
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection24 = httpConnection22.userAgent("");
        org.jsoup.Connection connection26 = httpConnection22.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal28 = httpConnection22.data("hi!");
        org.jsoup.Connection.Request request29 = httpConnection22.request();
        org.jsoup.Connection connection30 = httpConnection11.request(request29);
        org.jsoup.Connection connection31 = httpConnection0.request(request29);
        java.io.InputStream inputStream34 = null;
        org.jsoup.Connection connection35 = httpConnection0.data("Content-Encoding", "hi!", inputStream34);
        org.jsoup.Connection connection36 = httpConnection0.newRequest();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(keyVal17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNull(keyVal28);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection36);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test882");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection1 = org.jsoup.helper.HttpConnection.connect("");
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'url' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test883");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("application/x-www-form-urlencoded", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream2);
        java.io.InputStream inputStream4 = keyVal3.inputStream();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal3.value("");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal6.inputStream(inputStream7);
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.key("Content-Encoding");
        org.jsoup.helper.HttpConnection.KeyVal keyVal12 = keyVal10.value("hi!=");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertNotNull(keyVal12);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test884");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        java.io.InputStream inputStream11 = null;
        org.jsoup.Connection connection12 = httpConnection0.requestBodyStream(inputStream11);
        org.jsoup.Connection connection14 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection16 = httpConnection0.followRedirects(true);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test885");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("hi!");
        org.jsoup.Connection.Request request7 = httpConnection0.request();
        org.jsoup.Connection connection9 = httpConnection0.userAgent("application/x-www-form-urlencoded");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(connection9);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test886");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        java.net.Proxy proxy1 = null;
        org.jsoup.Connection connection2 = httpConnection0.proxy(proxy1);
        javax.net.ssl.SSLContext sSLContext3 = null;
        org.jsoup.Connection connection4 = httpConnection0.sslContext(sSLContext3);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test887");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        java.lang.String str4 = keyVal2.toString();
        org.jsoup.Connection.KeyVal keyVal6 = keyVal2.contentType("hi!=");
        java.lang.String str7 = keyVal2.contentType();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "multipart/form-data=multipart/form-data" + "'", str4, "multipart/form-data=multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!=" + "'", str7, "hi!=");
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test888");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.helper.HttpConnection httpConnection5 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection7 = httpConnection5.userAgent("");
        org.jsoup.Connection connection9 = httpConnection5.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal11 = httpConnection5.data("hi!");
        org.jsoup.Connection.Request request12 = httpConnection5.request();
        org.jsoup.Connection connection13 = httpConnection0.request(request12);
        org.jsoup.Connection connection15 = httpConnection0.ignoreHttpErrors(true);
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
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test889");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.Connection connection4 = httpConnection0.followRedirects(true);
        javax.net.ssl.SSLContext sSLContext5 = null;
        org.jsoup.Connection connection6 = httpConnection0.sslContext(sSLContext5);
        org.jsoup.Connection connection8 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        org.jsoup.Connection connection11 = httpConnection0.proxy("", (int) (byte) 0);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator12 = null;
        org.jsoup.Connection connection13 = httpConnection0.auth(requestAuthenticator12);
        org.jsoup.Connection connection15 = httpConnection0.referrer("multipart/form-data=Content-Type");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = httpConnection0.post();
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
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test890");
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
        org.jsoup.Connection connection56 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal58 = httpConnection0.data("Content-Type=");
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
        org.junit.Assert.assertNotNull(connection56);
        org.junit.Assert.assertNull(keyVal58);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test891");
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
            org.jsoup.Connection connection15 = httpConnection0.postDataCharset("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
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
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test892");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection9 = httpConnection7.userAgent("");
        java.net.Proxy proxy10 = null;
        org.jsoup.Connection connection11 = httpConnection7.proxy(proxy10);
        org.jsoup.Connection connection13 = httpConnection7.followRedirects(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection17 = httpConnection7.data(strArray16);
        org.jsoup.Connection connection18 = httpConnection0.data(strArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection20 = httpConnection0.postDataCharset("hi!=application/x-www-form-urlencoded=multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!=application/x-www-form-urlencoded=multipart/form-data");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
        org.junit.Assert.assertNotNull(connection18);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test893");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress8 = null;
        org.jsoup.Connection connection9 = httpConnection0.onResponseProgress(responseProgress8);
        org.jsoup.Connection connection12 = httpConnection0.data("hi!", "hi!");
        org.jsoup.Connection connection15 = httpConnection0.cookie("Content-Type=", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection16 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection18 = httpConnection16.followRedirects(true);
        java.io.InputStream inputStream21 = null;
        org.jsoup.Connection connection23 = httpConnection16.data("application/x-www-form-urlencoded", "Content-Type", inputStream21, "multipart/form-data");
        org.jsoup.Connection connection25 = httpConnection16.referrer("");
        org.jsoup.helper.HttpConnection httpConnection26 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection28 = httpConnection26.userAgent("");
        java.net.Proxy proxy29 = null;
        org.jsoup.Connection connection30 = httpConnection26.proxy(proxy29);
        org.jsoup.Connection.KeyVal keyVal32 = httpConnection26.data("multipart/form-data");
        org.jsoup.Connection connection34 = httpConnection26.maxBodySize((int) '#');
        org.jsoup.Connection connection36 = httpConnection26.timeout((int) '4');
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!=", "multipart/form-data" };
        org.jsoup.Connection connection40 = httpConnection26.data(strArray39);
        org.jsoup.Connection connection41 = httpConnection16.data(strArray39);
        org.jsoup.Connection connection42 = httpConnection0.data(strArray39);
        org.jsoup.Connection connection44 = httpConnection0.ignoreContentType(false);
        java.io.InputStream inputStream47 = null;
        org.jsoup.Connection connection49 = httpConnection0.data("hi!=", "multipart/form-data", inputStream47, "Content-Type=");
        java.io.InputStream inputStream52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection53 = httpConnection0.data("", "hi!", inputStream52);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The 'key' parameter must not be empty.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNotNull(connection18);
        org.junit.Assert.assertNotNull(connection23);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNull(keyVal32);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!=", "multipart/form-data" });
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection42);
        org.junit.Assert.assertNotNull(connection44);
        org.junit.Assert.assertNotNull(connection49);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test894");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        java.net.Proxy proxy1 = null;
        org.jsoup.Connection connection2 = httpConnection0.proxy(proxy1);
        java.net.CookieStore cookieStore3 = httpConnection0.cookieStore();
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection5 = httpConnection0.url(uRL4);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'url' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(cookieStore3);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test895");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.Connection connection12 = httpConnection0.ignoreHttpErrors(false);
        org.jsoup.Connection connection14 = httpConnection0.requestBody("multipart/form-data=multipart/form-data");
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
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test896");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection29 = httpConnection0.newRequest("hi!=Content-Type=");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!=Content-Type=', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
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
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test897");
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
        org.jsoup.Connection connection16 = httpConnection0.timeout((int) (short) 10);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection18 = httpConnection0.headers(strMap17);
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
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test898");
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
            org.jsoup.nodes.Document document12 = httpConnection0.get();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test899");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("hi!");
        org.jsoup.Connection.Request request7 = httpConnection0.request();
        org.jsoup.Connection connection10 = httpConnection0.cookie("Content-Type", "Content-Encoding");
        org.jsoup.Connection.Request request11 = httpConnection0.request();
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(request11);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test900");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("hi!");
        org.jsoup.helper.HttpConnection httpConnection7 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection9 = httpConnection7.userAgent("");
        java.net.Proxy proxy10 = null;
        org.jsoup.Connection connection11 = httpConnection7.proxy(proxy10);
        org.jsoup.Connection connection13 = httpConnection7.followRedirects(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection17 = httpConnection7.data(strArray16);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator18 = null;
        org.jsoup.Connection connection19 = httpConnection7.auth(requestAuthenticator18);
        org.jsoup.Connection connection21 = httpConnection7.ignoreContentType(true);
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        java.net.Proxy proxy23 = null;
        org.jsoup.Connection connection24 = httpConnection22.proxy(proxy23);
        java.net.CookieStore cookieStore25 = httpConnection22.cookieStore();
        org.jsoup.Connection connection26 = httpConnection7.cookieStore(cookieStore25);
        org.jsoup.Connection connection27 = httpConnection0.cookieStore(cookieStore25);
        java.lang.String[] strArray28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection29 = httpConnection0.data(strArray28);
            org.junit.Assert.fail("Expected exception of type org.jsoup.helper.ValidationException; message: The parameter 'keyvals' must not be null.");
        } catch (org.jsoup.helper.ValidationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(cookieStore25);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection27);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test901");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        org.jsoup.Connection connection9 = httpConnection0.cookie("Content-Type", "multipart/form-data");
        org.jsoup.Connection connection11 = httpConnection0.ignoreContentType(false);
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
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test902");
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
        java.io.InputStream inputStream14 = null;
        org.jsoup.Connection connection15 = httpConnection0.requestBodyStream(inputStream14);
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection17 = httpConnection0.method(method16);
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
        org.junit.Assert.assertNotNull(cookieStore13);
        org.junit.Assert.assertNotNull(connection15);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test903");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response40 = httpConnection0.execute();
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
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test904");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection5 = httpConnection3.userAgent("");
        org.jsoup.Connection connection7 = httpConnection3.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal9 = httpConnection3.data("hi!");
        org.jsoup.Connection.Request request10 = httpConnection3.request();
        org.jsoup.Connection connection11 = httpConnection0.request(request10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        org.jsoup.Connection connection13 = httpConnection0.sslSocketFactory(sSLSocketFactory12);
        java.net.CookieStore cookieStore14 = httpConnection0.cookieStore();
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection connection16 = httpConnection0.url(uRL15);
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
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(cookieStore14);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test905");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        java.net.Proxy proxy8 = null;
        org.jsoup.Connection connection9 = httpConnection0.proxy(proxy8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.Connection connection11 = httpConnection0.requestBodyStream(inputStream10);
        org.jsoup.Connection connection14 = httpConnection0.cookie("Content-Encoding", "");
        java.io.InputStream inputStream17 = null;
        org.jsoup.Connection connection19 = httpConnection0.data("multipart/form-data=Content-Type", "multipart/form-data=Content-Type", inputStream17, "application/x-www-form-urlencoded=multipart/form-data");
        java.net.CookieStore cookieStore20 = httpConnection0.cookieStore();
        org.jsoup.helper.RequestAuthenticator requestAuthenticator21 = null;
        org.jsoup.Connection connection22 = httpConnection0.auth(requestAuthenticator21);
        org.jsoup.Connection connection24 = httpConnection0.requestBody("hi!=");
        org.jsoup.Connection connection26 = httpConnection0.requestBody("multipart/form-data");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = httpConnection0.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(cookieStore20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test906");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal2.inputStream(inputStream4);
        org.jsoup.Connection.KeyVal keyVal7 = keyVal5.contentType("multipart/form-data=Content-Type");
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal5.key("Content-Type=");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test907");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("");
        java.io.InputStream inputStream8 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal9 = keyVal2.inputStream(inputStream8);
        java.io.InputStream inputStream10 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal11 = keyVal9.inputStream(inputStream10);
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNotNull(keyVal9);
        org.junit.Assert.assertNotNull(keyVal11);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test908");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        org.jsoup.Connection connection4 = httpConnection0.timeout(1);
        org.jsoup.Connection connection6 = httpConnection0.requestBody("Content-Type");
        org.jsoup.Connection connection8 = httpConnection0.ignoreContentType(true);
        org.jsoup.Connection.Response response9 = null;
        org.jsoup.Connection connection10 = httpConnection0.response(response9);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator11 = null;
        org.jsoup.Connection connection12 = httpConnection0.auth(requestAuthenticator11);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test909");
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
        org.jsoup.Connection connection19 = httpConnection0.userAgent("Content-Type=");
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
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test910");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.requestBody("application/x-www-form-urlencoded");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.helper.RequestAuthenticator requestAuthenticator5 = null;
        org.jsoup.Connection connection6 = httpConnection0.auth(requestAuthenticator5);
        org.jsoup.Connection connection9 = httpConnection0.data("Content-Encoding", "hi!=application/x-www-form-urlencoded=multipart/form-data");
        org.jsoup.Connection connection11 = httpConnection0.timeout(0);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection11);
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test911");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.Progress<org.jsoup.Connection.Response> responseProgress11 = null;
        org.jsoup.Connection connection12 = httpConnection0.onResponseProgress(responseProgress11);
        org.jsoup.Connection connection14 = httpConnection0.timeout((int) (short) 0);
        org.jsoup.helper.HttpConnection httpConnection15 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection17 = httpConnection15.userAgent("");
        java.net.Proxy proxy18 = null;
        org.jsoup.Connection connection19 = httpConnection15.proxy(proxy18);
        org.jsoup.Connection.Request request20 = httpConnection15.request();
        org.jsoup.Connection.Response response21 = null;
        org.jsoup.Connection connection22 = httpConnection15.response(response21);
        org.jsoup.helper.HttpConnection httpConnection23 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection25 = httpConnection23.followRedirects(true);
        org.jsoup.Connection connection28 = httpConnection23.cookie("Content-Type", "Content-Encoding");
        org.jsoup.helper.HttpConnection httpConnection29 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext30 = null;
        org.jsoup.Connection connection31 = httpConnection29.sslContext(sSLContext30);
        org.jsoup.helper.HttpConnection httpConnection32 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection34 = httpConnection32.userAgent("");
        org.jsoup.Connection connection36 = httpConnection32.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal38 = httpConnection32.data("hi!");
        org.jsoup.Connection.Request request39 = httpConnection32.request();
        org.jsoup.Connection connection40 = httpConnection29.request(request39);
        org.jsoup.Connection connection41 = httpConnection23.request(request39);
        org.jsoup.parser.Parser parser42 = null;
        org.jsoup.Connection connection43 = httpConnection23.parser(parser42);
        java.io.InputStream inputStream46 = null;
        org.jsoup.Connection connection47 = httpConnection23.data("hi!=application/x-www-form-urlencoded=multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream46);
        java.net.CookieStore cookieStore48 = httpConnection23.cookieStore();
        org.jsoup.Connection connection49 = httpConnection15.cookieStore(cookieStore48);
        org.jsoup.Connection connection50 = httpConnection0.cookieStore(cookieStore48);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(request20);
        org.junit.Assert.assertNotNull(connection22);
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection28);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNull(keyVal38);
        org.junit.Assert.assertNotNull(request39);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection41);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNotNull(cookieStore48);
        org.junit.Assert.assertNotNull(connection49);
        org.junit.Assert.assertNotNull(connection50);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test912");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection9 = httpConnection0.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection10 = httpConnection0.newRequest();
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
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test913");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection.Response response7 = null;
        org.jsoup.Connection connection8 = httpConnection0.response(response7);
        org.jsoup.Connection connection10 = httpConnection0.requestBody("hi!==multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test914");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection7 = httpConnection0.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Connection connection9 = httpConnection0.userAgent("hi!=");
        org.jsoup.Connection connection12 = httpConnection0.header("Content-Encoding", "multipart/form-data");
        org.jsoup.Connection connection14 = httpConnection0.userAgent("multipart/form-data");
        org.jsoup.Connection connection16 = httpConnection0.requestBody("Content-Encoding");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
        org.junit.Assert.assertNotNull(connection16);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test915");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.io.InputStream inputStream3 = keyVal2.inputStream();
        java.lang.String str4 = keyVal2.value();
        org.jsoup.helper.HttpConnection.KeyVal keyVal6 = keyVal2.key("Content-Type");
        java.io.InputStream inputStream7 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal8 = keyVal2.inputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal10 = keyVal8.inputStream(inputStream9);
        java.lang.String str11 = keyVal8.value();
        java.lang.String str12 = keyVal8.contentType();
        org.jsoup.Connection.KeyVal keyVal14 = keyVal8.contentType("application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(inputStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(keyVal6);
        org.junit.Assert.assertNotNull(keyVal8);
        org.junit.Assert.assertNotNull(keyVal10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(keyVal14);
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test916");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        java.io.InputStream inputStream6 = keyVal2.inputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test917");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("multipart/form-data", "multipart/form-data");
        java.lang.String str3 = keyVal2.contentType();
        java.lang.String str4 = keyVal2.key();
        boolean boolean5 = keyVal2.hasInputStream();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "multipart/form-data" + "'", str4, "multipart/form-data");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test918");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        org.jsoup.Connection connection11 = httpConnection0.cookie("hi!=", "Content-Encoding");
        org.jsoup.Connection.Request request12 = httpConnection0.request();
        java.io.InputStream inputStream15 = null;
        org.jsoup.Connection connection17 = httpConnection0.data("Content-Type", "Content-Type", inputStream15, "Content-Encoding");
        org.jsoup.Connection connection19 = httpConnection0.requestBody("Content-Type");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = httpConnection0.response();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: You must execute the request before getting a response.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertNotNull(connection17);
        org.junit.Assert.assertNotNull(connection19);
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test919");
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!", "");
        java.lang.String str3 = keyVal2.toString();
        java.lang.String str4 = keyVal2.value();
        java.lang.String str5 = keyVal2.key();
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal2.value("");
        java.io.InputStream inputStream8 = keyVal7.inputStream();
        boolean boolean9 = keyVal7.hasInputStream();
        java.lang.String str10 = keyVal7.toString();
        java.lang.String str11 = keyVal7.key();
        org.junit.Assert.assertNotNull(keyVal2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!=" + "'", str3, "hi!=");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(keyVal7);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!=" + "'", str10, "hi!=");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test920");
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
        org.jsoup.Connection connection23 = httpConnection0.referrer("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
        org.jsoup.helper.RequestAuthenticator requestAuthenticator24 = null;
        org.jsoup.Connection connection25 = httpConnection0.auth(requestAuthenticator24);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory26 = null;
        org.jsoup.Connection connection27 = httpConnection0.sslSocketFactory(sSLSocketFactory26);
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
        org.junit.Assert.assertNotNull(connection25);
        org.junit.Assert.assertNotNull(connection27);
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test921");
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
        org.jsoup.Connection connection27 = httpConnection25.followRedirects(true);
        org.jsoup.Connection connection30 = httpConnection25.cookie("Content-Type", "Content-Encoding");
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "application/x-www-form-urlencoded=multipart/form-data" };
        org.jsoup.Connection connection34 = httpConnection25.data(strArray33);
        org.jsoup.Connection connection35 = httpConnection0.data(strArray33);
        java.io.InputStream inputStream38 = null;
        org.jsoup.Connection connection39 = httpConnection0.data("hi!=", "multipart/form-data", inputStream38);
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
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!", "application/x-www-form-urlencoded=multipart/form-data" });
        org.junit.Assert.assertNotNull(connection34);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection39);
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test922");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection.KeyVal keyVal6 = httpConnection0.data("multipart/form-data");
        org.jsoup.Connection connection8 = httpConnection0.maxBodySize((int) '#');
        org.jsoup.Connection connection10 = httpConnection0.timeout((int) '4');
        org.jsoup.helper.RequestAuthenticator requestAuthenticator11 = null;
        org.jsoup.Connection connection12 = httpConnection0.auth(requestAuthenticator11);
        org.jsoup.Connection connection14 = httpConnection0.requestBody("hi!=application/x-www-form-urlencoded=multipart/form-data");
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNull(keyVal6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection12);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test923");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        org.jsoup.Connection connection4 = httpConnection0.requestBody("hi!");
        org.jsoup.Connection connection6 = httpConnection0.ignoreHttpErrors(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        org.jsoup.Connection connection8 = httpConnection0.sslSocketFactory(sSLSocketFactory7);
        java.net.CookieStore cookieStore9 = httpConnection0.cookieStore();
        java.io.InputStream inputStream12 = null;
        org.jsoup.Connection connection13 = httpConnection0.data("multipart/form-data", "multipart/form-data=Content-Type", inputStream12);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertNotNull(cookieStore9);
        org.junit.Assert.assertNotNull(connection13);
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test924");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.followRedirects(true);
        java.io.InputStream inputStream5 = null;
        org.jsoup.Connection connection7 = httpConnection0.data("application/x-www-form-urlencoded", "Content-Type", inputStream5, "multipart/form-data");
        javax.net.ssl.SSLContext sSLContext8 = null;
        org.jsoup.Connection connection9 = httpConnection0.sslContext(sSLContext8);
        org.jsoup.Connection.Request request10 = httpConnection0.request();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = httpConnection0.post();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL not set. Make sure to call #url(...) before executing the request.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNotNull(connection9);
        org.junit.Assert.assertNotNull(request10);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test925");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext1 = null;
        org.jsoup.Connection connection2 = httpConnection0.sslContext(sSLContext1);
        org.jsoup.helper.HttpConnection httpConnection3 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection5 = httpConnection3.userAgent("");
        org.jsoup.Connection connection7 = httpConnection3.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal9 = httpConnection3.data("hi!");
        org.jsoup.Connection.Request request10 = httpConnection3.request();
        org.jsoup.Connection connection11 = httpConnection0.request(request10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        org.jsoup.Connection connection13 = httpConnection0.sslSocketFactory(sSLSocketFactory12);
        java.net.CookieStore cookieStore14 = httpConnection0.cookieStore();
        org.jsoup.Connection connection16 = httpConnection0.followRedirects(true);
        org.jsoup.helper.HttpConnection httpConnection17 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection19 = httpConnection17.userAgent("");
        org.jsoup.Connection connection21 = httpConnection17.requestBody("hi!");
        org.jsoup.Connection connection24 = httpConnection17.proxy("multipart/form-data", (int) (short) 0);
        org.jsoup.Connection connection26 = httpConnection17.userAgent("hi!=");
        org.jsoup.Connection connection29 = httpConnection17.header("Content-Encoding", "multipart/form-data");
        org.jsoup.Connection connection31 = httpConnection17.userAgent("multipart/form-data");
        org.jsoup.parser.Parser parser32 = null;
        org.jsoup.Connection connection33 = httpConnection17.parser(parser32);
        org.jsoup.helper.HttpConnection httpConnection34 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection36 = httpConnection34.followRedirects(true);
        org.jsoup.Connection connection38 = httpConnection34.timeout(1);
        org.jsoup.Connection connection40 = httpConnection34.requestBody("Content-Type");
        org.jsoup.helper.HttpConnection httpConnection41 = new org.jsoup.helper.HttpConnection();
        javax.net.ssl.SSLContext sSLContext42 = null;
        org.jsoup.Connection connection43 = httpConnection41.sslContext(sSLContext42);
        org.jsoup.Connection connection45 = httpConnection41.followRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory46 = null;
        org.jsoup.Connection connection47 = httpConnection41.sslSocketFactory(sSLSocketFactory46);
        org.jsoup.helper.HttpConnection httpConnection48 = new org.jsoup.helper.HttpConnection();
        java.net.Proxy proxy49 = null;
        org.jsoup.Connection connection50 = httpConnection48.proxy(proxy49);
        java.net.CookieStore cookieStore51 = httpConnection48.cookieStore();
        org.jsoup.Connection connection52 = httpConnection41.cookieStore(cookieStore51);
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
        org.jsoup.Connection connection93 = httpConnection41.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList89);
        org.jsoup.Connection connection94 = httpConnection34.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList89);
        org.jsoup.Connection connection95 = httpConnection17.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList89);
        org.jsoup.Connection connection96 = httpConnection0.data((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList89);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection5);
        org.junit.Assert.assertNotNull(connection7);
        org.junit.Assert.assertNull(keyVal9);
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertNotNull(connection11);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(cookieStore14);
        org.junit.Assert.assertNotNull(connection16);
        org.junit.Assert.assertNotNull(connection19);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNotNull(connection29);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection33);
        org.junit.Assert.assertNotNull(connection36);
        org.junit.Assert.assertNotNull(connection38);
        org.junit.Assert.assertNotNull(connection40);
        org.junit.Assert.assertNotNull(connection43);
        org.junit.Assert.assertNotNull(connection45);
        org.junit.Assert.assertNotNull(connection47);
        org.junit.Assert.assertNotNull(connection50);
        org.junit.Assert.assertNotNull(cookieStore51);
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
        org.junit.Assert.assertNotNull(connection96);
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test926");
        java.io.InputStream inputStream2 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = org.jsoup.helper.HttpConnection.KeyVal.create("hi!=application/x-www-form-urlencoded=multipart/form-data", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", inputStream2);
        java.io.InputStream inputStream4 = null;
        org.jsoup.helper.HttpConnection.KeyVal keyVal5 = keyVal3.inputStream(inputStream4);
        org.jsoup.helper.HttpConnection.KeyVal keyVal7 = keyVal3.key("hi!");
        org.junit.Assert.assertNotNull(keyVal3);
        org.junit.Assert.assertNotNull(keyVal5);
        org.junit.Assert.assertNotNull(keyVal7);
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test927");
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
            org.jsoup.Connection connection14 = httpConnection0.url("hi!==multipart/form-data");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The supplied URL, 'hi!==multipart/form-data', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls");
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
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "JA_058_Regression1.test928");
        org.jsoup.helper.HttpConnection httpConnection0 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection2 = httpConnection0.userAgent("");
        java.net.Proxy proxy3 = null;
        org.jsoup.Connection connection4 = httpConnection0.proxy(proxy3);
        org.jsoup.Connection connection6 = httpConnection0.followRedirects(false);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!=", "hi!" };
        org.jsoup.Connection connection10 = httpConnection0.data(strArray9);
        org.jsoup.helper.HttpConnection httpConnection11 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection13 = httpConnection11.userAgent("");
        java.net.Proxy proxy14 = null;
        org.jsoup.Connection connection15 = httpConnection11.proxy(proxy14);
        org.jsoup.Connection.KeyVal keyVal17 = httpConnection11.data("multipart/form-data");
        org.jsoup.Connection connection20 = httpConnection11.proxy("hi!=", (int) (byte) 0);
        org.jsoup.Connection connection21 = httpConnection11.newRequest();
        org.jsoup.helper.HttpConnection httpConnection22 = new org.jsoup.helper.HttpConnection();
        org.jsoup.Connection connection24 = httpConnection22.userAgent("");
        org.jsoup.Connection connection26 = httpConnection22.requestBody("hi!");
        org.jsoup.Connection.KeyVal keyVal28 = httpConnection22.data("hi!");
        org.jsoup.Connection.Request request29 = httpConnection22.request();
        org.jsoup.Connection connection30 = httpConnection11.request(request29);
        org.jsoup.Connection connection31 = httpConnection0.request(request29);
        java.io.InputStream inputStream34 = null;
        org.jsoup.Connection connection35 = httpConnection0.data("Content-Encoding", "hi!", inputStream34);
        org.jsoup.Connection connection37 = httpConnection0.timeout((int) (byte) 10);
        org.junit.Assert.assertNotNull(connection2);
        org.junit.Assert.assertNotNull(connection4);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!=", "hi!" });
        org.junit.Assert.assertNotNull(connection10);
        org.junit.Assert.assertNotNull(connection13);
        org.junit.Assert.assertNotNull(connection15);
        org.junit.Assert.assertNull(keyVal17);
        org.junit.Assert.assertNotNull(connection20);
        org.junit.Assert.assertNotNull(connection21);
        org.junit.Assert.assertNotNull(connection24);
        org.junit.Assert.assertNotNull(connection26);
        org.junit.Assert.assertNull(keyVal28);
        org.junit.Assert.assertNotNull(request29);
        org.junit.Assert.assertNotNull(connection30);
        org.junit.Assert.assertNotNull(connection31);
        org.junit.Assert.assertNotNull(connection35);
        org.junit.Assert.assertNotNull(connection37);
    }
}

