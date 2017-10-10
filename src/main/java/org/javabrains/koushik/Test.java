package org.javabrains.koushik;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.koushik.dto.UserDetails;

public class Test {

	public void save(Object o){
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session sess =  factory.openSession();
		
		sess.save(o);
		
		sess.beginTransaction();
		
		
		
		sess.getTransaction().commit();

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setUserName("Marcelo");
		
		Test test = new Test();
		test.save(user);
		}

}
