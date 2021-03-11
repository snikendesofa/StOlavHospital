import no.ntnu.idatg2001.mappeHospital.Department;
import no.ntnu.idatg2001.mappeHospital.Patient;
import no.ntnu.idatg2001.mappeHospital.exception.RemoveException;
import no.ntnu.idatg2001.mappeHospital.personel.Employee;
import no.ntnu.idatg2001.mappeHospital.Hospital;
import no.ntnu.idatg2001.mappeHospital.client.HospitalTestData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This test class is made to test all the methods.
 */
public class DepartmentTest
{

    /**
     * This is the different objects we need to do our tests.
     */
    Hospital hospital;
    Department d1;
    Employee e1;
    Patient p1;
    Employee testEmployee;
    Patient testPatient;

    /**
     * This setUp method does everything we need for each test to be run properly.
     */
    @BeforeEach
    void setUp()
    {
        hospital = new Hospital("StOlav");
        HospitalTestData.fillRegisterWithTestData(hospital);
        d1 = hospital.getDepartments().get(0);
        e1 = d1.getEmployees().get(0);
        p1 = d1.getPatients().get(0);
        testEmployee = new Employee("Bjarte", "Olufsen", "442211");
        testPatient = new Patient("Ole", "Fredriksen", "88442");
    }

    /**
     * This test simply removes an employee from the Employee List and checks that the Employee actually got removed.
     */
    @Test
    void removeEmployeeTest() throws RemoveException {
        System.out.println("Test 1:");
        System.out.println("Numbers of employees in the list: " + d1.getEmployees().size());
        d1.remove(e1);
        assertEquals(6, d1.getEmployees().size());
        System.out.println("Numbers of employees in the list now: " + d1.getEmployees().size());
        System.out.println();
    }

    /**
     * This last test removes a patient from the patient list and is expected to work.
     */
    @Test
    void removePatientTest() throws RemoveException {
        System.out.println("Test 3:");
        System.out.println("Numbers of patients in the list: " + d1.getPatients().size());
        d1.remove(p1);
        assertEquals(1, d1.getPatients().size());
        System.out.println("Numbers of patients in the list now: " + d1.getPatients().size());
        System.out.println();
    }

    /**
     * This test tries to add a patient to the patient list and is expected to be successful.
     */
    @Test
    void addPatientTest()
    {
        System.out.println("Test 4:");
        System.out.println("Numbers of patients in the list: " + d1.getPatients().size());
        d1.addPatient(testPatient);
        assertEquals(3, d1.getPatients().size());
        System.out.println("Numbers of patients in the list now: " + d1.getPatients().size());
    }

    /**
     * This test tries to add a employee to the patient list and is expected to be successful.
     */
    @Test
    void addEmployeeTest()
    {
        System.out.println("Test 5:");
        System.out.println("Numbers of employees in the list: " + d1.getEmployees().size());
        d1.addEmployee(testEmployee);
        assertEquals(8, d1.getEmployees().size());
        System.out.println("Numbers of patients in the list now: " + d1.getEmployees().size());
    }

    /**
     * This test check that the RemoveException actually gets thrown from the remove method.
     */
    @Test
    void testRemoveThrow()
    {
        Assertions.assertThrows(RemoveException.class, () -> d1.remove(testEmployee));
    }
}