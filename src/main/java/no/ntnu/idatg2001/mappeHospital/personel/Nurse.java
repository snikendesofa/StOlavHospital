package no.ntnu.idatg2001.mappeHospital.personel;

/**
 * The nurse class which is an extension of the Employee class.
 */
public class Nurse extends Employee
{
    /**
     * The constructor for the nurse object.
     * @param firstName String containing the first name.
     * @param lastName String containing the last name.
     * @param socialSecurityNumber String containing the social security number.
     */
    public Nurse(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }
}
