package es.uah.matcomp.mp.e1.herencia.c.e4_2;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();
        System.out.println(cyl);
        Cylinder cyl2 = new Cylinder(4.0);
        System.out.println(cyl2);
        Cylinder cyl3 = new Cylinder(5.0, 4.0);
        System.out.println(cyl3);
        Cylinder cyl4 =  new Cylinder(4.0, 5.0, "Blue");
        System.out.println(cyl4);
        Circle cr1 = new Circle();
        System.out.println(cr1);
        Circle cr2 = new Circle(4.0);
        System.out.println(cr2);
        Circle cr3 = new Circle(5.0, "Red");
        System.out.println(cr3);

        cyl.setRadius(5.0);
        System.out.println("Cylinder radius: " + cyl.getRadius());
        cyl.setColor("Yellow");
        System.out.println("Cylinder color: " + cyl.getColor());
        cyl.setHeight(7.5);
        System.out.println("Cylinder height: " + cyl.getHeight());
        cr1.setRadius(5.75);
        System.out.println("Circle radius: " + cr1.getRadius());
        cr1.setColor("Purple");
        System.out.println("Circle color: " + cr1.getColor());
        System.out.println("Circle perimeter: " + cr1.getPerimeter());
        System.out.println("Circle area: " + cr1.getArea());
        System.out.println("Cylinder volume: " + cyl.getVolume());

        /* ¿Qué diseño es mejor en este caso? ¿Por qué?
        Para este caso es mejor opción la composición, porque un cilindro tiene un círculo,
        pero no es un círculo, por lo que la herencia no funcionaría tan bien como la composición.
        Además, con la composición podemos modificar Circle dentro de Cylinder sin modificar
        la clase original.
         */

    }
}
