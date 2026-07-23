    public String cssSelector() {
        Document ownerDoc = ownerDocument();
        String idSel = uniqueIdSelector(ownerDoc);
        if (!idSel.isEmpty()) return idSel;

        // No unique ID, work up the parent stack and find either a unique ID to hang from, or just a GP > Parent > Child chain
        StringBuilder selector = StringUtil.borrowBuilder();
        Element el = this;
        while (el != null && !(el instanceof Document)) {
            idSel = el.uniqueIdSelector(ownerDoc);
            if (!idSel.isEmpty()) {
                selector.insert(0, idSel);
                break; // found a unique ID to use as ancestor; stop
            }
            selector.insert(0, el.cssSelectorComponent());
            el = el.parent();
        }
        return StringUtil.releaseBuilder(selector);
    }
