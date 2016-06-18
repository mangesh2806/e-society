package com.e_society.dao;

import java.util.List;

import com.e_society.model.Member;
import com.e_society.model.User;

public interface MemberDAO 
{
	public void addmember(Member member);
	List<Member> viewmember();
	List<String> getMemberList();
}
