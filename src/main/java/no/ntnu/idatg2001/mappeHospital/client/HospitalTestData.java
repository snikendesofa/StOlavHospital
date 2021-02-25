package no.ntnu.idatg2001.mappeHospital.client;

import no.ntnu.idatg2001.mappeHospital.Department;
import no.ntnu.idatg2001.mappeHospital.Hospital;
import no.ntnu.idatg2001.mappeHospital.Patient;
import no.ntnu.idatg2001.mappeHospital.personel.Employee;
import no.ntnu.idatg2001.mappeHospital.personel.doctor.GeneralPractitioner;
import no.ntnu.idatg2001.mappeHospital.personel.Nurse;
import no.ntnu.idatg2001.mappeHospital.personel.doctor.Surgeon;

public final class HospitalTestData
{
    private HospitalTestData()
    {
        // not called
    }
    /**
     * @param hospital
     */
    public static void fillRegisterWithTestData(final Hospital hospital)
    {
        // Add some departments
        Department emergency = new Department("Akutten");
        emergency.getEmployees().add(new Employee("Odd Even", "Primtallet", "3344"));
        emergency.getEmployees().add(new Employee("Huppasahn", "DelFinito", "3345"));
        emergency.getEmployees().add(new Employee("Rigmor", "Mortis", "3346"));
        emergency.getEmployees().add(new GeneralPractitioner("Inco", "Gnito", "3347"));
        emergency.getEmployees().add(new Surgeon("Inco", "Gnito", "3348"));
        emergency.getEmployees().add(new Nurse("Nina", "Teknologi", "3349"));
        emergency.getEmployees().add(new Nurse("Ove", "Ralt", "3350"));
        emergency.getPatients().add(new Patient("Inga", "Lykke", "3351"));
        emergency.getPatients().add(new Patient("Ulrik", "Smål", "3352"));
        hospital.getDepartments().add(emergency);

        Department childrenPolyclinic = new Department("Barn poliklinikk");
        childrenPolyclinic.getEmployees().add(new Employee("Salti", "Kaffen", "4430"));
        childrenPolyclinic.getEmployees().add(new Employee("Nidel V.", "Elvefølger", "4431"));
        childrenPolyclinic.getEmployees().add(new Employee("Anton", "Nym", "4432"));
        childrenPolyclinic.getEmployees().add(new GeneralPractitioner("Gene", "Sis", "4433"));
        childrenPolyclinic.getEmployees().add(new Surgeon("Nanna", "Na", "4434"));
        childrenPolyclinic.getEmployees().add(new Nurse("Nora", "Toriet", "4435"));
        childrenPolyclinic.getPatients().add(new Patient("Hans", "Omvar", "4436"));
        childrenPolyclinic.getPatients().add(new Patient("Laila", "La", "4437"));
        childrenPolyclinic.getPatients().add(new Patient("Jøran", "Drebli", "4438"));
        hospital.getDepartments().add(childrenPolyclinic);
    }
}
