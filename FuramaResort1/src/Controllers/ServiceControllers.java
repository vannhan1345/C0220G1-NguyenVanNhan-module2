package Controllers;

import Commons.FuncFileCSV_house;
import Commons.FuncFileCSV_room;
import Commons.FuncFileCSV_villa;
import Commons.ScannerUtils;
import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;

import java.util.ArrayList;

import static Commons.Menu.displayMenuAddNewService;
import static Commons.Menu.displayMenuShowService;
import static Controllers.MainControllers.backMainMenu;
import static Controllers.MainControllers.processMain;

public class ServiceControllers {
    public static void addNewServices(){
        displayMenuAddNewService();
        processMenuAddNewService();
    }
    private static void processMenuAddNewService() {
        switch (ScannerUtils.scanner.nextLine()) {
            case "1":
                addNewVilla();
                break;

            case "2":
                addNewHouse();
                break;

            case "3":
                addNewRoom();
                break;
             case "4":
                processMain();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Enter again");
                backMainMenu();
                break;
            }

    }
    private static void addNewVilla() {
        Services villa=new Villa();
        villa=addNewService(villa);
        System.out.println("Enter Room Standard: ");
        ((Villa)villa).setRoomStandard(ScannerUtils.scanner.nextLine());
        System.out.println("Enter Convenient Description: ");
        ((Villa)villa).setConvenientDescription(ScannerUtils.scanner.nextLine());
        System.out.println("Enter Arena Pool: ");
        ((Villa)villa).setAreaPool(Double.parseDouble(ScannerUtils.scanner.nextLine()));
        System.out.println("Enter Number Of Floors: ");
        ((Villa)villa).setNumberOfFloors(Integer.parseInt(ScannerUtils.scanner.nextLine()));
        ArrayList<Villa> villaList= FuncFileCSV_villa.getFileCSVToListVilla();
        villaList.add((Villa)villa);
        FuncFileCSV_villa.writeVillaToCSV(villaList);
        System.out.println("---Add Villa: "+villa.getServiceName()+"successfully");
    }
    private static Services addNewService(Services services) {
        System.out.println("Enter service ID: ");
        services.setId(ScannerUtils.scanner.nextLine());
        System.out.println("Enter service Name: ");
        services.setServiceName(ScannerUtils.scanner.nextLine());
        System.out.println("Enter Arena Used: ");
        services.setAreaUsed(Double.parseDouble(ScannerUtils.scanner.nextLine()));
        System.out.println("Enter Rent Costs: ");
        services.setRentalCosts(Double.parseDouble(ScannerUtils.scanner.nextLine()));
        System.out.println("Enter Max Number Of People: ");
        services.setMaxNumberOfPeople(Integer.parseInt(ScannerUtils.scanner.nextLine()));
        System.out.println("Enter Rent Type");
        services.setTypeRent(ScannerUtils.scanner.nextLine());
        return services;
    }
    private static void addNewHouse() {
        Services house=new House();
        house=addNewService(house);
        System.out.println("Enter Room Standard: ");
        ((House)house).setRoomStandard(ScannerUtils.scanner.nextLine());
        System.out.println("Enter Convenient Description: ");
        ((House)house).setConvenientDescription(ScannerUtils.scanner.nextLine());
        System.out.println("Enter Number Of Floors: ");
        ((House)house).setNumberOfFloors(Integer.parseInt(ScannerUtils.scanner.nextLine()));
        ArrayList<House> houseList= FuncFileCSV_house.getFileCSVToListHouse();
        houseList.add((House) house);
        FuncFileCSV_house.writeHouseToCSV(houseList);
        System.out.println("---Add Villa: "+house.getServiceName()+"successfully");
    }
    private static void addNewRoom() {
        Services room=new Room();
        room=addNewService(room);
        System.out.println("Enter free service: ");
        ((Room)room).setFreeService(ScannerUtils.scanner.nextLine());

        ArrayList<Room> roomList= FuncFileCSV_room.getFileCSVToListRoom();
        roomList.add((Room) room);
        FuncFileCSV_room.writeRoomToCSV(roomList);
        System.out.println("---Add Villa: "+room.getServiceName()+"successfully");
    }

    public static void showServices(){
        displayMenuShowService();
        processMenuShowService();
    }
    public static void processMenuShowService(){
        switch (ScannerUtils.scanner.nextLine()){
            case "1":
                showVilla();
                break;
            case "2":
             //   showHouse();
                break;
            case "3":
            //    showRoom();
                break;
            case "4":
            //    showAllNameVilla();
                break;
            case "5":
             //   showAllNameHouse();
                break;
            case "6":
             //   showAllNameRoom();
                break;
            case "7":
                processMain();
                System.out.println("\n-----------------------");
                break;
            case "8":
                System.exit(0);
                break;
            default:
                System.out.println("Enter the wrong menu display again");
                backMainMenu();
                break;
        }
    }
    private static void showVilla(){
        ArrayList<Villa> villaList= FuncFileCSV_villa.getFileCSVToListVilla();

    }
}

