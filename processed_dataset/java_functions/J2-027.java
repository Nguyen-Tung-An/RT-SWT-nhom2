    public static Seconds seconds(int seconds) {
        switch (seconds) {
            case 0:
                return ZERO;
            case 1:
                return ONE;
            case 2:
                return TWO;
            case 3:
                return THREE;
            case Integer.MAX_VALUE:
                return MAX_VALUE;
            case Integer.MIN_VALUE:
                return MIN_VALUE;
            default:
                return new Seconds(seconds);
        }
    }
