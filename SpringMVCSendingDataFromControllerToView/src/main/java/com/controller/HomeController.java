package com.controller;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// Marks this class as a Spring MVC Controller, which handles web requests
@Controller
public class HomeController {

    // Maps the URL "/welcome" to this method, so when this URL is accessed, this method is called
    @RequestMapping("/welcome")
    public String welcome(Model model) {
        
        // Adds an attribute "name" to the Model object, which can be accessed in the view (JSP page)
        model.addAttribute("name", "Indrajit Chavan");
        
        // Creating a list of names (String type) using ArrayList
        List<String> namelist = new ArrayList<String>();
        
        // Adding several names to the namelist
        namelist.add("Pravin");
        namelist.add("Vishal");
        namelist.add("Kiran");
        namelist.add("Vikaram");
        namelist.add("Lorenzo");
        namelist.add("Sunil");
        
        // Adds the namelist to the Model object, making it available or sending to the view as "Names"
        model.addAttribute("Names", namelist);
        
        // Returns the name of the view (in this case, a JSP page named "welcome.jsp")
        // This tells Spring MVC to render the "welcome.jsp" view
        return "welcome";  // Spring looks for "welcome.jsp" in the view resolver configuration
    }
    
    // Maps the URL "/help" to this method
    @RequestMapping("/help")
    public ModelAndView help() {
    	
    	// Creating a ModelAndView object to hold both model data and the view name
    	ModelAndView modelAndview = new ModelAndView();
    	
    	// Adds an attribute "name" to the ModelAndView, which will be accessible in the view (JSP page)
    	modelAndview.addObject("name", "Indrajit Chavan");
    	
    	// Creating a Set of IDs (Integer type) using HashSet
    	Set<Integer> idset = new HashSet<Integer>();
    	
    	// Adding several IDs to the idset
    	idset.add(1001);
    	idset.add(1002);
    	idset.add(1003);
    	idset.add(1004);
    	idset.add(1005);

    	// Adds the idset (a Set of Integer IDs) to the ModelAndView object,
    	// making this data available to the view (JSP page) under the attribute name "idset"
    	modelAndview.addObject("idset", idset);
    	
    	// Specifies the view name (in this case, a JSP page named "help.jsp")
    	modelAndview.setViewName("help");  // This tells Spring MVC to render the "help.jsp" view
    	
    	// Returns the ModelAndView object containing both the model data and view name
    	return modelAndview;
    }
    
    @RequestMapping("/about")
    public String about(Model model) {
        
        // Adds an attribute "name" to the Model object, which can be accessed in the view (JSP page)
        model.addAttribute("name", "Indrajit Chavan");
        
        // Creating a list of names (String type) using ArrayList
        List<String> namelist = new ArrayList<String>();
        
        // Adding several names to the namelist
        namelist.add("Pravin");
        namelist.add("Vishal");
        namelist.add("Kiran");
        namelist.add("Vikaram");
        namelist.add("Lorenzo");
        namelist.add("Sunil");
        
        // Adds the namelist to the Model object, making it available or sending to the view as "Names"
        model.addAttribute("Names", namelist);
        
        // Returns the name of the view (in this case, a JSP page named "welcome.jsp")
        // This tells Spring MVC to render the "welcome.jsp" view
        return "welcome";  // Spring looks for "welcome.jsp" in the view resolver configuration
    }
}
