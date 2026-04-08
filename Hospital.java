class Hospital{

    String hospitalName;
    String location;
    int doctors;
    int nurses;
    int patients;
    String chiefDoctor;
    double consultationFee;
    boolean hasICU;
    boolean hasAmbulance;
    int establishedYear;

    public String treatPatient(String name) {
        System.out.println("Treating: " + name);
        return name;
    }

    public int admitPatient(int count) {
        System.out.println("Admitted: " + count);
        return count;
    }

    public String assignDoctor(String doctor) {
        System.out.println("Doctor: " + doctor);
        return doctor;
    }

    public double collectFee(double fee) {
        System.out.println("Fee: " + fee);
        return fee;
    }

    public boolean openICU(boolean status) {
        System.out.println("ICU: " + status);
        return status;
    }

    public boolean conductSurgery(boolean status) {
        System.out.println("Surgery: " + status);
        return status;
    }

    public String announceCamp(String camp) {
        System.out.println("Camp: " + camp);
        return camp;
    }

    public int totalPatients(int count) {
        System.out.println("Patients: " + count);
        return count;
    }

    public String organizeEvent(String event) {
        System.out.println("Event: " + event);
        return event;
    }

    public boolean maintainCleanliness(boolean status) {
        System.out.println("Cleanliness: " + status);
        return status;
    }
}