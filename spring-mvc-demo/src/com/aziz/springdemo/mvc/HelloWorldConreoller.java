package com.aziz.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldConreoller {
	
	//Controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//Controller method  to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	@RequestMapping("/processName")
	public String processName(HttpServletRequest request, Model model) {
		//read the request parameter from HTML form
		String theName = request.getParameter("studentName");
		
		// convert to Uppercase
		theName = theName.toUpperCase();
		
		// create the message
		String result = "YOI "+ theName ;
		//add ,essage to the model
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}
	
	@RequestMapping("/processName2")
	public String processName2(@RequestParam("studentName") String theName, Model model) {
		
		// convert to Uppercase
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Hay "+ theName ;
		//add ,essage to the model
		model.addAttribute("message", result);
		
		return "helloworld";
		
	}

}
