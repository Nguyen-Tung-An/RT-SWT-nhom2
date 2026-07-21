    public static DateTimeZone readFrom(DataInput in, String id) throws IOException {
        switch (in.readUnsignedByte()) {
        case 'F':
            DateTimeZone fixed = new FixedDateTimeZone
                (id, in.readUTF(), (int)readMillis(in), (int)readMillis(in));
            if (fixed.equals(DateTimeZone.UTC)) {
                fixed = DateTimeZone.UTC;
            }
            return fixed;
        case 'C':
            return CachedDateTimeZone.forZone(PrecalculatedZone.readFrom(in, id));
        case 'P':
            return PrecalculatedZone.readFrom(in, id);
        default:
            throw new IOException("Invalid encoding");
        }
    }
