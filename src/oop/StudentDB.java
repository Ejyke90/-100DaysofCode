package oop;

public class StudentDB {

	public static void main(String[] args) {
		StudentDBase student1 = new StudentDBase("Alfred", "345989047");
		
		student1.enroll("Math 221");
		student1.enroll("Physics 202");
		student1.enroll("Chemistry 201");
		student1.enroll("History 211");
		
		//student1.showCourses();
		//student1.checkingBalance();
		//student1.pay(600);
		//student1.checkingBalance();
		
		System.out.println(student1.toString());
		

	}

}

class StudentDBase {
	// Defining the properties of the student database and using encapsulation
	private static int iD = 2000;					//the ID is internal and must be unique to each new account, hence we will set this to static
	private String userID;		//we want the user ID to be = iD + 4 random numbers between 1000 and 9000 + last four SSN numbers
	private String phone;
	private String stdName;
	private String SSN;
	private String city;
	private String state;
	private String course = "";
	private int balance = 0;
	private String email;
	private static final int costOfCourse = 800;
	
	
	// Constructors
	public StudentDBase(String stdName, String SSN) {
		this.stdName = stdName;
		this.SSN = SSN;
		iD++;
		userID();
		setEmail();
		
		
	}
	
	private void setEmail() {
		email = stdName.toLowerCase() + "." + iD + "@SDNUniversity.com";
		System.out.println("Your Student email is: " + email);
	}
	
	
	
	
	private void userID() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * (max - min));
		randNum = randNum + min;
		userID = iD + "" + randNum + SSN.substring(5);
		System.out.println("Your New Student Number is: " + userID);
	}
	
	

	
	
	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public void enroll(String course) {
		this.course = this.course + " " + course;
		balance = balance + costOfCourse;
		
	}
	
	
	public void pay(int amount) {
		System.out.println("Tuition Paid " + amount);
		balance = balance - amount;
		
		
	}
	
	
	public void showCourses() {
		System.out.println(course);
	}
	
	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "[Name: " + stdName + "]\n" + "[Student Number: " + userID + "]\n" + "[Courses: " + course + "]\n" + "[Balance: " + balance +"]"; 
	}

	

	
	public void checkingBalance() {
		System.out.println("Balance: " + balance);
		
	}
	
	
	
}

