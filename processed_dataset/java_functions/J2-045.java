  public static boolean isWrapperType(Type type) {
    return type == Integer.class
        || type == Float.class
        || type == Byte.class
        || type == Double.class
        || type == Long.class
        || type == Character.class
        || type == Boolean.class
        || type == Short.class
        || type == Void.class;
  }
