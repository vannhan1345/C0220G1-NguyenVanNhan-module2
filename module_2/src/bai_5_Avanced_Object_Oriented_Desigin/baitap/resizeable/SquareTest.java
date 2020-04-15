package bai_5_Avanced_Object_Oriented_Desigin.baitap.resizeable;

import bai_4_ke_thua.thuchanh.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(2, "pin", true);
        squares[2] = new Square(6);
        System.out.println("Area before:");
        for (Square square : squares) {
            System.out.println(square.getArea());
        }
        System.out.println("Area after: ");
        for (Square square : squares) {
            square.resize(20);
        }
    }
}
