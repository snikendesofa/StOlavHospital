package no.ntnu.idatg2001.mappeHospital;

import java.util.ArrayList;

/**
 * The hospital class that has everything we need in order to create a hospital object.
 */
public class Hospital
{
    /**
     * The string that contains the name of the hospital.
     */
    private String hospitalName;

    /**
     * The arrayList that contains all the departments of each hospital object.
     */
    private ArrayList<Department> departments = new ArrayList<>();

    /**
     * The constructor for the hospital.
     * @param hospitalName the string with the name of the Hospital object.
     */
    public Hospital(String hospitalName)
    {
        this.hospitalName = hospitalName;
    }

    /**
     * A getter for the hospital name.
     * @return the hospital name string.
     */
    public String getHospitalName()
    {
        return hospitalName;
    }

    /**
     * A getter for the department list.
     * @return the departments of the hospital.
     */
    public ArrayList<Department> getDepartments()
    {
        return departments;
    }

    /**
     * This method adds a department to the department arraylist.
     * @param department the department to be added.
     */
    public void addDepartment(Department department)
    {
        departments.add(department);
    }
}
