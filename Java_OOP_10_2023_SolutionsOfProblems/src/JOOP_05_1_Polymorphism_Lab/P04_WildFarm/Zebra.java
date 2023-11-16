package JOOP_05_1_Polymorphism_Lab.P04_WildFarm;

public class Zebra extends Mammal{

    private final String SOUND="Zs";

    public Zebra(String animalName, String animalType,
                 Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }


    @Override
    void makeSound() {
        System.out.println(SOUND);
    }

    @Override
    void eat(Food food) {
        if(food.getClass().getSimpleName().equals("Meat")){
            System.out.println("Zebras are not eating that type of food!");
        }else{
            super.setFoodEaten(food.getQuantity());
        }

    }
}
