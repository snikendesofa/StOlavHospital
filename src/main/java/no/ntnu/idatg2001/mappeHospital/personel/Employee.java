package no.ntnu.idatg2001.mappeHospital.personel;

import no.ntnu.idatg2001.mappeHospital.Person;

/**
 * The Employee class which is an extension of the  abstract Person class.
 */
public class Employee extends Person
{
    /**
     * This is the constructor for the Employee class.
     * @param firstName String containing the first name.
     * @param lastName String containing the last name.
     * @param socialSecurityNumber String containing the social security number.
     */
    public Employee(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }
}
