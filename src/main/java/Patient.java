public class Patient extends Person implements Diagnosable
{
    String diagnosis;

    public Patient(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    public String getDiagnosis()
    {
        return diagnosis;
    }

    @Override
    public void setDiagnosis(String diagnosis)
    {
        this.diagnosis = diagnosis;
    }
}
