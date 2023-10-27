package JOOP_01_1_Working_with_Abstraction_Lab.P02_Point_in_Rectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;


    public Rectangle() {
    }

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point) {
        return point.getX() >= bottomLeft.getX() && point.getX() <= topRight.getX() &&
                point.getY() >= bottomLeft.getY() && point.getY() <= topRight.getY();
    }
}
