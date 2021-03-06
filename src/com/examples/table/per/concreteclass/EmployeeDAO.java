package com.examples.table.per.concreteclass;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.util.HibernateUtil;

public class EmployeeDAO {
	public void storeEmployees(){
		Session session=null;
		try{
			session=HibernateUtil.getSessionFactory().openSession();
			Transaction t=session.beginTransaction();
			
			Employee e1=new Employee();
			 e1.setName("Vimal Kumar");  
			 session.persist(e1); 
			 
		    Regular_Employee e2=new Regular_Employee();  
		    e2.setName("Vivek Kumar");  
		    e2.setSalary(50000);  
		    e2.setBonus(5);   
		    session.persist(e2);
		    
		    Contract_Employee e3=new Contract_Employee();  
		    e3.setName("Arjun Kumar");  
		    e3.setPay_per_hour(1000);  
		    e3.setContract_duration("15 hours");  
		   
		     
		    session.persist(e3); 
			t.commit();
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			//session.close();
		}
	}
	
	public static void main(String[] args) {
		EmployeeDAO dao=new EmployeeDAO();
		dao.storeEmployees();
	}
}
