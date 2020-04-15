package bai_1_ngon_ngu_lap_trinh_java.thuchanh;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần hiển thị :");
        int n=sc.nextInt();
        int number=0;
        int count=0;
        System.out.print(n + " số nguyên tố đầu tiên là : ");
        while (count<n){
            if (isPrimeNumber(number)){
                System.out.print(number+" ");
                count++;
            }
            number++;
        }

    }
}
