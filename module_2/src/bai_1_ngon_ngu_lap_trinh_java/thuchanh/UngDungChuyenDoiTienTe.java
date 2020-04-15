package bai_1_ngon_ngu_lap_trinh_java.thuchanh;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter USD: ");
        int a=sc.nextInt();
        int rate=a*23000;
        System.out.print("The Amount of VND is : "+rate);
    }
}
