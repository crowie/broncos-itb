package com.crow.broncos.data;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.crow.broncos.domain.User;

public class DefaultUsersDAOTest {

	/* TODO: Using stub is not testing the DAO functionality
	 * 
	 * Currently set to use stub to return data. Must test DAO properly
	 */
	@Test
	public void UserIdReturnsUser() {
		UsersDAO dao = new StubUsersDAO();
		int stubUserId = 1;
		
		assertThat(dao.getUser(stubUserId).getId(), equalTo(stubUserId));
	} 
}
