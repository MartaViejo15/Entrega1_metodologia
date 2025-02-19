package es.uah.matcomp.mp.e1.composagre.b.e2_6_7_8_9;

public class TestMyPoint {
    public static void main(String[] args) {
        // Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint(4,5); // Test constructor
        System.out.println(p1); // Test toString()
        p1.setX(8); // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX()); // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0); // Test setXY()
        System.out.println(p1.getXY()[0]); // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p2);
        // Testing the overloaded methods distance()
        System.out.println(p1.distance(p2)); // distance(MyPoint another), distance from p1 (3,0) to p2 (0,4)
        System.out.println(p2.distance(p1)); // distance(MyPoint another), distance from p2 (0,4) to p1 (3,0)
        System.out.println(p1.distance(5, 6)); // distance(int x, int y), distance from p1 (3,0) to given point (5,6)
        System.out.println(p1.distance()); // distance(), distance from p1 (3,0) to origin
    }
}
