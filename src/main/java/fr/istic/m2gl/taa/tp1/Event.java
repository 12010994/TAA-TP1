package fr.istic.m2gl.taa.tp1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

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
	private String date;
	
	/** The place of the event. */
	private String place;
	
	/** The participants list. */
	@Transient
	private List <Participant> participants;
	
	/** The cars list. */
	@Transient
	private List<Car> cars;
	
	public Event(String date, String place) throws Exception{
		if ( date.equals("") || place.equals("") ){
			throw new Exception("Event initialization : date or place cant be null");
		}else{
			this.date = date;
			this.place = place;
		}
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	
	public String getDate() {
		return date;
	}

	
	public void setDate(String date) {
		this.date = date;
	}

	
	public String getPlace() {
		return place;
	}

	
	public void setPlace(String place) {
		this.place = place;
	}

	
	@OneToMany(cascade=CascadeType.REMOVE)
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
