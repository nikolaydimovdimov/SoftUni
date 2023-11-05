package JOOP_02_2_Encapsulation_Ex.P01_Class_Box_Data_Validation;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setHeight(double height) {
        validation(height, "Height");
        this.height = height;
    }

    private void setWidth(double width) {
        validation(width, "Width");
        this.width = width;
    }

    private void setLength(double length) {
        validation(length, "Length");
        this.length = length;
    }

    public double calculateSurfaceArea() {
        return 2 * (this.height * this.width + this.height * this.length + this.length * this.width);
    }

    public double calculateLateralSurfaceArea() {
        return 2 * this.height * (this.length + this.width);
    }

    public double calculateVolume() {
        return this.length * this.height * this.width;
    }

    private void validation(double parameter, String name) {
        if (parameter <= 0) {
            throw new IllegalArgumentException(name + " cannot be zero or negative.");
        }
    }

    public String toString() {
        return String.format("Surface Area - %.2f%n" +
                        "Lateral Surface Area - %.2f%n" +
                        "Volume – %.2f",
                this.calculateSurfaceArea(),
                this.calculateLateralSurfaceArea(),
                this.calculateVolume());
    }

}
