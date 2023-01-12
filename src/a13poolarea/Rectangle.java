package a13poolarea;

public class Rectangle {
    double length, width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        if (width < 0) {
            width = 0;
        }
        if (length < 0) {
            length = 0;
        }
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return width*length;
    }
}