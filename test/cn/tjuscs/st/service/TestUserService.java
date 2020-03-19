package cn.tjuscs.st.service;

import org.junit.Before;
import org.junit.Test;

import cn.tjuscs.st.model.User;
import cn.tjuscs.st.model.UserException;
import static org.junit.Assert.*;

public class TestUserService {
	private IUserService us;
	private User baseUser,superUser;
	
	@Before
	public void setUp(){
//		初始化
//		us = new UserServiceByMap();
//		us = new UserServiceNull();
		us = new UserService();
		
//		首先定义User类的一个基本对象
		baseUser = new User("Admin","123","管理员");
//		定义User类的超级管理员对象
		superUser = new User("superadmin","123","超级管理员");
	}
	
	private void assertUserEquals(User tu, User u){
		assertEquals(tu.getUsername(), u.getUsername());
		assertEquals(tu.getPassword(), u.getPassword());
		assertEquals(tu.getNickname(), u.getNickname());
	}
	
	@Test
	public void testAdd(){
		
		us.add(baseUser);
		User tu = us.load("Admin");
		assertUserEquals(tu,baseUser);
			
	}
	
	@Test(expected=UserException.class)
	public void testAddExistUsername(){
		us.add(baseUser);
		User tu = new User("Admin","123","test");
		us.add(tu);	
		
	}
	
	@Test
	public void testDelete(){
		us.add(baseUser);
		User tu = us.load(baseUser.getUsername());
		assertNotNull(tu);
		us.delete(baseUser.getUsername());
		tu = us.load(baseUser.getUsername());
		assertNull(tu);
		
	}
	
	@Test
	public void testDeleteSA(){
		us.add(superUser);
		User tu = us.load("superadmin");
		assertNotNull(tu);
		us.delete("superadmin");
		User u = us.load("superadmin");
		assertNotNull(u);
	}
	

	
	@Test
	public void testLogin(){
		us.add(baseUser);
		String username = "Admin";
		String password = "123";
		User tu = us.login(username, password);
		assertUserEquals(tu,baseUser);
		
		
	}
	
	@Test(expected=UserException.class)
	public void testNotExistsUserLogin(){
		us.add(baseUser);
		String username="admin1";
		String password = "123";
		us.login(username, password);
	}
	
	@Test(expected=UserException.class)
	public void testPasswordErrorUserLogin(){
		us.add(baseUser);
		String username="Admin";
		String password="1234";
		us.login(username, password);
	}
	
}
