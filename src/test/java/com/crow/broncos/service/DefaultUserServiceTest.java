package com.crow.broncos.service;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.Test;

import com.crow.broncos.data.UsersDAO;
import com.crow.broncos.domain.User;

public class DefaultUserServiceTest {

	/*
	 * http://stackoverflow.com/questions/3236880/assert-list-in-junit
	 */
	@Test
	public void callsDAOReturnsList() {
		UsersService userService = new DefaultUsersService();
		UsersDAO usersDAO = EasyMock.createMock(UsersDAO.class);
		userService.setUsersDAO(usersDAO);
		
		List<User> actual = Arrays.asList(new User(1, "name1"), new User(2, "name2"));
		// List<User> expected = Arrays.asList(new User(1, "name1"), new User(2, "name2")); // Haven't overridden equals on User yet
		
		expect(usersDAO.findAllUsers()).andReturn(actual);
		
		replay(usersDAO);
		List<User> users = userService.findAllUsers();
		verify(usersDAO);
		
		assertThat(users, is(actual));
	}
	
}
