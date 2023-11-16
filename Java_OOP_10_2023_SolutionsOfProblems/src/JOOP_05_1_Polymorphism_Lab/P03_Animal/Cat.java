package JOOP_05_1_Polymorphism_Lab.P03_Animal;

public class Cat extends Animal{
    private final String SOUND="MEEOW";

    public Cat(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    public String explainSelf() {
        return super.explainSelf()+System.lineSeparator()+ SOUND;
    }
}
