package controllers;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import commons.FuncFileCSV_customers;
import commons.FuncFileCSV_villa;
import commons.ScannerUtils;
import model.Customers;
import model.Villa;

import java.util.ArrayList;
import java.util.List;

import static controllers.MainController.displayMainMenu;
import static controllers.serviceControllers.*;


public class BookingControllers {
    static int choiceCustomer;
    static int choiceService;
    public static void showInforCustomer1() {
        ArrayList<Customers> listCustomer = FuncFileCSV_customers.getFileCSVToListCustomer();
        for (Customers customers : listCustomer) {
            System.out.println("---------------------");
            System.out.println(customers.showInfor());
            System.out.println("---------------------");


        }
    }
//    static int ticketHasBeenSold = 0;
//    static int totalTickets = 4;
//    static int choiceCustomer = 0;
//    static int seat = 0;
//    static Queue<String> queueCustomerBookingTicket = new LinkedList<>();

    //    static void bookingTicket() {
//        System.out.println(LIST_CUSTOMER);
//        CustomerController.showAllCustomerUsingMap();
//        System.out.println(TOTAL_TICKETS + totalTickets);
//        System.out.println(TICKET_LEFT + (totalTickets - ticketHasBeenSold));
//
//        System.out.println(CHOICE_CUSTOMER_FOR_ORDER);
//        choiceCustomer = scan.nextInt();
//        choiceCustomer--;
//        bookingProcess(choiceCustomer);
//
//    }
//    static void bookingProcess(int numberCustomer) {
//        List<String> listCustomer = ReadFile.getDataFromCsvFile(CUSTOMER_FILE_NAME);
//
//        if (ticketHasBeenSold < totalTickets) {
//
//            seat+=1;
//            queueCustomerBookingTicket.add(SEAT_NUMBER+ seat +listCustomer.get(numberCustomer));
//            ticketHasBeenSold++;
//            System.out.println(BOOKING_TICKET_SUCCESS);
//            System.out.println(TICKET_LEFT + (totalTickets - ticketHasBeenSold));
//        }
//        if (ticketHasBeenSold == totalTickets) {
//            System.out.println(OUT_OF_TICKET);
//            System.out.println(CUSTOMER_LIST_BOOKED);
//            for (String customer : queueCustomerBookingTicket) {
//                System.out.println(customer);
//            }
//        }
//
//    }
    public static void addNewBooking() {
        CustomerControllers.numberedAllCustomerByMap();
        System.out.println("----Choice customer------");
        choiceCustomer = ScannerUtils.scanner.nextInt();
        System.out.println("1.\tBooking Villa\n" +
                "2.\tBooking House\n" +
                "3.\tBooking Room\n" +
                "4.\tBack to menu");
        switch (ScannerUtils.scanner.nextLine()) {
            case "1":
                bookingVilla();
                break;
            case "2":
                bookingHouse();
                break;
            case "3":
                bookingRoom();
                break;
            case "4":
                displayMainMenu();
                break;
        }
    }

    private static void bookingRoom() {
    }

    private static void bookingHouse() {
    }

    private static void bookingVilla() {


    }

    public static void main(String[] args) {
        ArrayList<Villa> villaList = FuncFileCSV_villa.getFileCSVToListVilla();
        System.out.println(villaList.get(0).showInfor());

    }
    static void bookingProcess(int choiceCustomer, int choiceService){

    }

//    private static void bookingVilla() {
//        showAllVilla();
//        System.out.println("----Choice Villa---");
//        choiceService = ScannerUtils.scanner.nextInt();
//        CustomerControllers.bookingService(choiceCustomer, choiceService, VILLA_FILE_NAME);
//    }
//
//    private static void bookingHouse() {
//        showAllHouse();
//        System.out.println(CHOICE_HOUSE);
//        choiceService = scan.nextInt();
//        CustomerController.bookingService(choiceCustomer, choiceService, HOUSE_FILE_NAME);
//    }
//
//    private static void bookingRoom() {
//        showAllRoom();
//        System.out.println(CHOICE_ROOM);
//        choiceService = scan.nextInt();
//        CustomerController.bookingService(choiceCustomer, choiceService, ROOM_FILE_NAME);
//
//    }
}