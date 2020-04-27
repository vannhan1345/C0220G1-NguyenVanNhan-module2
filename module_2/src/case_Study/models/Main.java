package case_Study.models;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Services villa= new Villa();
        villa.setId(UUID.randomUUID().toString().replace("_",""));
        System.out.println("Enter name service: ");
        villa.setNameService(sc.nextLine());
        System.out.println("Enter Area Used: ");
        villa.setAreaUsed(sc.nextDouble());
        System.out.println("Enter rental costs: ");
        villa.setRentalCosts(sc.nextDouble());
        System.out.println("Enter max number of people: ");
        villa.setMaxNumberOfPeople(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter type rent: ");
        villa.setTypeRent(sc.nextLine());
        System.out.println("Enter Room Standard: ");
        ((Villa)villa).setRoomStandard(sc.nextLine());
        System.out.println("Enter Convenient Description: ");
        ((Villa)villa).setConvenientDescription(sc.nextLine());
        System.out.println("Enter pool Area: ");
        ((Villa)villa).setPoolArea(sc.nextDouble());
        System.out.println("Enter number of floors: ");
        ((Villa)villa).setNumberOfFloors(sc.nextInt());
        System.out.println(villa.showInfor());

    }

}
