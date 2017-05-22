
package contact_generator;

/**
 * Student ID: 1507342
 *
 * @author Michal Sitarz
 */
public class Html {
    
    public Html(){
        
    }
    
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
    
}
