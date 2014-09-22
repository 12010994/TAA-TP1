package fr.istic.m2gl.taa.tp1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	
	/** The car owner. */
	private Participant owner;
	
	/** The remaining seat. */
	private int seat;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@ManyToOne
	public Participant getOwner() {
		return owner;
	}
	
	public void setOwner(Participant owner) {
		this.owner = owner;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	
	
}
