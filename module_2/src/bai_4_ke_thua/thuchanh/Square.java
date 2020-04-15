package bai_4_ke_thua.thuchanh;

import bai_5_Avanced_Object_Oriented_Desigin.baitap.colorable.Colorable;
import bai_5_Avanced_Object_Oriented_Desigin.baitap.resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable,Colorable {
    public double result = 0;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {

        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        result = getArea() + getArea() * percent / 100;
        System.out.println(result);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }



}
