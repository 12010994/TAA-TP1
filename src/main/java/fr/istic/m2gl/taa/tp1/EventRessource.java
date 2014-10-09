package fr.istic.m2gl.taa.tp1;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/events")
public class EventRessource {

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Event> getEvents(){
		System.out.println("Returns the events list");
		return JpaTest.eventList.getEvents();
	}
	
	@GET
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Event getEvent(@PathParam("id")int idEvent){
		return JpaTest.eventList.getEvent(idEvent);
	}
	
	@POST
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public void addEvent(String name, String location){
		System.out.println("Adds an event");
	}
	
	@POST
	@Path("/toto")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public void participateWithCar(int idEvent, Participant participant){
		System.out.println("Adds a participant with a car");
	}
	
	@POST
	@Path("/titi")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public void participate(int idEvent, Participant participant){
		System.out.println("Adds a participant with no car");
	}

}
