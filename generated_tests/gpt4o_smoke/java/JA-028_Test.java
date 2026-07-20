package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.RequestDispatch;
import org.jsoup.helper.RequestExecutor;
import org.jsoup.helper.UrlConnectionExecutor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class RequestDispatchTest {

    @Test
    void testGetWithHttpClient() {
        System.setProperty("UseHttpClient", "true");
        Connection.Request request = new Connection.Request() {
            @Override
            public Proxy proxy() {
                return null;
            }

            @Override
            public SSLSocketFactory sslSocketFactory() {
                return null;
            }
        };
        Connection.Response previousResponse = null;

        RequestExecutor executor = RequestDispatch.get(request, previousResponse);
        assertInstanceOf(RequestExecutor.class, executor);
    }

    @Test
    void testGetWithSocketFactory() {
        System.setProperty("UseHttpClient", "true");
        Connection.Request request = new Connection.Request() {
            @Override
            public Proxy proxy() {
                return null;
            }

            @Override
            public SSLSocketFactory sslSocketFactory() {
                return new SSLSocketFactory() {};
            }
        };
        Connection.Response previousResponse = null;

        RequestExecutor executor = RequestDispatch.get(request, previousResponse);
        assertInstanceOf(UrlConnectionExecutor.class, executor);
    }

    @Test
    void testGetWithSocksProxy() {
        System.setProperty("UseHttpClient", "true");
        Connection.Request request = new Connection.Request() {
            @Override
            public Proxy proxy() {
                return new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("localhost", 1080));
            }

            @Override
            public SSLSocketFactory sslSocketFactory() {
                return null;
            }
        };
        Connection.Response previousResponse = null;

        RequestExecutor executor = RequestDispatch.get(request, previousResponse);
        assertInstanceOf(UrlConnectionExecutor.class, executor);
    }

    @Test
    void testGetWithHttpClientConstructorException() {
        System.setProperty("UseHttpClient", "true");
        Connection.Request request = new Connection.Request() {
            @Override
            public Proxy proxy() {
                return null;
            }

            @Override
            public SSLSocketFactory sslSocketFactory() {
                return null;
            }
        };
        Connection.Response previousResponse = null;

        // Simulate an exception in clientConstructor
        RequestDispatch.clientConstructor = (req, res) -> { throw new RuntimeException(); };

        RequestExecutor executor = RequestDispatch.get(request, previousResponse);
        assertInstanceOf(UrlConnectionExecutor.class, executor);
    }

    @Test
    void testGetWithoutHttpClient() {
        System.setProperty("UseHttpClient", "false");
        Connection.Request request = new Connection.Request() {
            @Override
            public Proxy proxy() {
                return null;
            }

            @Override
            public SSLSocketFactory sslSocketFactory() {
                return null;
            }
        };
        Connection.Response previousResponse = null;

        RequestExecutor executor = RequestDispatch.get(request, previousResponse);
        assertInstanceOf(UrlConnectionExecutor.class, executor);
    }
}