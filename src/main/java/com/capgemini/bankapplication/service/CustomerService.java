package com.capgemini.bankapplication.service;

import com.capgemini.bankapplication.entity.Customer;

public interface CustomerService {

	public Customer authenticate(Customer customer);
	public Customer updateProfile(Customer customer);
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) ;

}