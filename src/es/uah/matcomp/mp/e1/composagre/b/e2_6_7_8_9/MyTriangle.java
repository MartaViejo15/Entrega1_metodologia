package es.uah.matcomp.mp.e1.composagre.b.e2_6_7_8_9;


public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
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

        if (face1 == face2 && face2 == face3){
            return "Equilateral";
        }
        else if (face1 == face2 || face2 == face3 || face3 == face1){
            return "Isosceles";
        }
        else {
            return "Scalene";
        }
    }
}
