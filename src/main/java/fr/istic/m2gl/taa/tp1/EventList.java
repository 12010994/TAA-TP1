package fr.istic.m2gl.taa.tp1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

/**
 * TAA - TP 1 - JPA test : Event and car pooling manager.
 * @author Victor PETIT - Amandine MANCEAU 
 */
public class EventList {
	
	public EntityManager manager;
	
	public EventList(EntityManager manager){
		this.manager = manager;
	}
	
	public synchronized void addEvent(String date, String place){
		Event event;
		try {
			event = new Event(date, place);
			manager.persist(event);
		} catch (NoResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized List<Event> getEvents(){
		//TODO ajouter exception
		return JpaTest.manager.createQuery("FROM Event").getResultList();
		
	}
	
	public synchronized Event getEvent(int id){
		//retourne l'evenement a partir de l'id
		Event event = (Event) JpaTest.manager.createQuery(
				"FROM Event WHERE id=2").getSingleResult();
		return(event);
	}
	
	public synchronized void addParticipant(){
	}
	
	public synchronized void addCar(){
	}
	
}
