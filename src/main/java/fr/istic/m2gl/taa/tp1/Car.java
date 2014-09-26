package fr.istic.m2gl.taa.tp1;

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
@Table(name = "CARS")
public class Car {
	
	/** The id. */
	private int id;
	
	/** The remaining seat. */
	@Transient
	private int seat;
	
	/** the participated event. */
	private Event event;
	
	/** the list of passengers */
	private List<Participant> passengers;
	
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@ManyToOne
	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	@OneToMany(mappedBy="Car")
	public List<Participant> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Participant> passengers) {
		this.passengers = passengers;
	}

	
//-------------------Not in BDD
	
	public void setSeat(int seat){
		this.seat = seat;
	}
	public int getSeat(){
		return passengers.size();
	}
	
}
