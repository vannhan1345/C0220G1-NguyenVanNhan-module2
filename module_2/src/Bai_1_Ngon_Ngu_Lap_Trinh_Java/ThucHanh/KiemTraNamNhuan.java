package Bai_1_Ngon_Ngu_Lap_Trinh_Java.ThucHanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int number = sc.nextInt();
        if (number % 4 == 0 && number % 100 != 0) {
            System.out.println(number + " is lead year");
        } else if (number % 400 == 0) {
            System.out.println(number + " is lead year");
        } else {
            System.out.println(number + " is not lead year");
        }
    }
}
