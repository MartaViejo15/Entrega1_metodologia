/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
     public Circle(double radius) { // 2nd constructor
        this.radius = radius;
        color = "red";
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
    public Circle (double radius, String c) {
        this.radius = radius;
    }

    // Getter for instance variable color
    public String getColor() {
        return color;
    }
    // Setter for instance variable radius
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    // Setter for instance variable color
    public void setColor(String newColor) {
        color = newColor;
    }

    /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

}
