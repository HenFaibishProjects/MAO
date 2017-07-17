package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Customers;

@Entity
@Table(name = "Payment")
public class PaymentMembership {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="paymnetID")
	public int paymnetID;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerID")
    public Customers customers;
    public float mount;
	public Date DatePaid;
	PaymentSystem paymentSystem;



public PaymentMembership(int paymnetID, Customers customers, float mount, Date datePaid, PaymentSystem paymentSystem) {
	super();
	this.paymnetID = paymnetID;
	this.customers = customers;
	this.mount = mount;
	DatePaid = datePaid;
	this.paymentSystem = paymentSystem;
}



public PaymentMembership() {
	
}

public int getPaymnetID() {
	return paymnetID;
}



public void setPaymnetID(int paymnetID) {
	this.paymnetID = paymnetID;
}



public Customers getCustomers() {
	return customers;
}



public void setCustomers(Customers customers) {
	this.customers = customers;
}



public float getMount() {
	return mount;
}



public void setMount(float mount) {
	this.mount = mount;
}



public Date getDatePaid() {
	return DatePaid;
}



public void setDatePaid(Date datePaid) {
	DatePaid = datePaid;
}



public PaymentSystem getPaymentSystem() {
	return paymentSystem;
}



public void setPaymentSystem(PaymentSystem paymentSystem) {
	this.paymentSystem = paymentSystem;
}




}
