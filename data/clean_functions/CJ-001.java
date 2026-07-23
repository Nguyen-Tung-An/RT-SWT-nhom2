    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MeterNeedle)) {
            return false;
        }
        MeterNeedle that = (MeterNeedle) obj;
        if (!PaintUtils.equal(this.outlinePaint, that.outlinePaint)) {
            return false;
        }
        if (!Objects.equals(this.outlineStroke, that.outlineStroke)) {
            return false;
        }
        if (!PaintUtils.equal(this.fillPaint, that.fillPaint)) {
            return false;
        }
        if (!PaintUtils.equal(this.highlightPaint, that.highlightPaint)) {
            return false;
        }
        if (this.size != that.size) {
            return false;
        }
        if (this.rotateX != that.rotateX) {
            return false;
        }
        if (this.rotateY != that.rotateY) {
            return false;
        }
        return true;
    }
