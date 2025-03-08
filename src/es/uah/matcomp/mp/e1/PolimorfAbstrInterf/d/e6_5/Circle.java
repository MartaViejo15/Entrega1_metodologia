package es.uah.matcomp.mp.e1.PolimorfAbstrInterf.d.e6_5;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle[" + radius + "]";
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
