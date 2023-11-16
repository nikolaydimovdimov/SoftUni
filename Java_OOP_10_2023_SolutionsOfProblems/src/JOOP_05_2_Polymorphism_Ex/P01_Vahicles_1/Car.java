package JOOP_05_2_Polymorphism_Ex.P01_Vahicles_1;

public class Car extends Vehicle {
    public Car(Double fuelQuantity, Double fuelConsumption) {
        super(fuelQuantity, fuelConsumption+0.9);
    }

}
