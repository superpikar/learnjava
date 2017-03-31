package dependencyinjection.withtDI;

public class SMSServiceInjectorImpl implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}
	
}
