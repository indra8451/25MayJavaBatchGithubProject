package com.beans;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Annotating the class as a Spring Controller
@Controller
public class TestController {
	
 // Mapping the "/welcome" URL to this method
	
 @RequestMapping("/welcome")
 public String welcome() {
     
	 System.out.println("Inside Welcome TestController");
     // Returning the name of the view (welcome.jsp) to be rendered
     return "welcome";  // returning welcome of page
 }

}
