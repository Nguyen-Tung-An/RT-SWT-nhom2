        public void head(org.jsoup.nodes.Node source, int depth) {
            if (source instanceof org.jsoup.nodes.Element) {
                org.jsoup.nodes.Element sourceEl = (org.jsoup.nodes.Element) source;
                @Nullable String namespace = namespaceAware ? w3cNamespace(sourceEl) : null;
                String tagName = Normalizer.xmlSafeTagName(sourceEl.tagName());
                try {
                    // use an empty namespace if none is present but the tag name has a prefix
                    String imputedNamespace = namespace == null && tagName.contains(":") ? "" : namespace;
                    Element el = doc.createElementNS(imputedNamespace, tagName);
                    copyAttributes(sourceEl, el);
                    append(el, sourceEl);
                    if (sourceEl == contextElement)
                        doc.setUserData(ContextNodeProperty, el, null);
                    dest = el; // descend
                } catch (DOMException e) {
                    // If the Normalize didn't get it XML / W3C safe, inserts as plain text
                    append(doc.createTextNode("<" + tagName + ">"), sourceEl);
                }
            } else if (source instanceof org.jsoup.nodes.TextNode) {
                org.jsoup.nodes.TextNode sourceText = (org.jsoup.nodes.TextNode) source;
                Text text = doc.createTextNode(sourceText.getWholeText());
                append(text, sourceText);
            } else if (source instanceof org.jsoup.nodes.Comment) {
                org.jsoup.nodes.Comment sourceComment = (org.jsoup.nodes.Comment) source;
                Comment comment = doc.createComment(sourceComment.getData());
                append(comment, sourceComment);
            } else if (source instanceof org.jsoup.nodes.DataNode) {
                org.jsoup.nodes.DataNode sourceData = (org.jsoup.nodes.DataNode) source;
                Text node = doc.createTextNode(sourceData.getWholeData());
                append(node, sourceData);
            } else {
                // unhandled. note that doctype is not handled here - rather it is used in the initial doc creation
            }
        }
