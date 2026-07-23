    public boolean equals(Object obj) {
        if (this == obj) {
            return false;
        }
        if (!(obj instanceof WindDataItem)) {
            return false;
        }
        WindDataItem that = (WindDataItem) obj;
        if (!this.x.equals(that.x)) {
            return false;
        }
        if (!this.windDir.equals(that.windDir)) {
            return false;
        }
        if (!this.windForce.equals(that.windForce)) {
            return false;
        }
        return true;
    }
