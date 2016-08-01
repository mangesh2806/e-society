package com.e_society.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.e_society.dao.FlatDetailsDAO;
import com.e_society.model.Flatdetails;


public class FlatDetailsDAOImpl extends HibernateDaoSupport implements FlatDetailsDAO
{
	

	@Override
	public List<String> getWingList() {
		Session session=getSession();
		Criteria cr=session.createCriteria(Flatdetails.class);
		ProjectionList prjlist=Projections.projectionList();
		prjlist.add(Projections.distinct(Projections.property("wing")));
		cr.setProjection(prjlist);
		List<String> winglist=cr.list();
		System.out.println(winglist);
		session.close();
		return winglist;
		
	}

	@Override
	public List<String> getFlatList() {
		
		Session session=getSession();
		Criteria cr=session.createCriteria(Flatdetails.class);
		ProjectionList prjlist=Projections.projectionList();
		prjlist.add(Projections.property("flatno"));
		cr.setProjection(prjlist);
		List<String> flatlist=cr.list();
		System.out.println(flatlist);
		session.close();
		return flatlist;

	}

}
