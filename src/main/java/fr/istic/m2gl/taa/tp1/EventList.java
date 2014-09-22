package fr.istic.m2gl.taa.tp1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventList {

	public synchronized void addEvent(){
		Event event;
		try {
			event = new Event(new Date(), "City");
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
