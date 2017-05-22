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

    public ContactRecord() {
        employeeID = 0;
        firstName = "";
        lastName = "";
        email = "";
        phone = "";
    }

    public String allContactDetails() {
        return this.employeeID + " "
                + this.firstName + " "
                + this.lastName + " "
                + this.email + " "
                + this.phone;
    }

    public String basicContactDetails() {
        return this.employeeID + " "
                + this.firstName + " "
                + this.lastName;
    }

    
    // SETters:
    public void setEmployeeID(int _employeeID) {
        this.employeeID = _employeeID;
    }

    public void setFirstName(String _firstName) {
        this.firstName = _firstName;
    }

    public void setLastName(String _lastName) {
        this.lastName = _lastName;
    }

    public void setEmail(String _email) {
        this.email = _email;
    }

    public void setPhone(String _phone) {
        this.phone = _phone;
    }

    // GETters:
    public int getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

}
