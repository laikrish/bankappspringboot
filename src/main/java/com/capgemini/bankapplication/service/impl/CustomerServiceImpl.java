package com.capgemini.bankapplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.capgemini.bankapplication.entity.Customer;
import com.capgemini.bankapplication.exception.PasswordChangeFailedException;
import com.capgemini.bankapplication.exception.UpdationFailedException;
import com.capgemini.bankapplication.exception.UserNotFoundException;
import com.capgemini.bankapplication.repository.CustomerRepository;
import com.capgemini.bankapplication.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer authenticate(Customer customer) throws UserNotFoundException {
		try {
			return customerRepository.authenticate(customer);
		} catch (DataAccessException e) {
			UserNotFoundException u = new UserNotFoundException("Customer Not Found");
			u.initCause(e);
			throw u;
		}
	}

	@Override
	public Customer updateProfile(Customer customer) throws UpdationFailedException {
		try {
			return customerRepository.updateProfile(customer);
		} 
		catch (DataAccessException e) {
			UpdationFailedException updationFailedException = new UpdationFailedException(
					"failed to update the customer details");
			updationFailedException.initCause(e);
			throw updationFailedException;
		}

		
	//return customerRepository.updateProfile(customer);
	}

	@Override
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword){
	try {
		return customerRepository.updatePassword(customer, oldPassword, newPassword);
	}
	catch (DataAccessException e) {
		PasswordChangeFailedException passwordChangeFailedException = new PasswordChangeFailedException(
				"Failed to change the password");
		passwordChangeFailedException.initCause(e);
		throw e;
	}

}
}