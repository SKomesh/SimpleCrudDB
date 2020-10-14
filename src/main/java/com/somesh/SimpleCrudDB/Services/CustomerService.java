package com.somesh.SimpleCrudDB.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.somesh.SimpleCrudDB.Entitys.Customer;
import com.somesh.SimpleCrudDB.Respositorys.CustomerDao;

@Service
public class CustomerService {

	@Autowired
	CustomerDao customerDao;

	public List<Customer> getAll() {
		return customerDao.getAll();
	}

	public String add(Customer customer) {
		return customerDao.add(customer);
	}

	public String update(Customer customer) {
		return customerDao.update(customer);
	}

	public String delete(int customerid) {
		return customerDao.delete(customerid);
	}
	
	
}
