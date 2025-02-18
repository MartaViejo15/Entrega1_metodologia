package es.uah.matcomp.mp.e1.composagre.b.e2_6_7_8_9;

import java.util.Arrays;

public class TestMyLine {
    public static void main(String[] args) {
        // Test for defining the data
        MyLine line1 = new MyLine(4, 8, 5, 6);
        System.out.println(line1);
        MyLine line2 = new MyLine(new MyPoint(7, 0), new MyPoint(0, 7));

        // Test for getters and setters
        line1.setBegin(new MyPoint(9, 7));
        line1.setEnd(new MyPoint(12, 15));
        System.out.println("New begin: " + line1.getBegin());
        System.out.println("New end: " + line1.getEnd());

        line1.setBeginX(2);
        line1.setEndX(5);
        System.out.println("Begin x is: " + line1.getBeginX());
        System.out.println("End x is: " + line1.getEndX());
        line1.setBeginY(3);
        line1.setEndY(4);
        System.out.println("Begin y is: " + line1.getBeginY());
        System.out.println("End y is: " + line1.getEndY());

        line1.setBeginXY(7,12);
        line1.setEndXY(15,15);
        System.out.println("Begin XY is: " + Arrays.toString(line1.getBeginXY(1, 2)));
        System.out.println("End XY is: " + Arrays.toString(line1.getEndXY(3, 4)));

        System.out.println("Line1 length is: " + line1.getLength());
        System.out.println("Line1 gradient is: " + line1.getGradient());
    }
}
