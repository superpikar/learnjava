package dependencyinjection.withoutDI;

public class MyApplication {
	private EmailService email = new EmailService();
	
	public void processMessages(String message, String receiver){
		// do some message validation, manipulation
		email.sendEmail(message, receiver);
	}
}
