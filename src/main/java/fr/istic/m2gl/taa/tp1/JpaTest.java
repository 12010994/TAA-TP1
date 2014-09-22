package fr.istic.m2gl.taa.tp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * TAA - TP 1 - JPA test : event and car pooling manager.
 * @author Victor PETIT - Amandine MANCEAU 
 * 
 * The project main class.
 */
public class JpaTest {

	/** The entity manager. */
	public static EntityManager manager;


	/**
	 * The constructor.
	 * @param manager the manager */
	public JpaTest(EntityManager manager) {
		JpaTest.manager = manager;
	}

	/**
	 * The main method.
	 * @param args the arguments */
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager); //?

		EntityTransaction tx = manager.getTransaction(); //?
		tx.begin();
			
		EventList eventList = new EventList();
		eventList.addEvent("12-12-12 12h12", "Berlin");
		eventList.addEvent("13-12-13 13h13", "Paris");
		eventList.addEvent("11-11-11 11h11", "Rennes");
		
		Event event = (Event) JpaTest.manager.createQuery(
				"FROM Event WHERE id=2")
				.getSingleResult();
		System.out.println(event.getPlace());
		
		tx.commit();
		
		/*
		Enseignant es = (Enseignant) manager.createQuery(
				"select e1 from Enseignant as e1 where e1.nom='barais'")
				.getSingleResult();
		*/
		
	}

}
