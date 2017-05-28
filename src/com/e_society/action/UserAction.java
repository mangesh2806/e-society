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
import com.e_society.util.Constants;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction implements ModelDriven<User> {

	User user=new User();
	UserType userType=new UserType();
	Flatdetails flatdetail=new Flatdetails();
	private UserDAO userdao;
	private UserTypeDAO usertypedao;
	private FlatDetailsDAO flatdetailsdao;
	private MemberDAO memberDao;
	public String id;
	
	
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
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		Date date = new Date();
		String logintime=dateFormat.format(date);
		
		try {
			Date date1=dateFormat.parse(logintime);
			user.setCreatedOn(date1);
		} catch (ParseException e) {
						e.printStackTrace();
		}
		/*MailSession.sendmail(user.getEmail(), user.getFirstname(), user.getLastname(), password);*/
		
		if(user.getUserType().equals(Constants.MEMBERUSERTYPE))
		{
		
			String memebrId=null;
			memebrId = user.getWing() + user.getFlat();
			
			user.setUserId(memebrId);
			userdao.adduser(user);
			
			Member member = new Member();
			member.setMemberId(memebrId);
			member.setFlatNo(user.getFlat());
			member.setWing(user.getWing().charAt(0));
			member.setFirstname(user.getFirstname());
			member.setLastname(user.getLastname());
			memberDao.addmember(member);
		}
		else if(user.getUserType().equals(Constants.ADMINUSERTYPE))
		{
			String userId=null;
			userId=user.getFirstname()+"."+user.getLastname();
			user.setUserId(userId);
			userdao.adduser(user);
		}
		
		return "success";
	}
	public String viewuser()
	{
		userlist=userdao.viewuser();
		return "success";
		
	}
	
	public String editUser()
	{
		
		System.out.println(id);
		String wing=String.valueOf(id.charAt(0));
		winglist.add(wing);
		String[] flatNoArray=id.split(wing);
		String flatNo=null;
		for(int i=0;i<flatNoArray.length;i++)
		{
			flatNo=flatNoArray[i];
			flatlist.add(flatNo);
		}
		List<User> userList=userdao.getUserUserByUserId(id);
		for(User usertemp: userList)
		{
			/*user.setWing(wing);
			user.setFlat(flatNo);*/
			user.setFirstname(usertemp.getFirstname());
			user.setLastname(usertemp.getLastname());
			usertypelist.add(usertemp.getUserType());
			user.setPassword(usertemp.getPassword());
			
		}
		return "success";
	}
	
	
}
