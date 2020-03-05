package cs.usfca.edu.ml.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cs.usfca.edu.ml.model.Event;

@RestController
@RequestMapping("/")
public class KeystrokeDynamicsController {
	
	@Autowired
	KeystrokeDynamicsHandler handler;
	
	@PostMapping(value = "/events")
	public void postEvents(@RequestBody List<Event> list) {
		handler.addEvents(list);
	}
	
	@GetMapping(value = "/events")
	public ResponseEntity<?> getEvents() {
		return ResponseEntity.status(HttpStatus.OK).body(handler.getEvents());
	}
}
