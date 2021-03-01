import no.ntnu.idatg2001.mappeHospital.Department;
import no.ntnu.idatg2001.mappeHospital.exception.RemoveException;
import no.ntnu.idatg2001.mappeHospital.personel.Employee;
import no.ntnu.idatg2001.mappeHospital.Hospital;
import no.ntnu.idatg2001.mappeHospital.client.HospitalTestData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DepartmentTest
{

    Hospital hospital;
    Department d1;
    Employee e1;
    Employee testEmployee;

    @BeforeEach
    void setUp()
    {
        hospital = new Hospital("StOlav");
        HospitalTestData.fillRegisterWithTestData(hospital);
        d1 = hospital.getDepartments().get(0);
        e1 = d1.getEmployees().get(0);
        testEmployee = new Employee("Bjarte", "Olufsen", "442211");
        d1.remove(testEmployee);
    }

    @Test
    public void remove()
    {
        System.out.println("Test 1:");
        System.out.println("Numbers of employees in the list: " + d1.getEmployees().size());
        d1.remove(e1);
        assertEquals(6, d1.getEmployees().size());
        System.out.println("Numbers of employees in the list now: " + d1.getEmployees().size());
        System.out.println();
    }

    @Test
    public void remove2()
    {
        System.out.println("Test 2:");
        System.out.println("Numbers of employees in the list: " + d1.getEmployees().size());
        //d1.remove(e4);
        assertEquals(2, d1.getEmployees().size());
        System.out.println("Numbers of employees in the list now: " + d1.getEmployees().size());
        System.out.println();
    }

    @Test
    public void remove3()
    {
        System.out.println("Test 3:");
        System.out.println("Numbers of employees in the list: " + d1.getEmployees().size());
        //d1.remove(e3);
        assertEquals(2, d1.getEmployees().size());
        System.out.println("Numbers of employees in the list now: " + d1.getEmployees().size());
    }

    @Test
    public void remove4()
    {
       // System.out.println("Number of exceptions: " + d1.ex2.getExceptions().size());
    }
}