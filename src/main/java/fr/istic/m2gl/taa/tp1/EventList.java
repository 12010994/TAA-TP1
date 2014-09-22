package fr.istic.m2gl.taa.tp1;

import java.util.List;

public class EventList {

	public synchronized void addEvent(String date, String place){
		Event event;
		try {
//			event = (Event) JpaTest.manager.createQuery(
//					"FROM Event WHERE id=0")
//					.getSingleResult();
			
			event = new Event(date, place);
			JpaTest.manager.persist(event);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized List<Event> getEvents(){
		return null;
	}
	
	public synchronized Event getEvent(){
		return null;
	}
	
	public synchronized void addParticipant(){
	}
	
	public synchronized void addCar(){
	}
	
}
