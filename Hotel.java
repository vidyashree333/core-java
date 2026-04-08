class Hotel {

    String hotelName;
    String location;
    int rooms;
    int staff;
    String manager;
    double roomPrice;
    String type;
    boolean hasWifi;
    boolean hasParking;
    int establishedYear;

    public String bookRoom(String customer) {
        System.out.println("Booked for: " + customer);
        return customer;
    }

    public double generateBill(double amount) {
        System.out.println("Bill: " + amount);
        return amount;
    }

    public String assignRoom(String room) {
        System.out.println("Room: " + room);
        return room;
    }

    public boolean provideWifi(boolean status) {
        System.out.println("Wifi: " + status);
        return status;
    }

    public boolean provideParking(boolean status) {
        System.out.println("Parking: " + status);
        return status;
    }

    public String orderFood(String item) {
        System.out.println("Food: " + item);
        return item;
    }

    public int totalRooms(int count) {
        System.out.println("Rooms: " + count);
        return count;
    }

    public String organizeEvent(String event) {
        System.out.println("Event: " + event);
        return event;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Clean: " + status);
        return status;
    }

    public String checkout(String customer) {
        System.out.println("Checkout: " + customer);
        return customer;
    }
}