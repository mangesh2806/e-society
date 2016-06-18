package com.e_society.impl;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.e_society.dao.UserDAO;
import com.e_society.dao.UserTypeDAO;
import com.e_society.model.UserType;

/**
 * Home object for domain model class UserType.
 * @see .UserType
 * @author Hibernate Tools
 */

public class UserTypeDAOImpl extends HibernateDaoSupport implements UserTypeDAO {

	private static final Log log = LogFactory.getLog(UserTypeDAOImpl.class);

	
	public List<String> getUserType() 
	{
		System.out.println("qddsfgdvdfbdfbgbcgbgfbfgnfgn");
		Session session=getSession();
		Criteria cr=session.createCriteria(UserType.class);
		ProjectionList prjlist=Projections.projectionList();
		prjlist.add(Projections.property("userType"));
		cr.setProjection(prjlist);
		System.out.println("1111");
		
		List<String> usertypelist=cr.list();
		System.out.println(usertypelist);
	
		return usertypelist;
	}
}

