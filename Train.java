class Train {

    String trainName;
    String route;
    int coaches;
    int passengers;
    String driver;
    double fare;
    String type;
    boolean hasAC;
    boolean hasFood;
    int year;

    public String startJourney(String journey) {
        System.out.println("Journey: " + journey);
        return journey;
    }

    public int bookTickets(int count) {
        System.out.println("Tickets: " + count);
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

    public boolean serveFood(boolean status) {
        System.out.println("Food: " + status);
        return status;
    }

    public String announceStation(String station) {
        System.out.println("Station: " + station);
        return station;
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