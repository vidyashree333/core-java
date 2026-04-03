class StudentRunner {

    public static void main(String[] args) {
    Student stu=new Student(); 		
	stu.name="Neha";
	stu.usn="revatlTy";
	stu.college="RV college";
	stu.course="B.E";
	stu.branch="CSE";
	stu.displayStudentDetails();
                                                                                     
	

        Student s1 = new Student("Rahul", "1RV21CS001", "RV College", "B.E", "CSE");
		 s1.displayStudentDetails();
		 
        Student s2 = new Student("Anita", "1RV21IS002", "RV College", "B.E", "ISE");
		 s2.displayStudentDetails();
		 
        Student s3 = new Student("Kiran", "1RV21ME003", "RV College", "B.E", "ME");
		s3.displayStudentDetails();
		
        Student s4 = new Student("Sneha", "1RV21EC004", "RV College", "B.E", "ECE");
		s4.displayStudentDetails();
		
        Student s5 = new Student("Arjun", "1RV21EE005", "RV College", "B.E", "EEE");
		s5.displayStudentDetails();
		
        Student s6 = new Student("Pooja", "1RV21CS006", "RV College", "B.E", "CSE");
		s6.displayStudentDetails();
		
        Student s7 = new Student("Vikram", "1RV21IS007", "RV College", "B.E", "ISE");
		s7.displayStudentDetails();
		
        Student s8 = new Student("Divya", "1RV21EC008", "RV College", "B.E", "ECE");
		s8.displayStudentDetails();
		
        Student s9 = new Student("Manoj", "1RV21ME009", "RV College", "B.E", "ME");
		s9.displayStudentDetails();
		
        Student s10 = new Student("Neha", "1RV21CS010", "RV College", "B.E", "CSE");
		 s10.displayStudentDetails();
    }    
      
}