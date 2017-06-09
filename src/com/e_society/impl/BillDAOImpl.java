package com.e_society.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.e_society.dao.BillDAO;
import com.e_society.model.Bill;
import com.e_society.model.Member;

public class BillDAOImpl extends HibernateDaoSupport implements BillDAO
{
		
	public void createBill(Bill bill) 
	{
		Transaction tx=null;
		Session session=getSessionFactory().openSession();
		tx=session.beginTransaction();
		try {
			getHibernateTemplate().save(bill);
			tx.commit();
			session.close();
			
		} catch (HibernateException re) {
			tx.rollback();
			re.getMessage();
			session.close();
			//throw re;
		}
		
	}

}
