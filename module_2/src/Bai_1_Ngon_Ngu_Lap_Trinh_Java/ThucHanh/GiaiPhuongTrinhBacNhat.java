package Bai_1_Ngon_Ngu_Lap_Trinh_Java.ThucHanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        a = scanner.nextDouble();
        System.out.println("b: ");
        b = scanner.nextDouble();
        System.out.println("c: ");
        c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x=%f!\n", answer);

        }else {
            if(b==0){
                System.out.printf("The solution is all x! ");
            }else {
                System.out.printf("No solution!");
            }
        }


    }
}
