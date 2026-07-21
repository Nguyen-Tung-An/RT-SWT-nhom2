package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class HtmlTreeBuilderStateTest {

    @Test
    void testProcess_WhitespaceToken() {
        Token whitespaceToken = mock(Token.class);
        when(whitespaceToken.isComment()).thenReturn(false);
        when(whitespaceToken.isDoctype()).thenReturn(false);
        when(isWhitespace(whitespaceToken)).thenReturn(true);

        HtmlTreeBuilder tb = mock(HtmlTreeBuilder.class);
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();

        boolean result = state.process(whitespaceToken, tb);
        assertTrue(result);
        verify(tb, never()).insertCommentNode(any());
        verify(tb, never()).getDocument().appendChild(any());
    }

    @Test
    void testProcess_CommentToken() {
        Token commentToken = mock(Token.class);
        when(commentToken.isComment()).thenReturn(true);
        when(commentToken.isDoctype()).thenReturn(false);
        when(isWhitespace(commentToken)).thenReturn(false);

        HtmlTreeBuilder tb = mock(HtmlTreeBuilder.class);
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();

        state.process(commentToken, tb);
        verify(tb).insertCommentNode(commentToken.asComment());
    }

    @Test
    void testProcess_DoctypeToken() {
        Token doctypeToken = mock(Token.class);
        when(doctypeToken.isComment()).thenReturn(false);
        when(doctypeToken.isDoctype()).thenReturn(true);
        when(doctypeToken.asDoctype()).thenReturn(mock(Token.Doctype.class));
        when(isWhitespace(doctypeToken)).thenReturn(false);

        HtmlTreeBuilder tb = mock(HtmlTreeBuilder.class);
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();

        state.process(doctypeToken, tb);
        verify(tb).getDocument().appendChild(any(DocumentType.class));
        verify(tb).transition(HtmlTreeBuilderState.BeforeHtml);
    }

    @Test
    void testProcess_OtherToken() {
        Token otherToken = mock(Token.class);
        when(otherToken.isComment()).thenReturn(false);
        when(otherToken.isDoctype()).thenReturn(false);
        when(isWhitespace(otherToken)).thenReturn(false);

        HtmlTreeBuilder tb = mock(HtmlTreeBuilder.class);
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();

        state.process(otherToken, tb);
        verify(tb).getDocument().quirksMode(Document.QuirksMode.quirks);
        verify(tb).transition(HtmlTreeBuilderState.BeforeHtml);
        verify(tb).process(otherToken);
    }
}