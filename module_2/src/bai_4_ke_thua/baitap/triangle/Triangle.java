package bai_4_ke_thua.baitap.triangle;

import bai_4_ke_thua.thuchanh.Shape;

public class Triangle extends Shape {
    protected double size1=1.0;
    protected double size2=1.0;
    protected double size3=1.0;
    public Triangle(){

    }
    public Triangle(String color,Boolean filled,double size1,double size2,double size3){
        super(color,filled);
        this.size1=size1;
        this.size2=size2;
        this.size3=size3;
    }
    public double getSize1(){
        return this.size1;
    }
    public void setSize1(double size1){
        this.size1=size1;
    }
    public double getSize2(){
        return this.size2;
    }
    public  void  setSize2(double size2){
        this.size2=size2;
    }
    public double getSize3(){
        return this.size3;
    }
    public void setSize3(double size3){
        this.size3=size3;
    }
    public double getPerimeter(){
        return getSize1()+getSize2()+getSize3();
    }
    public double getArea(){
        return Math.sqrt(getPerimeter()/2*(getPerimeter()/2-getSize1())*
                (getPerimeter()/2-getSize2())*(getPerimeter()/2-getSize3()));
    }
    @Override
    public String toString(){
        return "Perimeter of Triangle: "+getPerimeter()+
                "\nArea of Triangle : "+getArea()+
                "\n"+super.toString();
    }

    public static void main(String[] args) {
      Triangle triangle= new Triangle();
        System.out.println(triangle);
        Triangle triangle1 =new Triangle("red",true,3,3,5);
        System.out.println(triangle1);
    }
}
