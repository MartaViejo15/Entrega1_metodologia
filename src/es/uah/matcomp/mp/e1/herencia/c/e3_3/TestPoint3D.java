package es.uah.matcomp.mp.e1.herencia.c.e3_3;

import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(0.4f,1.6f,0.8f);
        System.out.println(p1);
        Point2D p2 = new Point2D(3.6f,4.8f);
        System.out.println(p2);
        Point3D p3 = new Point3D();
        System.out.println(p3);
        Point2D p4 = new Point2D();
        System.out.println(p4);

        p2.setX(2.0f);
        System.out.println("New p2 x: " + p2.getX());
        p2.setY(2.4f);
        System.out.println("New p2 y: " + p2.getY());
        p1.setX(5.9f);
        System.out.println("New p1 x: " + p1.getX());
        p1.setY(7.2f);
        System.out.println("New p1 y: " + p1.getY());
        p1.setZ(11.01f);
        System.out.println("New p1 z: " + p1.getZ());

        p1.setXYZ(4.6f,3.3f,0.5f);
        System.out.println("New p1: " + Arrays.toString(p1.getXYZ()));
        p2.setXY(7.3f,8.5f);
        System.out.println("New p2 x: " + Arrays.toString(p2.getXY()));
    }
}
