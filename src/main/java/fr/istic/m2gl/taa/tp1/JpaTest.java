package fr.istic.m2gl.taa.tp1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaTest {

	public static EntityManager manager;
	public static EventList eventList;
	public static EntityTransaction tx;

	static{
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		manager = factory.createEntityManager();
		tx = manager.getTransaction(); 
		eventList = new EventList(manager, tx);
		run();
	}
	
	public static void run() {
		
		eventList.addEvent("11-11-11", "Redon");
		eventList.addEvent("12-12-12", "Rennes");
		Participant coco = eventList.addParticipant(1, "Coco");
		Participant bob = eventList.addParticipant(1, "Bob");
		Participant tom = eventList.addParticipant(2, "Tom");
		eventList.addCar(1, 4);
		eventList.addToCar(1, coco);
		eventList.addToCar(1, bob);
		eventList.addCar(2, 4);
		eventList.addToCar(2, tom);
		eventList.addCar(2, 4);
		System.out.println("--------------------------------------");
		for(Event e : eventList.getEvents() ){
			System.out.println(e.getDate()+" "+e.getPlace());
			System.out.print("Participants: ");
			for(Participant p : e.getParticipants() ){
				System.out.print(p.getName()+" ");
			}
			System.out.println("\nNb cars: "+e.getCars().size());
			for(Car c : e.getCars() ){
				System.out.print("Car id: "+c.getId()+" - nb seats: "+c.getSeat()+" -  Passengers: ");
				for(Participant p : c.getPassengers() ){
					System.out.print(p.getName()+" ");
				}
				System.out.println();
			}
			System.out.println("\n--------------------------------------");
		}

		
		/*
		Enseignant es = (Enseignant) manager.createQuery(
				"select e1 from Enseignant as e1 where e1.nom='barais'")
				.getSingleResult();
		*/
		
	}

}
