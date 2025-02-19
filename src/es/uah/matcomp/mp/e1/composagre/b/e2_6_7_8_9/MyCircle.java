package es.uah.matcomp.mp.e1.composagre.b.e2_6_7_8_9;

public class MyCircle {
    private MyPoint center;
    private float radius = 1;

    public MyCircle(){
        this.center = new MyPoint(1,2);
    }
    public MyCircle(float x, float y, float radius){
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, float radius){
        this.center = center;
        this.radius = radius;
    }
    public float getRadius(){
        return radius;
    }
    public void setRadius(float radius){
        this.radius = radius;
    }
    public MyPoint getCenter(){
        return center;
    }
    public void setCenter(MyPoint center){
        this.center = center;
    }
    public float getCenterX(){
        return center.getX();
    }
    public void setCenterX(float x){
        this.center.setX(x);
    }
    public float getCenterY(){
        return center.getY();
    }
    public void setCenterY(float y){
        this.center.setY(y);
    }
    public float[] getCenterXY(){
        return new float[]{getCenterX(), getCenterY()};
    }
    public void setCenterXY(float x, float y){
        this.center.setX(x);
        this.center.setY(y);
    }
    public String toString(){
        return "MyCircle[radius=" + radius + ", center=" + center.toString() + "]";
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public double distance(MyCircle other){
        return this.center.distance(other.getCenter());
    }
}
