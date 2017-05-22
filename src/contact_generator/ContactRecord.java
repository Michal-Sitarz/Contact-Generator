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
     *
     */
    public ContactRecord() {
        employeeID = 0;
        firstName = "";
        lastName = "";
        email = "";
        phone = "";
    }

    /**
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
     *
     * @param _employeeID
     */
    public void setEmployeeID(int _employeeID) {
        this.employeeID = _employeeID;
    }

    /**
     *
     * @param _firstName
     */
    public void setFirstName(String _firstName) {
        this.firstName = _firstName;
    }

    /**
     *
     * @param _lastName
     */
    public void setLastName(String _lastName) {
        this.lastName = _lastName;
    }

    /**
     *
     * @param _email
     */
    public void setEmail(String _email) {
        this.email = _email;
    }

    /**
     *
     * @param _phone
     */
    public void setPhone(String _phone) {
        this.phone = _phone;
    }

    // GETters:

    /**
     *
     * @return
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

}
