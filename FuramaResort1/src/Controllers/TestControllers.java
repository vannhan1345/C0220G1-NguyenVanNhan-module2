package Controllers;

import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;

public class TestControllers {
    public static void main(String[] args) {
        Services villa = new Villa("vl","villa",50,5,10,"sd","sd","df",50,5);
        Services house = new House("ho","house",70,5,10,"sd","sd","df",5);
        Services room = new Room("ro","room",60,5,10,"sd","dsa");
        villa.showInfor();
        System.out.println("------------------------------");
        house.showInfor();
        System.out.println("------------------------------");
        room.showInfor();


    }
}
