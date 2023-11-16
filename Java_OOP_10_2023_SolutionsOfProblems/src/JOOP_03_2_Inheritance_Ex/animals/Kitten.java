package JOOP_03_2_Inheritance_Ex.animals;

public class Kitten extends Cat{
    private final static String SOUND = "Meow";
    private final static String GENDER="Female";
    public Kitten(String name, int age) {
        super(name, age, GENDER);
    }
    public String produceSound() {
        return SOUND;
    }
}
