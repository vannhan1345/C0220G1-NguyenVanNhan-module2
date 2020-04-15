package bai_2_mang_trong_java.baitap;

import java.util.Scanner;

public class DemSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "hom nay di hoc vui ve";
        System.out.print("Nhập ký tự cần đếm: ");
        char letter = input.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count += 1;
            }
        }
        System.out.print("Số ký tự " + letter + " trong chuỗi là: " + count);

    }
}
