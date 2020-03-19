package cn.tjuscs.st.service;

import cn.tjuscs.st.model.User;

public class UserServiceNull implements IUserService {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String username) {
		// TODO Auto-generated method stub

	}

	@Override
	public User load(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
