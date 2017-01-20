package com.e_society.action;

import java.util.List;

import com.e_society.dao.FlatDetailsDAO;
import com.e_society.dao.MemberDAO;
import com.e_society.model.Member;
import com.opensymphony.xwork2.ModelDriven;

public class MemberAction implements ModelDriven<Member> {

	private MemberDAO memberdao;
	private Member membertemp=new Member();
	private FlatDetailsDAO flatdetailsdao;
	private Member member=new Member();;
	private List<String> flatlist;
	private List<String> winglist;
	private List<Member> memberlist;
	private List<String> memberListdropdown;
	
	
	public Member getMembertemp() {
		return membertemp;
	}
	public void setMembertemp(Member membertemp) {
		this.membertemp = membertemp;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public List<String> getFlatlist() {
		return flatlist;
	}
	public void setFlatlist(List<String> flatlist) {
		this.flatlist = flatlist;
	}
	public List<String> getWinglist() {
		return winglist;
	}
	public void setWinglist(List<String> winglist) {
		this.winglist = winglist;
	}
	public List<Member> getMemberlist() {
		return memberlist;
	}
	public void setMemberlist(List<Member> memberlist) {
		this.memberlist = memberlist;
	}
	public void setMemberdao(MemberDAO memberdao) {
		this.memberdao = memberdao;
	}

	public void setFlatdetailsdao(FlatDetailsDAO flatdetailsdao) {
		this.flatdetailsdao = flatdetailsdao;
	}
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
		
		member.setFirstname(membertemp.getFirstname());
		member.setLastname(membertemp.getLastname());
		member.setWing(membertemp.getWing());
		member.setFlatNo(membertemp.getFlatNo());
		memberdao.addmember(member);
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
	
	public String populateMemberInformation()
	{
		
		List<Member> populatememberList=memberdao.populateMemberInformation(member.getMemberId());
		
		for(Member membertemp1:populatememberList)
		{
			membertemp.setFirstname(membertemp1.getFirstname());
			membertemp.setLastname(membertemp1.getLastname());
			membertemp.setWing(membertemp1.getWing());
			membertemp.setFlatNo(membertemp1.getFlatNo());
			
		}
		
		return "success";
	}

}
