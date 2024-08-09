package com.controller;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class HomeController {

	@ModelAttribute
	public void someCommonDataToAllHandler(Model model) {
		
		model.addAttribute("name","Indrajit");
	}
	
	/*//one way for redirecting using redirect prefix
	@RequestMapping("/welcome")
	public String welcome(Model model) {
		
		System.out.println("In welcome handler");
		return "redirect:/help";
	}
	
	@RequestMapping("/help")
	public String help(Model model) {
		
		System.out.println("In help handler");
		return "/about";
	}*/
	
	
	//second way for redirecting using RedirectView
	@RequestMapping("/welcome")
    public RedirectView welcome(Model model) {
        System.out.println("In welcome handler");
        
        // RedirectView object to redirect to "/help"
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("help");  
        //  redirectView.setUrl("https://google.com"); 
        return redirectView;
    }

    @RequestMapping("/help")
    public String help(Model model) {
        System.out.println("In help handler");
        
        // Returns the "about" view (about.jsp or other view configured)
        return "/about";
    }
}

/*
 * Scenarios for Using RedirectView: When Redirecting to a Local URL:
 * 
 * Example: redirectView.setUrl("help"); Use Case: You want to redirect the user
 * from one endpoint to another within the same application (e.g., from /welcome
 * to /help). Why Use It: This is helpful when the target URL is part of your
 * own web application, and you want to redirect to a specific endpoint, while
 * still allowing the user to navigate within the app seamlessly. When
 * Redirecting to an External URL:
 * 
 * Example: redirectView.setUrl("https://google.com"); Use Case: You want to
 * redirect the user to an external website (e.g., Google, or a third-party
 * service). Why Use It: This is useful when you need to send users to external
 * resources, like OAuth logins, external services, or external documentation
 * pages
 */