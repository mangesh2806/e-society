package com.e_society.action;

import java.util.ArrayList;
import java.util.List;

import com.e_society.dao.FlatDetailsDAO;
import com.e_society.dao.MemberDAO;
import com.e_society.dao.VisitorDAO;
import com.e_society.model.Flatdetails;
import com.e_society.model.Visitor;
import com.opensymphony.xwork2.ModelDriven;



public class VisitorAction implements ModelDriven<Visitor>{

	private VisitorDAO visitordao;
	private FlatDetailsDAO flatdetailsdao;
	Visitor visitor=new Visitor();
	List<String> flat=new ArrayList<String>();
	
	public List<String> getFlat() {
		return flat;
	}

	public void setFlat(List<String> flat) {
		this.flat = flat;
	}

	public void setFlatdetailsdao(FlatDetailsDAO flatdetailsdao) {
		this.flatdetailsdao = flatdetailsdao;
	}

	public void setVisitordao(VisitorDAO visitordao) {
		this.visitordao = visitordao;
	}

	public String addVisitor()
	{
		
		return "success";
	}
	public String execute()
	{
		List<Flatdetails> flatdetailslist=flatdetailsdao.getFlatDetailList();
		for (Flatdetails flatdetails2 : flatdetailslist) 
		{
			String flatno=flatdetails2.getFlatno();
			Character winno=flatdetails2.getWing();
			
			String flatde=flatno+winno;
			
			flat.add(flatde);
		}
		return "success";
	}
	
	@Override
	public Visitor getModel() {
		
		return visitor;
	}

}
