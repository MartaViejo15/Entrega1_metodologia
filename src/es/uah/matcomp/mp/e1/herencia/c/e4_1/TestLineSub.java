package es.uah.matcomp.mp.e1.herencia.c.e4_1;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub l1 = new LineSub(4,6,1,0);
        System.out.println(l1);
        Point begin=new Point(0,0);
        Point end=new Point(1,1);
        LineSub l2 = new LineSub(begin,end);
        System.out.println(l2);

        l2.setBegin(1,2);
        l2.setEnd(2,3);
        System.out.println("l2 is: begin=" + l2.getBegin() + ", end=" + l2.getEnd());
        l1.setBeginX(0);
        l1.setBeginY(7);
        l1.setEndX(3);
        l1.setEndY(5);
        System.out.println("l1 is:begin=(" + l1.getBeginX() + ", " + l1.getBeginY() + ") , end=(" + l1.getEndX() + ", " + l1.getEndY() + ")");
        l2.setBeginXY(5,9);
        l2.setEndXY(7,8);
        System.out.println(l2);

        System.out.println("l1 Length is: " + l1.getLength());
        System.out.println("l1 Gradient is: " + l1.getGradient());
    }
}
