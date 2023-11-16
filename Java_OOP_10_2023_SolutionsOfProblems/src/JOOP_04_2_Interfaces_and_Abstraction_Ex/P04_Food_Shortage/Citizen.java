package JOOP_04_2_Interfaces_and_Abstraction_Ex.P04_Food_Shortage;

public class Citizen implements Person,Identifiable,Birthable,Buyer{
    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
        this.food = 0;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void buyFood() {
         food+=10;
    }

    @Override
    public int getFood() {
        return food;
    }
}
