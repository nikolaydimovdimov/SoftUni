package JOOP_01_1_Working_with_Abstraction_Lab.P03_Student_System;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student() {
    }

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        String commentary;
        if (this.getGrade() >= 5.00) {
            commentary = "Excellent student";
        } else if (this.getGrade() >= 3.50) {
            commentary = "Average student";
        } else {
            commentary = "Very nice JOOP_03_2_Inheritance_Ex.person";
        }
        return String.format("%s is %d years old. %s.", this.getName(), this.getAge(), commentary);
    }
}
