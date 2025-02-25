package es.uah.matcomp.mp.e1.composagre.b.e2_6_7_8_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void testConstructorWithCoordinates() {
        MyLine line = new MyLine(4, 8, 5, 6);
        assertEquals(4, line.getBeginX());
        assertEquals(8, line.getBeginY());
        assertEquals(5, line.getEndX());
        assertEquals(6, line.getEndY());
    }

    @Test
    void testConstructorWithPoints() {
        MyPoint begin = new MyPoint(7, 0);
        MyPoint end = new MyPoint(0, 7);
        MyLine line = new MyLine(begin, end);
        assertEquals(begin, line.getBegin());
        assertEquals(end, line.getEnd());
    }

    @Test
    void getBegin() {
        MyPoint p1 = new MyPoint(4, 8);
        MyPoint p2 = new MyPoint(5, 6);
        MyLine line = new MyLine(p1, p2);
        assertEquals(p1, line.getBegin());
    }

    @Test
    void setBegin() {
        MyLine line = new MyLine(4, 8, 5, 6);
        MyPoint newBegin = new MyPoint(9, 7);
        line.setBegin(newBegin);
        assertEquals(newBegin, line.getBegin());
    }

    @Test
    void getEnd() {
        MyPoint p1 = new MyPoint(4, 8);
        MyPoint p2 = new MyPoint(5, 6);
        MyLine line = new MyLine(p1, p2);
        assertEquals(p2, line.getEnd());
    }

    @Test
    void setEnd() {
        MyLine line = new MyLine(4, 8, 5, 6);
        MyPoint newEnd = new MyPoint(12, 15);
        line.setEnd(newEnd);
        assertEquals(newEnd, line.getEnd());
    }

    @Test
    void getBeginX() {
        MyLine line = new MyLine(4, 8, 5, 6);
        assertEquals(4, line.getBeginX());
    }

    @Test
    void setBeginX() {
        MyLine line = new MyLine(4, 8, 5, 6);
        line.setBeginX(2);
        assertEquals(2, line.getBeginX());
    }

    @Test
    void getBeginY() {
        MyLine line = new MyLine(4, 8, 5, 6);
        assertEquals(8, line.getBeginY());
    }

    @Test
    void setBeginY() {
        MyLine line = new MyLine(4, 8, 5, 6);
        line.setBeginY(3);
        assertEquals(3, line.getBeginY());
    }

    @Test
    void getEndX() {
        MyLine line = new MyLine(4, 8, 5, 6);
        assertEquals(5, line.getEndX());
    }

    @Test
    void setEndX() {
        MyLine line = new MyLine(4, 8, 5, 6);
        line.setEndX(5);
        assertEquals(5, line.getEndX());
    }

    @Test
    void getEndY() {
        MyLine line = new MyLine(4, 8, 5, 6);
        assertEquals(6, line.getEndY());
    }

    @Test
    void setEndY() {
        MyLine line = new MyLine(4, 8, 5, 6);
        line.setEndY(4);
        assertEquals(4, line.getEndY());
    }

    @Test
    void getBeginXY() {
        MyLine line = new MyLine(4, 8, 5, 6);
        assertArrayEquals(new float[]{4, 8}, line.getBeginXY(1, 2));
    }

    @Test
    void setBeginXY() {
        MyLine line = new MyLine(4, 8, 5, 6);
        line.setBeginXY(7, 12);
        assertArrayEquals(new float[]{7, 12}, line.getBeginXY(1, 2));
    }

    @Test
    void getEndXY() {
        MyLine line = new MyLine(4, 8, 5, 6);
        assertArrayEquals(new float[]{5, 6}, line.getEndXY(3, 4));
    }

    @Test
    void setEndXY() {
        MyLine line = new MyLine(4, 8, 5, 6);
        line.setEndXY(15, 15);
        assertArrayEquals(new float[]{15, 15}, line.getEndXY(3, 4));
    }

    @Test
    void getLength() {
        MyLine line = new MyLine(3, 4, 6, 8);
        assertEquals(5, line.getLength(), 0.0001);
    }

    @Test
    void getGradient() {
        MyLine line = new MyLine(0, 0, 10, 10);
        assertEquals(Math.PI / 4, line.getGradient(), 0.0001);
    }

    @Test
    void testToString() {
        MyLine line = new MyLine(new MyPoint(4, 8), new MyPoint(5, 6));
        assertEquals("MyLine[begin=(4.0, 8.0), end=(5.0, 6.0)]", line.toString());
    }
}