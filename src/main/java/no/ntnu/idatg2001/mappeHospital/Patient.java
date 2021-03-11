package no.ntnu.idatg2001.mappeHospital;

/**
 * The patient class which implements the Diagnosable interface.
 */
public class Patient extends Person implements Diagnosable
{
    /**
     * The string diagnosis containing the diagnosis the a patient.
     */
    private String diagnosis;
git stat
    /**
     * The patient constructor.
     * @param firstName String with the first name of the patient.
     * @param lastName String with the last name of the patient.
     * @param socialSecurityNumber String with the socialsecuritynumber of the patient.
     */
    public Patient(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * Simple get method for the diagnosis. Returns the diagnosis string.
     * @return
     */
    public String getDiagnosis()
    {
        return diagnosis;
    }

    /**
     * Sets the diagnosis for the patient.
     * @param diagnosis sets the diagnosis string.
     */
    @Override
    public void setDiagnosis(String diagnosis)
    {
        this.diagnosis = diagnosis;
    }
}
