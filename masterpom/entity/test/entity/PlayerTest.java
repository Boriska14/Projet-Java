package entity;

import static org.junit.Assert.*;

import java.awt.image.BufferedImage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlayerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private Object alive;
	private BufferedImage sprites;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void test() {
		setActualSprite(getSprite("but1"));
		this.setX(10);
		this.setY(10);
		
	}

	private void setActualSprite(Object sprite) {
		// TODO Auto-generated method stub
		
	}

	private Object getSprite(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private void setY(int i) {
		// TODO Auto-generated method stub
		
	}

	private void setX(int i) {
		// TODO Auto-generated method stub
		
	}

}
