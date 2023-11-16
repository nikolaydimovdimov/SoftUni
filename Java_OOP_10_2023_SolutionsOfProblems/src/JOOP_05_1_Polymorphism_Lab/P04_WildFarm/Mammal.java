package JOOP_05_1_Polymorphism_Lab.P04_WildFarm;

public abstract class Mammal extends Animal{
    private String livingRegion;

    protected Mammal(String animalName, String animalType,
                     Double animalWeight,String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.setLivingRegion(livingRegion);
    }


    protected void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("%s, %d]",this.livingRegion,super.getFoodEaten());
    }
}
