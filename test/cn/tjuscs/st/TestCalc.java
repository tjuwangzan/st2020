package cn.tjuscs.st;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestCalc {
	Calculate cal = null;
	@Before
	public void setUp() {
		cal = new Calculate();
	}
	
	@Test
	public void testAdd(){
		
		assertEquals(5, cal.add(2, 3));
	}
	
//	@Test(expected=ArithmeticException.class)
//	public void testDivide(){
//		int result = cal.divide(20, 0);
////		assertEquals( 2, result);
//	}
	
	@Test(timeout=302)
	public void testTime(){
		try {
			Thread.sleep(301);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
