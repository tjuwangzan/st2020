package cn.tjuscs.st.service;

import org.easymock.EasyMock;
import org.junit.Test;

import cn.tjuscs.st.dao.IUserDao;
import cn.tjuscs.st.model.User;
import cn.tjuscs.st.util.EntitiesHelper;

public class TestEasyMockFirst {
	@Test
	public void testLoad() {
//		1. 创建Dao的Mock对象，目前就进入了record阶段
		IUserDao ud = EasyMock.createMock(IUserDao.class);
//		IUserDao ud = EasyMock.createStrictMock(IUserDao.class);
		User u = new User("admin","123","管理员");
//		User u2 = new User("admin2","1234","管理员2");

//		2.记录ud可能会发生操作并返回的结果，主要的record阶段
//		EasyMock.expect(ud.load("admin")).andReturn(u).times(2);
		EasyMock.expect(ud.load("admin")).andReturn(u);
//		EasyMock.expect(ud.load("admin2")).andReturn(u2);
//		ud.delete("abc");
//		EasyMock.expectLastCall();
		
//		3.进入测试阶段，也就是replay阶段
		EasyMock.replay(ud);
		
//		创建Service和Dao的关联
		IUserService us = new UserService(ud);
		User tu = us.load("admin");
		EntitiesHelper.assertUser(u, tu);
//		User tu2 = us.load("admin2");
//		EntitiesHelper.assertUser(u2, tu2);
		
//		4.verify阶段
		EasyMock.verify(ud);
		
		
		
	}

}
