package mypkg;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Query query=session.getNamedQuery("findbyname");
		query.setString("name", "P002");
		List l=query.list();
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
		session.close();
	}

}
