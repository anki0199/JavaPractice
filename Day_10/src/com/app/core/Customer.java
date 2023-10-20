package com.app.core;

import java.time.LocalDate;

//state  : customer id(int) ,first name, last name (string),email(string),
//password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
//idGenerator : static 
public class Customer implements Comparable<Customer> {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private LocalDate lastSubscriptionPaidDate;
	private static int idGenerator = 0;

	public Customer(String firstName, String lastName, String email, String password, double registrationAmount,
			LocalDate dob, LocalDate lastSubscriptionPaidDate, ServicePlan plan) {
		super();
		this.id = ++idGenerator;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
		
		//just to test it should be
		//lastSubscriptionPaidDate=LocalDate.now();
		this.lastSubscriptionPaidDate=lastSubscriptionPaidDate;
	}
	
	public Customer(String email) {
		super();
		this.email = email;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Customer) {
			Customer anotherCustomer = (Customer) o;
			return email.equals(anotherCustomer.email); /* && password.equals(anotherCustomer.password); */
		}
		return false;
	}
	
	@Override
	public int compareTo(Customer anotherCustomer) {
		
		return this.email.compareTo(anotherCustomer.email);
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", plan="
				+ plan + ", lastSubscriptionPaidDate=" + lastSubscriptionPaidDate + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}

	public LocalDate getLastSubscriptionPaidDate() {
		return lastSubscriptionPaidDate;
	}

	public void setLastSubscriptionPaidDate(LocalDate lastSubscriptionPaidDate) {
		this.lastSubscriptionPaidDate = lastSubscriptionPaidDate;
	}



}
