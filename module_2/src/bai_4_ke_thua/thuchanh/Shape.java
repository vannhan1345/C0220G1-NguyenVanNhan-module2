package bai_4_ke_thua.thuchanh;



public class Shape   {

    protected String color = "green";
    protected boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;

    }

    public boolean isFilled() {
        return this.filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return this.filled;
    }

    public boolean setFilled(boolean filled) {
        return this.filled = filled;
    }


    public String toString() {
        return "A Shape with color of " + getColor() +
                " and " +
                (isFilled() ? " filled" : " not filled");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }



}
