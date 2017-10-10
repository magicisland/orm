package org.javabrains.koushik;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.javabrains.koushik.dto.UserDetails;
import org.javabrains.koushik.dto.Vehicle;

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
		user.setUserName("Marcelo");
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("ford");
	
		
		Vehicle vehicle2=new Vehicle();
		vehicle2.setVehicleName("jeep");


		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session sess =  factory.openSession();
		
				
		sess.beginTransaction();
		
		
		sess.save(vehicle);
		sess.save(vehicle2);
	
		
		user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle2);

		
		sess.save(user);
		
		sess.getTransaction().commit();

		

		
		}

}
