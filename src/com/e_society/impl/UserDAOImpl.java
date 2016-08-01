package com.e_society.impl;



import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.e_society.dao.UserDAO;
import com.e_society.model.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO 
{
	private EntityManager entityManager;
	@Override
	public String loginCheck(String userid, String passwotrds) {
		
		User instance=null;
		System.out.println("1");
		System.out.println("user id:"+userid);
		User user=null;
		Session session=getSession();
		List results = session.createCriteria(User.class).add(Restrictions.eq("userId", userid)).add(Restrictions.eq("password", passwotrds)).list();
		if (results != null && results.size() > 0) {
			instance = (User) results.get(0);
			session.close();
		}
		
		
		else
		{
			System.out.println("error");
			session.close();
			return "fail";
			
		}
		
		return "success";
	}

	@Override
	public void adduser(User user) {
		
		Transaction tx=null;
		Session session=getSessionFactory().openSession();
		tx=session.beginTransaction();
		try {
			getHibernateTemplate().save(user);
			tx.commit();
			    
		} catch (HibernateException re) {
			re.printStackTrace();
			re.getMessage();
			tx.rollback();
			//throw re;
		}
	}
	public List<User> viewuser()
	{
		List<User> userlist=(List<User>) getSession().createQuery("from User").list();
		System.out.println("in user list imple method:"+userlist.get(0));
		return userlist;
	}
	

	
}
