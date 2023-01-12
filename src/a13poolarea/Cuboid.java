package a13poolarea;

public class Cuboid extends Rectangle {
    double height;
    public Cuboid (double width, double length, double height){
        super(length, width);
        this.height=height;
        if(height<0){
            height=0;
        }
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}
