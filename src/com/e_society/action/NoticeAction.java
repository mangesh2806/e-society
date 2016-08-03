package com.e_society.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.e_society.dao.NoticeDAO;
import com.e_society.model.Notice;
import com.e_society.model.User;
import com.opensymphony.xwork2.ModelDriven;

public class NoticeAction implements ModelDriven<Notice> 
{
	private NoticeDAO noticeDAO;
	List<Notice> noticelist=new ArrayList<Notice>();
	public List<Notice> getNoticelist() {
		return noticelist;
	}

	public void setNoticelist(List<Notice> noticelist) {
		this.noticelist = noticelist;
	}

	public void setNoticeDAO(NoticeDAO noticeDAO) {
		this.noticeDAO = noticeDAO;
	}

	Notice notice=new Notice();
	@Override
	public Notice getModel() {
		
		return notice;
	}
	
	public String addNotice()
	{
		notice.setCreatedBy("mangesh");
		notice.setCreatedon(new Date());
		
		noticeDAO.addNotice(notice);
		return "success";
	}
	public String execute()
	{
		return "success";
	}
	
	public String viewNotice()
	{
		noticelist=noticeDAO.viewNotice();
		return "success";
	}
	

}
