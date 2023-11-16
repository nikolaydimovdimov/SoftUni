package JOOP_05_2_Polymorphism_Ex.P02_Vehicles_Extension;

public class Truck extends Vehicle{

    private final Double FUEL_CONSUMPTION_CORRECTION = 1.6;
    private final Double REFUEL_CORRECTION=0.95;


    public Truck(Double fuelQuantity, Double fuelConsumption, Double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        super.changeFuelConsumption(FUEL_CONSUMPTION_CORRECTION);
    }

    @Override
    public void refuel(Double fuel) {
        super.refuel(fuel*REFUEL_CORRECTION);
    }

}
