package tdd;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * test class with duplicated code
 * inspired by : https://zeroturnaround.com/rebellabs/dont-test-blindly-the-right-methods-for-unit-testing-your-java-apps/
 */
public class MyUrlValidatorTest {

	@Test
	public void whenUrlHasPort() {
		MyUrlValidator vdtr = new MyUrlValidator();
		vdtr.allowCustomPorts(true);
		vdtr.allowFileUrls(false);
		vdtr.allowSubDomains(false);
		assertTrue("domain is valid", vdtr.isValidUrl("http://localhost.com:9090/test"));
	}
	
	@Test
	public void whenUrlIsFile() {
		MyUrlValidator vdtr = new MyUrlValidator();
		vdtr.allowCustomPorts(true);
		vdtr.allowFileUrls(false);
		vdtr.allowSubDomains(false);
		assertFalse("domain is valid", vdtr.isValidUrl("file://home/users"));
	}
	
	@Test
	public void whenUrlHasSubDomain() {
		MyUrlValidator vdtr = new MyUrlValidator();
		vdtr.allowCustomPorts(true);
		vdtr.allowFileUrls(false);
		vdtr.allowSubDomains(false);
		assertFalse("domain is valid", vdtr.isValidUrl("http://blog.localhost.com"));
	}

}
