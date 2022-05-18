package Task_21Encapsulation;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Student details = new Student();
		
		System.out.println("Addmission number of the student-" + " ");
		details.setAdmissionId(scan.nextInt());
		
		System.out.println("Name of the student-" + " ");
		details.setName(scan.next());
		
		System.out.println("Phone Number of the student-" + " ");
		details.setPhoneNumber(scan.nextLong());
		
		System.out.println("MailId of the student-" + " ");
		details.seteMail(scan.next());
		
		scan.close();
		
		System.out.println("\n Update details of  the Student ");
		
		details.setAdmissionId(2029);
		details.setName("Shivashangari");
		details.setPhoneNumber(6385300499l);
		details.seteMail("Shivashangari.c@atmecs.com");
		
		System.out.println("\nAddmission number of the student-" + " " + details.getAdmissionId());
		System.out.println("Name of the student-" + " " + details.getName());
		System.out.println("Phone Number of the student-" + " " + details.getPhoneNumber());
		System.out.println("MailId of the student-" + " " + details.geteMail());

	}
}