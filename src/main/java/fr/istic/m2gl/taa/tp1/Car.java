package fr.istic.m2gl.taa.tp1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

// TODO: Auto-generated Javadoc
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
	
	/**
	 * Gets the id.
	 * @return the id
	 */
	@Id
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the owner.
	 * @return the owner
	 */
	public int getOwner() {
		return owner;
	}
	
	/**
	 * Sets the owner.
	 * @param owner the new owner
	 */
	public void setOwner(int owner) {
		this.owner = owner;
	}
	
}
