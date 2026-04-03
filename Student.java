class Student {

    String name;
    String usn;
    String college;
    String course;
    static int semester = 3;
    String branch;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(String name, String usn, String college, String course, String branch) {
        this.name = name;
        this.usn = usn;
        this.college = college;
        this.course = course;
        this.branch = branch;
    }

    // Display method
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("College: " + college);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
        System.out.println("Branch: " + branch);
        System.out.println("-----------------------------");
    }
}