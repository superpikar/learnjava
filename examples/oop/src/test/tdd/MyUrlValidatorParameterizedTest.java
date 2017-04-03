package tdd;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.List;

/**
 * test class with duplicated code
 * inspired by : https://zeroturnaround.com/rebellabs/dont-test-blindly-the-right-methods-for-unit-testing-your-java-apps/
 */
@RunWith(Parameterized.class)
public class MyUrlValidatorParameterizedTest {
	private MyUrlValidator vdtr = null;
	private String uriTestedNow = null;
	private boolean expectedResult = false;
	
	public MyUrlValidatorParameterizedTest(String uriTestedNow, boolean expectedResult) {
		this.uriTestedNow = uriTestedNow;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
	public static Collection data(){
		// first element is the URI, second is the expected result
		List uriToBeTested = Arrays.asList(new Object[][] {
				{"http://localhost.com:9090/test", true},
				{"file://home/users", false},
				{"http://blog.localhost.com", false}
		});
		return uriToBeTested;
	}
	
	@Before
	public void beforeEachTest() {
		vdtr = new MyUrlValidator();
		vdtr.allowCustomPorts(true);
		vdtr.allowFileUrls(false);
		vdtr.allowSubDomains(false);
	}
	
	@Test
	public void whenUrlHasPort() {
		assertEquals("testing for "+uriTestedNow, expectedResult, vdtr.isValidUrl(uriTestedNow));
	}
}
