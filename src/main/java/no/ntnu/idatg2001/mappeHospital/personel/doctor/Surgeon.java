package no.ntnu.idatg2001.mappeHospital.personel.doctor;

import no.ntnu.idatg2001.mappeHospital.Patient;
import no.ntnu.idatg2001.mappeHospital.personel.doctor.Doctor;

public class Surgeon extends Doctor
{
    public Surgeon(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public void setDiagnosis(Patient patient, String diagnosis)
    {

    }
}
