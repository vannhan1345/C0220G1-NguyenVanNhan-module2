package Commons;



import Models.Customers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSV_customers {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameCustomer="src/data/Customers.csv";
    private static final String FILE_HEADER_VILLA = "nameCustomer,birthDay,gender,idCard,phoneNumber,email,typeCustomer,address";
    public static void writeCustomerToCSV(ArrayList<Customers> listCustomers){
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter(fileNameCustomer);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customers customers :listCustomers){
                fileWriter.append(customers.getNameCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customers.getBirthDay());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customers.getGender());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customers.getIdCard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customers.getPhoneNumber());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customers.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customers.getTypeCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customers.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        }catch (Exception e){
            System.out.println("Error in CvsFileWrite!");
        }finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception ex){
                System.out.println("Error when flush or close");
            }
        }
    }
    public static ArrayList<Customers> getFileCSVToListCustomer() {
        BufferedReader br = null;
        ArrayList<Customers> listCustomer = new ArrayList<Customers>();
        Path path= Paths.get(fileNameCustomer);
        if(!Files.exists(path)){
            try {
                Writer writer=new FileWriter(fileNameCustomer);

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameCustomer));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("nameCustomer")) {
                    continue;
                }
                Customers customers = new Customers();
                customers.setNameCustomer(splitData[0]);
                customers.setBirthDay(splitData[1]);
                customers.setGender(splitData[2]);
                customers.setIdCard(splitData[3]);
                customers.setPhoneNumber(splitData[4]);
                customers.setEmail(splitData[5]);
                customers.setTypeCustomer(splitData[6]);
                customers.setAddress(splitData[7]);

                listCustomer.add(customers);
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
}
