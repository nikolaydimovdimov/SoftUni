package JADV6_1_LAB_Defining_Classes_P01_CarInfo;

public class Car {
    private String brand;
    private String model;
    private int power;

    public Car(String brand, String model, int power) {
        this.setBrand(brand);
        this.setModel(model);
        this.setPower(power);
    }

    public Car(String brand) {
        this(brand,"unknown",-1);
    }
    public Car(){
        this("unknown","unknown",-1);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String carInfo(){
        return String.format("The car is: %s %s - %d HP.",brand,model,power);
    }

}
