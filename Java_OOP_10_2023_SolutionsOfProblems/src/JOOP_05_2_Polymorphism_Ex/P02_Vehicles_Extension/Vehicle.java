package JOOP_05_2_Polymorphism_Ex.P02_Vehicles_Extension;

import java.text.DecimalFormat;

public abstract class Vehicle {

    DecimalFormat DF=new DecimalFormat("#.##");
    private Double fuelQuantity;
    private Double fuelConsumption;
    private Double tankCapacity;

    protected Vehicle(Double fuelQuantity, Double fuelConsumption,Double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
        this.setTankCapacity(tankCapacity);
    }


    protected String drive(double distance){
        String output=this.getClass().getSimpleName();
        Double consumption=distance*fuelConsumption;
        if(consumption>fuelQuantity){
            output+=" needs refueling";
        }else {
            setFuelQuantity(this.fuelQuantity-consumption);
            output+=String.format(" travelled %s km",DF.format(distance));
        }
        return output;
    }

    protected void refuel(Double fuel){
        if(fuel<=0){
            System.out.println("Fuel must be a positive number");
        } else if (fuel+this.fuelQuantity>this.tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
        }else {
            this.setFuelQuantity(this.fuelQuantity + fuel);
        }
    }

    private void setFuelQuantity(Double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    private void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    private void setTankCapacity(Double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    private Double getFuelConsumption() {
        return fuelConsumption;
    }

    protected void changeFuelConsumption(Double fuel) {
        Double newConsumption=this.getFuelConsumption()+fuel;
        this.setFuelConsumption(newConsumption);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ String.format(": %.2f",this.fuelQuantity);
    }

}
