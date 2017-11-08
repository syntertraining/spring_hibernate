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
		Student s=new Student();
		s.setStudentId(101);
		s.setStudentName("student01");
		s.setGrp("grp01");
		Address ad=new Address();
		ad.setAddressId(1);
		ad.setPlace("carolina");
		ad.setParent(s);
		Transaction tx=session.beginTransaction();
		session.save(ad);
		tx.commit();
		System.out.println("one to one with annotations is done");
		session.close();
		factory.close();
	}

}
