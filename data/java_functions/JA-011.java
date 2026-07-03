    public int compare(Object lhsObj, Object rhsObj) {
        InstantConverter conv = ConverterManager.getInstance().getInstantConverter(lhsObj);
        Chronology lhsChrono = conv.getChronology(lhsObj, (Chronology) null);
        long lhsMillis = conv.getInstantMillis(lhsObj, lhsChrono);
        
        // handle null==null and other cases where objects are the same
        // but only do this after checking the input is valid
        if (lhsObj == rhsObj) {
            return 0;
        }
        
        conv = ConverterManager.getInstance().getInstantConverter(rhsObj);
        Chronology rhsChrono = conv.getChronology(rhsObj, (Chronology) null);
        long rhsMillis = conv.getInstantMillis(rhsObj, rhsChrono);

        if (iLowerLimit != null) {
            lhsMillis = iLowerLimit.getField(lhsChrono).roundFloor(lhsMillis);
            rhsMillis = iLowerLimit.getField(rhsChrono).roundFloor(rhsMillis);
        }

        if (iUpperLimit != null) {
            lhsMillis = iUpperLimit.getField(lhsChrono).remainder(lhsMillis);
            rhsMillis = iUpperLimit.getField(rhsChrono).remainder(rhsMillis);
        }

        if (lhsMillis < rhsMillis) {
            return -1;
        } else if (lhsMillis > rhsMillis) {
            return 1;
        } else {
            return 0;
        }
    }
