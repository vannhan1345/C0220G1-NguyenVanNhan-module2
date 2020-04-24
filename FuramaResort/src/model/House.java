package model;

public class House extends Services {
    private String roomStandard;
    private String convenientDescription;
    private String numberOfFloors;

    public House() {
    }

    public House(String id, String nameService, String areUsed, String rentalCosts, String maxNumberOfPeople,
                 String typeRent, String roomStandard, String convenientDescription, String numberOfFloors) {
        super(id, nameService, areUsed, rentalCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
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
                "\n9.Number of floors: "+this.numberOfFloors +
                "\n10.Other Service:  "+
                "\n   1.Service name: "+Massage.NAME+" ,Cost: "+Massage.COST+Massage.UNIT+
                "\n   2.Service name: "+Karaoke.NAME+" ,Cost: "+Karaoke.COST+Karaoke.UNIT+
                "\n   3.Service name: "+Food.NAME+" ,Cost: "+Food.COST+Food.UNIT+
                "\n   4.Service name: "+Drink.NAME+" ,Cost: "+Drink.COST+Drink.UNIT+
                "\n   5.Service name: "+RentCar.NAME+" ,Cost: "+RentCar.COST+RentCar.UNIT;
    }
}
