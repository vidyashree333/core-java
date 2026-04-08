class Gym{

    String name;
    String location;
    int trainers;
    int members;
    String owner;
    double fee;
    String type;
    boolean hasAC;
    boolean hasEquipment;
    int year;

    public String workout(String type) {
        System.out.println("Workout: " + type);
        return type;
    }

    public int totalMembers(int count) {
        System.out.println("Members: " + count);
        return count;
    }

    public String assignTrainer(String name) {
        System.out.println("Trainer: " + name);
        return name;
    }

    public double collectFee(double amount) {
        System.out.println("Fee: " + amount);
        return amount;
    }

    public boolean startAC(boolean status) {
        System.out.println("AC: " + status);
        return status;
    }

    public boolean useEquipment(boolean status) {
        System.out.println("Equipment: " + status);
        return status;
    }

    public String announce(String msg) {
        System.out.println("Announcement: " + msg);
        return msg;
    }

    public int sessions(int count) {
        System.out.println("Sessions: " + count);
        return count;
    }

    public String event(String event) {
        System.out.println("Event: " + event);
        return event;
    }

    public boolean hygiene(boolean status) {
        System.out.println("Hygiene: " + status);
        return status;
    }
}