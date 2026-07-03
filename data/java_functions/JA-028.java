    static RequestExecutor get(Request request, @Nullable Response previousResponse) {
        boolean useHttpClient = Boolean.parseBoolean(System.getProperty(SharedConstants.UseHttpClient, "true"));

        if (request.sslSocketFactory() != null) // downgrade if a socket factory is set, as it can't be supplied to the HttpClient
            useHttpClient = false;
        Proxy proxy = request.proxy();
        if (proxy != null && proxy.type() == Proxy.Type.SOCKS) // HttpClient doesn't support SOCKS proxies
            useHttpClient = false;

        if (useHttpClient && clientConstructor != null) {
            try {
                return clientConstructor.newInstance(request, previousResponse);
            } catch (Exception e) {
                return new UrlConnectionExecutor(request, previousResponse);
            }
        } else {
            return new UrlConnectionExecutor(request, previousResponse);
        }
    }
