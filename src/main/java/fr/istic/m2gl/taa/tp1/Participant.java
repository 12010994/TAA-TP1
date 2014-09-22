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

}
