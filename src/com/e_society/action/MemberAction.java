package com.e_society.action;

import java.util.ArrayList;
import java.util.List;

import com.e_society.dao.FlatDetailsDAO;
import com.e_society.dao.MemberDAO;
import com.e_society.dao.UserDAO;
import com.e_society.model.Member;
import com.e_society.model.User;
import com.opensymphony.xwork2.ModelDriven;

public class MemberAction implements ModelDriven<Member> {

	private MemberDAO memberdao;
	private UserDAO userdao;
	
	public void setUserdao(UserDAO userdao) {
		this.userdao = userdao;
	}
	public void setMemberdao(MemberDAO memberdao) {
		this.memberdao = memberdao;
	}
	private FlatDetailsDAO flatdetailsdao;
	public void setFlatdetailsdao(FlatDetailsDAO flatdetailsdao) {
		this.flatdetailsdao = flatdetailsdao;
	}
	List<String> flatlist=new ArrayList<String>();
	List<String> winglist=new ArrayList<String>();
	List<Member> memberlist=new ArrayList<Member>();
	List<String> memberListdropdown=new ArrayList<String>();
	public List<Member> getMemberlist() {
		return memberlist;
	}
	public void setMemberlist(List<Member> memberlist) {
		this.memberlist = memberlist;
	}
	public List<String> getWinglist() {
		return winglist;
	}
	public void setWinglist(List<String> winglist) {
		this.winglist = winglist;
	}
	public List<String> getFlatlist() {
		return flatlist;
	}
	public void setFlatlist(List<String> flatlist) {
		this.flatlist = flatlist;
	}
	Member member=new Member();
	User user=new User();
	@Override
	public Member getModel() {
		// TODO Auto-generated method stub
		return member;
	}
	public String execute()
	{
		flatlist=flatdetailsdao.getFlatList();
		winglist=flatdetailsdao.getWingList();
		memberListdropdown=memberdao.getMemberList();
		return "success";
	}
	public List<String> getMemberListdropdown() {
		return memberListdropdown;
	}
	public void setMemberListdropdown(List<String> memberListdropdown) {
		this.memberListdropdown = memberListdropdown;
	}
	public String addMember()
	{
		//user.setUserId("C101");
		String userid=member.getWing()+member.getFlatNo();
		user.setUserId(userid);
		String memberId=member.getFirstname()+"."+member.getLastname();
		//user.setMemberId(memberId);
		member.setMemberId(memberId);
		//member.setUser(user);
		memberdao.addmember(member);
		//userdao.adduser(user);
		return "success";
	}
	public String viewMember()
	{
		memberlist=memberdao.viewmember();
		return "success";
		
	}
	public String editmember()
	{
		return "success";
	}

}
