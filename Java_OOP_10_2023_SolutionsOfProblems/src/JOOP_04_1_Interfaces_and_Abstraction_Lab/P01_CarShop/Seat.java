package JOOP_04_1_Interfaces_and_Abstraction_Lab.P01_CarShop;

public class Seat implements Car{

    private String model;
    private String color;
    private Integer horsePower;
    private String country;

    public Seat(String model, String color, Integer horsePower, String country) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.country = country;
    }


    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public Integer getHorsePower() {
        return horsePower;
    }

    @Override
    public String countryProduced() {
        return country;
    }

    @Override
    public String toString() {
        return String.format(
                "This is %s produced in %s and have %d tires",
                this.getModel(),
                this.countryProduced(),
                this.TIRES);

    }
}
