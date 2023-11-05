package JOOP_02_1_Encapsulation_Lab.P02_Salary_Increase;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private final double MIN_SALARY=460;


    public Person(String firstName, String lastName, int age,double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double salary) {
        if(salary<MIN_SALARY){
            throw new  IllegalArgumentException("Massage");
        }
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return this.age;
    }
    public double getSalary() {
        return  this.salary;
    }

    public void increaseSalary(double bonus){
        if(this.getAge()<30){
            this.setSalary(this.getSalary()*(1+bonus/200));
        }else{
            this.setSalary(this.getSalary()*(1+bonus/100));
        }
    }

    public String toString() {
        return String.format("%s %s gets %s leva",
                this.getFirstName(), this.getLastName(),
                new DecimalFormat("#.0##").format(this.getSalary()));
    }

}
