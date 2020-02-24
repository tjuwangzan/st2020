package cn.tjuscs.st;

//
/*
 * Author WZ@tju
 */
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Before;
import org.junit.Test;

public class TestCalculate {
	Calculate cal;
	
	
	@Before
	public void setUp(){
		cal = new Calculate();
	}
	
	
	@Test
	public void testAdd(){
		int result = cal.add(2, 2);
		assertEquals( 4,result);
	}
	@Test
	public void testMinus(){
		int result = cal.minus(10, 3);
		assertEquals( 7, result);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivide(){
		int result = cal.divide(20, 0);
		assertEquals( 2, result);
	}
	
	//是否暴露ArithmeticException
	@Test(expected=ArithmeticException.class)
	public void testDivideException(){
		int result = cal.divide(1, 1);
		assertEquals(1,result);
		
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivideNoException(){
		int result = cal.divide(1, 0);
		
	}
	
	@Test(timeout=300)
	public void testTime(){
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testMultiply(){
		int result = cal.multipy(2, 3);
		assertEquals( 6, result);
	}
	
	@Test
	public void testHamcrest(){
	//	assertThat(30,allOf(greaterThan(20),lessThan(40)));
	//	assertThat("abc.txt",endsWith("txt"));
	//	assertThat(3.14,is(closeTo(0.14,3)));
		assertThat("abcdefg",allOf(startsWith("abc"),endsWith("efg")));

	}
	
	@Test
	public void testA(){
		assertTrue((30 < 40) || (400<50));
	}
	
	
	

}
