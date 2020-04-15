package bai_5_Avanced_Object_Oriented_Desigin.baitap.resizeable;

import bai_4_ke_thua.thuchanh.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0]=new Rectangle();
        rectangles[1]=new Rectangle(5,8,"green",false);
        rectangles[2]=new Rectangle(5,6);
        System.out.println("Area before");
        for (Rectangle rectangle : rectangles ){
            System.out.println(rectangle.getArea());
        }
        System.out.println("Area after");
        for (Rectangle rectangle : rectangles) {
//            rectangle.resize(50);
        }
    }
}
