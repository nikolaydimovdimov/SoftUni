package JOOP_05_1_Polymorphism_Lab.P04_WildFarm;

public class Tiger extends Felime{

    private final String SOUND="ROAAR!!!";

    public Tiger(String animalName, String animalType,
                 Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight,livingRegion);

    }


    @Override
    void makeSound() {
        System.out.println(SOUND);
    }

    @Override
    void eat(Food food) {
        if(food.getClass().getSimpleName().equals("Vegetable")){
            System.out.println("Tigers are not eating that type of food!");
        }else{
            super.setFoodEaten(food.getQuantity());
        }
    }
}
