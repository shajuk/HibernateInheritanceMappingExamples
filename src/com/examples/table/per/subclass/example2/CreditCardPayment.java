package com.examples.table.per.subclass.example2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="CREDITCARDPAYMENT")
@PrimaryKeyJoinColumn(name="CREDITCARDPAYMENTID")
public class CreditCardPayment extends Payment{
	
	
	
	@Column(name="CREDITCARDNO")
	private String creditcardno;
	
	@Column(name="EXPIRYMONTH")
	private String expirymonth;
	
	@Column(name="EXPIRYYEAR")
	private int expiryyear;

	

	public String getCreditcardno() {
		return creditcardno;
	}

	public void setCreditcardno(String creditcardno) {
		this.creditcardno = creditcardno;
	}

	public String getExpirymonth() {
		return expirymonth;
	}

	public void setExpirymonth(String expirymonth) {
		this.expirymonth = expirymonth;
	}

	public int getExpiryyear() {
		return expiryyear;
	}

	public void setExpiryyear(int expiryyear) {
		this.expiryyear = expiryyear;
	}
	
	
}
