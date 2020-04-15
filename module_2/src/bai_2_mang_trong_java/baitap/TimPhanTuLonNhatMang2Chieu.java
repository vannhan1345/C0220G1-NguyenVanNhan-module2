package bai_2_mang_trong_java.baitap;

import java.util.Scanner;

public class TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        int m,n;
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng : ");
        m=input.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        n=input.nextInt();
        double[][] arr=new double[m][n];
        System.out.println("Nhập các phần tử trong mảng: ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("arr["+i+"]["+j+"] = ");
                arr[i][j]=input.nextDouble();
            }
        }

        double max=arr[0][0];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất của mảng là: "+max);

    }
}
