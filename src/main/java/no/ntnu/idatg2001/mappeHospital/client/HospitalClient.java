package no.ntnu.idatg2001.mappeHospital.client;
import no.ntnu.idatg2001.mappeHospital.Department;
import no.ntnu.idatg2001.mappeHospital.Hospital;
import no.ntnu.idatg2001.mappeHospital.Patient;
import no.ntnu.idatg2001.mappeHospital.Person;
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

    /**
     * This is the main method of the client.
     * @param args (Not used)
     */
    public static void main(String[] args)
    {
        // We create the hospital client and run the initialize method.
        client = new HospitalClient();
        client.init();

        //We create a testEmployee and tries to remove this employee without adding them to the Employee list.
        Employee testEmployee = new Employee("Bjarte", "Olufsen", "442211");

        client.clientRemove(testEmployee);

        //We let the General practitioner "gp1" set the diagnosis to the patient.
        GeneralPractitioner gp1 = new GeneralPractitioner("Fossum", "Olufsen", "344343");
        gp1.setDiagnosis(d1.getPatients().get(0), "Covid-19");
        System.out.println(d1.getPatients().get(0).getDiagnosis());

        //We try to set a diagnosis on a null object and with an empty string.
        gp1.setDiagnosis(null, "");
        System.out.println(d1.getPatients().get(0).getDiagnosis());

        //We create a new employee and add them to the Empoyees list.
        Employee p22 = new Employee("Jonas", "Andre", "583483");
        d1.getEmployees().add(p22);
        client.numberOfEmployees();

        // We remove the added employee and print out the new number of employees.
        client.clientRemove(p22);
        client.numberOfEmployees();
    }

    /**
     * This method initializes the client. It creates a hospital object, fills the register with data and gets two departments that we  can use.
     */
    public void init()
    {
        hospital = new Hospital("StOlav");
        HospitalTestData.fillRegisterWithTestData(hospital);
        d1 = hospital.getDepartments().get(0); //This is the emergency department.
        d2 = hospital.getDepartments().get(1); //This is the childrenPolyclinic department.
    }

    /**
     * This simple method prints out the current number of employees in the list.
     */
    public void numberOfEmployees()
    {
        System.out.println();
        System.out.println("There are: " + d1.getEmployees().size() + " employees in the Emergency department.");
    }

    /**
     * This simple method prints out the current number of employees in the list.
     */
    public void numberOfPatients()
    {
        System.out.println();
        System.out.println("There are: " + d1.getPatients().size() + " employees in the Emergency department.");
    }

    /**
     * This simple method is created to make the main method more clean. It uses the remove method to remove the person it receives.
     * @param person the person object to be removed.
     */
    public void clientRemove(Person person)
    {
        //We use a try catch to handle the situation.
        try
        {
            d1.remove(person);
        }catch (RemoveException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
