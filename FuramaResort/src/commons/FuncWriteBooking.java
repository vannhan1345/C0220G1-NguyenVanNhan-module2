package commons;

import model.Customers;
import model.Villa;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncWriteBooking {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameBooking = "src/data/Booking.csv";
    private static final String FILE_HEADER_BOOKING = "customer, service";

    public static void writeBookingToCsv(String customer, String service) throws IOException {
        ArrayList listBooking = getFileCSVToListCustomer();
        FileWriter fileWriter = null;

        fileWriter = new FileWriter(fileNameBooking);
        fileWriter.append(FILE_HEADER_BOOKING);
        fileWriter.append(NEW_LINE_SEPARATOR);

        fileWriter.append(customer);
        fileWriter.append(COMMA_DELIMITER);

        fileWriter.append(service);
        fileWriter.append(NEW_LINE_SEPARATOR);

        fileWriter.flush();
        fileWriter.close();

    }

    public static ArrayList getFileCSVToListCustomer() {
        BufferedReader br = null;
        ArrayList<String> listCustomer = new ArrayList<>();
        Path path = Paths.get(fileNameBooking);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(fileNameBooking);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameBooking));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("customer")) {
                    continue;
                }
                String customers = (splitData[0]);
                String service = (splitData[1]);
                listCustomer.add(customers);
                listCustomer.add(service);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return listCustomer;
    }

    public static void main(String[] args) throws IOException {

        //get customer
        // ArrayList<Customers> listCustomer= FuncFileCSV_customers.getFileCSVToListCustomer();
        ArrayList<Customers> listCustomer = FuncFileCSV_customers.getFileCSVToListCustomer();
        ArrayList<Villa> listVilla = FuncFileCSV_villa.getFileCSVToListVilla();
        String customer = "[" + listCustomer.get(0).showInfor() + "]";
        String villa = "[" + listVilla.get(0).showInfor() + "]";
        writeBookingToCsv(customer, villa);
        //get service
        // ArrayList<Customers>

    }
}
