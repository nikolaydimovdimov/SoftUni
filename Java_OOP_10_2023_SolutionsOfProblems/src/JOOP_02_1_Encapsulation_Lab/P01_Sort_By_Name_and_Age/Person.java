package JOOP_02_1_Encapsulation_Lab.P01_Sort_By_Name_and_Age;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
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

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return String.format("%s %s is %d years old.",
                this.getFirstName(), this.getLastName(), this.getAge());
    }
}
