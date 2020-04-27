package bai_6_cau_truc_du_lieu_va_giai_thuat_co_ban.baitap.list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        MyList<Integer> newListInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(5);
        listInteger.add(6);
      listInteger.add(2,9);
        for (int i=0;i<listInteger.size();i++){
            System.out.print(listInteger.elements[i]+" ");
        }
        System.out.println(listInteger.remove(2));
          System.out.println(listInteger.size());




        System.out.println(listInteger.indexOf(7));
        System.out.println(listInteger.contains(9));
        listInteger.add(9);
        listInteger.ensureCapacity(1);
        System.out.println(listInteger.get(5));
       // listInteger.clear();



        System.out.println("Mảng sau khi xóa:");
        for (int i=0;i<listInteger.size();i++){
            System.out.print(listInteger.elements[i]+" ");
        }
        newListInteger = listInteger.clone();
        System.out.println("----");
               for (int i=0;i<newListInteger.size();i++){
                 System.out.print(newListInteger.elements[i]+" ");
              }

    }

}