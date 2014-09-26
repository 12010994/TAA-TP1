package fr.istic.m2gl.taa.tp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaTest {

	public static EntityManager manager;

	public JpaTest(EntityManager manager) {
		JpaTest.manager = manager;
	}
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		manager = factory.createEntityManager();
		
		JpaTest test = new JpaTest(manager); 

		EntityTransaction tx = manager.getTransaction(); 
		tx.begin();
			
		EventList eventList = new EventList(manager);
		eventList.getEvents();
		
		tx.commit();
		
		/*
		Enseignant es = (Enseignant) manager.createQuery(
				"select e1 from Enseignant as e1 where e1.nom='barais'")
				.getSingleResult();
		*/
		
	}

}
