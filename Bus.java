class Bus {

    String busName;
    String route;
    int seats;
    int passengers;
    String driver;
    double fare;
    String type;
    boolean hasAC;
    boolean hasWifi;
    int year;

    public String startTrip(String trip) {
        System.out.println("Trip: " + trip);
        return trip;
    }

    public int bookSeats(int count) {
        System.out.println("Seats Booked: " + count);
        return count;
    }

    public String assignDriver(String name) {
        System.out.println("Driver: " + name);
        return name;
    }

    public double collectFare(double amount) {
        System.out.println("Fare: " + amount);
        return amount;
    }

    public boolean startAC(boolean status) {
        System.out.println("AC: " + status);
        return status;
    }

    public boolean provideWifi(boolean status) {
        System.out.println("Wifi: " + status);
        return status;
    }

    public String announceStop(String stop) {
        System.out.println("Stop: " + stop);
        return stop;
    }

    public int totalPassengers(int count) {
        System.out.println("Passengers: " + count);
        return count;
    }

    public String maintenance(String msg) {
        System.out.println("Maintenance: " + msg);
        return msg;
    }

    public boolean safety(boolean status) {
        System.out.println("Safety: " + status);
        return status;
    }
}