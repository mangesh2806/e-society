package com.e_society.action;

import java.util.List;

import com.e_society.dao.BillDAO;
import com.e_society.dao.MemberDAO;
import com.e_society.model.Bill;
import com.e_society.model.Member;
import com.e_society.util.PropConfig;
import com.opensymphony.xwork2.ModelDriven;

public class BillAction implements ModelDriven<Bill> {
	
	
	
	private BillDAO billDAO;
	private MemberDAO memberDAO;
	private Bill bill=new Bill();
	private Bill billtemp=new Bill();
	private List<String> memberlist;
	private List<Member> memberinfolist;
	private String memberId;
	private PropConfig propConfig;
	
	public void setPropConfig(PropConfig propConfig) {
		this.propConfig = propConfig;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public List<Member> getMemberinfolist() {
		return memberinfolist;
	}
	public void setMemberinfolist(List<Member> memberinfolist) {
		this.memberinfolist = memberinfolist;
	}
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


	public Bill getBilltemp() {
		return billtemp;
	}
	public void setBilltemp(Bill billtemp) {
		this.billtemp = billtemp;
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
	
	public String populateMemberInformationForBill()
	{
		
		memberinfolist=memberDAO.populateMemberInformation(bill.getMemberId());
		for(Member member: memberinfolist)
		{
			billtemp.setMemberId(member.getMemberId());
			billtemp.setFirstName(member.getFirstname());
			billtemp.setLastName(member.getLastname());
			billtemp.setArea(member.getArea());
			billtemp.setMaintenanceRate(Integer.parseInt(propConfig.getMaintenanceRate()));
			
			
			double maintainceCharge=member.getArea() * Integer.parseInt(propConfig.getMaintenanceRate());
			billtemp.setMaintainceCharger(maintainceCharge);
			
			
			billtemp.setTwowheelerparking(member.getTwowheelerparking());
			billtemp.setFourwheelerparking(member.getFourwheelerparking());
			billtemp.setFourwheelerparkingCharge(Integer.parseInt(propConfig.getFourwheelerparkingCharge()));
			billtemp.setTwowheelerparkingCharge(Integer.parseInt(propConfig.getTwowheelerparkingCharge()));
			
			double parkingCharge= (member.getTwowheelerparking() * Integer.parseInt(propConfig.getTwowheelerparkingCharge()) ) +
					(member.getFourwheelerparking() * Integer.parseInt(propConfig.getFourwheelerparkingCharge()) );
			
			billtemp.setParkingCharge(parkingCharge);
			
			
		}
		return "success";
	}
	
	public String createBill()
	{
		billDAO.createBill(billtemp);
		return "success";
	}

}
