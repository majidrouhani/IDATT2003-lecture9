package edu.ntnu.idatt2001.lectures.dp.dependency_injection.ex3;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}