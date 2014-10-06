package fr.istic.m2gl.taa.tp1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * The Class Car.
 * @author Victor PETIT - Amandine MANCEAU
 * 
 */
@Entity
public class Car {
	
	/** The id. */
	private int id;
	
	/** The remaining seat. */
	private int seat;
	
	/** the participated event. */
	private Event event;
	
	/** the list of passengers */
	private List<Participant> passengers =  new ArrayList<Participant>();
	
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@ManyToOne
	private Event getEvent1() {
		return event;
	}

	private void setEvent1(Event event) {
		this.event = event;
	}
	
	@Transient
	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.setEvent1(event);
		event.getCars().add(this);
	}

	@OneToMany(mappedBy="car")
	public List<Participant> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Participant> passengers) {
		this.passengers = passengers;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	public void takeSeat() {
		seat--;
	}
	
}
