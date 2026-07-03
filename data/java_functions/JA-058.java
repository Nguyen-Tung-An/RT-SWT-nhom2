        private static void implWritePost(final HttpConnection.Request req, final BufferedWriter w, final OutputStream outputStream) throws IOException {
            final Collection<Connection.KeyVal> data = req.data();
            final String boundary = req.mimeBoundary;

            if (boundary != null) { // a multipart post
                for (Connection.KeyVal keyVal : data) {
                    w.write("--");
                    w.write(boundary);
                    w.write("\r\n");
                    w.write("Content-Disposition: form-data; name=\"");
                    w.write(encodeMimeName(keyVal.key())); // encodes " to %22
                    w.write("\"");
                    final InputStream input = keyVal.inputStream();
                    if (input != null) {
                        w.write("; filename=\"");
                        w.write(encodeMimeName(keyVal.value()));
                        w.write("\"\r\nContent-Type: ");
                        String contentType = keyVal.contentType();
                        w.write(contentType != null ? contentType : DefaultUploadType);
                        w.write("\r\n\r\n");
                        w.flush();
                        DataUtil.crossStreams(input, outputStream);
                        outputStream.flush();
                    } else {
                        w.write("\r\n\r\n");
                        w.write(keyVal.value());
                    }
                    w.write("\r\n");
                }
                w.write("--");
                w.write(boundary);
                w.write("--");
            } else if (req.body != null) { // a single body (bytes or plain text);  data will be in query string
                if (req.body instanceof String) {
                    w.write((String) req.body);
                } else if (req.body instanceof InputStream) {
                    DataUtil.crossStreams((InputStream) req.body, outputStream);
                    outputStream.flush();
                } else {
                    throw new IllegalStateException();
                }
            } else { // regular form data (application/x-www-form-urlencoded)
                boolean first = true;
                for (Connection.KeyVal keyVal : data) {
                    if (!first) w.append('&');
                    else first = false;

                    w.write(URLEncoder.encode(keyVal.key(), req.postDataCharset()));
                    w.write('=');
                    w.write(URLEncoder.encode(keyVal.value(), req.postDataCharset()));
                }
            }
        }
