package a12cylinder;

public class Circle {
    double radius;
    public Circle (double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        double area =(radius*radius*Math.PI);
        return area;
    }
}
