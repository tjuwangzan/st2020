package cn.tjuscs.st.service;

import cn.tjuscs.st.dao.*;
import cn.tjuscs.st.model.*;

public class UserService implements IUserService {
	

	private IUserDao userDao;
	
	public UserService(IUserDao userDao) {
		this.userDao = userDao;
	}
	
	public UserService() {
		userDao = new UserStubDao();
//		userDao = new UserDao();
	}

	@Override
	public void add(User user) {
		if(load(user.getUsername())!=null)
			throw new UserException("用户名已经存在");
		userDao.add(user);
	}

	@Override
	public void delete(String username) {
		if(username=="superadmin")
			return; 
			
		userDao.delete(username);
	}

	@Override
	public User load(String username) {
//		userDao.delete("abc");
		userDao.load(username);
		return userDao.load(username);
	}

	@Override
	public User login(String username, String password) {
		User u = load(username);
		if(u==null) throw new UserException("用户名不存在");
		if(!u.getPassword().equals(password)) throw new UserException("用户密码不正确");
		return u;
	}


}
