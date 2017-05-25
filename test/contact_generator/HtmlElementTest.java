/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact_generator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1507342
 */
public class HtmlElementTest {
    
    public HtmlElementTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of fullElement method, of class HtmlElement.
     */
    @Test
    public void testFullElement() {
        System.out.println("fullElement");
        HtmlElement instance = new HtmlElement();
        String expResult = "<></>";
        String result = instance.fullElement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of simpleTag method, of class HtmlElement.
     */
    @Test
    public void testSimpleTag() {
        System.out.println("simpleTag");
        HtmlElement instance = new HtmlElement();
        String expResult = "</>\n";
        String result = instance.simpleTag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTagName method, of class HtmlElement.
     */
    @Test
    public void testSetTagName() {
        System.out.println("setTagName");
        String tagName = "";
        HtmlElement instance = new HtmlElement();
        instance.setTagName(tagName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTagAttributes method, of class HtmlElement.
     */
    @Test
    public void testSetTagAttributes() {
        System.out.println("setTagAttributes");
        String tagAttributes = "";
        HtmlElement instance = new HtmlElement();
        instance.setTagAttributes(tagAttributes);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setElementContent method, of class HtmlElement.
     */
    @Test
    public void testSetElementContent() {
        System.out.println("setElementContent");
        String elementContent = "";
        HtmlElement instance = new HtmlElement();
        instance.setElementContent(elementContent);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTagClose method, of class HtmlElement.
     */
    @Test
    public void testSetTagClose() {
        System.out.println("setTagClose");
        boolean tagClose = false;
        HtmlElement instance = new HtmlElement();
        instance.setTagClose(tagClose);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTagName method, of class HtmlElement.
     */
    @Test
    public void testGetTagName() {
        System.out.println("getTagName");
        HtmlElement instance = new HtmlElement();
        String expResult = "";
        String result = instance.getTagName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTagAttributes method, of class HtmlElement.
     */
    @Test
    public void testGetTagAttributes() {
        System.out.println("getTagAttributes");
        HtmlElement instance = new HtmlElement();
        String expResult = "";
        String result = instance.getTagAttributes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getElementContent method, of class HtmlElement.
     */
    @Test
    public void testGetElementContent() {
        System.out.println("getElementContent");
        HtmlElement instance = new HtmlElement();
        String expResult = "";
        String result = instance.getElementContent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isTagClose method, of class HtmlElement.
     */
    @Test
    public void testIsTagClose() {
        System.out.println("isTagClose");
        HtmlElement instance = new HtmlElement();
        boolean expResult = true;
        boolean result = instance.isTagClose();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
