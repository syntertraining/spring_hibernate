package com.mypkg.spring.jdbc.main;

import com.mypkg.spring.jdbc.model.Address;
import com.mypkg.spring.jdbc.model.Customer;
import com.mypkg.spring.jdbc.service.CustomerManager;
import com.mypkg.spring.jdbc.service.CustomerManagerImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TransactionManagerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");
		CustomerManager customerManager=ctx.getBean("customerManager",CustomerManagerImpl.class);
		Customer cust=createDummyCustomer();
		customerManager.createCustomer(cust);
		ctx.close();
	}
	private static Customer createDummyCustomer(){
		Customer customer=new Customer();
		customer.setId(1);
		customer.setName("cust001");
		Address address=new Address();
		address.setCountry("india");
		address.setAddress("madhapur hyderabad");
		customer.setAddress(address);
		return customer;
	}
}
