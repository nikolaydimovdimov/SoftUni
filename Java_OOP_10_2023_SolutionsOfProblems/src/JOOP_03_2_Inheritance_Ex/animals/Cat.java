package JOOP_03_2_Inheritance_Ex.animals;

public class Cat extends Animal{
    private final static String SOUND = "Meow meow";
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }
    public String produceSound() {
        return SOUND;
    }
}
