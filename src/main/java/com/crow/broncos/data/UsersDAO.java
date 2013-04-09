package com.crow.broncos.data;

import java.util.List;

import com.crow.broncos.domain.User;

/**
 * A simple DAO for retrieving users
 * @author Admin
 *
 */
public interface UsersDAO {

	User getUser(int id);
	List<User> findAllUsers();
}
