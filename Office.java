class Office {

    String name;
    String location;
    int employees;
    int departments;
    String manager;
    double salary;
    String type;
    boolean hasWifi;
    boolean hasCafeteria;
    int year;

    public String assignWork(String work) {
        System.out.println("Work: " + work);
        return work;
    }

    public int totalEmployees(int count) {
        System.out.println("Employees: " + count);
        return count;
    }

    public String assignManager(String name) {
        System.out.println("Manager: " + name);
        return name;
    }

    public double paySalary(double amount) {
        System.out.println("Salary: " + amount);
        return amount;
    }

    public boolean provideWifi(boolean status) {
        System.out.println("Wifi: " + status);
        return status;
    }

    public boolean openCafeteria(boolean status) {
        System.out.println("Cafeteria: " + status);
        return status;
    }

    public String announce(String msg) {
        System.out.println("Announcement: " + msg);
        return msg;
    }

    public int projects(int count) {
        System.out.println("Projects: " + count);
        return count;
    }

    public String meeting(String meet) {
        System.out.println("Meeting: " + meet);
        return meet;
    }

    public boolean discipline(boolean status) {
        System.out.println("Discipline: " + status);
        return status;
    }
}