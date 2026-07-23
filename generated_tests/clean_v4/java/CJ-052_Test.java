import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Tag;
import org.jsoup.nodes.Attributes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementCssSelectorTest {

    @Test
    public void testCssSelectorWithUniqueId() {
        Element element = new Element("div", "http://example.com");
        element.attr("id", "uniqueId");
        assertEquals("#uniqueId", element.cssSelector());
    }

    @Test
    public void testCssSelectorWithoutUniqueIdButWithParent() {
        Element parent = new Element("div", "http://example.com");
        Element child = new Element("span", "http://example.com");
        parent.appendChild(child);
        child.attr("class", "childClass");
        assertEquals("div > span.childClass", child.cssSelector());
    }

    @Test
    public void testCssSelectorWithMultipleLevels() {
        Element grandparent = new Element("div", "http://example.com");
        Element parent = new Element("section", "http://example.com");
        Element child = new Element("p", "http://example.com");
        grandparent.appendChild(parent);
        parent.appendChild(child);
        child.attr("class", "childClass");
        assertEquals("div > section > p.childClass", child.cssSelector());
    }

    @Test
    public void testCssSelectorWithNoParent() {
        Element element = new Element("p", "http://example.com");
        assertEquals("p", element.cssSelector());
    }

    @Test
    public void testCssSelectorWithEmptyIdAndClass() {
        Element element = new Element("div", "http://example.com");
        element.attr("class", "");
        assertEquals("div", element.cssSelector());
    }

    @Test
    public void testCssSelectorWithNullParent() {
        Element element = new Element("div", "http://example.com");
        element.parentNode = null; // Simulating no parent
        assertEquals("div", element.cssSelector());
    }
}