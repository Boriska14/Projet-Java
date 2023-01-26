package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private Object observer;
	

	@Before
	public void setUp() throws Exception {
		Object score = null;
		this.setObserver(score);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void test() {
		//fail("Not yet implemented");
		
	}

	public Object getObserver() {
		return observer;
	}

	public void setObserver(Object observer) {
		this.observer = observer;
	}

}
