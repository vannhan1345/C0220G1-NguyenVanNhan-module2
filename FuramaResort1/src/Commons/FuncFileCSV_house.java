package Commons;




import Models.House;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSV_house {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameHouse="src/data/House.csv";
    private static final String FILE_HEADER_VILLA = "id,serviceName,areaUsed,rentalCosts,maxNumberOfPeople,typeRent,roomStandard,convenientDescription,numberOfFloors";
    public static void writeHouseToCSV(ArrayList<House> listHouse){
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter(fileNameHouse);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (House house :listHouse){
                fileWriter.append(house.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getServiceName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getAreaUsed()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getConvenientDescription());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getNumberOfFloors()));
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
    public static ArrayList<House> getFileCSVToListHouse() {
        BufferedReader br = null;
        ArrayList<House> listHouse = new ArrayList<House>();
        Path path= Paths.get(fileNameHouse);
        if(!Files.exists(path)){
            try {
                Writer writer=new FileWriter(fileNameHouse);

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameHouse));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                House house = new House();
                house.setId(splitData[0]);
                house.setServiceName(splitData[1]);
                house.setAreaUsed(Double.valueOf(splitData[2]));
                house.setRentalCosts(Double.valueOf(splitData[3]));
                house.setMaxNumberOfPeople(Integer.valueOf(splitData[4]));
                house.setTypeRent(splitData[5]);
                house.setRoomStandard(splitData[6]);
                house.setConvenientDescription(splitData[7]);
                house.setNumberOfFloors(Integer.valueOf(splitData[8]));
                listHouse.add(house);
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
        return listHouse;
    }
}
