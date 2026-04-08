class College{

    
    String collegeName;
    String location;
    int totalStudents;
    int totalStaff;
    String principalName;
    double fees;
    String university;
    boolean hasHostel;
    boolean hasLibrary;
    int establishedYear;

    public String conductClass(String subject) {
        System.out.println("Class: " + subject);
        return subject;
    }

    public int admitStudents(int count) {
        System.out.println("Students admitted: " + count);
        return count;
    }

    public String assignTeacher(String name) {
        System.out.println("Teacher: " + name);
        return name;
    }

    public double collectFees(double amount) {
        System.out.println("Fees: " + amount);
        return amount;
    }

    public boolean openLibrary(boolean status) {
        System.out.println("Library: " + status);
        return status;
    }

    public boolean conductExam(boolean status) {
        System.out.println("Exam: " + status);
        return status;
    }

    public String announceHoliday(String holiday) {
        System.out.println("Holiday: " + holiday);
        return holiday;
    }

    public int totalStudents(int count) {
        System.out.println("Total: " + count);
        return count;
    }

    public String organizeEvent(String event) {
        System.out.println("Event: " + event);
        return event;
    }

    public boolean maintainDiscipline(boolean status) {
        System.out.println("Discipline: " + status);
        return status;
    }
}