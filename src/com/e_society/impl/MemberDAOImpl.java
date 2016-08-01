package com.e_society.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.e_society.dao.MemberDAO;
import com.e_society.model.Flatdetails;
import com.e_society.model.Member;
import com.e_society.model.User;

public class MemberDAOImpl extends HibernateDaoSupport implements MemberDAO {

	@Override
	public void addmember(Member member) 
	{
		Transaction tx=null;
		Session session=getSessionFactory().openSession();
		tx=session.beginTransaction();
		try {
			getHibernateTemplate().saveOrUpdate(member);
			tx.commit();
			session.close();
			
		} catch (HibernateException re) {
			tx.rollback();
			re.getMessage();
			session.close();
			//throw re;
		}
		
	}

	@Override
	public List<Member> viewmember() {
		List<Member> memberlist=(List<Member>) getSession().createQuery("from Member").list();
		System.out.println("in user list imple method:"+memberlist.get(0));
		return memberlist;
	}
	
public List<String> getMemberList() {
		
		Session session=getSession();
		Criteria cr=session.createCriteria(Member.class);
		ProjectionList prjlist=Projections.projectionList();
		prjlist.add(Projections.property("memberId"));
		cr.setProjection(prjlist);
		List<String> memberList=cr.list();
		System.out.println(memberList);
		session.close();
		return memberList;

	}

}
