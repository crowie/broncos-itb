package com.crow.broncos.service;

import java.util.List;

import com.crow.broncos.data.UsersDAO;
import com.crow.broncos.domain.User;

/**
 * A class implemented to handle actions related to Users
 * 
 * @author Admin
 *
 */
public class DefaultUsersService implements UsersService {

	UsersDAO usersDAO;
	
	public List<User> findAllUsers() {
		return usersDAO.findAllUsers();
	}

	public void setUsersDAO(UsersDAO dao) {
		this.usersDAO  = dao;
	}

}
