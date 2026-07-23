    public String readLine() throws IOException {
        if (peek() == EOF) {
            return null;
        }
        final StringBuilder buffer = new StringBuilder();
        while (true) {
            final int current = read();
            if (current == CR) {
                final int next = peek();
                if (next == LF) {
                    read();
                }
            }
            if (current == EOF || current == LF || current == CR) {
                break;
            }
            buffer.append((char) current);
        }
        return buffer.toString();
    }
