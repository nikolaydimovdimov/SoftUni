package JADV6_2_Ex_Defining_Classes_P07_Google;

public class Car {
    //    •	"{Name} car {carModel} {carSpeed}"
    private String carModel;
    private int carSpeed;


    public Car(String carModel, int carSpeed) {
        this.setCarModel(carModel);
        this.setCarSpeed(carSpeed);
    }

    public Car() {
    }


    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarSpeed(int carSpeed) {
        this.carSpeed = carSpeed;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarSpeed() {
        return carSpeed;
    }

    public String toString() {
        if(this.getCarModel()==null) return "";

        return String.format("%s %d%n", this.getCarModel(), this.getCarSpeed());
    }
}
