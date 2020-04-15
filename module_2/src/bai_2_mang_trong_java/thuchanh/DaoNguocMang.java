package bai_2_mang_trong_java.thuchanh;

import java.util.Scanner;

public class DaoNguocMang {
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

        for (int j=0;j<array.length/2;j++){
           int temp=array[j];
           array[j]=array[array.length-1-j];
            array[array.length-1-j]=temp;

            }
        System.out.printf( "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        }
    }

