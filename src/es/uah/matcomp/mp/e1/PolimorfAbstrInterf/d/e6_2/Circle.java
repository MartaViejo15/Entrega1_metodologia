package es.uah.matcomp.mp.e1.PolimorfAbstrInterf.d.e6_2;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}
