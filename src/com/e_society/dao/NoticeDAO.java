package com.e_society.dao;

import java.util.List;

import com.e_society.model.Notice;
import com.e_society.model.User;

public interface NoticeDAO {

	public void addNotice(Notice notice);
	public List<Notice> viewNotice();
}
