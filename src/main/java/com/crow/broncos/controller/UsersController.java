package com.crow.broncos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crow.broncos.domain.User;


@Controller
@RequestMapping("/users")
public class UsersController {

	private List<User> users;
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView getWelcomePage() {
		
		// TODO: Set up correct access for Users using DAO
		User dummyUser = new User(1, "dummy ITB name");
		users = new ArrayList<User>();
		users.add(dummyUser);
		
		return new ModelAndView("welcome", "users", users);
	}

}
