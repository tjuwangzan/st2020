package cn.tjuscs.st.service;

import org.easymock.EasyMock;
import org.junit.Test;

import cn.tjuscs.st.dao.IUserDao;
import cn.tjuscs.st.model.User;
import cn.tjuscs.st.util.EntitiesHelper;

public class TestEasyMockSingle {
	@Test
	public void testLoadMock(){
		//1、创建DAO的Mock对象，进入了record阶段
		IUserDao ud = EasyMock.createMock(IUserDao.class);
//		IUserDao ud = EasyMock.createStrictMock(IUserDao.class);
		User u = new User(1,"admin","123","管理员");
		
		//2、记录ud可能会发生的操作的结果
		/*
		 * 以下代码所指的是，当在dao中调用了load方法并且参数为admin的时候，返回值是u对象
		 */
		//必须把交互的所有过程都记录下来	
			
		ud.delete("abc");
		EasyMock.expectLastCall();
//		
		EasyMock.expect(ud.load("admin")).andReturn(u).times(2);
	
		
		//3、进入测试阶段，也就是replay阶段
		EasyMock.replay(ud);
		
		IUserService us = new UserService(ud);
		User tu = us.load("admin");
		EntitiesHelper.assertUser(tu, u);
		
		EasyMock.verify(ud);
		
	}

}
