    public static void writeKeyedValues2D(KeyedValues2D data, Writer writer) 
            throws IOException {
        Args.nullNotPermitted(data, "data");
        Args.nullNotPermitted(writer, "writer");
        List<Comparable<?>> columnKeys = data.getColumnKeys();
        List<Comparable<?>> rowKeys = data.getRowKeys();
        writer.write("{");
        if (!columnKeys.isEmpty()) {
            writer.write("\"columnKeys\": [");
            boolean first = true;
            for (Comparable<?> columnKey : columnKeys) {
                if (!first) {
                    writer.write(", ");
                } else {
                    first = false;
                }
                writer.write(JSONValue.toJSONString(columnKey.toString()));
            }
            writer.write("]");
        }
        if (!rowKeys.isEmpty()) {
            writer.write(", \"rows\": [");
            boolean firstRow = true;
            for (Comparable<?> rowKey : rowKeys) {   
                if (!firstRow) {
                    writer.write(", [");
                } else {
                    writer.write("[");
                    firstRow = false;
                }
                // write the row data 
                writer.write(JSONValue.toJSONString(rowKey.toString()));
                writer.write(", [");
                boolean first = true;
                for (Comparable<?> columnKey : columnKeys) {
                    if (!first) {
                        writer.write(", ");
                    } else {
                        first = false;
                    }
                    writer.write(JSONValue.toJSONString(data.getValue(rowKey, 
                            columnKey)));
                }
                writer.write("]]");
            }
            writer.write("]");
        }
        writer.write("}");    
    }
