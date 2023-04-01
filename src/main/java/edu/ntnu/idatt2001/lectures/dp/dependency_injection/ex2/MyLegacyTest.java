package edu.ntnu.idatt2001.lectures.dp.dependency_injection.ex2;

import edu.ntnu.idatt2001.lectures.dp.dependency_injection.util.EmailService;

public class MyLegacyTest {

	public static void main(String[] args) {
		MyApplication app = new MyApplication(new EmailService());
		app.processMessages("Hi Pankaj", "pankaj@abc.com");
	}

}