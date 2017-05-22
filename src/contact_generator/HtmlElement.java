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

    /**
     *
     */
    public HtmlElement() {
        tagName = "";
        tagAttributes = "";
        elementContent = "";
        tagClose = true;
    }

    /**
     *
     * @return
     */
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

    /**
     *
     * @return
     */
    public String simpleTag() {

        String simpleTag;
        simpleTag = "</" + tagName + ">\n";

        return simpleTag;
    }

    // SETters:

    /**
     *
     * @param tagName
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     *
     * @param tagAttributes
     */
    public void setTagAttributes(String tagAttributes) {
        this.tagAttributes = tagAttributes;
    }

    /**
     *
     * @param elementContent
     */
    public void setElementContent(String elementContent) {
        this.elementContent = elementContent;
    }

    /**
     *
     * @param tagClose
     */
    public void setTagClose(boolean tagClose) {
        this.tagClose = tagClose;
    }

    // GETters:

    /**
     *
     * @return
     */
    public String getTagName() {
        return tagName;
    }

    /**
     *
     * @return
     */
    public String getTagAttributes() {
        return tagAttributes;
    }

    /**
     *
     * @return
     */
    public String getElementContent() {
        return elementContent;
    }

    /**
     *
     * @return
     */
    public boolean isTagClose() {
        return tagClose;
    }

}
