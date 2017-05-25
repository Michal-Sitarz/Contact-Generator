package contact_generator;

/**
 * Student ID: 1507342
 *
 * @author Michal Sitarz
 */
public class ContactRecord {

    private int employeeID;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    /**
     *  default CTOR
     */
    public ContactRecord() {
        employeeID = 0;
        firstName = "";
        lastName = "";
        email = "";
        phone = "";
    }

    /**
     * method to return
     * all the details of one record
     * in single string
     * 
     * @return
     */
    public String allContactDetails() {
        return this.employeeID + " "
                + this.firstName + " "
                + this.lastName + " "
                + this.email + " "
                + this.phone;
    }

    /**
     * method to return
     * the minimum details of one record
     * in single string
     * 
     * @return
     */
    public String basicContactDetails() {
        return this.employeeID + " "
                + this.firstName + " "
                + this.lastName;
    }

    
    // SETters:

    /**
     * SETter for:
     *
     * @param _employeeID
     */
    public void setEmployeeID(int _employeeID) {
        this.employeeID = _employeeID;
    }

    /**
     * SETter for:
     *
     * @param _firstName
     */
    public void setFirstName(String _firstName) {
        this.firstName = _firstName;
    }

    /**
     * SETter for:
     *
     * @param _lastName
     */
    public void setLastName(String _lastName) {
        this.lastName = _lastName;
    }

    /**
     * SETter for:
     *
     * @param _email
     */
    public void setEmail(String _email) {
        this.email = _email;
    }

    /**
     * SETter for:
     *
     * @param _phone
     */
    public void setPhone(String _phone) {
        this.phone = _phone;
    }

    // GETters:

    /**
     * GETter for:
     *
     * @return
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * GETter for:
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * GETter for:
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * GETter for:
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * GETter for:
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

}
