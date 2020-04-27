package bai_6_cau_truc_du_lieu_va_giai_thuat_co_ban.baitap.linkedlist;

public class MyLinkedList<E> {
    private class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data=data;
        }
        public Object getData(){
            return this.data;
        }
    }
    //  phần tử đầu tiên có trong danh sách liên kết.
    private Node head;
    // Số lượng phần tử  trong danh sách
    private int numNodes = 0;
     public MyLinkedList(){

    }
    public void addFirst(E element){
         Node temp =head;
         // Biến head sẽ nhận giá trị là 1 Node mới
         head=new Node(element);
         head.next=temp;
         numNodes++;
    }
    public void addLast(E element){
         Node temp =head;
         while (temp.next != null){
             temp = temp.next;
         }
         temp.next=new Node(element);
         numNodes++;

    }
    public  void add(int index,E element){
         //Khai báo biến temp trỏ đến head
        Node temp =head;
        //khai báo 1 node là holder
        Node holder;
        // cho con trở chạy đén vị trí index-1
        for(int i =0;i<index-1 && temp.next != null; i++){
            temp=temp.next;
        }
        //cho holder tham chiếu đến vị trí index;
        holder=temp.next;
        // Node tại vị trí index-1 sẽ trỏ tới vị tri index mới
        temp.next=new Node(element);
        temp.next.next=holder;
        numNodes++;
    }
    public Object get(int index){
         Node temp = head;
         for (int i=0; i<index;i++){
             temp=temp.next;
         }
         return temp.data;
    }
    public int size(){
         return numNodes;
    }
    public E remove(int index){
         if(index<0 || index >numNodes){
             throw new IllegalArgumentException(" Error index :"+index);
         }
         Node temp =head;
         Object data;
         //Nếu index=0 thì trả về data hiện tại.
        if(index==0){
            data=temp.data;
            head=temp.next;
            numNodes--;
        }else{
            for(int i=0;i<index-1&& temp.next!=null;i++){
                temp=temp.next;
            }
            data=temp.next.data;
            temp.next=temp.next.next;
            numNodes--;
        }
        return (E) data;
    }
    public boolean remove(E element){
         //remove đối tượng nếu element head;
        if(head.data.equals(element)){
            remove(0);
            return true;
        }else {
            Node temp=head;
            while (temp.next != null){
                if (temp.next.data.equals(element)){
                    temp.next=temp.next.next;
                    numNodes--;
                    return true;
                }
                temp=temp.next;
            }
        }
        return false;
    }
    public MyLinkedList<E> clone(){
         if(numNodes==0){
             throw new IllegalArgumentException("MyLinkedList is null");
         }
         MyLinkedList<E> returnLinkedList=new MyLinkedList<>();
         Node temp=head;
         // add temp vào danh sách trả về để nó làm head
        returnLinkedList.addFirst((E) temp.data);
        temp=temp.next;
        while (temp!=null){
            returnLinkedList.addLast((E) temp.data);
            temp=temp.next;

        }
        return returnLinkedList;
    }
    public boolean contains(E element){
         Node temp= head;
         while (temp.next != null){
             if(temp.data.equals(element)){
                 return true;
             }
             temp=temp.next;
         }
         return  false;
    }
    public int indexOf(E element){
         Node temp =head;
         for (int i =0; i<numNodes; i++){
             if(temp.getData().equals(element)){
                 return i;
             }
             temp=temp.next;
         }
         return -1;
    }
// Phương thức lấy phần tử đầu tiên trong mảng
    public E getFirst() {
        return (E) head.data;
    }

 // phương thức lấy phần tử cuối cùng trong mảng
    public E getLast() {
        Node temp = head;
        for (int i=0;i<numNodes-1;i++){
            temp=temp.next;
        }
        return (E) temp.data;
    }
    // xóa tất cả phần tử trong mảng
    public void clear(){
        head=null;
    }
    //in mảng
    public void printList() {
       Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }





}
