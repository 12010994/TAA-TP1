package fr.istic.m2gl.taa.tp1;

import static org.junit.Assert.*;

import javax.persistence.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EventListTest {

	private EntityManager manager;
	private EventList eventList;
	private EntityTransaction tx;

	@Before
	public void init(){

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		manager = factory.createEntityManager();
		tx = manager.getTransaction();

		eventList = new EventList(manager, tx);
	}

	@Test(expected = NoResultException.class)
	public void testNoResultExceptionIsThrownWhenEmpty() {
		Event event = (Event) manager.createQuery(
				"FROM Event WHERE id=1")
				.getSingleResult();
	}

	@Test(expected = Exception.class)
	public void ExceptionIsThrownWhenMalformedEvent() {
		eventList.addEvent("", "");
	}

	@Test
	public void testAddOneEvent() {

		eventList.addEvent("today", "Rennes");
		Event event = (Event) manager.createQuery(
				"FROM Event WHERE id=1")
				.getSingleResult();
		assertEquals(1, event.getId());
		assertEquals("today", event.getDate());
		assertEquals("Rennes", event.getPlace() );
	}

	@Test
	public void testAddThreeEvent() {

		eventList.addEvent("11-11-11 11h11", "Rennes");
		eventList.addEvent("12-12-12 12h12", "Paris");
		eventList.addEvent("13-12-13 13h13", "Berlin");

		Event event1 = (Event) manager.createQuery(
				"FROM Event WHERE id=1")
				.getSingleResult();
		Event event2 = (Event) manager.createQuery(
				"FROM Event WHERE id=2")
				.getSingleResult();
		Event event3 = (Event) manager.createQuery(
				"FROM Event WHERE id=3")
				.getSingleResult();
		assertEquals(1, event1.getId());
		assertEquals("11-11-11 11h11", event1.getDate());
		assertEquals("Rennes", event1.getPlace() );
		assertEquals(2, event2.getId());
		assertEquals("12-12-12 12h12", event2.getDate());
		assertEquals("Paris", event2.getPlace() );
		assertEquals(3, event3.getId());
		assertEquals("13-12-13 13h13", event3.getDate());
		assertEquals("Berlin", event3.getPlace() );
	}

}
