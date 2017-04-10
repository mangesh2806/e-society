package com.e_society.action;

import java.util.List;

import com.e_society.dao.BillDAO;
import com.e_society.dao.MemberDAO;
import com.e_society.model.Bill;
import com.opensymphony.xwork2.ModelDriven;

public class BillAction implements ModelDriven<Bill> {
	
	
	
	private BillDAO billDAO;
	private MemberDAO memberDAO;
	private Bill bill=new Bill();
	private List<String> memberlist;
	public List<String> getMemberlist() {
		return memberlist;
	}
	public void setMemberlist(List<String> memberlist) {
		this.memberlist = memberlist;
	}
	public void setBillDAO(BillDAO billDAO) {
		this.billDAO = billDAO;
	}
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}


	@Override
	public Bill getModel() {
		// TODO Auto-generated method stub
		return bill;
	}
	
	public String execute()
	{
		memberlist=memberDAO.getMemberList();
		return "success";
	}

}
