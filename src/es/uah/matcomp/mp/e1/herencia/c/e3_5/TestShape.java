package es.uah.matcomp.mp.e1.herencia.c.e3_5;

public class TestShape {
    public static void main(String[] args) {
        Square s1 = new Square();
        System.out.println(s1);
        Square s2 = new Square(4.0);
        System.out.println(s2);
        Square s3 = new Square(3.0, "Black", true);
        System.out.println(s3);
        Circle c1 = new Circle();
        System.out.println(c1);
        Circle c2 = new Circle(4.0);
        System.out.println(c2);
        Circle c3 = new Circle(3.0, "Blue", false);
        System.out.println(c3);

        s3.setSide(8.4);
        System.out.println("New side is: " + s3.getSide());
        s3.setLength(9.3);
        System.out.println("New length is: " + s3.getLength());
        s3.setWidth(9.3);
        System.out.println("New width is: " + s3.getWidth());
        c3.setRadius(5.5);
        System.out.println("New radius is: " + c3.getRadius());
        c3.setColor("Yellow");
        System.out.println("New color is: " + c3.getColor());
        c3.setFilled(true);
        System.out.println("Circle now is filled: " + c3.isFilled());

        System.out.println("Square perimeter is: " + s3.getPerimeter());
        System.out.println("Square area is: " + s3.getArea());
        System.out.println("Circle perimeter is: " + c3.getPerimeter());
        System.out.println("Circle area is: " + c3.getArea());
    }
}
