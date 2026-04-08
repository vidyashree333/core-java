class University {

    String name;
    String location;
    int colleges;
    int students;
    String chancellor;
    double fee;
    String type;
    boolean hasHostel;
    boolean hasLibrary;
    int year;

    public String addCollege(String college) {
        System.out.println("College: " + college);
        return college;
    }

    public int totalStudents(int count) {
        System.out.println("Students: " + count);
        return count;
    }

    public String assignDean(String name) {
        System.out.println("Dean: " + name);
        return name;
    }

    public double collectFee(double amount) {
        System.out.println("Fee: " + amount);
        return amount;
    }

    public boolean openHostel(boolean status) {
        System.out.println("Hostel: " + status);
        return status;
    }

    public boolean openLibrary(boolean status) {
        System.out.println("Library: " + status);
        return status;
    }

    public String announce(String msg) {
        System.out.println("Announcement: " + msg);
        return msg;
    }

    public int courses(int count) {
        System.out.println("Courses: " + count);
        return count;
    }

    public String event(String event) {
        System.out.println("Event: " + event);
        return event;
    }

    public boolean discipline(boolean status) {
        System.out.println("Discipline: " + status);
        return status;
    }
}