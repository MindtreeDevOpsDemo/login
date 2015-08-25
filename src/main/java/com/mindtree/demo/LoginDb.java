package com.mindtree.demo;


import java.util.HashMap;
import java.util.Map;

public final class LoginDb {
	
	public static Map<String,String> users;
	

	static {
		
		
		users = new HashMap<String, String>();
		users.put("james.bond@bond.com", "bond123");
		users.put("rango.mt@example.com", "rango123");
		users.put("bean.mr@junk.com", "bean123");
		users.put("user@user.com", "user1234");
	}
}
