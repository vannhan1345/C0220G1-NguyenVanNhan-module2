package bai_2_mang_trong_java.thuchanh;

import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        int[] array;
        do{
            System.out.print("Enter a size: ");
            size=sc.nextInt();
            if(size>20){
                System.out.println("not found");
            }

        }while (size>20);
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.print("Enter element "+(i+1)+": ");
            array[i]=sc.nextInt();
            i++;

        }
        System.out.println("Array list: ");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+"\t");
        }
        int max=array[0];
        int index=1;
        for (int j=0;j<array.length;j++){
            if (array[j]>max){
                max=array[j];
                index=j+1;
            }

        }
        System.out.println("max is: "+max+"\t"+"index: "+index);
    }
}
