package hibernateselect;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		/*
		Transaction t=session.beginTransaction();
		Product p1=new Product();
		
		p1.setProName("P002");
		p1.price=200;
		session.save(p1);
		t.commit();
		session.close();
		
		
		
		Query query=session.createQuery("from Product where productId=:pid");
		query.setParameter("pid",2);
		*/
		Criteria cr=session.createCriteria(Product.class);
		cr.add(Restrictions.ge("productId", 1));
		List l=cr.list();
		//List l=query.list();
		Iterator it=l.iterator();
		while(it.hasNext()){
			Object o=(Object)it.next();
			Product p=(Product)o;
			System.out.println("***************************************");
			System.out.println("Product ID "+p.getProductId());
			System.out.println("Product Name "+p.getProName());
			System.out.println("Product Price "+p.getPrice());
			System.out.println("***************************************");
		}
		
		System.out.println("success");
	}

}
