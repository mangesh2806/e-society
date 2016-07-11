package com.e_society.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.e_society.dao.VisitorDAO;
import com.e_society.model.Visitor;

public class VisitorDAOImpl extends HibernateDaoSupport implements VisitorDAO 
{
	public void addVisitor(Visitor visitor) 
	{
		Transaction tx=null;
		Session session=getSessionFactory().openSession();
		tx=session.beginTransaction();
		try {
			
			getHibernateTemplate().saveOrUpdate(visitor);
			tx.commit();
			
		} catch (HibernateException re) {
			session.close();
			tx.rollback();
			re.getMessage();
			//throw re;
		}
		finally{
		session.close();
		}
		
	}

}
