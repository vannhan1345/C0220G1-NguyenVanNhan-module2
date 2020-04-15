package bai_4_ke_thua.baitap.point_movablepoint;

public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY() {

    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{getX(), getY()};
    }

    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }

    public static void main(String[] args) {
       Point point = new Point();
        System.out.println(point);
        Point point1 = new Point(2, 6);
        System.out.println(point1);
    }
}
