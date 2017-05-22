
package contact_generator;

/**
 * Student ID: 1507342
 *
 * @author Michal Sitarz
 */
public class Html {
    
    public Html(){
        
    }
    
    // generate html skeleton code (no content)
    public String generateHtml(){
               
        HtmlElement html = new HtmlElement();
        html.setTagName("html");
        HtmlElement head = new HtmlElement();
        head.setTagName("head");
        HtmlElement body = new HtmlElement();
        body.setTagName("body");
        
        html.setElementContent(head.fullElement()+body.fullElement());
                
        return html.fullElement();
    }
    
    // generate simple html code with raw content
    public String generateHtml(String _content){
        
        HtmlElement html = new HtmlElement();
        html.setTagName("html");
        HtmlElement head = new HtmlElement();
        head.setTagName("head");
        HtmlElement body = new HtmlElement();
        body.setTagName("body");
        
        body.setElementContent(_content);
        html.setElementContent(head.fullElement()+body.fullElement());
                
        return html.fullElement();
    }
    
    // generate html code with content and page title
    public String generateHtml(String _content, String _pageTitle){
        
        HtmlElement html = new HtmlElement();
        html.setTagName("html");
        HtmlElement head = new HtmlElement();
        head.setTagName("head");
        HtmlElement body = new HtmlElement();
        body.setTagName("body");
        
        HtmlElement title = new HtmlElement();
        title.setTagName("title");
        title.setElementContent(_pageTitle);
        
        head.setElementContent(title.fullElement());
        body.setElementContent(_content);
        html.setElementContent(head.fullElement()+body.fullElement());
                
        return html.fullElement();
    }
    
}
