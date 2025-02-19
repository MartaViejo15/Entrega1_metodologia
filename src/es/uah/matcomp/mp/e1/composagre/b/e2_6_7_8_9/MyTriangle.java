package es.uah.matcomp.mp.e1.composagre.b.e2_6_7_8_9;


public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public String toString() {
        return "MyTriangle[v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
    }
    public double getPerimeter() {
        double face1 = v1.distance(v2);
        double face2 = v2.distance(v3);
        double face3 = v3.distance(v1);
        return face1 + face2 + face3;
    }
    public String getType(){
        double face1 = v1.distance(v2);
        double face2 = v2.distance(v3);
        double face3 = v3.distance(v1);

        if (Math.abs(face1 - face2) <= 0.5 && Math.abs(face2 - face3) <= 0.5) {
            return "Equilateral";
        }
        else if (Math.abs(face1 - face2) <= 0.1 || Math.abs(face2 - face3) <= 0.1 || Math.abs(face3 - face1) <= 0.1){
            return "Isosceles";
        }
        else {
            return "Scalene";
        }
    }
}
