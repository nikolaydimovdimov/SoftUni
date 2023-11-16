package JOOP_03_2_Inheritance_Ex.NeedForSpeed;

public class SportCar extends Car{
    private final static double DEFAULT_FUEL_CONSUMPTION =10.0;

    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
