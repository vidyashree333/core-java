class Library{

    String name;
    String location;
    int books;
    int staff;
    String librarian;
    double fee;
    String type;
    boolean hasDigital;
    boolean hasReadingRoom;
    int year;

    public String issueBook(String book) {
        System.out.println("Book: " + book);
        return book;
    }

    public int totalBooks(int count) {
        System.out.println("Books: " + count);
        return count;
    }

    public String assignLibrarian(String name) {
        System.out.println("Librarian: " + name);
        return name;
    }

    public double collectFee(double amount) {
        System.out.println("Fee: " + amount);
        return amount;
    }

    public boolean openDigital(boolean status) {
        System.out.println("Digital: " + status);
        return status;
    }

    public boolean openReading(boolean status) {
        System.out.println("Reading Room: " + status);
        return status;
    }

    public String announce(String msg) {
        System.out.println("Announcement: " + msg);
        return msg;
    }

    public int visitors(int count) {
        System.out.println("Visitors: " + count);
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