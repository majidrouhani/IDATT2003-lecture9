package edu.ntnu.idatt2001.lectures.dp.dependency_injection.ex3;

public class EmailServiceImpl implements MessageService {

	
    /** 
     * @param msg
     * @param rec
     */
    @Override
	public void sendMessage(String msg, String rec) {
		//logic to send email
		System.out.println("Email sent to "+rec+ " with Message="+msg);
	}

}