  public JsonElement serialize(Message src, Type typeOfSrc, JsonSerializationContext context) {
    JsonObject ret = new JsonObject();
    Map<FieldDescriptor, Object> fields = src.getAllFields();

    for (Map.Entry<FieldDescriptor, Object> fieldPair : fields.entrySet()) {
      FieldDescriptor desc = fieldPair.getKey();
      String name = getCustSerializedName(desc);

      if (desc.getType() == ENUM_TYPE) {
        // Enum collections are also returned as ENUM_TYPE
        if (fieldPair.getValue() instanceof Collection) {
          // Build the array to avoid infinite loop
          JsonArray array = new JsonArray();
          @SuppressWarnings("unchecked")
          Collection<EnumValueDescriptor> enumDescs =
              (Collection<EnumValueDescriptor>) fieldPair.getValue();
          for (EnumValueDescriptor enumDesc : enumDescs) {
            array.add(context.serialize(getEnumValue(enumDesc)));
            ret.add(name, array);
          }
        } else {
          EnumValueDescriptor enumDesc = ((EnumValueDescriptor) fieldPair.getValue());
          ret.add(name, context.serialize(getEnumValue(enumDesc)));
        }
      } else {
        ret.add(name, context.serialize(fieldPair.getValue()));
      }
    }
    return ret;
  }
