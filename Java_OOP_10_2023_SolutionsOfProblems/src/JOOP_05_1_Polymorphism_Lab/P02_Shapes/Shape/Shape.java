package JOOP_05_1_Polymorphism_Lab.P02_Shapes.Shape;

public abstract class Shape {
    private Double perimeter;
    private Double area;
    abstract void calculatePerimeter();
    abstract void calculateArea();

    public Double getPerimeter() {
        return perimeter;
    }

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getArea() {
        return area;
    }

    protected void setArea(Double area) {
        this.area = area;
    }
}
