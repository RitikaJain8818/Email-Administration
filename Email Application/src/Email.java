import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String email;
	private String alternateEmail;
	private int mailBoxCapacity=500;
	private int defaultPasswordLength = 10;
	private String companySuffix="rjcompany.com";

	// Constructor to Generate Email
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		// Call method to assign dept.
		this.department = setDept();
		//System.out.println("Assigned Department Code: " + this.department);
		
		// Call method to Assigned Default Password
		this.password = setRandomPassword(defaultPasswordLength);
		System.out.println("Your Password: " + this.password);
		
		//Email Generation
		this.email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		//System.out.println("Your Email Id is=> "+this.email);
	}

	//Method for assigning dept.
	private String setDept() {
		System.out.println("Hey "+this.firstName+"!! Select Your Department Code: ");
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
		this.alternateEmail=mail;
	}
	
	//Change password
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailBoxCapacity(){
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	//Display details
	public void showInfo() {
		System.out.println("Name => " +this.firstName+" "+this.lastName
				+"\nCompany Email => " +email+"\nMailBox Capacity => "+mailBoxCapacity+"mb");
	}
}
