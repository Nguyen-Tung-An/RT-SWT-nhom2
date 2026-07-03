    protected EntityCollection drawTitle(Title t, Graphics2D g2,
                                         Rectangle2D area, boolean entities) {

        Args.nullNotPermitted(t, "t");
        Args.nullNotPermitted(area, "area");
        Rectangle2D titleArea;
        RectangleEdge position = t.getPosition();
        double ww = area.getWidth();
        if (ww <= 0.0) {
            return null;
        }
        double hh = area.getHeight();
        if (hh <= 0.0) {
            return null;
        }
        RectangleConstraint constraint = new RectangleConstraint(ww,
                new Range(0.0, ww), LengthConstraintType.RANGE, hh,
                new Range(0.0, hh), LengthConstraintType.RANGE);
        Object retValue = null;
        BlockParams p = new BlockParams();
        p.setGenerateEntities(entities);
        switch (position) {
            case TOP: {
                Size2D size = t.arrange(g2, constraint);
                titleArea = createAlignedRectangle2D(size, area,
                        t.getHorizontalAlignment(), VerticalAlignment.TOP);
                retValue = t.draw(g2, titleArea, p);
                area.setRect(area.getX(), Math.min(area.getY() + size.height,
                        area.getMaxY()), area.getWidth(), Math.max(area.getHeight()
                        - size.height, 0));
                break;
            }
            case BOTTOM: {
                Size2D size = t.arrange(g2, constraint);
                titleArea = createAlignedRectangle2D(size, area,
                        t.getHorizontalAlignment(), VerticalAlignment.BOTTOM);
                retValue = t.draw(g2, titleArea, p);
                area.setRect(area.getX(), area.getY(), area.getWidth(),
                        area.getHeight() - size.height);
                break;
            }
            case RIGHT: {
                Size2D size = t.arrange(g2, constraint);
                titleArea = createAlignedRectangle2D(size, area,
                        HorizontalAlignment.RIGHT, t.getVerticalAlignment());
                retValue = t.draw(g2, titleArea, p);
                area.setRect(area.getX(), area.getY(), area.getWidth()
                        - size.width, area.getHeight());
                break;
            }
            case LEFT: {
                Size2D size = t.arrange(g2, constraint);
                titleArea = createAlignedRectangle2D(size, area,
                        HorizontalAlignment.LEFT, t.getVerticalAlignment());
                retValue = t.draw(g2, titleArea, p);
                area.setRect(area.getX() + size.width, area.getY(), area.getWidth()
                        - size.width, area.getHeight());
                break;
            }
            default: {
                throw new RuntimeException("Unrecognised title position.");
            }
        }
        EntityCollection result = null;
        if (retValue instanceof EntityBlockResult) {
            EntityBlockResult ebr = (EntityBlockResult) retValue;
            result = ebr.getEntityCollection();
        }
        return result;
    }
