package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.net.Proxy;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RequestDispatchTest {

    @Test
    void testGet_WithSslSocketFactory() {
        Request request = Mockito.mock(Request.class);
        Mockito.when(request.sslSocketFactory()).thenReturn(Mockito.mock(javax.net.ssl.SSLSocketFactory.class));
        Response previousResponse = null;

        RequestExecutor executor = RequestDispatch.get(request, previousResponse);
        assertNotNull(executor);
        assertTrue(executor instanceof UrlConnectionExecutor);
    }

    @Test
    void testGet_WithSocksProxy() {
        Request request = Mockito.mock(Request.class);
        Proxy proxy = Mockito.mock(Proxy.class);
        Mockito.when(proxy.type()).thenReturn(Proxy.Type.SOCKS);
        Mockito.when(request.proxy()).thenReturn(proxy);
        Response previousResponse = null;

        RequestExecutor executor = RequestDispatch.get(request, previousResponse);
        assertNotNull(executor);
        assertTrue(executor instanceof UrlConnectionExecutor);
    }

    @Test
    void testGet_WithHttpClient() throws Exception {
        Request request = Mockito.mock(Request.class);
        Mockito.when(request.sslSocketFactory()).thenReturn(null);
        Mockito.when(request.proxy()).thenReturn(null);
        Response previousResponse = null;

        // Assuming clientConstructor is set up correctly in the actual implementation
        RequestExecutor executor = RequestDispatch.get(request, previousResponse);
        assertNotNull(executor);
        // Additional assertions can be made based on the expected behavior of the HttpClient
    }

    @Test
    void testGet_WithExceptionInHttpClient() throws Exception {
        Request request = Mockito.mock(Request.class);
        Mockito.when(request.sslSocketFactory()).thenReturn(null);
        Mockito.when(request.proxy()).thenReturn(null);
        Response previousResponse = null;

        // Simulate an exception in the client constructor
        RequestDispatch.clientConstructor = (request1, response1) -> {
            throw new Exception("Test Exception");
        };

        RequestExecutor executor = RequestDispatch.get(request, previousResponse);
        assertNotNull(executor);
        assertTrue(executor instanceof UrlConnectionExecutor);
    }
}