public class EmailApp {

	public static void main(String[] args) {
		System.out.println("*********New Employee********");
		Email mail = new Email("Ariana", "Grande");
		mail.showInfo();
		System.out.println("*********New Employee********");
		Email mail1 = new Email("Selena", "Gomez");
		mail1.showInfo();
		System.out.println("*********New Employee********");
		Email mail2 = new Email("Shawn", "Mendes");
		mail2.showInfo();
	}

}
