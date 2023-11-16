package JOOP_04_1_Interfaces_and_Abstraction_Lab.P05_BorderControl_Extended;

public class Citizen extends BaseIdentifiable {
    private String name;
    private int age;

    public Citizen(String name, int age, String id) {
        super(id);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
