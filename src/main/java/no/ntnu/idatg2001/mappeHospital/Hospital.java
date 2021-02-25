package no.ntnu.idatg2001.mappeHospital;

import java.util.ArrayList;

public class Hospital
{
    public String hospitalName;

    private ArrayList<Department> departments = new ArrayList<>();

    public Hospital(String hospitalName)
    {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName()
    {
        return hospitalName;
    }

    public ArrayList<Department> getDepartments()
    {
        return departments;
    }

    public void addDepartment(Department department)
    {
        departments.add(department);
    }
}
