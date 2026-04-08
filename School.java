class School{

    String schoolName;
    String location;
    int students;
    int teachers;
    String principal;
    double fee;
    String board;
    boolean library;
    boolean playground;
    int year;

    public String conductClass(String name) {
        System.out.println("Class: " + name);
        return name;
    }

    public int admit(int count) {
        System.out.println("Admit: " + count);
        return count;
    }

    public String teacher(String name) {
        System.out.println("Teacher: " + name);
        return name;
    }

    public double fee(double amount) {
        System.out.println("Fee: " + amount);
        return amount;
    }

    public boolean lib(boolean status) {
        System.out.println("Library: " + status);
        return status;
    }

    public boolean exam(boolean status) {
        System.out.println("Exam: " + status);
        return status;
    }

    public String holiday(String name) {
        System.out.println("Holiday: " + name);
        return name;
    }

    public int total(int count) {
        System.out.println("Total: " + count);
        return count;
    }

    public String event(String name) {
        System.out.println("Event: " + name);
        return name;
    }

    public boolean discipline(boolean status) {
        System.out.println("Discipline: " + status);
        return status;
    }
}