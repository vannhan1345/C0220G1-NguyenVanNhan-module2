package Commons;

public class Menu {
    public static void displayMainMenu(){
        System.out.println("-------------Menu--------");
        System.out.println("1. Add New Services"+
        "\n2. Show Services"+
        "\n3. Add New Customer"+
        "\n4. Show Information of Customer"+
        "\n5. Add New Booking"+
        "\n6. Show Information of Employee"+
        "\n7. Booking Movie Ticket 4D"+
        "\n8.	Find Employee"+
        "\n9.	Exit");
        System.out.println("----Please select one function below----");
    }
    public static void displayMenuAddNewService(){
        System.out.println("Add new service menu");
        System.out.println("1. Add New Villa" + "\n" +
                "2. Add New House" + "\n" +
                "3. Add New Room" + "\n" +
                "4. Back to menu" + "\n" +
                "5. Exit");
        System.out.println("Please select one function below: ");
    }
    public static void displayMenuShowService(){
        System.out.println("--------show service menu------");
        System.out.println("1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Name Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n");
        System.out.println("----Please select one function below------");
    }
    public static void displayMenuBackToMain(){
        System.out.println("------------Enter to continue------------");
        ScannerUtils.scanner.nextLine();
    }

}
