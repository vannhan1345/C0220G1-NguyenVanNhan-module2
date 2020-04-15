package bai_4_ke_thua.thuchanh;

import bai_5_Avanced_Object_Oriented_Desigin.baitap.colorable.Colorable;
import bai_5_Avanced_Object_Oriented_Desigin.baitap.resizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    protected double radius=1.0;
    public double result = 0;
    public Circle(){

    }
    public Circle(double radius){

        this.radius=radius;
    }
    public Circle(String color,boolean filled, double radius){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double setRadius(double radius){
        return  this.radius=radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }
    @Override
    public String toString(){
        return "A Circle with radius = "+getRadius()+
                ", which is a subclass of " +super.toString();

    }
    @Override
    public void resize(double percent) {
        result = getArea()+getArea()*percent/100;
        System.out.println(result);
    }


    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        Circle circle1=new Circle(2.0);
        System.out.println(circle1);
        Circle circle2=new Circle("red",false,5.0);
        System.out.println(circle2);


    }


}
