package es.uah.matcomp.mp.e1.PolimorfAbstrInterf.d.e6_2;

public class TestGeoObj {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.5);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        Rectangle r1 = new Rectangle(6.3, 7);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
