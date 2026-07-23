package com.google.gson.protobuf;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.protobuf.Message;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProtoTypeAdapterTest {

    @Test
    void testSerialize_EmptyMessage() {
        Message message = mock(Message.class);
        when(message.getAllFields()).thenReturn(Collections.emptyMap());
        JsonSerializationContext context = mock(JsonSerializationContext.class);
        ProtoTypeAdapter adapter = new ProtoTypeAdapter();
        
        JsonElement result = adapter.serialize(message, Object.class, context);
        assertTrue(result.isJsonObject());
        assertTrue(result.getAsJsonObject().entrySet().isEmpty());
    }

    @Test
    void testSerialize_SingleField() {
        Message message = mock(Message.class);
        FieldDescriptor fieldDescriptor = mock(FieldDescriptor.class);
        when(fieldDescriptor.getType()).thenReturn(FieldDescriptor.Type.STRING);
        when(fieldDescriptor.getName()).thenReturn("name");
        
        Map<FieldDescriptor, Object> fields = new HashMap<>();
        fields.put(fieldDescriptor, "value");
        when(message.getAllFields()).thenReturn(fields);
        
        JsonSerializationContext context = mock(JsonSerializationContext.class);
        when(context.serialize("value")).thenReturn(new JsonElement() {
            @Override
            public JsonObject getAsJsonObject() {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("value", "value");
                return jsonObject;
            }
        });
        
        ProtoTypeAdapter adapter = new ProtoTypeAdapter();
        JsonElement result = adapter.serialize(message, Object.class, context);
        
        assertTrue(result.isJsonObject());
        assertEquals("value", result.getAsJsonObject().get("name").getAsString());
    }

    @Test
    void testSerialize_EnumField() {
        Message message = mock(Message.class);
        FieldDescriptor fieldDescriptor = mock(FieldDescriptor.class);
        when(fieldDescriptor.getType()).thenReturn(FieldDescriptor.Type.ENUM);
        when(fieldDescriptor.getName()).thenReturn("enumField");
        
        EnumValueDescriptor enumValueDescriptor = mock(EnumValueDescriptor.class);
        when(enumValueDescriptor.getName()).thenReturn("ENUM_VALUE");
        
        Map<FieldDescriptor, Object> fields = new HashMap<>();
        fields.put(fieldDescriptor, enumValueDescriptor);
        when(message.getAllFields()).thenReturn(fields);
        
        JsonSerializationContext context = mock(JsonSerializationContext.class);
        when(context.serialize(any())).thenReturn(new JsonElement() {
            @Override
            public JsonObject getAsJsonObject() {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("enumValue", "ENUM_VALUE");
                return jsonObject;
            }
        });
        
        ProtoTypeAdapter adapter = new ProtoTypeAdapter();
        JsonElement result = adapter.serialize(message, Object.class, context);
        
        assertTrue(result.isJsonObject());
        assertEquals("ENUM_VALUE", result.getAsJsonObject().get("enumField").getAsString());
    }

    @Test
    void testSerialize_EnumCollectionField() {
        Message message = mock(Message.class);
        FieldDescriptor fieldDescriptor = mock(FieldDescriptor.class);
        when(fieldDescriptor.getType()).thenReturn(FieldDescriptor.Type.ENUM);
        when(fieldDescriptor.getName()).thenReturn("enumCollectionField");
        
        EnumValueDescriptor enumValueDescriptor1 = mock(EnumValueDescriptor.class);
        when(enumValueDescriptor1.getName()).thenReturn("ENUM_VALUE_1");
        EnumValueDescriptor enumValueDescriptor2 = mock(EnumValueDescriptor.class);
        when(enumValueDescriptor2.getName()).thenReturn("ENUM_VALUE_2");
        
        Map<FieldDescriptor, Object> fields = new HashMap<>();
        fields.put(fieldDescriptor, Arrays.asList(enumValueDescriptor1, enumValueDescriptor2));
        when(message.getAllFields()).thenReturn(fields);
        
        JsonSerializationContext context = mock(JsonSerializationContext.class);
        when(context.serialize(any())).thenReturn(new JsonElement() {
            @Override
            public JsonObject getAsJsonObject() {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("enumValue", "ENUM_VALUE");
                return jsonObject;
            }
        });
        
        ProtoTypeAdapter adapter = new ProtoTypeAdapter();
        JsonElement result = adapter.serialize(message, Object.class, context);
        
        assertTrue(result.isJsonObject());
        assertTrue(result.getAsJsonObject().has("enumCollectionField"));
        assertTrue(result.getAsJsonObject().get("enumCollectionField").isJsonArray());
        assertEquals(2, result.getAsJsonObject().get("enumCollectionField").getAsJsonArray().size());
    }
}