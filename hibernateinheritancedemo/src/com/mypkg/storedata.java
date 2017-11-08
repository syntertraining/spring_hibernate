package com.mypkg;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class storedata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();

		Transaction t = session.beginTransaction();
		Employee e1 = new Employee();
		e1.setName("emp001");
		Regular_Employee e2 = new Regular_Employee();
		e2.setName("emp002");
		e2.setSalary(4000);
		e2.setBonus(5);
		Contract_Employee e3=new Contract_Employee();
		e3.setName("emp003");
		e3.setPay_per_hour(1000);
		e3.setContract_duration("5 hrs");
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		t.commit();
		session.close();
		System.out.println("success");
	}

}
