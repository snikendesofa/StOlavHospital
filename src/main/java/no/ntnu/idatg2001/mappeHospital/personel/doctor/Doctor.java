package no.ntnu.idatg2001.mappeHospital.personel.doctor;

import no.ntnu.idatg2001.mappeHospital.Patient;
import no.ntnu.idatg2001.mappeHospital.personel.Employee;

public abstract class Doctor extends Employee
{
    public Doctor(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    public abstract void setDiagnosis(Patient patient, String diagnosis);
}
