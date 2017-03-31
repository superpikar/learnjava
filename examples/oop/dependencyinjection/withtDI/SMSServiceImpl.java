package dependencyinjection.withtDI;

public class SMSServiceImpl implements MessageService {

	@Override
	public void sendMessage(String message, String receiver) {
		// logic to send email
		System.out.println("SMS sent to "+receiver+" with message : "+message);
	}
	
}
