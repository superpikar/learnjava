package dependencyinjection.withDI;

public class EmailServiceInjectorImpl implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new EmailServiceImpl());
	}
	
}
