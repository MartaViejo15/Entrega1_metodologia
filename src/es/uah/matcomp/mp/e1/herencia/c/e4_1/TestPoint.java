package es.uah.matcomp.mp.e1.herencia.c.e4_1;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20); // Construct a Point
        System.out.println(p1);
        // Try setting p1 to (100, 10).
        p1.setX(100);
        p1.setY(10);
        System.out.println("New x is: " + p1.getX());
        System.out.println("New y is: " + p1.getY());
        System.out.println(p1);
        p1.setXY(100, 10);
    }
}
