package cn.tjuscs.st.dao;

import cn.tjuscs.st.model.User;

public interface IUserDao {
	public void add(User user);
	public void delete(String username);
	public User load(String username);

}
