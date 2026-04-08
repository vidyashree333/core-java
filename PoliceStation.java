class PoliceStation {

    String name;
    String location;
    int officers;
    int cases;
    String inspector;
    double budget;
    String type;
    boolean hasJail;
    boolean hasVehicles;
    int year;

    public String registerCase(String caseName) {
        System.out.println("Case: " + caseName);
        return caseName;
    }

    public int totalCases(int count) {
        System.out.println("Cases: " + count);
        return count;
    }

    public String assignOfficer(String name) {
        System.out.println("Officer: " + name);
        return name;
    }

    public double allocateBudget(double amount) {
        System.out.println("Budget: " + amount);
        return amount;
    }

    public boolean openJail(boolean status) {
        System.out.println("Jail: " + status);
        return status;
    }

    public boolean useVehicle(boolean status) {
        System.out.println("Vehicle: " + status);
        return status;
    }

    public String announce(String msg) {
        System.out.println("Announcement: " + msg);
        return msg;
    }

    public int complaints(int count) {
        System.out.println("Complaints: " + count);
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