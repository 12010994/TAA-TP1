package fr.istic.m2gl.taa.tp1;

import javax.persistence.Entity;
import javax.persistence.Id;
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
	
	/** The owner. */
	@Transient
	private int owner;
	
	
	@Id
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public int getOwner() {
		return owner;
	}
	
	
	public void setOwner(int owner) {
		this.owner = owner;
	}
	
}
