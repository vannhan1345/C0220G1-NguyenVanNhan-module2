package controllers;

import commons.FuncFileCSV_house;
import commons.FuncFileCSV_room;
import commons.FuncFileCSV_villa;
import commons.ScannerUtils;
import model.House;
import model.Room;
import model.Villa;

import java.util.ArrayList;


import static controllers.MainController.addNewServices;
import static controllers.MainController.showServices;

public class serviceControllers {
    private static ArrayList<Villa> listVilla = new ArrayList<>();
    private static ArrayList<House> listHouse = new ArrayList<House>();
    private static ArrayList<Room> listRoom = new ArrayList<Room>();
    private static String checkIdVilla = "^(SVVL)-([0-9]{4})+$";
    private static String checkIdHouse = "^(SVHO)-([0-9]{4})+$";
    private static String checkIdRoom = "^(SVRO)-([0-9]{4})+$";
    private static String checkNameService = "^[A-Z]+([a-z]{1,}$)";
    private static String checkRentCosts = "^[1-9]+[\\d]*$";
    private static String checkNumberOfPeople = "(^[01][1-9]$|^10$|^[1-9]$)";
    private static String checkArea = "(^[3-9][\\d]{0,3}\\.+0[1-9]{1,}|^[12][\\d]{2,3}\\.([\\d])*$)";
    public static void addNewVilla() {

        listVilla = FuncFileCSV_villa.getFileCSVToListVilla();
        Villa villa = new Villa();

        do {
            System.out.println("Enter id service: ");
            villa.setId(ScannerUtils.scanner.nextLine());
        } while (!isIdVilla(villa.getId()));

        do {
            System.out.println("Enter name service: ");
            villa.setNameService(ScannerUtils.scanner.nextLine());
        } while (!isNameService(villa.getNameService()));

        do {
            System.out.println("Enter Area Used: ");
            villa.setAreaUsed(ScannerUtils.scanner.nextLine());
        } while (!isAreaUsed(String.valueOf(villa.getAreaUsed())));

        do {
            System.out.println("Enter rental costs: ");
            villa.setRentalCosts(ScannerUtils.scanner.nextLine());
        } while (!isRentalCosts(String.valueOf(villa.getRentalCosts())));

        do {
            System.out.println("Enter max number of people: ");
            villa.setMaxNumberOfPeople(ScannerUtils.scanner.nextLine());
        } while (!isMaxNumberOfPeople(String.valueOf(villa.getMaxNumberOfPeople())));

        do {
            System.out.println("Enter type rent: ");
            villa.setTypeRent(ScannerUtils.scanner.nextLine());
        } while (!isTypeRent(villa.getTypeRent()));

        do {
            System.out.println("Enter Room Standard: ");
            villa.setRoomStandard(ScannerUtils.scanner.nextLine());
        } while (!isRoomStandard(villa.getRoomStandard()));


        System.out.println("Enter Convenient Description: ");
        villa.setConvenientDescription(ScannerUtils.scanner.nextLine());

        do {
            System.out.println("Enter pool Area: ");
            villa.setPoolArea(ScannerUtils.scanner.nextLine());
        } while (!isAreaPool(String.valueOf(villa.getPoolArea())));
        do {
            System.out.println("Enter number of floors: ");
            villa.setNumberOfFloors(ScannerUtils.scanner.nextLine());
        } while (!isNumberOfFloors(String.valueOf(villa.getNumberOfFloors())));

        listVilla.add(villa);
        FuncFileCSV_villa.writeVillaToCSV(listVilla);
        System.out.println("Add new villa complete, Enter to continue...");
        ScannerUtils.scanner.nextLine();
        addNewServices();

    }

    public static boolean isIdVilla(String s) {
        if (!(s.matches(checkIdVilla))) {
            System.out.println("ID invalid, please enter again");
            return false;
        }
        return true;
    }
    public static boolean isIdHouse(String s) {
        if (!(s.matches(checkIdHouse))) {
            System.out.println("ID invalid, please enter again");
            return false;
        }
        return true;
    }
    public static boolean isIdRoom(String s) {
        if (!(s.matches(checkIdRoom))) {
            System.out.println("ID invalid, please enter again");
            return false;
        }
        return true;
    }

    public static boolean isNameService(String s) {
        if (!(s.matches(checkNameService))) {
            System.out.println("Name service invalid, please enter again");
            return false;
        }
        return true;
    }

    public static boolean isAreaUsed(String s) {
        if (!(s.matches(checkArea))) {
            System.out.println("Area Used invalid, please enter again");
            return false;
        }
        return true;
    }

    public static boolean isRentalCosts(String s) {
        if (!(s.matches(checkRentCosts))) {
            System.out.println("Rental Cost invalid, please enter again");
            return false;
        }
        return true;
    }

    public static boolean isMaxNumberOfPeople(String s) {
        if (!(s.matches(checkNumberOfPeople))) {
            System.out.println("Number of people invalid, please enter again");
            return false;
        }
        return true;
    }
    public static boolean isTypeRent(String s) {
        if (!(s.matches(checkNameService))) {
            System.out.println("Type rent service invalid, please enter again");
            return false;
        }
        return true;
    }
    public static boolean isRoomStandard(String s) {
        if (!(s.matches(checkNameService))) {
            System.out.println("Room Standard service invalid, please enter again");
            return false;
        }
        return true;
    }

    public static boolean isAreaPool(String s) {
        if (!(s.matches(checkArea))) {
            System.out.println("Area pool invalid, please enter again");
            return false;
        }
        return true;
    }

    public static boolean isNumberOfFloors(String s) {
        if (!(s.matches(checkRentCosts))) {
            System.out.println("Number of floors invalid, please enter again");
            return false;
        }
        return true;
    }


    public static void addNewHouse() {
        listHouse = FuncFileCSV_house.getFileCSVToListHouse();

        House house = new House();
        do {
            System.out.println("Enter Id Service: ");
            house.setId(ScannerUtils.scanner.nextLine());
        } while (!isIdHouse(house.getId()));

        do {
            System.out.println("Enter name service: ");
            house.setNameService(ScannerUtils.scanner.nextLine());
        } while (!isNameService(house.getNameService()));

        do {
            System.out.println("Enter Area Used: ");
            house.setAreaUsed(ScannerUtils.scanner.nextLine());
        } while (!isAreaUsed(String.valueOf(house.getAreaUsed())));

        do {
            System.out.println("Enter rental costs: ");
            house.setRentalCosts(ScannerUtils.scanner.nextLine());
        } while (!isRentalCosts(String.valueOf(house.getRentalCosts())));

        do {
            System.out.println("Enter max number of people: ");
            house.setMaxNumberOfPeople(ScannerUtils.scanner.nextLine());
        } while (!isMaxNumberOfPeople(String.valueOf(house.getMaxNumberOfPeople())));

        do {
            System.out.println("Enter type rent: ");
            house.setTypeRent(ScannerUtils.scanner.nextLine());
        } while (!isTypeRent(house.getTypeRent()));

        do {
            System.out.println("Enter Room Standard: ");
            house.setRoomStandard(ScannerUtils.scanner.nextLine());
        } while (!isRoomStandard(house.getRoomStandard()));


        System.out.println("Enter Convenient Description: ");
        house.setConvenientDescription(ScannerUtils.scanner.nextLine());


        do {
            System.out.println("Enter number of floors: ");
            house.setNumberOfFloors(ScannerUtils.scanner.nextLine());
        } while (!isNumberOfFloors(String.valueOf(house.getNumberOfFloors())));

        listHouse.add(house);
        FuncFileCSV_house.writeHouseToCSV(listHouse);
        System.out.println("Add new house complete, Enter to continue...");
        ScannerUtils.scanner.nextLine();
        addNewServices();
    }

    public static void addNewRoom() {
        listRoom = FuncFileCSV_room.getFileCSVToListRoom();

        Room room = new Room();
        do {
            System.out.println("Enter Id Service room: ");
            room.setId(ScannerUtils.scanner.nextLine());
        } while (!isIdRoom(room.getId()));

        do {
            System.out.println("Enter name service: ");
            room.setNameService(ScannerUtils.scanner.nextLine());
        } while (!isNameService(room.getNameService()));

        do {
            System.out.println("Enter Area Used: ");
            room.setAreaUsed(ScannerUtils.scanner.nextLine());
        } while (!isAreaUsed(String.valueOf(room.getAreaUsed())));

        do {
            System.out.println("Enter rental costs: ");
            room.setRentalCosts(ScannerUtils.scanner.nextLine());
        } while (!isRentalCosts(String.valueOf(room.getRentalCosts())));

        do {
            System.out.println("Enter max number of people: ");
            room.setMaxNumberOfPeople(ScannerUtils.scanner.nextLine());
        } while (!isMaxNumberOfPeople(String.valueOf(room.getMaxNumberOfPeople())));

        do {
            System.out.println("Enter type rent: ");
            room.setTypeRent(ScannerUtils.scanner.nextLine());
        } while (!isTypeRent(room.getTypeRent()));

        System.out.println("Enter Free service included: ");
        room.setFreeService(ScannerUtils.scanner.nextLine());

        listRoom.add(room);
        FuncFileCSV_room.writeRoomToCSV(listRoom);
        System.out.println("Add new Room complete, Enter to continue...");
        ScannerUtils.scanner.nextLine();
        addNewServices();
    }
    public static void showAllVilla() {
        listVilla = FuncFileCSV_villa.getFileCSVToListVilla();
        for (Villa villa : listVilla) {
            System.out.println("------------------------------");

            System.out.println(villa.showInfor());
            System.out.println("------------------------------");

        }

        System.out.println("Enter to continue...");
        ScannerUtils.scanner.nextLine();
        showServices();
    }

    public static void showAllHouse() {
        listHouse = FuncFileCSV_house.getFileCSVToListHouse();
        for (House house : listHouse) {
            System.out.println("------------------------------");
            System.out.println(house.showInfor());
            System.out.println("------------------------------");

        }

        System.out.println("Enter to continue...");
        ScannerUtils.scanner.nextLine();
        showServices();
    }

    public static void showAllRoom() {
        listRoom = FuncFileCSV_room.getFileCSVToListRoom();
        for (Room room : listRoom) {
            System.out.println("------------------------------");
            System.out.println(room.showInfor());
            System.out.println("------------------------------");

        }

        System.out.println("Enter to continue...");
        ScannerUtils.scanner.nextLine();
        showServices();
    }
}
