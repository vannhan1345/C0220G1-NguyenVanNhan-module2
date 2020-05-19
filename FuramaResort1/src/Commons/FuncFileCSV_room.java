package Commons;



import Models.Room;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSV_room {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileNameRoom="src/data/Room.csv";
    private static final String FILE_HEADER_VILLA = "id,serviceName,areaUsed,rentalCosts,maxNumberOfPeople,typeRent,freeServiceIncluded";
    public static void writeRoomToCSV(ArrayList<Room> listRoom){
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter(fileNameRoom);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Room room :listRoom){
                fileWriter.append(room.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getServiceName()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getAreaUsed()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getFreeService()));
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
    public static ArrayList<Room> getFileCSVToListRoom() {
        BufferedReader br = null;
        ArrayList<Room> listRoom = new ArrayList<Room>();
        Path path= Paths.get(fileNameRoom);
        if(!Files.exists(path)){
            try {
                Writer writer=new FileWriter(fileNameRoom);

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameRoom));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Room room = new Room();
                room.setId(splitData[0]);
                room.setServiceName(splitData[1]);
                room.setAreaUsed(Double.valueOf(splitData[2]));
                room.setRentalCosts(Double.valueOf(splitData[3]));
                room.setMaxNumberOfPeople(Integer.valueOf(splitData[4]));
                room.setTypeRent(splitData[5]);
                room.setFreeService(splitData[6]);

                listRoom.add(room);
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
        return listRoom;
    }
}
