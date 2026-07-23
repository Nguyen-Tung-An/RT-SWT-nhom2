    public static Interval parseWithOffset(String str) {
        int separator = str.indexOf('/');
        if (separator < 0) {
            throw new IllegalArgumentException("Format requires a '/' separator: " + str);
        }
        String leftStr = str.substring(0, separator);
        if (leftStr.length() <= 0) {
            throw new IllegalArgumentException("Format invalid: " + str);
        }
        String rightStr = str.substring(separator + 1);
        if (rightStr.length() <= 0) {
            throw new IllegalArgumentException("Format invalid: " + str);
        }

        DateTimeFormatter dateTimeParser = ISODateTimeFormat.dateTimeParser().withOffsetParsed();
        PeriodFormatter periodParser = ISOPeriodFormat.standard();
        DateTime start = null;
        Period period = null;
        
        // before slash
        char c = leftStr.charAt(0);
        if (c == 'P' || c == 'p') {
            period = periodParser.withParseType(PeriodType.standard()).parsePeriod(leftStr);
        } else {
            start = dateTimeParser.parseDateTime(leftStr);
        }
        
        // after slash
        c = rightStr.charAt(0);
        if (c == 'P' || c == 'p') {
            if (period != null) {
                throw new IllegalArgumentException("Interval composed of two durations: " + str);
            }
            period = periodParser.withParseType(PeriodType.standard()).parsePeriod(rightStr);
            return new Interval(start, period);
        } else {
            DateTime end = dateTimeParser.parseDateTime(rightStr);
            if (period != null) {
                return new Interval(period, end);
            } else {
                return new Interval(start, end);
            }
        }
    }
