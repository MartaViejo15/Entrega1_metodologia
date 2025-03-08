package es.uah.matcomp.mp.e1.PolimorfAbstrInterf.d.e6_3_4;

public class TestMovableCircle {
    public static void main(String[] args) {
        MovableCircle mc1 = new MovableCircle(4,5,0,6,7);
        System.out.println(mc1);
        mc1.moveUp();
        System.out.println("Movable circle moves up:" + mc1);
        mc1.moveDown();
        System.out.println("Movable circle moves down:" + mc1);
        mc1.moveLeft();
        System.out.println("Movable circle moves left:" + mc1);
        mc1.moveRight();
        System.out.println("Movable circle moves right:" + mc1);
    }
}
