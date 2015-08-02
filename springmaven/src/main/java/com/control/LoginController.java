package com.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.User;
import com.service.UserService;

@Controller
public class LoginController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/login.html")
	public String toLoginPage(){
		
		return "login";
	}
	@RequestMapping("/checkLogin.html")
	public ModelAndView checkLogin(HttpServletRequest request ,User user){
		ModelAndView modelAndView =new ModelAndView();
		if(userService.checkLogin(user)){
//			request.setAttribute("user", user);
			modelAndView.setViewName("welcome");
		}else{
			modelAndView.setViewName("login");
		}
		return modelAndView;
	}
}
