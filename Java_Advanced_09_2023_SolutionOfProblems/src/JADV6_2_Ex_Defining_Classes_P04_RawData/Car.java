package JADV6_2_Ex_Defining_Classes_P04_RawData;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Car {
    private String model;
    private int speed;
    private int power;
    private int weightCargo;
    private String cargoType;

    private double[] tyrePressure;
    private int[] tyreAge;


    public Car(String model, int speed, int power, int weightCargo,
               String cargoType, double[] tyrePressure, int[] tyreAge) {
        this.model = model;
        this.speed = speed;
        this.power = power;
        this.weightCargo = weightCargo;
        this.cargoType = cargoType;
        this.tyrePressure = tyrePressure;
        this.tyreAge = tyreAge;
    }

    public Car() {
        this("", 0, 0, 0, "", new double[4], new int[4]);
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }

    public int getWeightCargo() {
        return weightCargo;
    }

    public String getCargoType() {
        return cargoType;
    }

    public double[] getTyrePressure() {
        return tyrePressure;
    }

    public int[] getTyreAge() {
        return tyreAge;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setWeightCargo(int weightCargo) {
        this.weightCargo = weightCargo;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public void setTyrePressure(double[] tyrePressure) {
        this.tyrePressure = tyrePressure;
    }

    public void setTyreAge(int[] tyreAge) {
        this.tyreAge = tyreAge;
    }

    public double getMinPressure() {
        return Arrays.stream(tyrePressure).min().getAsDouble();
    }

}
