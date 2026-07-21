package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.TokeniserState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.HashMap;

public class XmlTreeBuilderTest {
    private XmlTreeBuilder xmlTreeBuilder;
    private Element mockElement;
    private TokeniserState mockTextState;

    @BeforeEach
    void setUp() {
        xmlTreeBuilder = new XmlTreeBuilder();
        mockElement = mock(Element.class);
        mockTextState = mock(TokeniserState.class);
    }

    @Test
    void testInitialiseParseFragment_NullContext() {
        xmlTreeBuilder.initialiseParseFragment(null);
        // No exception should be thrown and method should return
    }

    @Test
    void testInitialiseParseFragment_ValidContext_NoAttributes() {
        when(mockElement.tag()).thenReturn(mock(Tag.class));
        when(mockElement.parents()).thenReturn(new Elements());
        when(mockElement.attributesSize()).thenReturn(0);
        when(mockElement.tag().textState()).thenReturn(mockTextState);

        xmlTreeBuilder.initialiseParseFragment(mockElement);
        // Verify that the tokeniser transitions to the text state
        verify(xmlTreeBuilder.tokeniser).transition(mockTextState);
    }

    @Test
    void testInitialiseParseFragment_ValidContext_WithAttributes() {
        when(mockElement.tag()).thenReturn(mock(Tag.class));
        when(mockElement.parents()).thenReturn(new Elements());
        when(mockElement.attributesSize()).thenReturn(1);
        when(mockElement.tag().textState()).thenReturn(mockTextState);
        
        Attributes mockAttributes = mock(Attributes.class);
        when(mockElement.attributes()).thenReturn(mockAttributes);
        
        xmlTreeBuilder.initialiseParseFragment(mockElement);
        // Verify that the tokeniser transitions to the text state
        verify(xmlTreeBuilder.tokeniser).transition(mockTextState);
        // Verify that processNamespaces is called
        verify(xmlTreeBuilder).processNamespaces(mockAttributes, new HashMap<>());
    }
}