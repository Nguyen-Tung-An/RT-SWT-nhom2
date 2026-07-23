    public boolean hasClass(String className) {
        if (attributes == null) return false;

        final String classAttr = attributes.getIgnoreCase("class");
        final int len = classAttr.length();
        final int wantLen = className.length();

        if (len == 0 || len < wantLen) return false;

        // if both lengths are equal, only need to compare the className with the attribute
        if (len == wantLen) return className.equalsIgnoreCase(classAttr);

        // otherwise, scan for whitespace and compare regions (with no string or list allocations)
        for (int i = 0; i < len; ) {
            int start = nextClassStart(classAttr, i, len);
            if (start == len) return false;

            int end = nextClassEnd(classAttr, start, len);
            if (end - start == wantLen && classAttr.regionMatches(true, start, className, 0, wantLen)) return true;
            i = end;
        }

        return false;
    }
