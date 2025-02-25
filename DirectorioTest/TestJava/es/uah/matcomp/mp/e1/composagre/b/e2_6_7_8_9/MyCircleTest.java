package es.uah.matcomp.mp.e1.composagre.b.e2_6_7_8_9;

import es.uah.matcomp.mp.e1.herencia.c.e4_1.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void getRadius() {
        MyCircle circle1 = new MyCircle(3,5,6);
        assertEquals(6, circle1.getRadius());
    }

    @Test
    void setRadius() {
        MyCircle circle = new MyCircle(3, 5, 6);
        circle.setRadius(10);
        assertEquals(10, circle.getRadius());
    }

    @Test
    void getCenter() {
        MyPoint center = new MyPoint(4, 2);
        MyCircle circle = new MyCircle(center, 8);
        assertEquals(center, circle.getCenter());
    }

    @Test
    void setCenter() {
        MyCircle circle = new MyCircle(3, 5, 6);
        MyPoint newCenter = new MyPoint(7, 9);
        circle.setCenter(newCenter);
        assertEquals(newCenter, circle.getCenter());
    }

    @Test
    void getCenterX() {
        MyCircle circle = new MyCircle(3, 5, 6);
        assertEquals(3, circle.getCenterX());
    }

    @Test
    void setCenterX() {
        MyCircle circle = new MyCircle(3, 5, 6);
        circle.setCenterX(10);
        assertEquals(10, circle.getCenterX());
    }

    @Test
    void getCenterY() {
        MyCircle circle = new MyCircle(3, 5, 6);
        assertEquals(5, circle.getCenterY());
    }

    @Test
    void setCenterY() {
        MyCircle circle = new MyCircle(3, 5, 6);
        circle.setCenterY(15);
        assertEquals(15, circle.getCenterY());
    }

    @Test
    void getCenterXY() {
        MyCircle circle = new MyCircle(3, 5, 6);
        assertArrayEquals(new float[]{3, 5}, circle.getCenterXY());
    }

    @Test
    void setCenterXY() {
        MyCircle circle = new MyCircle(3, 5, 6);
        circle.setCenterXY(10, 12);
        assertArrayEquals(new float[]{10, 12}, circle.getCenterXY());
    }

    @Test
    void testToString() {
        MyCircle circle = new MyCircle(3, 5, 6);
        assertEquals("MyCircle[radius=6.0, center=(3.0, 5.0)]", circle.toString());
    }

    @Test
    void getArea() {
        MyCircle circle = new MyCircle(3, 5, 6);
        assertEquals(Math.PI * 6 * 6, circle.getArea(), 0.0001);
    }

    @Test
    void getCircumference() {
        MyCircle circle = new MyCircle(3, 5, 6);
        assertEquals(2 * Math.PI * 6, circle.getCircumference(), 0.0001);
    }

    @Test
    void distance() {
        MyCircle circle1 = new MyCircle(3, 5, 6);
        MyCircle circle2 = new MyCircle(8, 10, 4);
        assertEquals(circle1.getCenter().distance(circle2.getCenter()), circle1.distance(circle2));
    }
}