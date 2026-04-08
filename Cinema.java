class Cinema {

    String cinemaName;
    String location;
    int screens;
    int seats;
    String manager;
    double ticketPrice;
    String type;
    boolean has3D;
    boolean hasFoodCourt;
    int year;

    public String playMovie(String movie) {
        System.out.println("Movie: " + movie);
        return movie;
    }

    public int bookTickets(int count) {
        System.out.println("Tickets: " + count);
        return count;
    }

    public String assignManager(String name) {
        System.out.println("Manager: " + name);
        return name;
    }

    public double collectMoney(double amount) {
        System.out.println("Money: " + amount);
        return amount;
    }

    public boolean start3D(boolean status) {
        System.out.println("3D: " + status);
        return status;
    }

    public boolean openFoodCourt(boolean status) {
        System.out.println("Food Court: " + status);
        return status;
    }

    public String announceShow(String show) {
        System.out.println("Show: " + show);
        return show;
    }

    public int totalAudience(int count) {
        System.out.println("Audience: " + count);
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