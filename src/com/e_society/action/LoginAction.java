package com.e_society.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.e_society.dao.UserDAO;
import com.e_society.model.User;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction implements ModelDriven<User>,SessionAware 
{

	private UserDAO userdao;
	private SessionMap<String,Object> sessionMap;
	User user=new User();
	@Override
	public User getModel() 
	{
		return user;
	}

	public void setUserdao(UserDAO userdao) {
		this.userdao = userdao;
	}

	@Override
	public void setSession(Map<String, Object> session) 
	
	{
		this.sessionMap=(SessionMap)session;
		
	}
	public String execute()
	{
		System.out.println("in execute pwd is ::::"+user.getPassword());
		System.out.println("in execute user id is ::::"+user.getUserId());
		String userid=user.getUserId();
		String password=user.getPassword();
		
		sessionMap.put("userid", userid);
		sessionMap.put("password", password);
		String check=userdao.loginCheck(userid, password);
		if(check.equals("fail"))
		{
			return "input";
			
		}
		return "success";
	}
	
	public String logout()
	{
		if(sessionMap!=null)
		{
			sessionMap.invalidate();
		}
		return "success";
	}

	

}
