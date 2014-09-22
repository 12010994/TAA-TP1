package fr.istic.m2gl.taa.tp1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	@Transient
	private Car car;

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

	@Transient
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	

}
