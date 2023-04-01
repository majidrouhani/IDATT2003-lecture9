package edu.ntnu.idatt2001.lectures.dp.dependency_injection.ex2;

import edu.ntnu.idatt2001.lectures.dp.dependency_injection.util.EmailService;

public class MyApplication {

	private EmailService email = null;
	
	public MyApplication(EmailService svc){
		this.email=svc;
	}
	
	public void processMessages(String msg, String rec){
		//do some msg validation, manipulation logic etc
		this.email.sendEmail(msg, rec);
	}
}