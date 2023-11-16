package JOOP_05_2_Polymorphism_Ex.P02_Vehicles_Extension;

public class Bus extends Vehicle {
    private final Double FUEL_CONSUMPTION_CORRECTION = 1.4;

    public Bus(Double fuelQuantity, Double fuelConsumption, Double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }


    public String driveWithPeople(Double distance) {
        super.changeFuelConsumption(FUEL_CONSUMPTION_CORRECTION);
        String output = super.drive(distance);
        super.changeFuelConsumption(-FUEL_CONSUMPTION_CORRECTION);
        return output;
    }


}
