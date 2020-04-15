package bai_2_mang_trong_java.baitap;

public class TinhTong2DuongCheo {
    public static void main(String[] args) {
       int[][] arr = {{3, 5, 8}, {3, 5, 6}, {7, 8, 9}};
//        int m,n;
//        Scanner input=new Scanner(System.in);
//        System.out.println("Nhập vào số dòng của mảng : ");
//        m=input.nextInt();
//        System.out.println("Nhập vào số cột của mảng: ");
//        n=input.nextInt();
//        int[][] arr=new int[m][n];
//        System.out.println("Nhập các phần tử trong mảng: ");
//        for (int i=0;i<m;i++){
//            for (int j=0;j<n;j++){
//                System.out.print("arr["+i+"]["+j+"] = ");
//                arr[i][j]=input.nextInt();
//            }
//        }
        int sumRight=0;
//        int sumLeft=0;
//        for (int i = 0; i < arr.length; i++) {
//            int j = arr.length-1-i;
//            sumLeft +=arr[i][j];
//
////                    sumRight+=arr[i][j];
//
//                }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
              if(i==j){
                  sumRight+=arr[i][j];

              }
            }
        }
        System.out.print("Tổng 1 đường chéo là: "+sumRight);

    }
}
