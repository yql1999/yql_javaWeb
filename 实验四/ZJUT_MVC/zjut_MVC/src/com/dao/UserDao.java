package com.dao;

import com.bean.User;
import java.util.HashMap;
import java.util.Map;

public class UserDao {
	private static Map<String,User> db=new HashMap<String,User>();
	
	public static boolean addUser(String username,String password,
			String sex,int age,String address) {
		//若用户名已被注册
		if(db.containsKey(username)) {
			return false;
		}
		else {
			User user= new User(username,password,sex,age,address);
			//加入该用户
			db.put(username, user);
			return true;
		}
	}
	
	public static User verifyAccount(String username,String password) {
		if(db.containsKey(username)) {
			//读取该用户名的用户
			User user=db.get(username);
			if(user.getPassword().equals(password)) {
				return user;
			}
			else {
				return null;
			}
		}
		return null;
	}
	
}
