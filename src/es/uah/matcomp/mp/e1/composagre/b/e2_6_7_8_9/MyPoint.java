package es.uah.matcomp.mp.e1.composagre.b.e2_6_7_8_9;

public class MyPoint {
    private float x = 0;
    private float y = 0;

    public MyPoint(float x1, float y1){
        this.x = Math.round(x1);
        this.y = Math.round(y1);
    }
    public MyPoint() {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY() {
        return new float[]{x, y};
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public double distance(float x, float y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(x - another.x, 2) + Math.pow(y - another.y, 2));
    }
    public double distance() {
        return Math.sqrt(Math.pow(x - y, 2) + Math.pow(y, 2));
    }

}
