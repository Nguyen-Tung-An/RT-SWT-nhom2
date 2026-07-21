    public static void writeShape(Shape shape, ObjectOutputStream stream)
            throws IOException {

        Args.nullNotPermitted(stream, "stream");
        if (shape != null) {
            stream.writeBoolean(false);
            if (shape instanceof Line2D) {
                final Line2D line = (Line2D) shape;
                stream.writeObject(Line2D.class);
                stream.writeDouble(line.getX1());
                stream.writeDouble(line.getY1());
                stream.writeDouble(line.getX2());
                stream.writeDouble(line.getY2());
            } else if (shape instanceof Rectangle2D) {
                final Rectangle2D rectangle = (Rectangle2D) shape;
                stream.writeObject(Rectangle2D.class);
                stream.writeDouble(rectangle.getX());
                stream.writeDouble(rectangle.getY());
                stream.writeDouble(rectangle.getWidth());
                stream.writeDouble(rectangle.getHeight());
            } else if (shape instanceof Ellipse2D) {
                final Ellipse2D ellipse = (Ellipse2D) shape;
                stream.writeObject(Ellipse2D.class);
                stream.writeDouble(ellipse.getX());
                stream.writeDouble(ellipse.getY());
                stream.writeDouble(ellipse.getWidth());
                stream.writeDouble(ellipse.getHeight());
            } else if (shape instanceof Arc2D) {
                final Arc2D arc = (Arc2D) shape;
                stream.writeObject(Arc2D.class);
                stream.writeDouble(arc.getX());
                stream.writeDouble(arc.getY());
                stream.writeDouble(arc.getWidth());
                stream.writeDouble(arc.getHeight());
                stream.writeDouble(arc.getAngleStart());
                stream.writeDouble(arc.getAngleExtent());
                stream.writeInt(arc.getArcType());
            } else if (shape instanceof GeneralPath) {
                stream.writeObject(GeneralPath.class);
                final PathIterator pi = shape.getPathIterator(null);
                final float[] args = new float[6];
                stream.writeBoolean(pi.isDone());
                while (!pi.isDone()) {
                    final int type = pi.currentSegment(args);
                    stream.writeInt(type);
                    // TODO: could write this to only stream the values
                    // required for the segment type
                    for (int i = 0; i < 6; i++) {
                        stream.writeFloat(args[i]);
                    }
                    stream.writeInt(pi.getWindingRule());
                    pi.next();
                    stream.writeBoolean(pi.isDone());
                }
            } else {
                stream.writeObject(shape.getClass());
                stream.writeObject(shape);
            }
        } else {
            stream.writeBoolean(true);
        }
    }
