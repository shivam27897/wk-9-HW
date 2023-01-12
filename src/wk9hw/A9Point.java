package wk9hw;

/*
9. Point
You have to represent a point in 2D space. Write a class with the name Point. The class needstwo
fields (instance variables) with name x and y of type int.
The class needsto have two constructors. The first constructor does not have any parameters(no-arg
constructor). The second constructor has parameters x and y of type int and it needsto initialize the
fields.
Write the following methods(instance methods):
* Method named getX without any parameters, it needsto return the value of x field.
* Method named getY without any parameters, it needsto return the value of y field.
* Method named setX with one parameter oftype int, it needs to set the value of the x field.
* Method named setY with one parameter oftype int, it needs to set the value of the y field.
* Method named distance without any parameters, it needsto return the distance between this
Point and Point 0,0 as double.
* Method named distance with two parameters x, y both of type int, it needs to return the distance
between this Point and Point x,y as double.
* Method named distance with parameter another of type Point, it needsto return the distance
between this Point and another Point as double.
How to find the distance between two points?
To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
Where √ represents square root.
TEST EXAMPLE
→ TEST CODE: Write the below code into the main method.
Point first = new Point(6, 5);
Pointsecond = new Point(3, 1);
System.out.println("distance(0,0)= " + first.distance());

System.out.println("distance(second)= " + first.distance(second));
System.out.println("distance(2,2)= " + first.distance(2, 2));
Point point = new Point();
System.out.println("distance()= " + point.distance());
OUTPUT
distance(0,0)= 7.810249675906654
distance(second)= 5.0
distance(2,2)= 5.0
distance()= 0.0
NOTE: Use Math.sqrt to calculate the square root √.
NOTE: Try to avoid duplicated code.
NOTE: All methodsshould be defined as public NOT public static.
NOTE: In total, you have to write 7 methods.
 */
public class A9Point {
    int x,y;
    public A9Point(){
    }
    public A9Point (int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){ return x; }
    public int getY(){ return y; }
    public void setX(int x){ this.x=x; }
    public void setY(int y){ this.y=y; }
    public double distance(){
        return distance(0,0);
    }
    public double distance(int x,int y){
        return Math.sqrt((x -this.x)*(x-this.x)+(y -this.y)*(y-this.y));
    }
    public double distance (A9Point secondPoint){
        return distance(secondPoint.x, secondPoint.y);
    }

    public static void main(String[] args) {
        A9Point first = new A9Point(6, 5);
        A9Point second = new A9Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        A9Point point = new A9Point();
        System.out.println("distance()= " + point.distance());
    }
}