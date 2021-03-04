package no.ntnu.idatg2001.mappeHospital;
import no.ntnu.idatg2001.mappeHospital.exception.RemoveException;
import no.ntnu.idatg2001.mappeHospital.personel.Employee;

import java.util.ArrayList;

/**
 * The department class. Each department has its own list of employees and patients.
 */
public class Department
{
    /**
     * The two arraylists for the department object. One for Patients and one for Employees.
     */
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Patient> patients = new ArrayList<>();

    /**
     * The String departmentName containing the department name.
     */
    private String departmentName;

    /**
     * The department constructor.
     * @param departmentName name of the department.
     */
    public Department(String departmentName)
    {
        this.departmentName = departmentName;
    }

    /**
     * Getter for the department name.
     * @return the string departmentName.
     */
    public String getDepartmentName()
    {
        return departmentName;
    }

    /**
     * Setter for the department name.
     * @param departmentName
     */
    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }

    /**
     *  This is the add method. It checks that the object is not null before adding it to the list.
     * @param employee is a employee object.
     * @throws IllegalArgumentException if the object is null.
     */
    public void addEmployee(Employee employee)throws IllegalArgumentException
    {
        try
        {
            if(employee == null)
            {
                throw new IllegalArgumentException("This can't be null!");
            }else
            {
                employees.add(employee);
            }
        } catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }


    }

    /**
     * This is the add method. It checks that the object is not null before adding it to the list.
     * @param patient is a patient object.
     * @throws IllegalArgumentException if the object is null.
     */
    public void addPatient(Patient patient) throws IllegalArgumentException
    {
        try
        {
            if(patient == null)
            {
                throw new IllegalArgumentException("This can't be null!");
            }else
            {
                patients.add(patient);
            }
        } catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method returns the patients list so that it can be accessed from outside the class.
     * @return the patients list.
     */
    public ArrayList<Patient> getPatients()
    {
        return patients;
    }

    /**
     * This method returns the employees list so that it can be accessed from outside the class.
     * @return the employees list.
     */
    public ArrayList<Employee> getEmployees()
    {
        return employees;
    }

    /**
     * This is the remove method. It takes in a Person object and checks to see if it exists in either the Patient list or Employee list.
     * If the object is not in any list it will return an Exception message from the RemoveException class.
     * @param person is the object you wish to remove.
     */
    public void remove(Person person)
    {
        try
        {
            for (Employee employee : employees)
            {
                if (employee.getSocialSecurityNumber().equals(person.getSocialSecurityNumber()))
                {
                    employees.remove(person);
                    return;
                }
            }

            for (Patient patient : patients)
            {
                if (patient.getSocialSecurityNumber().equals(person.getSocialSecurityNumber()))
                {
                    patients.remove(person);
                    return;
                }
            }

            throw new RemoveException();
        }

        catch (RemoveException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
