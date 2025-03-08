package es.uah.matcomp.mp.e1.PolimorfAbstrInterf.d.e6_1;

import es.uah.matcomp.mp.e1.herencia.c.e3_5.Shape;

public class Circle extends Shape {
    protected double radius = 1.0;

    public Circle() {
        super();
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}
