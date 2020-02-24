package cn.tjuscs.st;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.TestResult;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestMid {
	private int x;
	private int y;
	private int z;
	private int m;
	private Mid mid = null;
	
	public TestMid(int x, int y, int z, int m){
		this.x = x;
		this.y = y;
		this.z = z;
		this.m = m;
	}
	
	@Parameters
	public static Collection getData(){
		return Arrays.asList(new Object[][]{
						  {3,3,5,3},
						  {1,2,3,2},
						  {3,2,2,2},
						  {5,5,5,5},
						  {1,1,4,1},
						  {5,3,4,4},
						  {3,2,1,2},
						  {2,1,3,2},
						  {5,4,2,4},
						  {5,2,6,5}});
		
	}
	
	@Before
	public void setUp(){
		mid = new Mid();
	}

	@Test
	public void testMid() {
		
		assertEquals(this.m,mid.mid(x, y, z));
		
		
		
	}
	
	@AfterClass
	public static void testResult(){
		
		System.out.println();
	}
	

}
