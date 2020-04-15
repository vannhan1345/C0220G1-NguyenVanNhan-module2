package bai_2_mang_trong_java.baitap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr1=new int[3];
        int[] arr2=new int[4];
        int[] arr3=new  int[7];
        System.out.println("Nhập phần tử mảng 1: ");
        for (int i=0;i<arr1.length;i++){

                System.out.print("arr1["+i+"] = ");
                arr1[i]=input.nextInt();
        }
        System.out.println("Nhập phần tử mảng 2: ");
        for (int j=0;j<arr2.length;j++){

            System.out.print("arr2["+j+"] = ");
            arr2[j]=input.nextInt();
        }
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
        }
        System.out.println("mảng 3 sau khi gộp: ");
        for (int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]+" ");
        }



    }
}
