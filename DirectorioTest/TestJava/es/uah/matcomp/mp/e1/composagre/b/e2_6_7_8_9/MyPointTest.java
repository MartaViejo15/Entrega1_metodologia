package es.uah.matcomp.mp.e1.composagre.b.e2_6_7_8_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint p1 = new MyPoint();
        p1.setX(8);
        assertEquals(8, p1.getX());
    }

    @Test
    void setX() {
        MyPoint p1 = new MyPoint();
        p1.setX(8);
        assertEquals(8, p1.getX());
    }

    @Test
    void getY() {
        MyPoint p1 = new MyPoint();
        p1.setY(6);
        assertEquals(6, p1.getY());
    }

    @Test
    void setY() {
        MyPoint p1 = new MyPoint();
        p1.setY(6);
        assertEquals(6, p1.getY());
    }

    @Test
    void getXY() {
        MyPoint p1 = new MyPoint(4, 5);
        float[] xy = p1.getXY();
        assertEquals(4, xy[0]);
        assertEquals(5, xy[1]);
    }

    @Test
    void setXY() {
        MyPoint p1 = new MyPoint();
        p1.setXY(3, 0);
        assertEquals(3, p1.getX());
        assertEquals(0, p1.getY());
    }

    @Test
    void testToString() {
        MyPoint p1 = new MyPoint(4, 5);
        assertEquals("(4.0, 5.0)", p1.toString());
    }

    @Test
    void distance() {  // Distance to another point
        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);
        assertEquals(5, p1.distance(p2), 0.001);
        assertEquals(5, p2.distance(p1), 0.001);
    }

    @Test
    void testDistance() { // Distance to (x,y)
        MyPoint p1 = new MyPoint(3, 0);
        assertEquals(6.324, p1.distance(5, 6), 0.001);
    }

    @Test
    void testDistance1() {  // Distance to (0,0)
        MyPoint p1 = new MyPoint(3, 0);
        assertEquals(3, p1.distance(), 0.001);
    }
}