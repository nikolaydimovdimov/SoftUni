package JOOP_05_1_Polymorphism_Lab.P02_Shapes.Shape.Shape_1;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*this.getRadius();
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(this.getRadius(),2);
    }
}
