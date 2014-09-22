package fr.istic.m2gl.taa.tp1;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * The Class Event.
 * @author Victor PETIT - Amandine MANCEAU
 * 
 */
@Entity
@Table(name = "EVENTS")
public class Event {

	/** The unique id of the event. */
	private int id;
	
	/** The date of the event. */
	private Date date;
	
	/** The place of the event. */
	private String place;
	
	/** The participants list. */
	@Transient
	private List <Participant> participants;
	
	/** The cars list. */
	@Transient
	private List<Car> cars;
	
	public Event(Date date, String place) throws Exception{
		this.date = date;
		if (!place.equals("")){
			this.place = place;
		}else{
			throw new Exception("Event initialization : place cant be null");
		}
	}

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
	 * Gets the date.
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Sets the date.
	 * @param date the new date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Gets the place.
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * Sets the place.
	 * @param place the new place
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * Gets the participants.
	 * @return the participants
	 */
	@Transient
	public List<Participant> getParticipants() {
		return participants;
	}

	/**
	 * Sets the participants.
	 * @param participants the new participants
	 */
	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	/**
	 * Gets the cars.
	 * @return the cars
	 */
	 @Transient
	public List<Car> getCars() {
		return cars;
	}

	/**
	 * Sets the cars.
	 * @param cars the new cars
	 */
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	
}
