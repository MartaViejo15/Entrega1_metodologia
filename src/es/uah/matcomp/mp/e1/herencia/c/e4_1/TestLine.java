package es.uah.matcomp.mp.e1.herencia.c.e4_1;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(4,5);
        Point p2 = new Point(3,1);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);

        l1.setBegin(3,1);
        l1.setEnd(4,7);
        System.out.println("l1: " + l1.getBegin() + " " + l1.getEnd());
        l2.setBeginX(8);
        l2.setBeginY(9);
        System.out.println("l2: " + l2.getBeginX() + " " + l2.getBeginY());
        l2.setEndX(10);
        l2.setEndY(11);
        System.out.println("l2: " + l2.getEndX() + " " + l2.getEndY());
        l1.setBeginXY(4,0);
        l1.setEndXY(3,0);
        System.out.println("l1 is" + l1);

        System.out.println("l1 Length is:" + l1.getLength());
        System.out.println("l1 Gradient is" + l1.getGradient());
    }
}
