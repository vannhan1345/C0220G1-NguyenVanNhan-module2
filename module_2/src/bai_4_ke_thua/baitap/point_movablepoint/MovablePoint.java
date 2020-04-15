package bai_4_ke_thua.baitap.point_movablepoint;

public class MovablePoint extends Point {
    protected float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return this.xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return this.ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint move() {
        this.x += xSpeed;
        this.y += ySpeed;
        return this;
    }

    public float[] getSpeed() {
        return new float[]{getXSpeed(), getYSpeed()};
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "),speed = (" + getXSpeed() + "," + getYSpeed() + ")";
    }


    public static void main(String[] args) {
        MovablePoint movablePoint =new MovablePoint();
        System.out.println(movablePoint);
        MovablePoint movablePoint1 = new MovablePoint(1, 5);
        System.out.println(movablePoint1);
        MovablePoint movablePoint2 = new MovablePoint(2, 6, 8, 5);
        movablePoint2.move();
        System.out.println(movablePoint2);
    }


}
