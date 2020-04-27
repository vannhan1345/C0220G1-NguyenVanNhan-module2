package case_Study.models;

public abstract class Services  implements Massage, Karaoke,Food, Drink,RentCar {
    private String id;
    private  String nameService;
    private double areaUsed;
    private double rentalCosts;
    private int maxNumberOfPeople;
    private String typeRent;

    public Services() {

    }

    public Services(String id, String nameService, double areUsed, double rentalCosts, int maxNumberOfPeople, String typeRent) {
        this.id = id;
        this.nameService = nameService;
        this.areaUsed = areUsed;
        this.rentalCosts = rentalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.typeRent = typeRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }
    public abstract String showInfor();




}
