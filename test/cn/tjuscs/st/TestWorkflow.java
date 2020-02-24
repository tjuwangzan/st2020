package cn.tjuscs.st;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestWorkflow {
	
	@Before
	public void setUp(){
		System.out.println("Before test method");
	}
	
	@After
	public void tearDown(){
		System.out.println("After test method");
	}
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("After Class");
	}

	@Test
	public void test1() {
		System.out.println("This is the first test method");;
	}
	
	@Test
	public void test2(){
		System.out.println("This is the second test method");
	}

}
