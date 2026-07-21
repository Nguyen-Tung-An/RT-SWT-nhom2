        private AVLNode<E> balance() {
            switch (heightRightMinusLeft()) {
            case 1:
            case 0:
            case -1:
                return this;
            case -2:
                if (left.heightRightMinusLeft() > 0) {
                    setLeft(left.rotateLeft(), null);
                }
                return rotateRight();
            case 2:
                if (right.heightRightMinusLeft() < 0) {
                    setRight(right.rotateRight(), null);
                }
                return rotateLeft();
            default:
                throw new IllegalStateException("tree inconsistent.");
            }
        }
