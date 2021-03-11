package no.ntnu.idatg2001.mappeHospital;

/**
 * This abstract class is used to create other classes like Patient and Employee.
 */
public abstract class Person
{
    /**
     * This is the fields of the class.
     */
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    /**
     * This is the constructor for the Person class.
     * @param firstName String containing the first name.
     * @param lastName String containing the last name.
     * @param socialSecurityNumber String containing the social security number.
     */
    public Person(String firstName, String lastName, String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Get method for the last name.
     * @return the firstName String.
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Get method for the last name.
     * @return the lastName String.
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Get method for the social security number.
     * @return the socialSecurityNumber String.
     */
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }

    /**
     * Set method for the firstName String.
     * @param firstName
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * Set method for the lastName String.
     * @param lastName
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * Set method for the socialSecurityNumber String.
     * @param socialSecurityNumber
     */
    public void setSocialSecurityNumber(String socialSecurityNumber)
    {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Getter for the fullName String.
     * @return a new String which is a combination of the first and last name.
     */
    public String getFullName()
    {
        return getFirstName() + " " + getLastName();
    }

    /**
     * This simple method returns a combination of the fullname and the social security number, which can then be printed.
     * @return a string with full name and socialsecurity number.
     */
    public String toString()
    {
        return getFullName() + " " + getSocialSecurityNumber();
    }
}
