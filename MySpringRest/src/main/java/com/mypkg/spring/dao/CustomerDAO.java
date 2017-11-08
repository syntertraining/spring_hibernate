package com.mypkg.spring.dao;

import java.util.*;
import org.springframework.stereotype.Component;
import com.mypkg.spring.model.*;

@Component
public class CustomerDAO {
	private static List<Customer> customers;
	{
		customers=new ArrayList();
		customers.add(new Customer(101,"test01","test01","test01@gmail.com","123444"));
		customers.add(new Customer(102,"test02","test02","test02@gmail.com","223444"));
		customers.add(new Customer(103,"test03","test03","test01@gmail.com","323444"));
		customers.add(new Customer(103,"test04","test04","test01@gmail.com","423444"));
	}
	public List list(){
		return customers;
	}
	public Customer get(int id){
		for(Customer c:customers){
			if(c.getId()==id){
				return c;
			}
		}
		return null;
	}
	public Customer create(Customer customer){
		int size=customers.size();
		customer.setId(size+1);
		customers.add(customer);
		return customer;
	}
	public int delete(int id){
		for(Customer c:customers){
			if(c.getId()==id){
				customers.remove(c);
				return id;
			}
		}
		return 0;
	}
	public Customer update(int id,Customer customer){
		for(Customer c:customers){
			if(c.getId()==id){
			customer.setId(c.getId());
			customers.remove(c);
			customers.add(customer);
			return customer;
			}
		}
		return null;
	}
}
