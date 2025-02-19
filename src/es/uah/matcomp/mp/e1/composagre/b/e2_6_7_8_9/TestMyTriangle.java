package es.uah.matcomp.mp.e1.composagre.b.e2_6_7_8_9;

public class TestMyTriangle {
    public static void main(String[] args) {
        // Test for defining the data
        MyTriangle triangle1 = new MyTriangle(2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 8.0f);
        MyTriangle triangle2 = new MyTriangle(new MyPoint(5,3), new MyPoint(4,5), new MyPoint(6,7));
        System.out.println("Triangle 1: " + triangle1);
        System.out.println("Triangle 2: " + triangle2);

        // Test for trying the getters
        System.out.println("Triangle 1 perimeter is: " + triangle1.getPerimeter());
        System.out.println("Triangle 1 type is: " + triangle1.getType());  // Scalene
        System.out.println("Triangle 2 perimeter is: " + triangle2.getPerimeter());
        System.out.println("Triangle 2 type is: " + triangle2.getType());  // Scalene

        // Test for trying the operations
        MyTriangle triangle3 = new MyTriangle(new MyPoint(0,0), new MyPoint(0, 4), new MyPoint(3.5f,2));
        System.out.println("Triangle 3 type: " + triangle3.getType());  // Equilateral
        MyTriangle triangle4 = new MyTriangle(new MyPoint(0,0), new MyPoint(2,0), new MyPoint(1,3));
        System.out.println("Triangle 4 type: " + triangle4.getType());  // Isosceles with face2 == face3
        MyTriangle triangle5 = new MyTriangle(new MyPoint(0,0), new MyPoint(2, 3), new MyPoint(5,1));
        System.out.println("Triangle 5 type: " + triangle5.getType());  // Isosceles with face1 == face2
        MyTriangle triangle6 = new MyTriangle(new MyPoint(0, 0), new MyPoint(0, 2), new MyPoint(2, 0));
        System.out.println("Triangle 6 type: " + triangle6.getType()); //  Isosceles with face1 == face3
    }
}
