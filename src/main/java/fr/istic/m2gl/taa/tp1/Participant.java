package fr.istic.m2gl.taa.tp1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * The Class Participant.
 * @author Victor PETIT - Amandine MANCEAU
 * 
 */
@Entity
@Table(name = "PARTICIPANTS")
public class Participant {
	
	
	/** The id. */
	private int id;
	
	/** The car owner name. */
	private String name;
	
	/** the reference to the owner car. */
	private Car car;
	
	/** the participated event. */
	private Event event;

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany
	public Car getCar() {
		return car;
	}

	
	public void setCar(Car car) {
		this.car = car;
	}

	@ManyToOne
	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	
	
	
}
