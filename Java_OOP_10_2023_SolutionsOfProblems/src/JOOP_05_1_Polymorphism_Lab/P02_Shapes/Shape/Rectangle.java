package JOOP_05_1_Polymorphism_Lab.P02_Shapes.Shape;

public class Rectangle extends Shape{
    private Double height;
    private Double	width;

    public Rectangle(Double height, Double width) {
        this.setHeight(height);
        this.setWidth(width);
        this.calculatePerimeter();
        this.calculateArea();
    }

    @Override
    void calculatePerimeter() {
        super.setPerimeter(2*(height+width));
    }

    @Override
    void calculateArea() {
        super.setArea(height*width);
    }

    public Double getHeight() {
        return height;
    }

    private void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    private void setWidth(Double width) {
        this.width = width;
    }
}
