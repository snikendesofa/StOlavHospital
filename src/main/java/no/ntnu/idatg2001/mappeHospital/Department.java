package no.ntnu.idatg2001.mappeHospital;
import no.ntnu.idatg2001.mappeHospital.exception.RemoveException;
import no.ntnu.idatg2001.mappeHospital.personel.Employee;

import java.util.ArrayList;

public class Department
{
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Patient> patients = new ArrayList<>();


    public String departmentName;

    public Department(String departmentName)
    {
        this.departmentName = departmentName;
    }

    public String getDepartmentName()
    {
        return departmentName;
    }

    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }

    public void addEmployee(Employee employee)throws IllegalArgumentException
    {
        if(employee == null)
        {
            throw new IllegalArgumentException("This can't be null!");
        }else
            {
                employees.add(employee);
            }

    }

    public void addPatient(Patient patient) throws IllegalArgumentException
    {
        if(patient == null)
        {
            throw new IllegalArgumentException("This can't be null!");
        }else
        {
            patients.add(patient);
        }
    }

    public ArrayList<Patient> getPatients()
    {
        return patients;
    }

    public ArrayList<Employee> getEmployees()
    {
        return employees;
    }

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
