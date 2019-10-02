import java.util.Scanner;

public class Email {
	private String fName;
	private String lName;
	private String dept;
	private String password;
	private String email;
	private String altEmail;
	private int mailBoxCapacity=2000;
	private int defaultPasswordLength = 50;
	private String companySuffix="company.com";

	// Constructor to Generate Email
	public Email(String firstName, String lastName) {
		this.fName = firstName;
		this.lName = lastName;
		//System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		// Call method to assign dept.
		this.dept = setDept();
		//System.out.println("Assigned Department Code: " + this.department);
		
		// Call method to Assigned Default Password
		this.password = setRandomPassword(defaultPasswordLength);
		System.out.println("Your Password: " + this.password);
		
		//Email Generation
		this.email=fName.toLowerCase()+lName.toLowerCase()+"@"+dept+"."+companySuffix;
		//System.out.println("Your Email Id is=> "+this.email);
	}

	//Method for assigning dept.
	private String setDept() {
		System.out.println("Hey "+this.fName+"!! Select Your Department Code: ");
		System.out.println("A. IT Department");
		System.out.println("B. Accounting");
		System.out.println("C. Sales");
		System.out.println("D. None");
		Scanner scn = new Scanner(System.in);
		char cc = scn.next().charAt(0);
		switch (cc) {
		case 'A':
			return "IT";
		case 'B':
			return "Accounting";
		case 'C':
			return "Sales";
		default:
			return "";
		}
	}

	//Generate default password
	private String setRandomPassword(int length) {
		String randompassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@3$_";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * randompassword.length());
			password[i] = randompassword.charAt(random);
		}
		return new String(password);
	}
	
	//Set mailBox Capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity=capacity;
	}
	
	//Set Alternate mailId
	public void setAlternateEmail(String mail) {
		this.altEmail=mail;
	}
	
	//Change password
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailBoxCapacity(){
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail() {
		return altEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	//Display details
	public void showInfo() {
		System.out.println("Name => " +this.fName+" "+this.lName
				+"\nCompany Email => " +email+"\nMailBox Capacity => "+mailBoxCapacity+"mb");
	}
}
