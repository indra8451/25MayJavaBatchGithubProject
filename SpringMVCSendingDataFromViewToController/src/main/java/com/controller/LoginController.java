package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/first") // Optional: Base URL mapping for all routes in this controller
public class LoginController {

	// Handles GET requests to "/login". By default, @RequestMapping without the
	// 'method' parameter maps to GET.
	@RequestMapping("/login") // The method responds to "/login" URL, rendering the login view
	public String login() {
		// This method returns the login view (typically a JSP or HTML file).
		return "login";
	}

	@RequestMapping(path = "/loginform", method = RequestMethod.POST)
	public String processLogin(@ModelAttribute User user, Model model) {

		// Automatically binds form data to the User object.
		System.out.println(user); // Prints the User object (with email, name, password fields) to the console.

		// also set the user object in model referce

		// Return the "success" view, where the user data can be accessed and displayed.
		return "success";
	}

}

/*
 * //Before using @ModelAttribute, we manually handle each URL parameter //If
 * the URL request contains 10 parameters, we must write 10 @RequestParam for
 * each parameter. //Similarly, we need to create a User object and call 10
 * setter methods to set values in the User object.
 * 
 * // Handles POST requests to "/loginform", triggered when the form is
 * submitted
 * 
 * @RequestMapping(path = "/loginform", method = RequestMethod.POST) // POST
 * method handler for login form submission public String
 * processLogin(@RequestParam("email") String userEmail,
 * 
 * @RequestParam("name") String username,
 * 
 * @RequestParam("pass") String password, Model model) {
 * 
 * 
 * // Retrieving form data sent via POST from login.jsp, printing the values to
 * the console System.out.println("Email: " + userEmail);
 * System.out.println("Username: " + username); System.out.println("Password: "
 * + password);
 * 
 * // Creating a new User object to store the form data of login.jsp User user =
 * new User();
 * 
 * // Setting the values (email, name, password) in the User object from the
 * form data user.setEmail(userEmail); // Storing the user's email
 * user.setName(username); // Storing the user's name user.setPass(password); //
 * Storing the user's password
 * 
 * // Printing the User object to the console to verify that the values have
 * been set correctly System.out.println(user); // This will call the toString()
 * method of the User class, showing its state
 * 
 * 
 * // Adding form data to the Model object, which will be accessible in the view
 * (success.jsp) model.addAttribute("email", userEmail); // Sending email to the
 * view model.addAttribute("name", username); // Sending username to the view
 * model.addAttribute("pass", password); // Sending password to the view
 * 
 * // Returning the name of the view (success.jsp), which will display the
 * passed data return "success"; }
 */