package cn.tjuscs.st.util;

import static org.junit.Assert.*;
import cn.tjuscs.st.model.User;

public class EntitiesHelper {
	private static User baseUser = new User(1,"admin","123","管理员");
	
	public static void assertUser(User expected,User actual) {
		assertNotNull(expected);
		assertEquals(expected.getId(), actual.getId());
		assertEquals(expected.getUsername(), actual.getUsername());
		assertEquals(expected.getPassword(), actual.getPassword());
		assertEquals(expected.getNickname(), actual.getNickname());
	}
	
	public static void assertUser(User expected) {
		assertUser(expected, baseUser);
	}
}
