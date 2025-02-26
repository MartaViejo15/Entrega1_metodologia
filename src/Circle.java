/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius = 1.0;
    private String color = "red";

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        double radius1 = radius;
        String color1 = color;
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
    public Circle (double radius, String color) {
        this.radius = radius;
        this.color = color;
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

    /*¿Puede ejecutarse la clase creada?
    No, ya que es una clase y no un main.

    Intenta acceder al atributo radio desde el programa principal. ¿Es posible? ¿Por qué? Indica los
    mensajes recibidos.
    No, porque el atributo radius es privado.
    El mensaje recibido es 'radius' has private access in 'Circle'

    ¿Podemos poner un radio negativo?
    Sí, porque double puede ser tanto positivo como negativo.
     */

}
