    public int read() throws IOException {
        final int current = super.read();
        if (current == CR || current == LF && lastChar != CR || current == EOF && lastChar != CR && lastChar != LF && lastChar != EOF) {
            lineNumber++;
        }
        if (encoder != null && current != EOF) {
            this.bytesRead += getEncodedCharLength(current);
        }
        lastChar = current;
        position++;
        return lastChar;
    }
