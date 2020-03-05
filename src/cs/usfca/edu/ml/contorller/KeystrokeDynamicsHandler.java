package cs.usfca.edu.ml.contorller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import cs.usfca.edu.ml.model.Event;

@Component
public class KeystrokeDynamicsHandler {
	
	public List<Event> mockEvents = new LinkedList<Event>();
	
	public void addEvents(List<Event> events) {
		mockEvents.addAll(events);
	}

	public List<Event> getEvents() {
		return mockEvents;
	}
}
