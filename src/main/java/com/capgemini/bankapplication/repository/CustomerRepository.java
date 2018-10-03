package com.capgemini.bankapplication.repository;

import com.capgemini.bankapplication.entity.Customer;

public interface CustomerRepository {

	public Customer authenticate(Customer customer);
	public Customer updateProfile(Customer customer);
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword);
}
