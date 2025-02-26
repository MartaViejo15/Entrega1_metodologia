package es.uah.matcomp.mp.e1.herencia.c.e4_1;

public class LineSub extends Point {
    // A line needs two points: begin and end.
    // The begin point is inherited from its superclass Point.
    // Private variables
    Point end; // Ending point

    // Constructors
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // construct the begin Point
        this.end = new Point(endX, endY); // construct the end Point
    }
    public LineSub (Point begin, Point end) { // caller to construct the Points
        super(begin.getX(), begin.getY()); // need to reconstruct the begin Point
        this.end = end;
    }

    // Public methods
    // Inherits methods getX() and getY() from superclass Point
    @Override
    public String toString() {
        return "LineSub[begin=" + super.toString() + ", end=" + end.toString() + "]";
    }

    public Point getBegin() {
        return new Point(getX(), getY());
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(int beginX, int beginY) {
        super.setX(beginX);
        super.setY(beginY);
    }
    public void setEnd(int endX, int endY) {
        super.setX(endX);
        super.setY(endY);
    }

    public int getBeginX() {
        return getX();
    }
    public int getBeginY() {
        return getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        super.setX(beginX);
    }
    public void setBeginY(int beginY) {
        super.setY(beginY);
    }
    public void setBeginXY(int beginX, int beginY) {
        super.setX(beginX);
        super.setY(beginY);
    }
    public void setEndX(int endX) {
        super.setX(endX);
    }
    public void setEndY(int endY) {
        super.setY(endY);
    }
    public void setEndXY(int endX, int endY) {
        super.setX(endX);
        super.setY(endY);
    }

    public int getLength() {  // Length of the line
        return (int) Math.sqrt((getEndX()-getBeginX())*(getEndX()-getBeginY()) + (getEndY()-getBeginY())*(getEndY()-getBeginY()));
    }
    public double getGradient() {  // Gradient in radians
        return Math.atan2(getEndY()-getBeginY(), getEndX()-getBeginX());
    }

    /* Para el caso que nos ocupa, ¿cuál consideras mejor? ¿Por qué?
    Creo que para este caso es mejor hacerlo con composición, ya que de esta forma
    el código queda más limpio y además la línea se compone de dos puntos, pero no es
    un punto, como podría darse a entender usando herencias. Además, no habrá problema
    con el punto en el test unitario, ya que no apunta hacia el mismo punto
     */

}
