package JOOP_03_2_Inheritance_Ex.animals;

public class Frog extends Animal{
    private final static String SOUND = "Ribbit";
    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }
    public String produceSound() {
        return SOUND;
    }
}
