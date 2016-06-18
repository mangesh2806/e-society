package com.e_society.dao;

import java.util.List;

import com.e_society.model.User;

public interface UserDAO 
{
	public String loginCheck(String userid,String passwotrds);
	public void adduser(User user);
	List<User> viewuser();

}
