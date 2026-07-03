    private Token parseSimpleToken(final Token token, final int ch) throws IOException {
        // Faster to use while(true)+break than while(token.type == INVALID)
        int cur = ch;
        while (true) {
            if (readEndOfLine(cur)) {
                token.type = Token.Type.EORECORD;
                break;
            }
            if (isEndOfFile(cur)) {
                token.type = Token.Type.EOF;
                token.isReady = true; // There is data at EOF
                break;
            }
            if (isDelimiter(cur)) {
                token.type = Token.Type.TOKEN;
                break;
            }
            // continue
            if (isEscape(cur)) {
                appendNextEscapedCharacterToToken(token);
            } else {
                token.content.append((char) cur);
            }
            cur = reader.read(); // continue
        }

        if (ignoreSurroundingSpaces) {
            trimTrailingSpaces(token.content);
        }

        return token;
    }
