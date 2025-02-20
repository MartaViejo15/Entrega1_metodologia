package es.uah.matcomp.mp.e1.herencia.c;

public class Cylinder {
    private double height;

    public Cylinder(){
        this.height = 0;
    }
    public Cylinder(double radius){
        this.height = radius;
    }
    public Cylinder(double radius, double height){
        this.height = height;
        this.radius = radius
    }
}
