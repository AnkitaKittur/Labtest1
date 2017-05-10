package test1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LightBulbTest {
	
	LightBulb LightBulbTest1;
	@Before
	public void setUp() throws Exception {
		LightBulbTest1=new LightBulb(2000);
		
		
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(2000,LightBulbTest1.getEnergy());
	}

}
