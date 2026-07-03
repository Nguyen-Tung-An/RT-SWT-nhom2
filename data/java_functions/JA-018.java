    private static ControllableInputStream openStream(Path path) throws IOException {
        final SeekableByteChannel byteChannel = Files.newByteChannel(path);
        InputStream stream = Channels.newInputStream(byteChannel);
        String name = Normalizer.lowerCase(path.getFileName().toString());
        if (name.endsWith(".gz") || name.endsWith(".z")) {
            try {
                final boolean zipped = (stream.read() == 0x1f && stream.read() == 0x8b); // gzip magic bytes
                byteChannel.position(0); // reset to start of file
                if (zipped) stream = new GZIPInputStream(stream);
            } catch (IOException e) {
                stream.close(); // error during our first read; close the stream and cascade close byteChannel
                throw e;
            }
        }
        return ControllableInputStream.wrap(stream, 0);
    }
