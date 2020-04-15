package bai_5_Avanced_Object_Oriented_Desigin.baitap.resizeable;


import bai_4_ke_thua.thuchanh.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle[] circles= new Circle[3];
        circles[0]=new Circle();
        circles[1] =new Circle("red",true,5);
        circles[2] =new Circle(6.2);
        System.out.println("Area before: ");
        for (Circle circle :circles){
            System.out.println(circle.getArea());
        }
        System.out.println("Area after: ");
        for (Circle circle :circles){
            circle.resize(60);
        }
    }


}
