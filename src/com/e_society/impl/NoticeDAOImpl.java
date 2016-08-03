package com.e_society.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.e_society.dao.NoticeDAO;
import com.e_society.model.Notice;
import com.e_society.model.Notice;

public class NoticeDAOImpl extends HibernateDaoSupport implements NoticeDAO{

	@Override
	public void addNotice(Notice notice) {
		Transaction tx=null;
		Session session=getSessionFactory().openSession();
		tx=session.beginTransaction();
		try {
			getHibernateTemplate().save(notice);
			tx.commit();
			session.close();
			    
		} catch (HibernateException re) {
			re.printStackTrace();
			re.getMessage();
			tx.rollback();
			session.close();
			//throw re;
		}
	}
		
	

	@Override
	public List<Notice> viewNotice() {
		List<Notice> noticeList=(List<Notice>) getSession().createQuery("from Notice").list();
		System.out.println("in user list imple method:"+noticeList.get(0));
		return noticeList;
	}

}
