package Controllers;

import Commons.ScannerUtils;

import static Commons.Menu.displayMainMenu;
import static Commons.Menu.displayMenuBackToMain;
import static Controllers.BookingControllers.addNewBooking;
import static Controllers.BookingControllers.bookingMovieTicket4D;
import static Controllers.CustomerControllers.addNewCustomer;
import static Controllers.CustomerControllers.showInformationOfCustomer;
import static Controllers.EmployeeControllers.findEmployee;
import static Controllers.EmployeeControllers.showInformationOfEmployee;
import static Controllers.ServiceControllers.addNewServices;
import static Controllers.ServiceControllers.showServices;

public class MainControllers {

    public static void processMain() {
        try {
            displayMainMenu();
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
                showInformationOfCustomer();
                break;

            case "5":
                addNewBooking();
                break;

            case "6":
                showInformationOfEmployee();
                break;

            case "7":
                bookingMovieTicket4D();
                break;

            case "8":
                findEmployee();
                break;

            case "9":
                System.exit(0);
                break;

            default:
                System.out.println("Error.Back to main menu: ");
                displayMainMenu();
                break;


        }
    }
    static void backMainMenu() {
        displayMenuBackToMain();
        processMain();
    }
}
