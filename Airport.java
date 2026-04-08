class Airport {

    String airportName;
    String location;
    int terminals;
    int runways;
    String director;
    double ticketPrice;
    String airportType;
    boolean hasCargo;
    boolean hasLounge;
    int establishedYear;

    public String scheduleFlight(String flight) {
        System.out.println("Flight Scheduled: " + flight);
        return flight;
    }

    public int totalFlights(int count) {
        System.out.println("Flights: " + count);
        return count;
    }

    public String assignPilot(String name) {
        System.out.println("Pilot: " + name);
        return name;
    }

    public double collectFare(double amount) {
        System.out.println("Fare: " + amount);
        return amount;
    }

    public boolean openLounge(boolean status) {
        System.out.println("Lounge: " + status);
        return status;
    }

    public boolean allowCargo(boolean status) {
        System.out.println("Cargo: " + status);
        return status;
    }

    public String announce(String msg) {
        System.out.println("Announcement: " + msg);
        return msg;
    }

    public int passengers(int count) {
        System.out.println("Passengers: " + count);
        return count;
    }

    public String event(String event) {
        System.out.println("Event: " + event);
        return event;
    }

    public boolean security(boolean status) {
        System.out.println("Security: " + status);
        return status;
    }
}