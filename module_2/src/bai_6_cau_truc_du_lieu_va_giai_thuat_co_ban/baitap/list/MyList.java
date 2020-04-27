package bai_6_cau_truc_du_lieu_va_giai_thuat_co_ban.baitap.list;


import java.util.Arrays;

public class MyList<E> {

    public int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    public Object elements[];
// Sức chứa mặc định khi khởi tạo bằng constructor không có tham số.
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
// Phương thức constructor với sức chứa được truyền vào.
    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity" + capacity);
        }
    }
// Phương thức thêm mới 1 phần tử vào vị trí index nhất định.
    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("size: " + size);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }
 //Phương thức xóa 1 phần tử ở vị trí nhất định và trả về giá trị của phần tử đã xóa.
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index: " + index);

        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
// Phương thức trả về số phần tử có trong mảng.
    public int size() {
        return this.size;
    }
 //Phương thức sao chép 1 mảng giống như MyList
    public MyList<E> clone() {
        MyList<E> temp = new MyList<>();
        temp.elements = Arrays.copyOf(this.elements, this.size);
        temp.size = this.size;
        return temp;
    }
// Phương thức trả về vị trí của phần tử xác định, nếu có nhiều phần tử trùng nhau thì trả về vị trí phần tử đầu tiên.
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }
 // Phương thức kiểm tra phần tử có trong mảng hay ko.
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }


// Phương thức thêm 1 phần tử vào trong mảng
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }
// Phương thức tăng kích thước của MyList
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }
// Phương thức trả về 1 phần tử tại vị trí index xác định
    public E get(int index) {
        return (E) elements[index];

    }
// phướng thức xóa hết các phần tử có trong mảng.
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }


}
