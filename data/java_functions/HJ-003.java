        @Override boolean process(Token t, HtmlTreeBuilder tb) {
            if (isWhitespace(t)) {
                return true; // ignore whitespace until we get the first content
            } else if (t.isComment()) {
                tb.insertCommentNode(t.asComment());
            } else if (t.isDoctype()) {
                // todo: parse error check on expected doctypes
                Token.Doctype d = t.asDoctype();
                DocumentType doctype = new DocumentType(
                    tb.settings.normalizeTag(d.getName()), d.getPublicIdentifier(), d.getSystemIdentifier());
                doctype.setPubSysKey(d.getPubSysKey());
                tb.getDocument().appendChild(doctype);
                tb.onNodeInserted(doctype);
                // todo: quirk state check on more doctype ids, if deemed useful (most are ancient legacy and presumably irrelevant)
                if (d.isForceQuirks() || !doctype.name().equals("html") || doctype.publicId().equalsIgnoreCase("HTML"))
                    tb.getDocument().quirksMode(Document.QuirksMode.quirks);
                tb.transition(BeforeHtml);
            } else {
                // todo: check not iframe srcdoc
                tb.getDocument().quirksMode(Document.QuirksMode.quirks); // missing doctype
                tb.transition(BeforeHtml);
                return tb.process(t); // re-process token
            }
            return true;
        }
