package es.uah.matcomp.mp.e1.PolimorfAbstrInterf.d.e6_5;

public class ResizableCircleTest {
    public static void main(String[] args) {
        ResizableCircle rc1 = new ResizableCircle(7.8);
        System.out.println(rc1);
        rc1.resize(25);
        System.out.println(rc1);
    }
}
