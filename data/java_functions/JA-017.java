        public boolean isCompatibleValue(Object val) {
            switch (intKey()) {
                case 0:
                    return val == null || val instanceof String 
                            || val instanceof Map;
                case 1:
                    return val == null || val instanceof Object;
                default:
                    throw new RuntimeException("Not possible!");
            }
        }
