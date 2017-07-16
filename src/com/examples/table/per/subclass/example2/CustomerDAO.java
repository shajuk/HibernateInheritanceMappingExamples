package com.examples.table.per.subclass.example2;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.util.HibernateUtil;

public class CustomerDAO {

	public void storeCustomerDetails(Customer customer,Address address){
		Session session=null;
		try{
			session=HibernateUtil.getSessionFactory().openSession();
			Transaction t=session.beginTransaction();
			customer.setAddress(address);
			session.save(customer);
			session.flush();
			t.commit();
		}catch(HibernateException e){
			e.printStackTrace();
		}/*finally{
			session.close();
		}*/
	}
}
