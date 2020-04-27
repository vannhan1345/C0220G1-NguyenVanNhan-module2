package Models;

public class Villa extends Services {
    private String roomStandard;
    private String convenientDescription;
    private double areaPool;
    private int numberOfFloors;

    public Villa() {
    }


    public Villa(String id, String serviceName, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeRent, String roomStandard, String convenientDescription, double areaPool, int numberOfFloors) {
        super(id, serviceName, areaUsed, rentalCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void showInfor() {
        System.out.println("1.Service Id: "+super.getId()+
                "\n2. Service Name: "+super.getServiceName()+
                "\n3. Area Used: "+super.getAreaUsed()+
                "\n4. Rental Cost: "+super.getRentalCosts()+
                "\n.5 Max number of people: "+super.getMaxNumberOfPeople()+
                "\n6. Type rent: "+super.getRentType()+
                "\n7. Room Standard: "+this.roomStandard+
                "\n8. Convenient description: "+this.convenientDescription+
                "\n9. Area pool: "+this.areaPool+
                "\n10. Number of Floors: "+this.numberOfFloors);

    }
}
