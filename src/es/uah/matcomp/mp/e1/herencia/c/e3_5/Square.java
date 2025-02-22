package es.uah.matcomp.mp.e1.herencia.c.e3_5;

public class Square extends Rectangle{

    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        this.setWidth(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    @Override
    public String toString(){
        return "Square[" + super.toString() + "]";
    }
}
