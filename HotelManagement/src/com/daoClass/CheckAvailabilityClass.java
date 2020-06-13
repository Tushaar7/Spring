package com.daoClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.daoInterface.CheckAvailabilityInterface;
import com.model.CheckAvailabilityModel;

@Repository
public class CheckAvailabilityClass implements CheckAvailabilityInterface{

	@Autowired
	private SessionFactory hibernateSessionFactory;

	public SessionFactory getHibernateSessionFactory() {
		return hibernateSessionFactory;
	}

	public void setHibernateSessionFactory(SessionFactory hibernateSessionFactory) {
		this.hibernateSessionFactory = hibernateSessionFactory;
	}

	@Override
	public void saveDate(String date1, String date2) {
		hibernateSessionFactory.openSession().save(date1, date2);
		
	}

	@Override
	public List<String> CheckBookedRoom() {
		// TODO Auto-generated method stub
		List<String> List1=new ArrayList<String>();
		SQLQuery query=hibernateSessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM room r");
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List1=query.list();
		return List1;
	}
	
public HashMap getBookedRoomList(){
	
	List<HashMap> getRoom = new ArrayList<>();
	HashMap getRoomBookList1 = new HashMap();
	SQLQuery query = hibernateSessionFactory.getCurrentSession().createSQLQuery("select r.Id, r.roomNo from room r");
	
	query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
	getRoom = query.list();
	
	System.out.println("getRoom from Query: " + getRoom);
	
	for(HashMap h : getRoom){
		getRoomBookList1.put(h.get("Id"), h.get("roomNo"));
	}
	
	System.out.println("getRoomBookList1 from Query: " + getRoomBookList1);
	return getRoomBookList1;
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
