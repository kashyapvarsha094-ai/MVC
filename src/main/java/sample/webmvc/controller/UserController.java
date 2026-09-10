package sample.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class UserController {

	@RequestMapping("/")
	@ResponseBody
	public String greet() {

		return "Hii user welcome to the web dev.......... ";

	}
	
	@RequestMapping("/movies")
	@ResponseBody
	public String movie() {

		return "Hii user welcome to the movie dev.......... ";

	}
	
	
	
	
	
	

}
