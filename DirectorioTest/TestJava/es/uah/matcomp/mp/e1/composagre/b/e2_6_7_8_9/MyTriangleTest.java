package es.uah.matcomp.mp.e1.composagre.b.e2_6_7_8_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyTriangle t = new MyTriangle(new MyPoint(1, 2), new MyPoint(3, 4), new MyPoint(5, 6));
        assertEquals("MyTriangle[v1=(1.0, 2.0), v2=(3.0, 4.0), v3=(5.0, 6.0)]", t.toString());
    }

    @Test
    void getPerimeter() {
        MyTriangle t = new MyTriangle(0, 0, 0, 4, 3, 0);
        assertEquals(12, t.getPerimeter(), 0.001);
    }

    @Test
    void testGetTypeScalene() {
        MyTriangle t = new MyTriangle(2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 8.0f);
        assertEquals("Scalene", t.getType());
    }

    @Test
    void testGetTypeEquilateral() {
        MyTriangle t = new MyTriangle(new MyPoint(0, 0), new MyPoint(0, 4), new MyPoint(3.5f, 2));
        assertEquals("Equilateral", t.getType());
    }

    @Test
    void testGetTypeIsosceles1() {
        MyTriangle t = new MyTriangle(new MyPoint(0, 0), new MyPoint(2, 0), new MyPoint(1, 3));
        assertEquals("Isosceles", t.getType());
    }

    @Test
    void testGetTypeIsosceles2() {
        MyTriangle t = new MyTriangle(new MyPoint(0, 0), new MyPoint(2, 3), new MyPoint(5, 1));
        assertEquals("Isosceles", t.getType());
    }

    @Test
    void testGetTypeIsosceles3() {
        MyTriangle t = new MyTriangle(new MyPoint(0, 0), new MyPoint(0, 2), new MyPoint(2, 0));
        assertEquals("Isosceles", t.getType());
    }
}