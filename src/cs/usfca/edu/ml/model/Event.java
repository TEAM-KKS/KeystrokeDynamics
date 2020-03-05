package cs.usfca.edu.ml.model;

import java.io.Serializable;

public class Event implements Serializable {
	private String eventName;
	
	public Event() {}
	
	public Event(String eventName) {
		this.eventName = eventName;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
}
