package view;

import model.Customers;

public class CustomerView {
    public static void displayAllCustomer(Customers customers) {
        System.out.println(customers.showInfor());
    }

    public static void displayAllCustomer(Integer key, String customers) {
        System.out.println(key + ": " + customers);
    }
}
