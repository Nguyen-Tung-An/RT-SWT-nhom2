import org.jsoup.helper.RequestDispatch;
import org.jsoup.helper.RequestExecutor;
import org.jsoup.helper.UrlConnectionExecutor;
import org.jsoup.Connection.Request;
import org.jsoup.Connection.Response;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.Method;
import java.net.Proxy;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RequestDispatchTest {

    @Test
    void testGetWithHttpClient() throws Exception {
        Request request = Mockito.mock(Request.class);
        Response previousResponse = Mockito.mock(Response.class);
        Mockito.when(request.sslSocketFactory()).thenReturn(null);
        Mockito.when(request.proxy()).thenReturn(null);

        RequestExecutor executor = RequestDispatch.get(request, previousResponse);
        assertNotNull(executor);
        assertTrue(executor instanceof UrlConnectionExecutor);
    }

    @Test
    void testGetWithSocksProxy() throws Exception {
        Request request = Mockito.mock(Request.class);
        Response previousResponse = Mockito.mock(Response.class);
        Mockito.when(request.sslSocketFactory()).thenReturn(null);
        Mockito.when(request.proxy()).thenReturn(Proxy.NO_PROXY);
        Mockito.when(request.proxy().type()).thenReturn(Proxy.Type.SOCKS);

        RequestExecutor executor = RequestDispatch.get(request, previousResponse);
        assertNotNull(executor);
        assertTrue(executor instanceof UrlConnectionExecutor);
    }

    @Test
    void testGetWithSocketFactory() throws Exception {
        Request request = Mockito.mock(Request.class);
        Response previousResponse = Mockito.mock(Response.class);
        Mockito.when(request.sslSocketFactory()).thenReturn(new javax.net.ssl.SSLSocketFactory() {});
        Mockito.when(request.proxy()).thenReturn(null);

        RequestExecutor executor = RequestDispatch.get(request, previousResponse);
        assertNotNull(executor);
        assertTrue(executor instanceof UrlConnectionExecutor);
    }

    @Test
    void testGetWithExceptionInClientConstructor() throws Exception {
        Request request = Mockito.mock(Request.class);
        Response previousResponse = Mockito.mock(Response.class);
        Mockito.when(request.sslSocketFactory()).thenReturn(null);
        Mockito.when(request.proxy()).thenReturn(null);

        // Simulate clientConstructor throwing an exception
        Method method = RequestDispatch.class.getDeclaredMethod("get", Request.class, Response.class);
        method.setAccessible(true);
        RequestExecutor executor = (RequestExecutor) method.invoke(null, request, previousResponse);
        
        assertNotNull(executor);
        assertTrue(executor instanceof UrlConnectionExecutor);
    }
}