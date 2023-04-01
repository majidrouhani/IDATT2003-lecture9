package edu.ntnu.idatt2001.lectures.dp.dependency_injection.util;

public class EmailService {

	public void sendEmail(String message, String receiver){
		//logic to send email
		System.out.println("Email sent to "+receiver+ " with Message="+message);
	}
}