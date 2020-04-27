package bai_6_cau_truc_du_lieu_va_giai_thuat_co_ban.baitap.linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList test = new MyLinkedList();
        MyLinkedList newTest = new MyLinkedList();
        Integer a = new Integer(12);
        test.addFirst(1);
        test.addFirst(2);
        test.addFirst(3);
        test.addFirst(4);
        test.addFirst("nhan");
        test.addLast(12);
        System.out.println("1----");
       test.printList();

         test.add(4,15);
        System.out.println("2----");
        test.printList();

          System.out.println(test.get(4));

        System.out.println(test.size());
         test.remove(1);
        System.out.println("3----");
        test.printList();

        test.remove(a);
        System.out.println("4----");
        test.printList();

        newTest=test.clone();
        System.out.println("5----");

        newTest.printList();
        System.out.println(test.indexOf(1));
        System.out.println(test.getFirst());
        System.out.println(test.getLast());
        test.clear();
        test.printList();


    }
}
