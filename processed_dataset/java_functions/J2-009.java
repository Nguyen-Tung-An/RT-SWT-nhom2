    getInstance(final Field<T> field, final int nSteps) {
        synchronized(CACHE) {
            Map<Field<? extends RealFieldElement<?>>,
                      AdamsNordsieckFieldTransformer<? extends RealFieldElement<?>>> map = CACHE.get(nSteps);
            if (map == null) {
                map = new HashMap<>();
                CACHE.put(nSteps, map);
            }
            @SuppressWarnings("unchecked")
            AdamsNordsieckFieldTransformer<T> t = (AdamsNordsieckFieldTransformer<T>) map.get(field);
            if (t == null) {
                t = new AdamsNordsieckFieldTransformer<>(field, nSteps);
                map.put(field, t);
            }
            return t;
        }
    }
