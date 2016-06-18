package com.e_society.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;

import com.e_society.dao.FlatDetailsDAO;
import com.e_society.dao.MemberDAO;
import com.e_society.dao.UserDAO;
import com.e_society.dao.UserTypeDAO;
import com.e_society.model.Flatdetails;
import com.e_society.model.Member;
import com.e_society.model.User;
import com.e_society.model.UserType;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction implements ModelDriven<User> {

	User user=new User();
	UserType userType=new UserType();
	Flatdetails flatdetail=new Flatdetails();
	private UserDAO userdao;
	private UserTypeDAO usertypedao;
	private FlatDetailsDAO flatdetailsdao;
	private MemberDAO memberDao;
	
	public void setMemberDao(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	public void setFlatdetailsdao(FlatDetailsDAO flatdetailsdao) {
		this.flatdetailsdao = flatdetailsdao;
	}
	public void setUsertypedao(UserTypeDAO usertypedao) {
		this.usertypedao = usertypedao;
	}
	public void setUserdao(UserDAO userdao) {
		this.userdao = userdao;
	}
	List<String> usertypelist=new ArrayList<String>();
	List<User> userlist=new ArrayList<User>();
	List<String> flatlist=new ArrayList<String>();
	List<String> winglist=new ArrayList<String>();
	
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
	public List<User> getUserlist() {
		return userlist;
	}
	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}
	public List<String> getUsertypelist() {
		return usertypelist;
	}
	public void setUsertypelist(List<String> usertypelist) {
		this.usertypelist = usertypelist;
	}
	@Override
	public User getModel() {
		return user;
	}
	public String execute()
	{
		usertypelist=usertypedao.getUserType();
		flatlist=flatdetailsdao.getFlatList();
		winglist=flatdetailsdao.getWingList();
		return "success";
	}
	public String adduser()
	{
		
		String userid;
		userid=user.getWing()+user.getFlat();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Member member=new Member();
		member.setMemberId(userid);
		Date date = new Date();
		String logintime=dateFormat.format(date);
		user.setUserId(userid);
		try {
			Date date1=dateFormat.parse(logintime);
			user.setCreatedOn(date1);
		} catch (ParseException e) {
						e.printStackTrace();
		}
		/*MailSession.sendmail(user.getEmail(), user.getFirstname(), user.getLastname(), password);*/
		userdao.adduser(user);
		memberDao.addmember(member);
		return "success";
	}
	public String viewuser()
	{
		userlist=userdao.viewuser();
		return "success";
		
	}
	
}
