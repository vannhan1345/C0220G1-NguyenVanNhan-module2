package Bai_1_Ngon_Ngu_Lap_Trinh_Java.ThucHanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        boolean flag=true;
        for(int i=2;i<num;i++){
            if (num%i==0){

                flag=false;

            }
        }
        if (!flag){
            System.out.print(num + " is not prime");
        }else {
            System.out.print(num+" is prime");
        }
    }
}
