package JF06_2_Ex_Obj_Classes_P05_VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public String print() {
        String newType = this.type.substring(0, 1).toUpperCase() + this.type.substring(1);
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                newType, this.model, this.color, this.horsePower);
    }
}
