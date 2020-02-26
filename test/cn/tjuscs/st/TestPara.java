package cn.tjuscs.st;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestPara {
	//针对一行数据，定义与之相对应的实例变量，
	//{1,1,2}
	private int input1;
	private int input2;
	private int expected;
	private Calculate cal = null;
	
	public TestPara(int input1, int input2, int expected){
		this.input1 = input1;
		this.input2 = input2;
		this.expected = expected;
	}
	
	@Before
	public void setUp(){
		cal = new Calculate();
	}
	
	@Parameters
	public static Collection<Object[]> getData(){
			
//		return Arrays.asList(new Object[][]{
//				{1,2,1},
//				{2,5,3},
//				{3,8,5}
//				});
		return Arrays.asList(new Object[][]{
			{1,1,2},
			{2,3,5},
			{3,5,8}
			});
	}
	
	
	@Test
	public void testAdd() {
		
		assertEquals(this.expected,cal.add(input1, input2));
	}

}
