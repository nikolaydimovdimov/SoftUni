package JOOP_05_2_Polymorphism_Ex.P02_Vehicles_Extension;

public class Car extends Vehicle {

    private final Double FUEL_CONSUMPTION_CORRECTION = 0.9;


    public Car(Double fuelQuantity, Double fuelConsumption, Double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        super.changeFuelConsumption(FUEL_CONSUMPTION_CORRECTION);
    }

}
