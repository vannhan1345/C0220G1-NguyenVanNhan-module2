package bai_4_ke_thua.baitap.circle_cylinder;

public class Cylinder extends Circle{
    private double height=4;
    public Cylinder(){

    }
    public Cylinder(double height){
        this.height=height;

    }
    public Cylinder(String color,double radius, double height){
        super(radius,color);
        this.height=height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolume(){
        return super.getRadius()*super.getRadius()*this.height*Math.PI;
    }
    @Override
    public String toString(){
        return "Cylinder with height = " +getHeight()+
                " and Volume "+getVolume()+super.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);
        Cylinder cylinder1=new Cylinder(10);
        System.out.println(cylinder1);
        Cylinder cylinder2=new Cylinder("green",6,10);
        System.out.println(cylinder2);

    }

}
