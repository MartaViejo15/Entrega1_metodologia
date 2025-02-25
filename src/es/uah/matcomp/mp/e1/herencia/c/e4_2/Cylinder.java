package es.uah.matcomp.mp.e1.herencia.c.e4_2;

public class Cylinder {
    private Circle base; // Base circle, an instance of Circle class
    private double height;

    // Constructor with default color, radius and height
    public Cylinder() {
        base = new Circle(); // Call the constructor to construct the Circle
        height = 1.0;
    }
    public Cylinder(double height) {
        base = new Circle();
        this.height = height;
    }
    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }
    public double getRadius() {
        return base.getRadius();
    }
    public void setRadius(double radius) {
        base.setRadius(radius);
    }
    public String getColor() {
        return base.getColor();
    }
    public void setColor(String color) {
        base.setColor(color);
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return base.getArea() * height;
    }
    @Override
    public String toString() {
        return "Cylinder[base=" + base.toString() + ", height=" + height + ", volume=" + getVolume() + "]";
    }
}
