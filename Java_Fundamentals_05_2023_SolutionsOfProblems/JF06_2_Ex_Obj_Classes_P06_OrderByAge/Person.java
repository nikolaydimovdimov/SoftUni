package JF06_2_Ex_Obj_Classes_P06_OrderByAge;

public class Person {
    private String name;
    private String iD;
    private int age;

    public Person(String name, String iD, int age) {
        this.name = name;
        this.iD = iD;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
    public String output(){
        return String.format("%s with ID: %s is %d years old.",this.name,this.iD,this.age);
    }
}
