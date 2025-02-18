package es.uah.matcomp.mp.e1.composagre.b.e2_6_7_8_9;

public class TestMyTriangle {
    public static void main(String[] args) {
        // Test for defining the data
        MyTriangle triangle = new MyTriangle(2, 3, 4, 5, 6, 8);
        MyTriangle triangle2 = new MyTriangle(new MyPoint(5,3), new MyPoint(4,5), new MyPoint(6,7));
        System.out.println("Triangle 1:" + triangle);
        System.out.println("Triangle 2:" + triangle2);

        // Test for trying the getters
        System.out.println("Triangle 1 perimeter is: " + triangle.getPerimeter());
        System.out.println("Triangle 1 type is: " + triangle.getType());
        System.out.println("Triangle 2 perimeter is: " + triangle2.getPerimeter());
        System.out.println("Triangle 2 type is: " + triangle2.getType());

        // Test for trying the operations
        MyTriangle triangle3 = new MyTriangle(new MyPoint(0,0), new MyPoint(4,0), new MyPoint(2,4));
        System.out.println("Triangle 3 type: " + triangle3.getType());  // equilateral
        MyTriangle triangle4 = new MyTriangle(new MyPoint(0,0), new MyPoint(2,0), new MyPoint(1,3));
        System.out.println("Triangle 4 type: " + triangle4.getType());  // isosceles
        MyTriangle triangle5 = new MyTriangle(new MyPoint(0,0), new MyPoint(2, 3), new MyPoint(5,1));
        System.out.println("Triangle 5 type: " + triangle5.getType());  // scalene

        // Distance from MyPoint
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(2, 0);
        System.out.println("p1: " + p1);
    }
}
