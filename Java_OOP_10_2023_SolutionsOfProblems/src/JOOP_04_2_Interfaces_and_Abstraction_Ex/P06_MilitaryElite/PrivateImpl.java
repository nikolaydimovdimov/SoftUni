package JOOP_04_2_Interfaces_and_Abstraction_Ex.P06_MilitaryElite;

public class PrivateImpl extends SoldierImpl implements Private {
    private double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.setSalary(salary);
    }

    public PrivateImpl(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }


    @Override
    public double getSalary() {
        return this.salary;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return super.toString()+String.format(" Salary: %.2f",this.getSalary());
    }
}
