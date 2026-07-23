package com.google.gson.protobuf;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.protobuf.Message;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.EnumValueDescriptor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProtoTypeAdapterTest {

    private ProtoTypeAdapter protoTypeAdapter;
    private JsonSerializationContext context;
    private Message message;

    @BeforeEach
    public void setUp() {
        protoTypeAdapter = new ProtoTypeAdapter(null, null, null, null, null, false);
        context = mock(JsonSerializationContext.class);
        message = mock(Message.class);
    }

    @Test
    public void testSerializeWithSingleEnumField() {
        FieldDescriptor fieldDescriptor = mock(FieldDescriptor.class);
        EnumValueDescriptor enumValueDescriptor = mock(EnumValueDescriptor.class);
        when(fieldDescriptor.getType()).thenReturn(FieldDescriptor.Type.ENUM);
        when(enumValueDescriptor.getName()).thenReturn("ENUM_VALUE");
        
        Map<FieldDescriptor, Object> fields = new HashMap<>();
        fields.put(fieldDescriptor, enumValueDescriptor);
        
        when(message.getAllFields()).thenReturn(fields);
        when(context.serialize("ENUM_VALUE")).thenReturn(new JsonElement() {
            @Override
            public JsonObject getAsJsonObject() {
                return new JsonObject();
            }
        });

        JsonElement result = protoTypeAdapter.serialize(message, (Type) Message.class, context);
        assertEquals(new JsonObject(), result.getAsJsonObject());
    }

    @Test
    public void testSerializeWithEnumCollectionField() {
        FieldDescriptor fieldDescriptor = mock(FieldDescriptor.class);
        EnumValueDescriptor enumValueDescriptor1 = mock(EnumValueDescriptor.class);
        EnumValueDescriptor enumValueDescriptor2 = mock(EnumValueDescriptor.class);
        when(fieldDescriptor.getType()).thenReturn(FieldDescriptor.Type.ENUM);
        when(enumValueDescriptor1.getName()).thenReturn("ENUM_VALUE_1");
        when(enumValueDescriptor2.getName()).thenReturn("ENUM_VALUE_2");

        Map<FieldDescriptor, Object> fields = new HashMap<>();
        fields.put(fieldDescriptor, Arrays.asList(enumValueDescriptor1, enumValueDescriptor2));

        when(message.getAllFields()).thenReturn(fields);
        when(context.serialize("ENUM_VALUE_1")).thenReturn(new JsonElement() {
            @Override
            public JsonObject getAsJsonObject() {
                return new JsonObject();
            }
        });
        when(context.serialize("ENUM_VALUE_2")).thenReturn(new JsonElement() {
            @Override
            public JsonObject getAsJsonObject() {
                return new JsonObject();
            }
        });

        JsonElement result = protoTypeAdapter.serialize(message, (Type) Message.class, context);
        assertEquals(new JsonObject(), result.getAsJsonObject());
    }

    @Test
    public void testSerializeWithNonEnumField() {
        FieldDescriptor fieldDescriptor = mock(FieldDescriptor.class);
        when(fieldDescriptor.getType()).thenReturn(FieldDescriptor.Type.STRING);
        
        Map<FieldDescriptor, Object> fields = new HashMap<>();
        fields.put(fieldDescriptor, "Test String");
        
        when(message.getAllFields()).thenReturn(fields);
        when(context.serialize("Test String")).thenReturn(new JsonElement() {
            @Override
            public JsonObject getAsJsonObject() {
                return new JsonObject();
            }
        });

        JsonElement result = protoTypeAdapter.serialize(message, (Type) Message.class, context);
        assertEquals(new JsonObject(), result.getAsJsonObject());
    }
}