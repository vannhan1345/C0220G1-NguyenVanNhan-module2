package bai_3_lop_va_doi_tuong_trong_java.baitap;

public class Fan {
    private final String Slow="Slow";
    private final String Medium="Medium";
    private  final String Fast="Fast";

    private String speed=Slow;
    private boolean on=false;
    private double radius=5;

    private String color="blue";
    public String getSpeed(){
      return this.speed;
    }

    public void setSpeed(int speed) {
        if(speed==1){
            this.speed=Slow;
        }else if(speed==2){
            this.speed=Medium;
        }else if (speed==3){
            this.speed=Fast;
        }
    }

    public boolean getOn(){
        return this.on;
   }
   public boolean setOn(boolean on) {
      return this.on = on;
   }
   public double getRadius(){
       return this.radius;
   }
   public double setRadius(double radius){
       return this.radius=radius;
   }
   public String getColor(){
       return  this.color;
   }
   public String setColor(String color){
       return this.color=color;
   }

   public Fan(){

    }
//    public Fan(boolean on,int speed,double radius,String color){
//        this.on=on;
//        this.speed=speed;
//        this.radius=radius;
//        this.color=color;
//
//    }
    public String toString(){
        if (getOn()==true){
            return "1. Speed of fan: "+getSpeed()
                    +"\n2.Radius of fan: "+getRadius()
                    +"\n3.Color of fan: "+getColor()
                    +"\nFan is on ";
        }else {
            return "1.Speed of fan: "+getSpeed()
                    +"\n2.Radius of fan: "+getRadius()
                    +"\n3.Color of fan: "+getColor()
                    +"\n4.Fan is off ";

        }

    }

    public static void main(String[] args) {
        Fan fan1=new Fan();
        fan1.setSpeed(3);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan1.setRadius(10);
        Fan fan2=new Fan();
        fan2.setSpeed(2);
        fan2.setColor("blue");
        fan2.setOn(false);
        fan2.setRadius(5);
        System.out.println("Information of Fan 1:");
       System.out.print(fan1);

        System.out.println("Information of Fan 2:");
        System.out.print(fan2);

    }


}
