package com.mypkg.spring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mypkg.spring.dao.*;
import com.mypkg.spring.model.*;

@RestController
public class CustomerRestController {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@GetMapping("/customers")
	public List getCustomers() {
		return customerDAO.list();
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity getCustomer(@PathVariable("id") int id) {

		Customer customer = customerDAO.get(id);
		if (customer == null) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(customer, HttpStatus.OK);
	}
	
	@PostMapping(value = "/customers")
	public ResponseEntity createCustomer(@RequestBody Customer customer) {

		customerDAO.create(customer);

		return new ResponseEntity(customer, HttpStatus.OK);
	}
	
	@DeleteMapping("/customers/{id}")
	public ResponseEntity deleteCustomer(@PathVariable int id) {

		if (0 == customerDAO.delete(id)) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);

	}
	
	@PutMapping("/customers/{id}")
	public ResponseEntity updateCustomer(@PathVariable int id, @RequestBody Customer customer) {

		customer = customerDAO.update(id, customer);

		if (null == customer) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(customer, HttpStatus.OK);
	}
}
