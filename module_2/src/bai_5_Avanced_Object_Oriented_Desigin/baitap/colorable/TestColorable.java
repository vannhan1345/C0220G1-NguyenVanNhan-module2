package bai_5_Avanced_Object_Oriented_Desigin.baitap.colorable;

import bai_4_ke_thua.thuchanh.Circle;
import bai_4_ke_thua.thuchanh.Rectangle;
import bai_4_ke_thua.thuchanh.Shape;
import bai_4_ke_thua.thuchanh.Square;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Blue", true, 5);
        shapes[1] = new Rectangle(5, 7, "yellow", false);
        shapes[2] = new Square(5, "red", true);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("circle: " + ((Circle) shape).getArea());
            } else if (shape instanceof Square) {
                System.out.println("square: " + ((Square) shape).getArea());
                ((Square) shape).howToColor();
            } else if (shape instanceof Rectangle) {
                System.out.println("rectangle:" + ((Rectangle) shape).getArea());
            }
        }

    }
}
