package mypkg;
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
		Product p=new Product();
		p.setProductid(105);
		p.setProName("P001");
		p.setPrice(100);
		Transaction tx=session.beginTransaction();
		session.save(p);
		System.out.println("Object saved to Database");
		tx.commit();
		session.close();
		factory.close();
	}

}
