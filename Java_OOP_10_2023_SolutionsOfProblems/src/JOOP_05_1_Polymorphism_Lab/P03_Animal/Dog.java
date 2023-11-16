package JOOP_05_1_Polymorphism_Lab.P03_Animal;

public class Dog extends Animal{
    private final String SOUND="DJAAF";
    public Dog(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String explainSelf() {
        return super.explainSelf()+System.lineSeparator()+ SOUND;
    }
}
