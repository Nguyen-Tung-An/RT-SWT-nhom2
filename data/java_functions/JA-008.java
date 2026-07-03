    public static void main(String... args) throws IOException {
        Validate.isTrue(args.length == 1 || args.length == 2, "usage: java -jar jsoup-examples.jar url [selector]");
        final String url = args[0];
        final String selector = args.length == 2 ? args[1] : null;

        // fetch the specified URL and parse to a HTML DOM:
        Connection session = Jsoup.newSession() // .newSession creates a session to maintain settings and cookies across multiple requests
            .userAgent(userAgent)
            .timeout(timeout);
        Document doc = session.newRequest(url).get(); // .get executes a GET request, and parses the result

        if (selector != null) {
            Elements elements = doc.select(selector); // get each element that matches the CSS selector
            elements = trimParents(elements); // trim out elements that descend from a previously seen element
            for (Element element : elements) {
                String plainText = getPlainText(element); // format that element to plain text
                System.out.println(plainText);
            }
        } else { // format the whole doc
            String plainText = getPlainText(doc);
            System.out.println(plainText);
        }
    }
