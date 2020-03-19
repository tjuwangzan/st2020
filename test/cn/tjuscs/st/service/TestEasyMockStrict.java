package cn.tjuscs.st.service;

import org.easymock.EasyMock;
import org.junit.Test;

import cn.tjuscs.st.dao.IUserDao;
import cn.tjuscs.st.model.User;
import cn.tjuscs.st.util.EntitiesHelper;

public class TestEasyMockStrict {
	
//	@Test
//	public void testLoad() {
//		//1、创建DAO的Mock对象，进入了record阶段
//		//通过CreateMock创建的Mock对象，在进行Verify的时候仅仅只是检查关联方法是否正常完成调用，如果完成次数一致就认为测试通过，不考虑顺序问题
//		//而CreateStrictMock则要
//		IUserDao ud = EasyMock.createMock(IUserDao.class);
//		User u = new User(1,"admin","123","管理员");
//		//2、记录ud可能会发生的操作的结果
//		/*
//		 * 以下代码所指的是，当在dao中调用了load方法并且参数为admin的时候，返回值是u对象
//		 */
//		//必须把交互的所有过程都记录下来
//		
//	
////		EasyMock.expect(ud.load("asd")).andReturn(u);
//		//以下用来操作没有返回值的方法
//		ud.delete("abc");
//		EasyMock.expectLastCall();
//		
//		EasyMock.expect(ud.load("admin")).andReturn(u);
//		
//		//3、进入测试阶段，也就是replay阶段
//		EasyMock.replay(ud);
//		//创建Service和DAO的关联
//		IUserService us = new UserService(ud);
//		//完成测试
//		User tu = us.load("admin");
//		EntitiesHelper.assertUser(tu,u);
//		//3、验证交互关系是否正确
//		EasyMock.verify(ud);
//	}
//	
//	@Test
//	public void testLoadMock() {
//		//1、创建DAO的Mock对象，目前就进入了record阶段
//		IUserDao ud = EasyMock.createMock(IUserDao.class);
//		User u = new User(1,"admin","123","管理员");
////		EasyMock.expect(ud.load("asd")).andReturn(u);
//		//使用的createMock,如果方法的调用顺序不一致，不会抛出异常
//		ud.delete("abc");
//		EasyMock.expectLastCall();
//		EasyMock.expect(ud.load("admin")).andReturn(u);
//		EasyMock.replay(ud);
//		//创建Service和DAO的关联
//		IUserService us = new UserService(ud);
//		//完成测试
//		User tu = us.load("admin");
//		EntitiesHelper.assertUser(tu,u);
//		//3、验证交互关系是否正确
//		EasyMock.verify(ud);
//	}
//	
	@Test
	public void testLoadStrictMock() {
		//1、创建DAO的Mock对象，目前就进入了record阶段
		IUserDao ud = EasyMock.createStrictMock(IUserDao.class);
		User u = new User(1,"admin","123","管理员");
//		EasyMock.expect(ud.load("asd")).andReturn(u);
		
		
		//使用的createStrictMock,方法的顺序不一致，所以会抛出异常
		ud.delete("abc");
		EasyMock.expectLastCall();
		
		EasyMock.expect(ud.load("admin")).andReturn(u);
		EasyMock.expect(ud.load("admin")).andReturn(u);
		EasyMock.replay(ud);
		//创建Service和DAO的关联
		IUserService us = new UserService(ud);
		//完成测试
		User tu = us.load("admin");
		EntitiesHelper.assertUser(tu,u);
		//3、验证交互关系是否正确
		EasyMock.verify(ud);
	}
}
