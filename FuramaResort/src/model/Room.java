package model;

public class Room extends Services {
    private String freeService;

    public Room() {
    }

    public Room(String id, String nameService, String areUsed, String rentalCosts,
                String maxNumberOfPeople, String typeRent, String freeService) {
        super(id, nameService, areUsed, rentalCosts, maxNumberOfPeople, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeServiceIncluded) {
        this.freeService = freeServiceIncluded;
    }

    @Override
    public String showInfor() {
        return "1.Id Service: "+super.getId()+
                "\n2.Name Service: "+super.getNameService()+
                "\n3.Area Used: "+super.getAreaUsed()+
                "\n4.Rental costs: "+super.getRentalCosts()+
                "\n5.Max number of people: "+super.getMaxNumberOfPeople()+
                "\n6.Type rent: "+super.getTypeRent()+
                "\n7.Free service included: "+this.freeService+"\n+" +
                "11.Other Service:  "+
                "\n   1.Service name: "+Massage.NAME+" ,Cost: "+Massage.COST+Massage.UNIT+
                "\n   2.Service name: "+Karaoke.NAME+" ,Cost: "+Karaoke.COST+Karaoke.UNIT+
                "\n   3.Service name: "+Food.NAME+" ,Cost: "+Food.COST+Food.UNIT+
                "\n   4.Service name: "+Drink.NAME+" ,Cost: "+Drink.COST+Drink.UNIT+
                "\n   5.Service name: "+RentCar.NAME+" ,Cost: "+RentCar.COST+RentCar.UNIT;

    }
}
