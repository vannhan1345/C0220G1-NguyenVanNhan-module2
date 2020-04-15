package bai_2_mang_trong_java.baitap;

import java.util.Scanner;

public class TimGiaTriNhoNhatCuaMang {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner input= new Scanner(System.in);
        System.out.println("Nhập phần tử của mảng: ");
        for (int i=0;i<arr.length;i++){
            System.out.print("arr["+i+"] = ");
            arr[i]=input.nextInt();
        }
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: "+min);
    }
}
