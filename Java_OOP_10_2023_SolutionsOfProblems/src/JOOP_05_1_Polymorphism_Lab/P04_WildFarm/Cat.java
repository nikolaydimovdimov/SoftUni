package JOOP_05_1_Polymorphism_Lab.P04_WildFarm;

public class Cat extends Felime{

    private final String SOUND="Meowwww";
    private String breed;
    public Cat(String animalName, String animalType,
               Double animalWeight, String livingRegion,String breed) {
        super(animalName, animalType, animalWeight,livingRegion);
        this.setBreed(breed);

    }

    @Override
    void makeSound() {
        System.out.println(SOUND);

    }

    @Override
    void eat(Food food) {
        super.setFoodEaten(food.getQuantity());
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return super.toString().replaceFirst(",",String.format(", %s,",this.breed));
    }
}
