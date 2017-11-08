package com.mypkg.hibernate.dao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mypkg.hibernate.bean.User;
public class UserDAO {
	public void addUserDetails(String userName,String password,String email,String phone,String city){
		try{
			Configuration configuration=new Configuration().configure();
			SessionFactory sessionFactory=configuration.buildSessionFactory();
			Session session=sessionFactory.openSession();
			Transaction transaction=session.beginTransaction();
			User user=new User();
			user.setUserName(userName);
			user.setPassword1(password);
			user.setEmail(email);
			user.setPhone(phone);
			user.setCity(city);
			session.save(user);
			transaction.commit();
			System.out.println("Details saved");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public void showuserDetails(String pageIndexstr,HttpServletResponse response){
		Configuration configuration=new Configuration().configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		/*
		Query query=session.createQuery("from User where id=:id");
		int id=Integer.parseInt(idstr);
		query.setParameter("id", id);
		
		*/
		int pageIndex=Integer.parseInt(pageIndexstr);
		int totalNumberofRecords=0;
		int numberOfRecordsPerPage=4;
		int s=(pageIndex*numberOfRecordsPerPage)-numberOfRecordsPerPage;
		Criteria crit=session.createCriteria(User.class);
		crit.setFirstResult(s);
		crit.setMaxResults(numberOfRecordsPerPage);
		List l=crit.list();
		Iterator it=l.iterator();
		try {
			PrintWriter out=response.getWriter();
		out.println("<table border='1'>");
		out.println("<thead><th>ID</th><th>Username</th><th>Email</th><th>ECity</th><th>EPhone</th></thead><tbody>");
		while(it.hasNext()){
			out.println("<tr>");
			Object o=(Object)it.next();
			User user=(User)o;
			out.println("<td>");
			out.println(user.getId());
			out.println("</td>");
			out.println("<td>");
			out.println(user.getUserName());
			out.println("</td>");
			out.println("<td>");
			out.println(user.getEmail());
			out.println("</td>");
			out.println("<td>");
			out.println(user.getCity());
			out.println("</td>");
			out.println("<td>");
			out.println(user.getPhone());
			out.println("</td>");
			
			out.println("</tr>");
		}
		out.println("</tbody></table>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
