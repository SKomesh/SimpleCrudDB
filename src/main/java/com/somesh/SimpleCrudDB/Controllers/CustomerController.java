package com.somesh.SimpleCrudDB.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.somesh.SimpleCrudDB.Entitys.Customer;
import com.somesh.SimpleCrudDB.Services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/getAll")
	public List<Customer> getAll(){
		return customerService.getAll();
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Customer customer) {
		return customerService.add(customer);
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Customer customer) {
		return customerService.update(customer);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam int customerid) {
		return customerService.delete(customerid);
	}
}
