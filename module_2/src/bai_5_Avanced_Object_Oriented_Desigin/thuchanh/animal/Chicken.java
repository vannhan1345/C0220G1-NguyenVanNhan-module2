package bai_5_Avanced_Object_Oriented_Desigin.thuchanh.animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken : cluck cluck! ";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}

