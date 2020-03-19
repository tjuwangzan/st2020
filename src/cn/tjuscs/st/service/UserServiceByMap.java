package cn.tjuscs.st.service;

import java.util.HashMap;
import java.util.Map;

import cn.tjuscs.st.model.User;
import cn.tjuscs.st.model.UserException;

public class UserServiceByMap implements IUserService {
	
	private Map<String,User> us = new HashMap<String,User>();

	@Override
	public void add(User user) {
		if(load(user.getUsername())!=null)
			throw new UserException("用户名已经存在");
		us.put(user.getUsername(), user);

	}

	@Override
	public void delete(String username) {
		if(username=="superadmin") return;
		us.remove(username);

	}

	@Override
	public User load(String username) {
		return us.get(username);
	}

	@Override
	public User login(String username, String password) {
		User u = load(username);
		if(u==null) throw new UserException("用户名不存在");
		if(!u.getPassword().equals(password)) throw new UserException("密码错误");
		return u;
	}

}
