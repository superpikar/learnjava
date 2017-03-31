package dependencyinjection.withtDI;

public class App {
	public static void main(String[] args) {
		String message = "Hi Pankaj";
		String email = "pankaj@abc.com";
		String phone = "4088888888";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		// bad behaviour because client need to initializing the email service that is not a good design decision.
		app = new MyDIApplication(new EmailServiceImpl());
		app.processMessage(message, email);
		app = new MyDIApplication(new SMSServiceImpl());
		app.processMessage(message, phone);
		
		// good design, because dependency injection implementation solved the problem with hard-coded dependency and 
		// helped us in making our application flexible and easy to extend. N
		injector = new EmailServiceInjectorImpl();
		app = injector.getConsumer();
		app.processMessage(message, email);
		injector = new SMSServiceInjectorImpl();
		app = injector.getConsumer();
		app.processMessage(message, phone);
	}
}
