package no.ntnu.idatg2001.mappeHospital.personel.doctor;

import no.ntnu.idatg2001.mappeHospital.Patient;

/**
 * The Surgeon class which is an extension of the Doctor class.
 */
public class GeneralPractitioner extends Doctor
{
    /**
     * The constructor for the GeneralPractitioner object.
     * @param firstName String containing the first name.
     * @param lastName String containing the last name.
     * @param socialSecurityNumber String containing the social security number.
     */
    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * This is an Override of the setDiagnosis method and the method makes sure that the object and diagnosis string is not empty/null.
     * @param patient is the patient that will get a diagnosis.
     * @param diagnosis is the diagnosis.
     */
    @Override
    public void setDiagnosis(Patient patient, String diagnosis)
    {
        try
        {
            if(patient == null || diagnosis.isEmpty())
            {
                throw new IllegalArgumentException("You need to choose a patient and enter a diagnosis!");
            }else
            {
                patient.setDiagnosis(diagnosis);
            }
        } catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
