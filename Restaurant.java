class Restaurant {

    String name;
    String location;
    int tables;
    int staff;
    String manager;
    double price;
    String type;
    boolean hasAC;
    boolean hasDelivery;
    int year;

    public String orderFood(String food) {
        System.out.println("Food: " + food);
        return food;
    }

    public int serveCustomers(int count) {
        System.out.println("Customers: " + count);
        return count;
    }

    public String assignChef(String name) {
        System.out.println("Chef: " + name);
        return name;
    }

    public double bill(double amount) {
        System.out.println("Bill: " + amount);
        return amount;
    }

    public boolean startAC(boolean status) {
        System.out.println("AC: " + status);
        return status;
    }

    public boolean delivery(boolean status) {
        System.out.println("Delivery: " + status);
        return status;
    }

    public String announceOffer(String offer) {
        System.out.println("Offer: " + offer);
        return offer;
    }

    public int totalOrders(int count) {
        System.out.println("Orders: " + count);
        return count;
    }

    public String event(String event) {
        System.out.println("Event: " + event);
        return event;
    }

    public boolean hygiene(boolean status) {
        System.out.println("Hygiene: " + status);
        return status;
    }
}