package tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * test class with duplicated code
 * inspired by : https://zeroturnaround.com/rebellabs/dont-test-blindly-the-right-methods-for-unit-testing-your-java-apps/
 */
public class MyUrlValidatorBeforeEachTest {
	private MyUrlValidator vdtr = null;
	
	@Before
	public void beforeEachTest() {
		vdtr = new MyUrlValidator();
		vdtr.allowCustomPorts(true);
		vdtr.allowFileUrls(false);
		vdtr.allowSubDomains(false);
	}
	
	@Test
	public void whenUrlHasPort() {
		assertTrue("domain is valid", vdtr.isValidUrl("http://localhost.com:9090/test"));
	}
	
	@Test
	public void whenUrlIsFile() {
		assertFalse("domain is valid", vdtr.isValidUrl("file://home/users"));
	}
	
	@Test
	public void whenUrlHasSubDomain() {
		assertFalse("domain is valid", vdtr.isValidUrl("http://blog.localhost.com"));
	}

}
