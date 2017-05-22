package contact_generator;

/**
 * Student ID: 1507342
 *
 * @author Michal Sitarz
 */
public class HtmlElement {

    private String tagName;
    private String tagAttributes;
    private String elementContent;
    private boolean tagClose;

    public HtmlElement() {
        tagName = "";
        tagAttributes = "";
        elementContent = "";
        tagClose = true;
    }

    public String fullElement() {

        String fullElement;

        if (tagClose) {
            //tag with closing
            if (tagAttributes != "") {
                //tag with attributes
                fullElement = "<" + tagName + " "
                        + tagAttributes + ">"
                        + elementContent
                        + "</" + tagName + ">";
            } else {
                //tag with NO attributes
                fullElement = "<" + tagName + ">"
                        + elementContent
                        + "</" + tagName + ">";
            }

        } else {
            //tag with NO closing
            if (tagAttributes != "") {
                //tag with attributes
                fullElement = "<" + tagName + " "
                        + tagAttributes + ">"
                        + elementContent
                        + "</" + tagName + ">";
            } else {
                //tag with NO attributes
                fullElement = "<" + tagName + ">"
                        + elementContent
                        + "</" + tagName + ">";
            }
        }

        return fullElement;
    }

    public String simpleTag() {

        String simpleTag;
        simpleTag = "</" + tagName + ">\n";

        return simpleTag;
    }

    // SETters:
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public void setTagAttributes(String tagAttributes) {
        this.tagAttributes = tagAttributes;
    }

    public void setElementContent(String elementContent) {
        this.elementContent = elementContent;
    }

    public void setTagClose(boolean tagClose) {
        this.tagClose = tagClose;
    }

    // GETters:
    public String getTagName() {
        return tagName;
    }

    public String getTagAttributes() {
        return tagAttributes;
    }

    public String getElementContent() {
        return elementContent;
    }

    public boolean isTagClose() {
        return tagClose;
    }

}
