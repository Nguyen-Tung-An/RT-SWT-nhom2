    public Safelist removeAttributes(String tag, String... attributes) {
        Validate.notEmpty(tag);
        Validate.notNull(attributes);
        Validate.isTrue(attributes.length > 0, "No attribute names supplied.");

        TagName tagName = TagName.valueOf(tag);
        Set<AttributeKey> attributeSet = new HashSet<>();
        for (String key : attributes) {
            Validate.notEmpty(key);
            attributeSet.add(AttributeKey.valueOf(key));
        }
        if(tagNames.contains(tagName) && this.attributes.containsKey(tagName)) { // Only look in sub-maps if tag was allowed
            Set<AttributeKey> currentSet = this.attributes.get(tagName);
            currentSet.removeAll(attributeSet);

            if(currentSet.isEmpty()) // Remove tag from attribute map if no attributes are allowed for tag
                this.attributes.remove(tagName);
        }
        if(tag.equals(All)) { // Attribute needs to be removed from all individually set tags
            Iterator<Map.Entry<TagName, Set<AttributeKey>>> it = this.attributes.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<TagName, Set<AttributeKey>> entry = it.next();
                Set<AttributeKey> currentSet = entry.getValue();
                currentSet.removeAll(attributeSet);
                if(currentSet.isEmpty()) // Remove tag from attribute map if no attributes are allowed for tag
                    it.remove();
            }
        }
        return this;
    }
