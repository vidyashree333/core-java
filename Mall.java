class Mall {

    
    String mallName;
    String location;
    int totalShops;
    int totalFloors;
    String ownerName;
    double parkingFee;
    String mallType;
    boolean hasFoodCourt;
    boolean hasCinema;
    int establishedYear;

    

    public String openShop(String shopName) {
        System.out.println("Shop Opened: " + shopName);
        return shopName;
    }

    public int addShops(int count) {
        System.out.println("Shops Added: " + count);
        return count;
    }

    public String assignManager(String managerName) {
        System.out.println("Manager Assigned: " + managerName);
        return managerName;
    }

    public double collectParkingFee(double fee) {
        System.out.println("Parking Fee Collected: " + fee);
        return fee;
    }

    public boolean openFoodCourt(boolean status) {
        System.out.println("Food Court Open: " + status);
        return status;
    }

    public boolean startCinema(boolean status) {
        System.out.println("Cinema Running: " + status);
        return status;
    }

    public String announceOffer(String offer) {
        System.out.println("Offer Announced: " + offer);
        return offer;
    }

    public int totalVisitors(int visitors) {
        System.out.println("Visitors Count: " + visitors);
        return visitors;
    }

    public String organizeEvent(String eventName) {
        System.out.println("Event Organized: " + eventName);
        return eventName;
    }

    public boolean maintainSecurity(boolean status) {
        System.out.println("Security Maintained: " + status);
        return status;
    }
}