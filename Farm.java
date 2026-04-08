class Farm {

    String name;
    String location;
    int animals;
    int workers;
    String owner;
    double income;
    String type;
    boolean hasIrrigation;
    boolean hasMachinery;
    int year;

    public String growCrop(String crop) {
        System.out.println("Crop: " + crop);
        return crop;
    }

    public int totalAnimals(int count) {
        System.out.println("Animals: " + count);
        return count;
    }

    public String assignWorker(String name) {
        System.out.println("Worker: " + name);
        return name;
    }

    public double calculateIncome(double amount) {
        System.out.println("Income: " + amount);
        return amount;
    }

    public boolean startIrrigation(boolean status) {
        System.out.println("Irrigation: " + status);
        return status;
    }

    public boolean useMachinery(boolean status) {
        System.out.println("Machinery: " + status);
        return status;
    }

    public String announce(String msg) {
        System.out.println("Announcement: " + msg);
        return msg;
    }

    public int production(int count) {
        System.out.println("Production: " + count);
        return count;
    }

    public String event(String event) {
        System.out.println("Event: " + event);
        return event;
    }

    public boolean safety(boolean status) {
        System.out.println("Safety: " + status);
        return status;
    }
}