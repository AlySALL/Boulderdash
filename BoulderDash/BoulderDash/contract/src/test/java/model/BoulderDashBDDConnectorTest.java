package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BoulderDashBDDConnectorTest {
	
	private  BoulderDashBDDConnectorTest boulder;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.setBoulder(new BoulderDashBDDConnectorTest());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetClass() {

	}

	public BoulderDashBDDConnectorTest getBoulder() {
		return boulder;
	}

	public void setBoulder(BoulderDashBDDConnectorTest boulder) {
		this.boulder = boulder;
	}

}
