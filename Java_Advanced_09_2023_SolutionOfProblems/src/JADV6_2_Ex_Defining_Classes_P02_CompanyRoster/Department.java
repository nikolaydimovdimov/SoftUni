package JADV6_2_Ex_Defining_Classes_P02_CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Employee> persons;

    public Department(List<Employee> persons) {
        this.persons = persons;
    }

    public Department() {
    }

    public void setPersons(List<Employee> persons) {
        this.persons = persons;
    }

    public List<Employee> getPersons() {
        return persons;
    }

    public double getAverageSalary() {
        double sum = 0;
        if (this.persons.size() == 0) return -1;
        for (Employee person : this.persons) {
            sum += person.getSalary();
        }
        return sum / this.persons.size();
    }
}
