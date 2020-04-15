package bai_1_ngon_ngu_lap_trinh_java.thuchanh;

import java.util.Scanner;

public class TimUocSoChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.print("Không có ước chung lớn nhất");

        }
        while (a!=b){
            if(a>b)
                a = a - b;
            else
                b=b-a;
            }
        System.out.print("Ước chung lớn nhất là "+a);
        }
    }


