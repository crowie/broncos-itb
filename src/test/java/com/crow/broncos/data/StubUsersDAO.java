package com.crow.broncos.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.crow.broncos.domain.User;

public class StubUsersDAO implements UsersDAO {

	private final Map<Integer, User> db = new HashMap<Integer, User>();
	
	public StubUsersDAO() {
		db.put(1, new User(1, "ITB employee 1"));
	}
	
	public User getUser(int id) {
		return db.get(id);
	}

	// TODO: Fix. This is a downside of using Stub. Method not currently used. 
	public List<User> findAllUsers() {
		return null;
	}

}
