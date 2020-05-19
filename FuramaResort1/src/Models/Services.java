package Models;

public abstract class Services {
    private String id;
    private String serviceName;
    private double areaUsed;
    private double rentalCosts;
    private int maxNumberOfPeople;
    private String TypeRent;

    public Services() {
    }



    public Services(String id, String serviceName, double areUsed, double rentalCosts, int maxNumberOfPeople, String typeRent) {
        this.id = id;
        this.serviceName = serviceName;
        this.areaUsed = areUsed;
        this.rentalCosts = rentalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
        TypeRent = typeRent;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areUsed) {
        this.areaUsed = areUsed;
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
        return TypeRent;
    }

    public void setTypeRent(String typeRent) {
        TypeRent = typeRent;
    }

    public abstract void showInfor();



}
