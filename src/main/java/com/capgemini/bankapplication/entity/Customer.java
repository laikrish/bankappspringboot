package com.capgemini.bankapplication.entity;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.internal.NotNull;

public class Customer {

	@NotNull
	private long customerId;
	@NotNull
	@Size(min=3,max=50)
	private String customerName;
	@NotNull
	@Size(min=8)
	@Pattern(regexp="")
	private String customerPassword;
	@NotNull
	@Email
	private String customerEmail;
	@NotNull
	@Size(min=10, max=100)
	private String customerAddress;
	@NotNull
	@Past
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate customerDateOfBirth;
	@NotNull
	private BankAccount customerAccount;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(long customerId, String customerName, String customerPassword, String customerEmail,
			String customerAddress, LocalDate customerDateOfBirth, BankAccount customerAccount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.customerDateOfBirth = customerDateOfBirth;
		this.customerAccount = customerAccount;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public LocalDate getCustomerDateOfBirth() {
		return customerDateOfBirth;
	}

	public void setCustomerDateOfBirth(LocalDate customerDateOfBirth) {
		this.customerDateOfBirth = customerDateOfBirth;
	}

	public BankAccount getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(BankAccount customerAccount) {
		this.customerAccount = customerAccount;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPassword="
				+ customerPassword + ", customerEmail=" + customerEmail + ", customerAddress=" + customerAddress
				+ ", customerDateOfBirth=" + customerDateOfBirth + ", customerAccount=" + customerAccount + "]";
	}

}