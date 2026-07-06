package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.InvocationTargetException;
import java.net.Proxy;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RequestDispatchTest {

    @Test
    void testGet_UseHttpClient_WithValidRequest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Request request = Mockito.mock(Request.class);
        Response previousResponse = Mockito.mock(Response.class);
        Mockito.when(request.sslSocketFactory()).thenReturn(null);
        Mockito.when(request.proxy()).thenReturn(null);

        RequestExecutor executor = RequestDispatch.get(request, previousResponse);
        assertNotNull(executor);
        assertTrue(executor instanceof RequestExecutor);
    }

    @Test
    void testGet_UseUrlConnectionExecutor_WhenSocketFactoryIsSet() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Request request = Mockito.mock(Request.class);
        Response previousResponse = Mockito.mock(Response.class);
        Mockito.when(request.sslSocketFactory()).thenReturn(new Object());
        Mockito.when(request.proxy()).thenReturn(null);

        RequestExecutor executor = RequestDispatch.get(request, previousResponse);
        assertNotNull(executor);
        assertTrue(executor instanceof UrlConnectionExecutor);
    }

    @Test
    void testGet_UseUrlConnectionExecutor_WhenSocksProxy() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Request request = Mockito.mock(Request.class);
        Response previousResponse = Mockito.mock(Response.class);
        Proxy proxy = Mockito.mock(Proxy.class);
        Mockito.when(proxy.type()).thenReturn(Proxy.Type.SOCKS);
        Mockito.when(request.sslSocketFactory()).thenReturn(null);
        Mockito.when(request.proxy()).thenReturn(proxy);

        RequestExecutor executor = RequestDispatch.get(request, previousResponse);
        assertNotNull(executor);
        assertTrue(executor instanceof UrlConnectionExecutor);
    }

    @Test
    void testGet_UseUrlConnectionExecutor_WhenHttpClientConstructorFails() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Request request = Mockito.mock(Request.class);
        Response previousResponse = Mockito.mock(Response.class);
        Mockito.when(request.sslSocketFactory()).thenReturn(null);
        Mockito.when(request.proxy()).thenReturn(null);

        // Simulate the clientConstructor being set but throwing an exception
        RequestDispatch.clientConstructor = (request1, response1) -> {
            throw new Exception("Constructor failed");
        };

        RequestExecutor executor = RequestDispatch.get(request, previousResponse);
        assertNotNull(executor);
        assertTrue(executor instanceof UrlConnectionExecutor);
    }
}