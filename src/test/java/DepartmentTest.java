import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    Department d1 = new Department("Gastro");
    Employee e1 = new Employee("Håkon", "Fossum", "334412");
    Employee e2 = new Employee("Terje", "Løken", "442156");
    Patient p1 = new Patient("Bjarne", "Olufsen", "332146");
    Patient p2 = new Patient("Kari", "Solbø", "553423");
    Employee e3 = null;
    Employee e4 = new Employee("Kiran", "Kul", "344312");

    @BeforeEach
    void setUp()
    {
        d1.addEmployee(e1);
        d1.addEmployee(e2);
        d1.addPatient(p1);
        d1.addPatient(p2);
    }

    @Test
    public void remove()
    {
        System.out.println("Test 1:");
        System.out.println("Numbers of employees in the list: " + d1.employees.size());
        d1.remove(e1);
        assertEquals(1, d1.employees.size());
        System.out.println("Numbers of employees in the list now: " + d1.employees.size());
        System.out.println();
    }

    @Test
    public void remove2()
    {
        System.out.println("Test 2:");
        System.out.println("Numbers of employees in the list: " + d1.employees.size());
        d1.remove(e4);
        assertEquals(2, d1.employees.size());
        System.out.println("Numbers of employees in the list now: " + d1.employees.size());
        System.out.println();
    }

    @Test
    public void remove3()
    {
        System.out.println("Test 3:");
        System.out.println("Numbers of employees in the list: " + d1.employees.size());
        d1.remove(e3);
        assertEquals(2, d1.employees.size());
        System.out.println("Numbers of employees in the list now: " + d1.employees.size());
    }
}