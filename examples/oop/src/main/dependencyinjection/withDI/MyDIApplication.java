package dependencyinjection.withDI;

public class MyDIApplication implements Consumer {
	
	private MessageService service;
	
	public MyDIApplication(MessageService service) {
		this.service = service;
	}

	@Override
	public void processMessage(String message, String receiver) {
		service.sendMessage(message, receiver);
	}

}
