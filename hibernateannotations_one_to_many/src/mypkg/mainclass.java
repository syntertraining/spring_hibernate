package mypkg;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Vendor v=new Vendor();
		v.setVendorId(100);
		v.setVendorName("vendor001");
		Customers c1=new Customers();
		c1.setCustomerId(101);
		c1.setCustomerName("cust001");
		c1.setParent(v);
		Customers c2=new Customers();
		c2.setCustomerId(102);
		c2.setCustomerName("cust002");
		c2.setParent(v);
		Customers c3=new Customers();
		c3.setCustomerId(103);
		c3.setCustomerName("cust003");
		c3.setParent(v);
		
		Transaction tx=session.beginTransaction();
		session.save(c1);
		session.save(c2);
		session.save(c3);
		tx.commit();
		System.out.println("Many to one with annotations is done");
		session.close();
		factory.close();
	}

}
