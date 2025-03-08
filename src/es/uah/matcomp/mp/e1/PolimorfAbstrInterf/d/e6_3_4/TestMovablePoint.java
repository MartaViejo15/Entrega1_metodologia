package es.uah.matcomp.mp.e1.PolimorfAbstrInterf.d.e6_3_4;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint(4,5,7,9);
        System.out.println(m1);
        m1.moveUp();
        System.out.println("Move up:" + m1);
        m1.moveDown();
        System.out.println("Move down:" + m1);
        m1.moveLeft();
        System.out.println("Move left:" + m1);
        m1.moveRight();
        System.out.println("Move right:" + m1);
    }
}
