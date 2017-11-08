package hibernatedemo01;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		/*Insert query */
		Product p=new Product();
//		p.setProductId(107);
		p.setProName("Pro003");
		p.setPrice(1700);
		Transaction tx=session.beginTransaction();
		session.save(p);
		System.out.println("product has been saved");
		
		tx.commit();
		session.close();
		factory.close();
		/*
		//select query
		Query qry=session.createQuery("from Product p where p.productId=?");
		qry.setParameter(0, 106);
		List l=qry.list(); 
		System.out.println("total number of elements are :"+l.size());
		Iterator  it=l.iterator();
		while (it.hasNext()){
			Object o=(Object)it.next();
			Product p=(Product)o;
			System.out.println("Product name :"+p.getProName());
			System.out.println("Product Price :"+p.getPrice());
			System.out.println("--------------------------------");
		}
		*/
		/* update 
		Query qry=session.createQuery("update Product p set p.proName=? where p.productId=?");
		qry.setParameter(0, "p011");
		qry.setParameter(1, 106);
		int result=qry.executeUpdate();
		System.out.println("comand successfully executed");
		System.out.println("Number of records afected is :"+result);
		*/
		
		//delete
		/*
		Query qry=session.createQuery("delete from Product p where p.productId=:pid");
		qry.setParameter("pid", 107);
		int result=qry.executeUpdate();
		System.out.println("comand successfully executed");
		System.out.println("Number of records afected is :"+result);
		session.close();
		factory.close();
		*/
	}

}
