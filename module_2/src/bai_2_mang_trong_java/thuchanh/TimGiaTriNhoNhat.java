package bai_2_mang_trong_java.thuchanh;

public class TimGiaTriNhoNhat {
    public static int minValue(int[] array){
        int min=array[0];
        for (int i=0;i<array.length;i++){
            if(min>array[i]){
                min=array[i];

            }
        } return min;
    }
    public static void main(String[] args) {
        int[] array={2,5,-5,9,15,5};
        System.out.println("Min value in array is: "+minValue(array));

    }
}
