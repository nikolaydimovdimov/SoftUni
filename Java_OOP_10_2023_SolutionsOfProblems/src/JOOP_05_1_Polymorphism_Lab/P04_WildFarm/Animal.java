package JOOP_05_1_Polymorphism_Lab.P04_WildFarm;

import java.text.DecimalFormat;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten;

    protected Animal(String animalName, String animalType, Double animalWeight) {
        this.setAnimalName(animalName);
        this.setAnimalType(animalType);
        this.setAnimalWeight(animalWeight);
        this.setFoodEaten(0);
    }
    abstract void makeSound();
    abstract void eat(Food food);

    private void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    private void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    private void setAnimalWeight(Double animalWeight) {
        this.animalWeight = animalWeight;
    }

    protected void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }


    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("#.##");
        return String.format("%s[%s, %s, ",this.animalType,this.animalName,df.format(this.animalWeight));
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }
}
