    <A extends Appendable> A appendWrappedText(final A appendable, final int width, final int nextLineTabStop, final String text) throws IOException {
        if (width <= 0) {
            return appendable;
        }
        String render = text;
        int nextLineTabStopPos = nextLineTabStop;
        int pos = findWrapPos(render, width, 0);
        if (pos == -1) {
            appendable.append(rtrim(render));
            return appendable;
        }
        appendable.append(rtrim(render.substring(0, pos))).append(getNewLine());
        if (nextLineTabStopPos >= width) {
            // stops infinite loop happening
            nextLineTabStopPos = 1;
        }
        // all following lines must be padded with nextLineTabStop space characters
        final String padding = createPadding(nextLineTabStopPos);
        while (true) {
            render = padding + render.substring(pos).trim();
            pos = findWrapPos(render, width, 0);
            if (pos == -1) {
                appendable.append(render);
                return appendable;
            }
            if (render.length() > width && pos == nextLineTabStopPos - 1) {
                pos = width;
            }
            appendable.append(rtrim(render.substring(0, pos))).append(getNewLine());
        }
    }
