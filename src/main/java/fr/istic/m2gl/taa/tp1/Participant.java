package fr.istic.m2gl.taa.tp1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
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
	private String nameee;
	
	/** the ref to the owned car. */
	private Car car;

	@Id
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
	

}
