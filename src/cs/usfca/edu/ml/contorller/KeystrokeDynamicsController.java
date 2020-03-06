package cs.usfca.edu.ml.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import cs.usfca.edu.ml.model.Event;

@RestController
@RequestMapping("/")
public class KeystrokeDynamicsController {
	
	@Autowired
	KeystrokeDynamicsHandler handler;
	
	@PostMapping(value = "/events", consumes="application/json")
	public void postEvents(@RequestBody List<Event> list) {
		handler.addEvents(list);
	}
	
	@GetMapping("/")
	public ModelAndView home()
	{
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("index");
	    return modelAndView;
	}
}
