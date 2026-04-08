class Zoo {

    String zooName;
    String location;
    int animals;
    int staff;
    String director;
    double ticketPrice;
    String zooType;
    boolean hasAquarium;
    boolean hasSafari;
    int establishedYear;

    public String addAnimal(String animal) {
        System.out.println("Animal Added: " + animal);
        return animal;
    }

    public int totalAnimals(int count) {
        System.out.println("Animals: " + count);
        return count;
    }

    public String assignKeeper(String name) {
        System.out.println("Keeper: " + name);
        return name;
    }

    public double collectFee(double fee) {
        System.out.println("Fee: " + fee);
        return fee;
    }

    public boolean openSafari(boolean status) {
        System.out.println("Safari: " + status);
        return status;
    }

    public boolean openAquarium(boolean status) {
        System.out.println("Aquarium: " + status);
        return status;
    }

    public String announceEvent(String event) {
        System.out.println("Event: " + event);
        return event;
    }

    public int visitors(int count) {
        System.out.println("Visitors: " + count);
        return count;
    }

    public String organizeShow(String show) {
        System.out.println("Show: " + show);
        return show;
    }

    public boolean maintainClean(boolean status) {
        System.out.println("Cleanliness: " + status);
        return status;
    }
}