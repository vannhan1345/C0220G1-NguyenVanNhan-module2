package bai_4_ke_thua.baitap.circle_cylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "blue";

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double setPerimeter() {
        return 2 * this.radius * Math.PI;
    }


    public String toString() {
        return "A Circle with radius = " + getRadius() +
                " and color " + getColor();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(10, "yellow");
        System.out.println(circle1);
    }
}
