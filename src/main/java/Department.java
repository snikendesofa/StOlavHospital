import javax.swing.*;
import java.util.ArrayList;

public class Department
{
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

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
        if(person instanceof Employee)
        {
            for (Employee employee : employees)
            {
                if (employee.getSocialSecurityNumber().equals(person.getSocialSecurityNumber()))
                {
                    employees.remove(person);
                    return;
                }
            }
        }
        else if (person instanceof Patient)
        {
            for (Patient patient : patients)
            {
                if (patient.getSocialSecurityNumber().equals(person.getSocialSecurityNumber()))
                {
                    patients.remove(person);
                    return;
                }
            }
        }
        else
            {
            RemoveException e1 = new RemoveException();
            String exception = "" + person;
            e1.removeException(exception);
            }

    }
}
