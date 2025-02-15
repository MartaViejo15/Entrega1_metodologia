package es.uah.matcomp.mp.e1.ejerciciosclases.a.e1_2;

/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius = 1.0;


    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        double radius1 = radius;
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double radius) { // 2nd constructor
        this.radius = radius;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }
    // 3rd constructor to construct a new instance of Circle with the given radius and color
    public Circle (double radius, String color) {
        this.radius = radius;
    }


    // Setter for instance variable radius
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    public float getCircumference() {
        return ((Double) (2 * Math.PI * radius)).floatValue();
    }


}
