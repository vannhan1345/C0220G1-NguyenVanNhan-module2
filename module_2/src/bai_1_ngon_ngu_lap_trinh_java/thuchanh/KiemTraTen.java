package bai_1_ngon_ngu_lap_trinh_java.thuchanh;

import java.util.Scanner;

public class KiemTraTen {
    public static void main(String[] args){
        String[] student ={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter name student: ");
        String input_name=sc.nextLine();
        Boolean isExist=false;
        for (int i=0; i<student.length;i++){
            if(student[i].equals(input_name)){
                System.out.println(" Position name student in the list"+input_name +" is "+(i+1));
                isExist=true;
                break;
            }

        }
        if(!isExist){
            System.out.println("Not found "+input_name+" in the list.");
        }
    }
}
