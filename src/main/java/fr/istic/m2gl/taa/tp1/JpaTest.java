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
			
		
<<<<<<< df5cd4ccb5adb582a7b61d82f06a8701b77d2a32
		
		
=======
		EventList eventList = new EventList(manager);
		eventList.getEvents();
>>>>>>> d6a176701f330060e0c8505792b33ea11407dba7
		
		tx.commit();
		
		/*
		Enseignant es = (Enseignant) manager.createQuery(
				"select e1 from Enseignant as e1 where e1.nom='barais'")
				.getSingleResult();
		*/
		
	}

}
