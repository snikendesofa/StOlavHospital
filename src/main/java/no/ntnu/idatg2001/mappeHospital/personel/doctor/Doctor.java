package no.ntnu.idatg2001.mappeHospital.personel.doctor;

import no.ntnu.idatg2001.mappeHospital.Patient;
import no.ntnu.idatg2001.mappeHospital.personel.Employee;

/**
 * The abstract class doctor is used to make the Surgeon and GeneralPractitioner classes.
 */
public abstract class Doctor extends Employee
{
    /**
     * The abstract constructor for the Doctor object.
     * @param firstName String containing the first name.
     * @param lastName String containing the last name.
     * @param socialSecurityNumber String containing the social security number.
     */
    public Doctor(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * The abstract setDiagnosis method.
     * @param patient is the patient that will get a diagnosis.
     * @param diagnosis is the diagnosis.
     */
    public abstract void setDiagnosis(Patient patient, String diagnosis);
}
