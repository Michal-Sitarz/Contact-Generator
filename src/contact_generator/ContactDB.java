package contact_generator;

import static contact_generator.Main.allContacts;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Student ID: 1507342
 *
 * @author Michal Sitarz
 */
public class ContactDB {

    private boolean dbConn;

    /**
     *
     * @return
     * @throws SQLException
     */
    public boolean connectDB() throws SQLException {
        dbConn = false;

        // implement driver for the database
        try {
            // if we get a problem here ("driver does not exist"): 
            // Click  the project icon / Properties / Libraries -> add (the path to) ojdbc7_g.jar
            Class.forName("oracle.jdbc.driver.OracleDriver");
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        } catch (ClassNotFoundException c_) {
            System.out.println(c_.getMessage());
        }
        

        // connect with database
        try {
            // CAUTION: the connection string needs real username/password for connecting to the database!
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@//10.1.9.106:1521/sw2", "michal", "password");
            Statement s = c.createStatement();

            // retrieve the data from DB and fill it into the array
            ResultSet rset = s.executeQuery("select * from contacts order by contact_id");
            while (rset.next()) {
                ContactRecord cr = new ContactRecord();
                cr.setEmployeeID(rset.getInt(1));
                cr.setFirstName(rset.getString(2));
                cr.setLastName(rset.getString(3));
                cr.setEmail(rset.getString(4));
                cr.setPhone(rset.getString(5));
                allContacts.add(cr);
            }
            dbConn = true;
            
        } catch (SQLException s_) {
            System.out.println(s_.getErrorCode());
        }
        
        
        return this.dbConn;
    }

    /**
     *
     * @return
     */
    public ArrayList<ContactRecord> retrieveContacts() {
        
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
