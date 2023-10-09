package JADV6_2_Ex_Defining_Classes_P01_OpinionPoll;

public class Person {
    private String name;
    private int age;

    public Person() {
        this("", 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
