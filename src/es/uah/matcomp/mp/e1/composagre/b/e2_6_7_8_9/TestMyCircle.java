package es.uah.matcomp.mp.e1.composagre.b.e2_6_7_8_9;

import java.util.Arrays;

public class TestMyCircle {
    public static void main(String[] args) {
        // Test for defining the data
        MyCircle circle1 = new MyCircle();
        MyCircle circle2 = new MyCircle(3,5,6);
        MyCircle circle3 = new MyCircle( new MyPoint(4,2),8);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        // Test for getters and setters
        circle2.setRadius(2);
        System.out.println("New radius is:" + circle2.getRadius());
        circle2.setCenter(new MyPoint(5,7));
        System.out.println("New center is:" + circle2.getCenter());
        circle2.setCenterX(8);
        System.out.println("New center x is:" + circle2.getCenterX());
        circle2.setCenterY(17);
        System.out.println("New center y is:" + circle2.getCenterY());
        circle2.setCenterXY(21,18);
        System.out.println("New center xy is:" + Arrays.toString(circle2.getCenterXY()));

        // Test for operations
        System.out.println("Circle area is:" + circle2.getArea());
        System.out.println("Circle circumference is:" + circle2.getCircumference());
        System.out.println("Circle distance to another is:" + circle2.distance(circle1)); // Distance from this circle (centers) to the one given with MyPoint
    }
}
