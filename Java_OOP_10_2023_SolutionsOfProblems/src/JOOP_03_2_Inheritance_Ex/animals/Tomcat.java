package JOOP_03_2_Inheritance_Ex.animals;

public class Tomcat extends Cat{
    private final static String SOUND = "MEOW";
    private final static String GENDER="Male";

    public Tomcat(String name, int age) {
        super(name, age, GENDER);
    }
    public String produceSound() {
        return SOUND;
    }
}
