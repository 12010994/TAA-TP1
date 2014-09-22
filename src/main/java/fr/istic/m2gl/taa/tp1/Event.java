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

	@Id
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	
	public Date getDate() {
		return date;
	}

	
	public void setDate(Date date) {
		this.date = date;
	}

	
	public String getPlace() {
		return place;
	}

	
	public void setPlace(String place) {
		this.place = place;
	}

	
	@Transient
	public List<Participant> getParticipants() {
		return participants;
	}

	
	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}

	
	 @Transient
	public List<Car> getCars() {
		return cars;
	}

	
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	
}
