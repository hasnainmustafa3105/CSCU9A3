public class NewStudents
{
    protected String fullName;
    protected int registrationNumber;
    protected String email;

    /**
     * Constructor
     * @param fn Full name
     * @param rn Registration number
     * @param email Email id
     */
    public NewStudents(String fn, int rn, String email)
    {
        this.fullName = fn;
        this.registrationNumber = rn;
        this.email = email;
    }

    public NewStudents() {
    }

    //Getter methods for Encapsulation
    /**
     * @return returns the full name
     */

    public String getFullName()
    {
        return fullName;
    }

    /**
     * @return returns the registration no.
     */

    public int getRegistrationNumber()
    {
        return registrationNumber;
    }

    /**
     * @return returns the email id
     */

    public String getEmail()
    {
        return email;
    }

    /**
     * standard string description
     */

    public String toString()
    {
        return "University Member : " + fullName + " ( " + registrationNumber + " )";
    }
}