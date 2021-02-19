package com.portfolio_package;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@RequestMapping("/user")
	public ModelAndView showUser(HttpServletResponse response, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		UserDao uMode = new UserDao();
		User u = uMode.getUser(id);
		ModelAndView mvUser = new ModelAndView();
		mvUser.setViewName("user.jsp");
		mvUser.addObject("resultUser",u.showUserInfo());
		return mvUser;
	}
}
