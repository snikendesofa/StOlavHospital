package no.ntnu.idatg2001.mappeHospital.client;

import no.ntnu.idatg2001.mappeHospital.Department;
import no.ntnu.idatg2001.mappeHospital.Hospital;
import no.ntnu.idatg2001.mappeHospital.exception.RemoveException;
import no.ntnu.idatg2001.mappeHospital.personel.Employee;
import no.ntnu.idatg2001.mappeHospital.personel.Nurse;
import no.ntnu.idatg2001.mappeHospital.personel.doctor.GeneralPractitioner;
import org.w3c.dom.ls.LSOutput;

public class HospitalClient
{
   public static Department d1;
   public static Department d2;
   Hospital hospital;
   static HospitalClient client;

    public static void main(String[] args) {
        client = new HospitalClient();
        client.init();

        //client.numberOfEmployees();
        //d1.remove(d1.getEmployees().get(0));
       // client.numberOfEmployees();

        Employee testEmployee = new Employee("Bjarte", "Olufsen", "442211");

        try
        {
            d1.remove(testEmployee);
        }catch (RemoveException e)
        {
           System.out.println(e.getMessage());
        }

        GeneralPractitioner gp1 = new GeneralPractitioner("Fossum", "Olufsen", "344343");
        gp1.setDiagnosis(d1.getPatients().get(0), "Covid-19");
        System.out.println(d1.getPatients().get(0).getDiagnosis());

        gp1.setDiagnosis(d1.getPatients().get(0), "");
        System.out.println(d1.getPatients().get(0).getDiagnosis());
    }

    public void init()
    {
        hospital = new Hospital("StOlav");
        HospitalTestData.fillRegisterWithTestData(hospital);
        d1 = hospital.getDepartments().get(0); //This is the emergency department.
        d2 = hospital.getDepartments().get(1); //This is the childrenPolyclinic department.
    }

    public void numberOfEmployees()
    {
        System.out.println();
        System.out.println("There are: " + d1.getEmployees().size() + " employees in the Emergency department.");
    }

}
