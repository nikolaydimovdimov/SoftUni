package JOOP_05_2_Polymorphism_Ex.P01_Vehicles;

public class Truck extends Vehicle {
    public Truck(Double fuelQuantity, Double fuelConsumption) {
        super(fuelQuantity, fuelConsumption+1.6);
    }

    @Override
    protected void refuel(Double fuel) {
        super.refuel(fuel*0.95);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+  super.toString();
    }

    @Override
    public String drive(double distance) {
        return this.getClass().getSimpleName() + super.drive(distance);
    }
}
