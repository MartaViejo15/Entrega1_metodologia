package es.uah.matcomp.mp.e1.herencia.c.e3_4;

import java.util.Arrays;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(4.5f, 5.5f,7.8f, 4.3f);
        System.out.println(p1);
        MovablePoint p2 = new MovablePoint(1.2f, 3.4f);
        System.out.println(p2);
        MovablePoint p3 = new MovablePoint();
        System.out.println(p3);
        Point p4 = new Point();
        System.out.println(p4);
        Point p5 = new Point(4.7f, 9.8f);
        System.out.println(p5);

        p4.setX(5.5f);
        System.out.println("New p4 x: " + p4.getX());
        p4.setY(4.3f);
        System.out.println("New p4 y: " + p4.getY());
        p4.setXY(1.0f,3.0f);
        System.out.println("New p4: " + Arrays.toString(p4.getXY()));
        p3.setXSpeed(4f);
        System.out.println("New p3 xSpeed: " + p3.getXSpeed());
        p3.setYSpeed(5f);
        System.out.println("New p3 ySpeed: " + p3.getYSpeed());
        p3.setSpeed(7f, 8f);
        System.out.println("New p3 speed: " + Arrays.toString(p3.getSpeed()));

        System.out.println("Before move:" + p1);
        p1.move();

    }
}
