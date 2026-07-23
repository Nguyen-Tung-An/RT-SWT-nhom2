    public void printComment(final String comment) throws IOException {
        lock.lock();
        try {
            if (comment == null || !format.isCommentMarkerSet()) {
                return;
            }
            if (!newRecord) {
                println();
            }
            appendable.append(format.getCommentMarker().charValue()); // Explicit unboxing is intentional
            appendable.append(SP);
            for (int i = 0; i < comment.length(); i++) {
                final char c = comment.charAt(i);
                switch (c) {
                case CR:
                    if (i + 1 < comment.length() && comment.charAt(i + 1) == LF) {
                        i++;
                    }
                    // falls-through: break intentionally excluded.
                case LF:
                    println();
                    appendable.append(format.getCommentMarker().charValue()); // Explicit unboxing is intentional
                    appendable.append(SP);
                    break;
                default:
                    appendable.append(c);
                    break;
                }
            }
            println();
        } finally {
            lock.unlock();
        }
    }
