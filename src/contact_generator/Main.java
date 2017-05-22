package contact_generator;

import java.util.ArrayList;

/**
 * Student ID: 1507342
 *
 * @author Michal Sitarz
 */
public class Main {

    public static ArrayList<ContactRecord> allContacts;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        collectDBcontacts();
        createPage("index", "test content");
        */
        //Automated Unit-Testing method >> will be disabled in release mode
        runAllTests();
    }

    //method to retrieve and collect user's data from database
    public static void collectDBcontacts() {
        ContactDB cdb = new ContactDB();

        if (cdb.connectDB()) {
            cdb.retrieveContacts();
        } else {
            // check "exceptions" for displayed errors
            System.out.println("Sorry, database is currently unavailable...");
            System.exit(0);
        }

    }

    public static void createPage(String pageName, String content) {

        WebPage page = new WebPage();
        page.setFileName(pageName);
        page.setFileType("html");
        page.setFileLocation(System.getProperty("user.home") + "\\Desktop\\contacts");

        Html h = new Html();

        if (page.saveFile(h.generateHtml(content, pageName))) {
            System.out.println("The page: " + pageName + " has been saved to a file.");
        } else {
            System.out.println("Sorry, the page couldn't be saved to a file.");
        }

    }

    /* 
     * =========================
     * UNIT-TESTING methods here
     * =========================
     */
    private static void runAllTests() {
        /*
         * list of all Unit-Testing methods
         * to run automatically all prepared tests
         */

        test1();
        testArrayList1();
        testArrayList2();
        testContactDB1();
        testCollectDBcontacts();
        testUserLocation1();
        testSavingFile1();
        testHtmlElement1();
        testHtmlElement2();
        testHtml1();
        testHtmlWithContent1();
        testHtmlWithContent2();

    }

    //temporary array with exemplar data - only for testing purposes!
    private static void tempArray() {
        allContacts = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            ContactRecord cr = new ContactRecord();
            cr.setEmployeeID(100 + i);
            cr.setFirstName("Name" + i);
            cr.setLastName("Surname" + i);
            cr.setEmail("email" + i + "email.org");
            cr.setPhone("555.555.55" + i);
            allContacts.add(cr);
        }
    }

    // method to test default Main method and standard output
    private static void test1() {
        System.out.println("\n[TEST: main()]");
        System.out.println("Expected: check");
        System.out.print("Result:   ");

        String test = "check";
        System.out.println(test);
    }

    // method to test an arraylist of type ContactRecord
    private static void testArrayList1() {
        System.out.println("\n[TEST: ArrayList+ContactRecord] : long display");
        System.out.println("Expected 3 rows of:\nID: name: surname: email:          phone:");
        System.out.println("Result:");

        tempArray();
        for (ContactRecord cr : allContacts) {
            // use allContactDetails() to test ContactRecord
            System.out.println(cr.allContactDetails());
        }
    }

    // method to test an arraylist of type ContactRecord
    private static void testArrayList2() {
        System.out.println("\n[TEST: ArrayList+ContactRecord] : short display");
        System.out.println("Expected 3 rows of:\nID: name: surname:");
        System.out.println("Result:");

        tempArray();
        for (ContactRecord cr : allContacts) {
            // use basicContactDetails() to test ContactRecord
            System.out.println(cr.basicContactDetails());
        }
    }

    // method to test ContactDB class
    private static void testContactDB1() {
        System.out.println("\n[TEST: ContactDB class]");
        System.out.println("Expected 3 rows of:\nID: name: surname: email:          phone:");
        System.out.println("Result:");

        ContactDB cdb = new ContactDB();
        cdb.retrieveContacts();

        for (ContactRecord cr : allContacts) {
            // use allContactDetails() to test ContactRecord
            System.out.println(cr.allContactDetails());
        }
    }

    // method to test collectDBcontacts() method
    private static void testCollectDBcontacts() {
        System.out.println("\n[TEST: collectDBcontacts()]");
        System.out.println("Expected 3 rows of:\nID: name: surname: email:          phone:");
        System.out.println("Result:");

        for (ContactRecord cr : allContacts) {
            // use allContactDetails() to test ContactRecord
            System.out.println(cr.allContactDetails());
        }
    }

    // method to test System.getProperty() 
    //to generate current user's path to the Desktop folder
    private static void testUserLocation1() {
        System.out.println("\n[TEST: System.getProperty()]");
        System.out.println("Expected: current user's file path");
        System.out.print("Result:   ");

        String userPath = System.getProperty("user.home") + "\\Desktop\\contacts";
        System.out.println(userPath);
    }

    // method to test saveFile() method in WebPage class
    private static void testSavingFile1() {
        System.out.println("\n[TEST: saveFile()]");
        System.out.println("Expected: user's file path + correct message");
        System.out.print("Result:   ");

        collectDBcontacts();
        createPage("index", "test content");
    }

    // method to test: instantiation of object HtmlElement
    // and method fullElement() to generate html code
    private static void testHtmlElement1() {
        System.out.println("\n[TEST: HtmlElement object1]");
        System.out.println("Expected: <body>Hello World</body>");
        System.out.print("Result:   ");

        HtmlElement elem = new HtmlElement();
        elem.setTagName("body");
        elem.setElementContent("Hello World");

        System.out.println(elem.fullElement());
    }

    // method to test: instantiation of object HtmlElement
    // and method fullElement() to generate html code
    // adding "attributes" to the html tag
    private static void testHtmlElement2() {
        System.out.println("\n[TEST: HtmlElement object2]");
        System.out.println("Expected: <a href='link.html'>Link</a>");
        System.out.print("Result:   ");

        HtmlElement elem = new HtmlElement();
        elem.setTagName("a");
        elem.setElementContent("Link");
        elem.setTagAttributes("href='link.html'");

        System.out.println(elem.fullElement());
    }

    // method to test: instantiation of object Html
    // and method generateHtml() to generate basic skeleton html code
    private static void testHtml1() {
        System.out.println("\n[TEST: Html object]");
        System.out.println("Expected: <html><head></head><body></body></html>");
        System.out.print("Result:   ");

        Html html = new Html();
        System.out.println(html.generateHtml());

    }

    // method to test: instantiation of object Html
    // and method generateHtml() to generate html code with some content
    private static void testHtmlWithContent1() {
        System.out.println("\n[TEST: Html object with content]");
        System.out.println("Expected: <html><head></head><body>Content</body></html>");
        System.out.print("Result:   ");

        Html html = new Html();
        System.out.println(html.generateHtml("Content"));
    }
    
    // method to test: instantiation of object Html
    // and method generateHtml() to generate html code with some content
    // and a page title
    private static void testHtmlWithContent2() {
        System.out.println("\n[TEST: Html object with content & page title]");
        System.out.println("Expected: <html><head><title>Page Title</title></head><body>Content</body></html>");
        System.out.print("Result:   ");

        Html html = new Html();
        System.out.println(html.generateHtml("Content","Page Title"));
    }
}
