package cs.usfca.edu.ml.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cs.usfca.edu.ml.model.Event;
import cs.usfca.edu.ml.model.EventRepository;

@Component
public class KeystrokeDynamicsHandler {
	
	@Autowired
	private EventRepository eventRepository;
	
	public void addEvents(List<Event> events) {
		eventRepository.saveAll(events);
	}
}
