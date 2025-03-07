package es.uah.matcomp.mp.e1.PolimorfAbstrInterf.d.e6_1;

import es.uah.matcomp.mp.e1.herencia.c.e3_5.Shape;

public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle(){
        super();
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2 * width + 2 * length;
    }
    @Override
    public String toString(){
        return "Rectangle[" + super.toString() + "width=" + width + ", length=" + length + "]";
    }
}
