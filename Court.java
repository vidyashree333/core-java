class Court {

    String name;
    String location;
    int judges;
    int cases;
    String chiefJudge;
    double budget;
    String type;
    boolean hasJury;
    boolean hasRecords;
    int year;

    public String hearCase(String caseName) {
        System.out.println("Hearing: " + caseName);
        return caseName;
    }

    public int totalCases(int count) {
        System.out.println("Cases: " + count);
        return count;
    }

    public String assignJudge(String name) {
        System.out.println("Judge: " + name);
        return name;
    }

    public double allocateBudget(double amount) {
        System.out.println("Budget: " + amount);
        return amount;
    }

    public boolean startTrial(boolean status) {
        System.out.println("Trial: " + status);
        return status;
    }

    public boolean maintainRecords(boolean status) {
        System.out.println("Records: " + status);
        return status;
    }

    public String announce(String msg) {
        System.out.println("Announcement: " + msg);
        return msg;
    }

    public int hearings(int count) {
        System.out.println("Hearings: " + count);
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