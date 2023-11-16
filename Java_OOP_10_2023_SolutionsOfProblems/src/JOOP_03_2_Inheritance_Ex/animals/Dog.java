package JOOP_03_2_Inheritance_Ex.animals;

public class Dog extends Animal{
    private final static String SOUND = "Woof!";
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }
    public String produceSound() {
        return SOUND;
    }
}
