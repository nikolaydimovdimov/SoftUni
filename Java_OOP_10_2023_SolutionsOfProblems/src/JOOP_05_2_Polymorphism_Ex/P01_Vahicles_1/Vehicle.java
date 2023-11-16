package JOOP_05_2_Polymorphism_Ex.P01_Vahicles_1;

import java.text.DecimalFormat;

public abstract class Vehicle {

    DecimalFormat DF=new DecimalFormat("#.##");
    private Double fuelQuantity;
    private Double fuelConsumption;

    protected Vehicle(Double fuelQuantity, Double fuelConsumption) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
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
        this.setFuelQuantity(this.fuelQuantity+fuel);
    }

    private void setFuelQuantity(Double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ String.format(": %.2f",this.fuelQuantity);
    }
}
