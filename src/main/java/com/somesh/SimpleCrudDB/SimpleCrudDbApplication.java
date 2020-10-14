package com.somesh.SimpleCrudDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.somesh.SimpleCrudDB.Entitys.Customer;
import com.somesh.SimpleCrudDB.Respositorys.CustomerDao;

@SpringBootApplication
public class SimpleCrudDbApplication implements CommandLineRunner {

	@Autowired
	CustomerDao customerDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleCrudDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer c1 = new Customer(1,"Somesh","Rahatani");
		Customer c2 = new Customer(2,"Nitish","Katarj");
		Customer c3 = new Customer(3,"Santosh","Warje");
		
		customerDao.customers.add(c1);
		customerDao.customers.add(c2);
		customerDao.customers.add(c3);
	}

}
