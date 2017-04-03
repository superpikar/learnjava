package dependencyinjection.withDI;

public class SMSServiceInjectorImpl implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}
	
}
