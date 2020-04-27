package Controllers;

import Commons.ScannerUtils;

import static Commons.Menu.displayMenuBackToMain;
import static Commons.Menu.displayMenuMain;
import static Controllers.BookingController.addNewBooking;
import static Controllers.BookingController.bookingMovieTicket4D;
import static Controllers.CustomerController.addNewCustomer;
import static Controllers.CustomerController.showInformationCustomers;
import static Controllers.EmployeeController.findEmployeeFromResume;
import static Controllers.EmployeeController.showInformationEmployees;
import static Controllers.ServiceController.addNewServices;
import static Controllers.ServiceController.showServices;

public class MainController {
    public static void processMain() {
        try {
            displayMenuMain();
            processMenuMain();
        } catch (Exception e) {
            backMainMenu();
        }
    }
    public static void processMenuMain() {
        switch (ScannerUtils.scanner.nextLine()) {
            case "1":
                addNewServices();
                break;
            case "2":
                showServices();
                break;
            case "3":
                addNewCustomer();
                break;
            case "4":
                showInformationCustomers();
                break;
            case "5":
                addNewBooking();
                break;
            case "6":
                showInformationEmployees();
                break;
            case "7":
                bookingMovieTicket4D();
                break;
            case "8":
                findEmployeeFromResume();
                break;
            case "9":
                System.exit(0);
            default:
                System.out.println("Error!!! is backing");
                backMainMenu();
        }
    }
    public static void backMainMenu() {
        displayMenuBackToMain();
        processMain();
    }
}
