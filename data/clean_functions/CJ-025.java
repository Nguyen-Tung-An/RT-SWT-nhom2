    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MeanAndStandardDeviation)) {
            return false;
        }
        MeanAndStandardDeviation that = (MeanAndStandardDeviation) obj;
        if (!Objects.equals(this.mean, that.mean)) {
            return false;
        }
        if (!Objects.equals(this.standardDeviation, that.standardDeviation)
        ) {
            return false;
        }
        return true;
    }
