    long getLineNumber() {
        // Check if we are at EOL or EOF or just starting
        if (lastChar == CR || lastChar == LF || lastChar == UNDEFINED || lastChar == EOF) {
            return lineNumber; // counter is accurate
        }
        return lineNumber + 1; // Allow for counter being incremented only at EOL
    }
