package contact_generator;

import static contact_generator.Main.allContacts;
import java.util.ArrayList;

/**
 * Student ID: 1507342
 *
 * @author Michal Sitarz
 */
public class ContactDB {

    private boolean dbConn;

    public boolean connectDB() {
        dbConn = false;

        // real DB connection here...
        //on success:
        dbConn = true;

        return this.dbConn;
    }

    public ArrayList<ContactRecord> retrieveContacts() {
        tempDBArray();
        return allContacts;
    }

    /* 
     * =========================
     * UNIT-TESTING methods here
     * =========================
     */
    //temporary array with exemplar data - only for testing purposes!
    private static void tempDBArray() {
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

}
