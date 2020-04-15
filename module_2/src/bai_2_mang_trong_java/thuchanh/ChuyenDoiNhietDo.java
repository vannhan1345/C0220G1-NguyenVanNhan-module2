package bai_2_mang_trong_java.thuchanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Celsius to fahrenheit: ");
            System.out.println("2. Fahrenheit to celsius");
            System.out.println("0. Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Celsius: ");
                    celsius = sc.nextDouble();
                    System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.print("Enter Fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheit));

                    break;
                case 0:
                    System.exit(0);

            }

        } while (choice != 0);


    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * (5 / 9.0);
        return celsius;
    }
}
