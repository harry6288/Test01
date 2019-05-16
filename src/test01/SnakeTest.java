// name hardeep kaur  id= 738253
package test01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SnakeTest {
	private Snake peter;
	private Snake takis;
	

	@Before
	public void setUp() throws Exception {
		peter = new Snake("Peter S", 10, "coffee");
		takis = new Snake("Takis Z", 80, "vegetables");
	}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testhealthy() {
		
		
		takis.isHealthy();
		assertEquals("vegetables",takis);
		peter.isHealthy();
		assertEquals("vegetables",peter);
	}

}
