package bai_1_ngon_ngu_lap_trinh_java.thuchanh;


public class HienThiSoNguyenTo {


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


        System.out.print("Các số nguyên tố nhỏ hơn 100 là :");
        for (int i = 1; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
}