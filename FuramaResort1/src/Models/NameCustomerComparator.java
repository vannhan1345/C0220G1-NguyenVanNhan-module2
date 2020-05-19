package Models;

import java.util.Comparator;

public class NameCustomerComparator implements Comparator<Customers> {
    @Override
    public int compare(Customers o1, Customers o2) {
        return o1.getNameCustomer().compareTo(o2.getNameCustomer());
    }
}
