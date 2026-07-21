    void initialiseParseFragment(@Nullable Element context) {
        super.initialiseParseFragment(context);
        if (context == null) return;

        // transition to the tag's text state if available
        TokeniserState textState = context.tag().textState();
        if (textState != null) tokeniser.transition(textState);

        // reconstitute the namespace stack by traversing the element and its parents (top down)
        Elements chain = context.parents();
        chain.add(0, context);
        for (int i = chain.size() - 1; i >= 0; i--) {
            Element el = chain.get(i);
            HashMap<String, String> namespaces = new HashMap<>(namespacesStack.peek());
            namespacesStack.push(namespaces);
            if (el.attributesSize() > 0) {
                processNamespaces(el.attributes(), namespaces);
            }
        }
    }
