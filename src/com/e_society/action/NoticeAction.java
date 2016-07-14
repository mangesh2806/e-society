package com.e_society.action;

import com.e_society.model.Notice;
import com.opensymphony.xwork2.ModelDriven;

public class NoticeAction implements ModelDriven<Notice> 
{
	Notice notice=new Notice();
	@Override
	public Notice getModel() {
		
		return notice;
	}
	

}
