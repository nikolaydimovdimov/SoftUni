package JOOP_05_2_Polymorphism_Ex.P01_Vahicles_1;

public class Truck extends Vehicle {
    public Truck(Double fuelQuantity, Double fuelConsumption) {
        super(fuelQuantity, fuelConsumption+1.6);
    }

    @Override
    protected void refuel(Double fuel) {
        super.refuel(fuel*0.95);
    }

}
