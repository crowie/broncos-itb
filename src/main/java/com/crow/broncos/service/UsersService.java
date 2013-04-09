package com.crow.broncos.service;

import java.util.List;

import com.crow.broncos.data.UsersDAO;
import com.crow.broncos.domain.User;

public interface UsersService {

	List<User> findAllUsers();
	
	void setUsersDAO(UsersDAO dao);
}
