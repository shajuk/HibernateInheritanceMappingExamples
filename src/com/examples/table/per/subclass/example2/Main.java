package com.examples.table.per.subclass.example2;

import java.util.Date;

import com.examples.table.per.subclass.example1.EmployeeDAO;

public class Main {
	public static void main(String[] args) {
		CustomerDAO customerDAO=new CustomerDAO();
		Customer customer=new Customer();
		Address address=new Address();
		customer.setCustomerName("Benny");
		address.setCity("Kochi");
		address.setContactNo(62625);
		address.setDoorNo("503");
		address.setEmailId("benny@gmail.com");
		address.setPincode(87458);
		address.setState("Kerala");
		address.setStreet("sagarika street");
		customer.setAddress(address);
		customerDAO.storeCustomerDetails(customer, address);
		PaymentDAO pdao=new PaymentDAO();
		CreditCardPayment p=new CreditCardPayment();
		p.setAmountpaid(1000.00);
		p.setPaiddate(new Date());
		p.setCustomer(customer);
		p.setCreditcardno("C10001");
		p.setExpirymonth("May");
		p.setExpiryyear(2018);
		pdao.payBill(p);
		
	
		
	}
}
