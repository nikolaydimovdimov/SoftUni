package JADV6_2_Ex_Defining_Classes_P07_Google;

public class Company {
    //    •	"{Name} company {companyName} {department} {salary}"
    private String companyName;
    private String department;
    private double salary;

    public Company(String companyName, String department, double salary) {
        this.setCompanyName(companyName);
        this.setDepartment(department);
        this.setSalary(salary);
    }

    public Company() {
    }


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        if(this.getCompanyName()==null) return "";
        return String.format("%s %s %.2f%n",
                this.getCompanyName(), this.getDepartment(), this.getSalary());
    }
}
