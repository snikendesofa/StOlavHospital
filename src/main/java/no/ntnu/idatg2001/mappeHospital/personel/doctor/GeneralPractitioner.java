package no.ntnu.idatg2001.mappeHospital.personel.doctor;

import no.ntnu.idatg2001.mappeHospital.Patient;

public class GeneralPractitioner extends Doctor
{

    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public void setDiagnosis(Patient patient, String diagnosis)
    {

    }
}
