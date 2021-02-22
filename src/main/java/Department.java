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

    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }

    public void addPatient(Patient patient)
    {
        patients.add(patient);
    }

    public ArrayList<Patient> getPatients()
    {
        return patients;
    }

    public ArrayList<Employee> getEmployees()
    {
        return employees;
    }
}
