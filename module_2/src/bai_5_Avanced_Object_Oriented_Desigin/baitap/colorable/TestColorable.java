package bai_5_Avanced_Object_Oriented_Desigin.baitap.colorable;


public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[3];
        shapeArray[0] = new Circle(5, "blue", true);
        shapeArray[1] = new Rectangle(5.2, 7, "yellow", false);
        shapeArray[2] = new Square(3.4, "red", true);
        for (int i=0;i<shapeArray.length;i++) {
            System.out.println(shapeArray[i]);
            if (shapeArray[i] instanceof Square) {
                shapeArray[i].howToColor();
            }

        }
    }
}