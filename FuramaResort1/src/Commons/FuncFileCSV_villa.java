package Commons;

import Models.Villa;


import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSV_villa {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameVilla="src/data/Villa.csv";
    private static final String FILE_HEADER_VILLA = "id,serviceName,areaUsed,rentalCosts,maxNumberOfPeople,typeRent,roomStandard,convenientDescription,poolArea,numberOfFloors";
    public static void writeVillaToCSV(ArrayList<Villa> listVilla){
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter(fileNameVilla);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa :listVilla){
                fileWriter.append(villa.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getServiceName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getAreaUsed()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getConvenientDescription());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getAreaPool()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getNumberOfFloors()));
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

   public static ArrayList<Villa> getFileCSVToListVilla() {
        BufferedReader br = null;
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
       Path path= Paths.get(fileNameVilla);
        if(!Files.exists(path)){
            try {
                Writer writer=new FileWriter(fileNameVilla);

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameVilla));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Villa villa = new Villa();
                villa.setId(splitData[0]);
                villa.setServiceName(splitData[1]);
                villa.setAreaUsed(Double.valueOf(splitData[2]));
                villa.setRentalCosts(Double.valueOf(splitData[3]));
                villa.setMaxNumberOfPeople(Integer.valueOf(splitData[4]));
                villa.setTypeRent(splitData[5]);
                villa.setRoomStandard(splitData[6]);
                villa.setConvenientDescription(splitData[7]);
                villa.setAreaPool(Integer.valueOf(splitData[8]));
                villa.setNumberOfFloors(Integer.valueOf(splitData[9]));
                listVilla.add(villa);
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
        return listVilla;
    }

}
