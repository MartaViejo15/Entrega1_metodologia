package es.uah.matcomp.mp.e1.herencia.c.e4_1;

public class Line {
    // A line composes of two points (as instance variables)
    private Point begin; // beginning point
    private Point end; // ending point

    // Constructors
    public Line (Point begin, Point end) { // caller to construct the Points
        this.begin = begin;
        this.end = end;
    }
    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY); // construct the Points here
        end = new Point(endX, endY);
    }

    // Public methods
    @Override
    public String toString() {
        return begin.toString() + " " + end.toString();
    }

    public Point getBegin() {
        return begin;
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(int beginX, int beginY) {
        begin = new Point(beginX, beginY);
    }
    public void setEnd(int endX, int endY) {
        end = new Point(endX, endY);
    }

    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }
    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }
    public void setBeginXY(int beginX, int beginY) {
        this.begin.setX(beginX);
        this.begin.setY(beginY);
    }
    public void setEndX(int endX) {
        this.end.setX(endX);
    }
    public void setEndY(int endY) {
        this.end.setY(endY);
    }
    public void setEndXY(int endX, int endY) {
        this.end.setX(endX);
        this.end.setY(endY);
    }

    public int getLength() {  // Length of the line
        return (int) Math.sqrt((end.getX()-begin.getX())*(end.getX()-begin.getX()) + (end.getY()-begin.getY())*(end.getY()-begin.getY()));
    }  // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
    public double getGradient() {  // Gradient in radians
        return (Math.atan2(end.getY()-begin.getY(), end.getX()-begin.getX()));
    }  // Math.atan2(yDiff, xDiff)
}
