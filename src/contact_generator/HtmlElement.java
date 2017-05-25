package contact_generator;

/**
 * Student ID: 1507342
 *
 * @author Michal Sitarz
 */
public class HtmlElement {
    
    //global fields
    private String tagName;
    private String tagAttributes;
    private String elementContent;
    private boolean tagClose;

    /**
     * default CTOR
     */
    public HtmlElement() {
        tagName = "";
        tagAttributes = "";
        elementContent = "";
        tagClose = true;
    }

    /**
     * method to create and return
     * full html code for the single element
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
     * method to create and return
     * simple tag, like: br or hr
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
     * SETter for:
     * 
     * @param tagName
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * SETter for:
     *
     * @param tagAttributes
     */
    public void setTagAttributes(String tagAttributes) {
        this.tagAttributes = tagAttributes;
    }

    /**
     * SETter for:
     *
     * @param elementContent
     */
    public void setElementContent(String elementContent) {
        this.elementContent = elementContent;
    }

    /**
     * SETter for:
     *
     * @param tagClose
     */
    public void setTagClose(boolean tagClose) {
        this.tagClose = tagClose;
    }

    // GETters:

    /**
     * GETter for:
     *
     * @return
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * GETter for:
     *
     * @return
     */
    public String getTagAttributes() {
        return tagAttributes;
    }

    /**
     * GETter for:
     *
     * @return
     */
    public String getElementContent() {
        return elementContent;
    }

    /**
     * GETter for:
     *
     * @return
     */
    public boolean isTagClose() {
        return tagClose;
    }

}
