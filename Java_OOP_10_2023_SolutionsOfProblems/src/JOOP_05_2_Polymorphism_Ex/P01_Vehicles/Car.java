package JOOP_05_2_Polymorphism_Ex.P01_Vehicles;

public class Car extends Vehicle {
    public Car(Double fuelQuantity, Double fuelConsumption) {
        super(fuelQuantity, fuelConsumption+0.9);
    }

    @Override
    public String drive(double distance) {
        return this.getClass().getSimpleName() + super.drive(distance);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ super.toString();
    }


}
