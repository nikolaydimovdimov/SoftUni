package JOOP_05_1_Polymorphism_Lab.P02_Shapes.Shape;

public class Circle extends Shape{
    private Double radius;


    public Circle(Double radius) {
        this.setRadius(radius);
        this.calculatePerimeter();
        this.calculateArea();
    }

    @Override
    void calculatePerimeter() {
        super.setPerimeter(2* Math.PI*radius);
    }

    @Override
    void calculateArea() {
        super.setArea(Math.PI*radius*radius);
    }

    public final Double getRadius() {
        return radius;
    }

    private void setRadius(Double radius) {
        this.radius = radius;
    }
}
