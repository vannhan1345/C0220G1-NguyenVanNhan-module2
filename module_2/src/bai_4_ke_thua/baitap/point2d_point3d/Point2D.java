package bai_4_ke_thua.baitap.point2d_point3d;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;
    public  Point2D(){

    }
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float getX(){
        return this.x;
    }
    public void setX(float x){
        this.x=x;
    }public float getY(){
        return this.y;
    }
    public void setY(float y){
        this.y=y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        return new float[]{getX(), getY()};
    }
    public String toString(){
        return "("+getX()+","+getY()+")";
    }

    public static void main(String[] args) {
       Point2D point2D=new Point2D();
        System.out.println(point2D);
        Point2D point2D1=new Point2D(2,3);
        System.out.println(point2D1);
    }

}
