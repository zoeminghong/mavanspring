package com.service;

import org.springframework.stereotype.Service;

import com.bean.User;

@Service
public class UserService {
	
	public boolean checkLogin(User user){
		if(user.getPassword().equals("123456")){
			return true;
		}else {
			return false;
		}
	}
}
