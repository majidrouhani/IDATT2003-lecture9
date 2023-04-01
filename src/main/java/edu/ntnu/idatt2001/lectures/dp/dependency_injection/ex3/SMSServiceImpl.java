package edu.ntnu.idatt2001.lectures.dp.dependency_injection.ex3;

public class SMSServiceImpl implements MessageService {

	
    /** 
     * @param msg
     * @param rec
     */
    @Override
	public void sendMessage(String msg, String rec) {
		//logic to send SMS
		System.out.println("SMS sent to "+rec+ " with Message="+msg);
	}

}