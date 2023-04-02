package lr2.Task6;

import lr2.Task5.Rectangle;

public class Test {
    public static void main(String[] args) {
        Shape my_shape = new Circle(6.f);
        System.out.printf("Area of the circle is %f\n", my_shape.getArea());
        System.out.printf("Perimeter of the circle is %f\n", my_shape.getPerimeter());

        my_shape = new Square(1.f);
        System.out.printf("Area of the square is %f\n", my_shape.getArea());
        System.out.printf("Perimeter of the square is %f\n", my_shape.getPerimeter());

        my_shape = new Triangle(3.f, 4.f, 5.f);
        System.out.printf("Area of the triangle is %f\n", my_shape.getArea());
        System.out.printf("Perimeter of the triangle is %f\n", my_shape.getPerimeter());
    }
}
