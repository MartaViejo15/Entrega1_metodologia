package es.uah.matcomp.mp.e1.composagre.b.e2_6_7_8_9;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(float x1, float y1, float x2, float y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }
    public MyPoint getBegin() {
        return begin;
    }
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    public MyPoint getEnd() {
        return end;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public float getBeginX() {
        return begin.getX();
    }
    public void setBeginX(float beginX) {
        this.begin.setX(beginX);
    }
    public float getBeginY() {
        return begin.getY();
    }
    public void setBeginY(float beginY) {
        this.begin.setY(beginY);
    }
    public float getEndX() {
        return end.getX();
    }
    public void setEndX(float endX) {
        this.end.setX(endX);
    }
    public float getEndY() {
        return end.getY();
    }
    public void setEndY(float endY) {
        this.end.setY(endY);
    }
    public float[] getBeginXY(float x, float y) {
        return new float[]{begin.getX(), begin.getY()};
    }
    public void setBeginXY(float x, float y) {
        begin.setX(x);
        begin.setY(y);
    }
    public float[] getEndXY(float x, float y) {
        return new float[]{end.getX(), end.getY()};
    }
    public void setEndXY(float x, float y) {
        end.setX(x);
        end.setY(y);
    }
    public double getLength() {
        return Math.sqrt(Math.pow(begin.getX(), 2) + Math.pow(begin.getY(), 2));
    }
    public double getGradient(){
        return Math.atan2(end.getY()-begin.getY(), end.getX()-begin.getX());
    }
    public String toString() {
        return "MyLine[" + "begin="+ begin + ", end=" + end + ']';
    }
}
