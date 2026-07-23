package com.google.gson.protobuf;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.protobuf.Message;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProtoTypeAdapterTest {

    @Test
    void testSerialize_EnumField() {
        // Arrange
        ProtoTypeAdapter adapter = new ProtoTypeAdapter();
        Message message = Mockito.mock(Message.class);
        JsonSerializationContext context = Mockito.mock(JsonSerializationContext.class);
        FieldDescriptor fieldDescriptor = Mockito.mock(FieldDescriptor.class);
        EnumValueDescriptor enumValueDescriptor = Mockito.mock(EnumValueDescriptor.class);
        
        Mockito.when(fieldDescriptor.getType()).thenReturn(FieldDescriptor.Type.ENUM);
        Mockito.when(enumValueDescriptor.getName()).thenReturn("ENUM_VALUE");
        Mockito.when(context.serialize("ENUM_VALUE")).thenReturn(new JsonElement() {});
        
        Map<FieldDescriptor, Object> fields = new HashMap<>();
        fields.put(fieldDescriptor, enumValueDescriptor);
        Mockito.when(message.getAllFields()).thenReturn(fields);
        
        // Act
        JsonElement result = adapter.serialize(message, (Type) Message.class, context);
        
        // Assert
        assertEquals(new JsonObject().add("ENUM_FIELD", context.serialize("ENUM_VALUE")), result);
    }

    @Test
    void testSerialize_EnumCollectionField() {
        // Arrange
        ProtoTypeAdapter adapter = new ProtoTypeAdapter();
        Message message = Mockito.mock(Message.class);
        JsonSerializationContext context = Mockito.mock(JsonSerializationContext.class);
        FieldDescriptor fieldDescriptor = Mockito.mock(FieldDescriptor.class);
        EnumValueDescriptor enumValueDescriptor1 = Mockito.mock(EnumValueDescriptor.class);
        EnumValueDescriptor enumValueDescriptor2 = Mockito.mock(EnumValueDescriptor.class);
        
        Mockito.when(fieldDescriptor.getType()).thenReturn(FieldDescriptor.Type.ENUM);
        Mockito.when(enumValueDescriptor1.getName()).thenReturn("ENUM_VALUE_1");
        Mockito.when(enumValueDescriptor2.getName()).thenReturn("ENUM_VALUE_2");
        Mockito.when(context.serialize("ENUM_VALUE_1")).thenReturn(new JsonElement() {});
        Mockito.when(context.serialize("ENUM_VALUE_2")).thenReturn(new JsonElement() {});
        
        Map<FieldDescriptor, Object> fields = new HashMap<>();
        fields.put(fieldDescriptor, Arrays.asList(enumValueDescriptor1, enumValueDescriptor2));
        Mockito.when(message.getAllFields()).thenReturn(fields);
        
        // Act
        JsonElement result = adapter.serialize(message, (Type) Message.class, context);
        
        // Assert
        JsonArray expectedArray = new JsonArray();
        expectedArray.add(context.serialize("ENUM_VALUE_1"));
        expectedArray.add(context.serialize("ENUM_VALUE_2"));
        JsonObject expectedResult = new JsonObject();
        expectedResult.add("ENUM_FIELD", expectedArray);
        assertEquals(expectedResult, result);
    }

    @Test
    void testSerialize_NonEnumField() {
        // Arrange
        ProtoTypeAdapter adapter = new ProtoTypeAdapter();
        Message message = Mockito.mock(Message.class);
        JsonSerializationContext context = Mockito.mock(JsonSerializationContext.class);
        FieldDescriptor fieldDescriptor = Mockito.mock(FieldDescriptor.class);
        
        Mockito.when(fieldDescriptor.getType()).thenReturn(FieldDescriptor.Type.STRING);
        Mockito.when(context.serialize("testValue")).thenReturn(new JsonElement() {});
        
        Map<FieldDescriptor, Object> fields = new HashMap<>();
        fields.put(fieldDescriptor, "testValue");
        Mockito.when(message.getAllFields()).thenReturn(fields);
        
        // Act
        JsonElement result = adapter.serialize(message, (Type) Message.class, context);
        
        // Assert
        JsonObject expectedResult = new JsonObject();
        expectedResult.add("FIELD_NAME", context.serialize("testValue"));
        assertEquals(expectedResult, result);
    }
}