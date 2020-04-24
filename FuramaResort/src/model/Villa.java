package model;

public class Villa extends Services {
    private String roomStandard;
    private String convenientDescription;
    private String poolArea;
    private String numberOfFloors;

    public Villa() {
    }

    public Villa(String id, String nameService, String areaUsed, String rentalCosts, String maxNumberOfPeople,
                 String typeRent, String roomStandard, String convenientDescription, String poolArea, String numberOfFloors) {
        super(id, nameService, areaUsed, rentalCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.poolArea = poolArea;
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

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfor() {
        return "1.Id Service: "+super.getId()+
                "\n2.Name Service: "+super.getNameService()+
                "\n3.Area Used: "+super.getAreaUsed()+
                "\n4.Rental costs: "+super.getRentalCosts()+
                "\n5.Max number of people: "+super.getMaxNumberOfPeople()+
                "\n6.Type rent: "+super.getTypeRent()+
                "\n7.Standard of room: "+this.roomStandard+
                "\n8.Convenient description: "+this.convenientDescription+
                "\n9.Poor area: "+this.poolArea+
                "\n10.Number of floors: "+this.numberOfFloors+
                "\n11.Other Service:  "+
                "\n   1.Service name: "+Massage.NAME+" ,Cost: "+Massage.COST+Massage.UNIT+
                "\n   2.Service name: "+Karaoke.NAME+" ,Cost: "+Karaoke.COST+Karaoke.UNIT+
                "\n   3.Service name: "+Food.NAME+" ,Cost: "+Food.COST+Food.UNIT+
                "\n   4.Service name: "+Drink.NAME+" ,Cost: "+Drink.COST+Drink.UNIT+
                "\n   5.Service name: "+RentCar.NAME+" ,Cost: "+RentCar.COST+RentCar.UNIT;
    }
}
