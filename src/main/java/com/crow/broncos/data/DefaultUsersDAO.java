package com.crow.broncos.data;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.crow.broncos.domain.User;

/*
 * TODO: Make this work:
 * http://www.informit.com/guides/content.aspx?g=java&seqNum=620
 */
public class DefaultUsersDAO implements UsersDAO {

	/*
	 * TODO: Try to not return null
	 */
	public User getUser(int id) {
		return null;
	}

	public List<User> findAllUsers() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Query q = session.createQuery("from Users");
		@SuppressWarnings("unchecked")
		List<User> users = q.list();
		return users;
	}

}
