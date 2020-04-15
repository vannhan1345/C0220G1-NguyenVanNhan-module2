package bai_4_ke_thua.baitap.point2d_point3d;

public class Point3D extends Point2D {
    private float z=0.0f;
    public Point3D(){

    }
    public Point3D(float x,float y, float z){
        super(x,y);
        this.z=z;
    }
    public float getZ(){
        return  this.z;
    }
    public void setZ(float z){
        this.z=z;
    }
    public void setXYZ(float x,float y, float z){
        super.setX(x);
        super.setY(y);
        this.z=z;
    }
    @Override
    public String toString(){
        return "("+super.getX()+","+super.getY()+","+getZ()+")";
    }

    public static void main(String[] args) {
        Point3D point3D=new Point3D(4,5,6);
        System.out.println(point3D);
        point3D.setXYZ(2,3,4);
        System.out.println(point3D);
    }
}
