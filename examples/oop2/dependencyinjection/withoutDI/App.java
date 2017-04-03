package dependencyinjection.withoutDI;

public class App {
	public static void main(String[] args) {
		MyApplication app = new MyApplication();
		app.processMessages("Hi Putra!", "putra@gmail.com");
	}
}
