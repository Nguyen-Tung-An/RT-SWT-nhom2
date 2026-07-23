    public static TextBlock createTextBlock(String text, Font font,
            Paint paint, float maxWidth, int maxLines, TextMeasurer measurer) {

        TextBlock result = new TextBlock();
        BreakIterator iterator = BreakIterator.getLineInstance();
        iterator.setText(text);
        int current = 0;
        int lines = 0;
        int length = text.length();
        while (current < length && lines < maxLines) {
            int next = nextLineBreak(text, current, maxWidth, iterator,
                    measurer);
            if (next == BreakIterator.DONE) {
                result.addLine(text.substring(current), font, paint);
                return result;
            } else if (next == current) {
                next++; // we must take one more character or we'll loop forever
            }
            result.addLine(text.substring(current, next), font, paint);
            lines++;
            current = next;
            while (current < text.length()&& text.charAt(current) == '\n') {
                current++;
            }
        }
        if (current < length) {
            TextLine lastLine = result.getLastLine();
            TextFragment lastFragment = lastLine.getLastTextFragment();
            String oldStr = lastFragment.getText();
            String newStr = "...";
            if (oldStr.length() > 3) {
                newStr = oldStr.substring(0, oldStr.length() - 3) + "...";
            }

            lastLine.removeFragment(lastFragment);
            TextFragment newFragment = new TextFragment(newStr,
                    lastFragment.getFont(), lastFragment.getPaint());
            lastLine.addFragment(newFragment);
        }
        return result;
    }
