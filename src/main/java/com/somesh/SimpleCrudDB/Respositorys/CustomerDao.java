package com.somesh.SimpleCrudDB.Respositorys;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.somesh.SimpleCrudDB.Entitys.Customer;

@Repository
public class CustomerDao {

	public List<Customer> customers = new ArrayList<>();

	public List<Customer> getAll() {
		return customers;
	}

	public String add(Customer customer) {
		if(customers.add(customer)) {
			return "Successfully Customer Added.";  
		}else {
			return "Adding Failed.";  
		}
	}

	public String update(Customer customer) {
		for(Customer c:customers) {
			if(c.getId()==customer.getId()) {
				c.setName(customer.getName());
				c.setAddress(customer.getAddress());
				return "Successfully Customer Updated."; 
			}
		}
		return "Updating Failed.";
	}

	public String delete(int customerid) {
		for(Customer c:customers) {
			if(c.getId()==customerid) {
				customers.remove(c);
				return "Successfully Customer Deleted."; 
			}
		}
		return "Deleting Failed.";
	}


}
