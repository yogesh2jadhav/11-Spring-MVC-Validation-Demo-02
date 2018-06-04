package com.luv2code.springdemo;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainMenuController {

	
	@RequestMapping("/")
	public String showMainMenu() {
		return "main-menu";
	}
	//==============================================================
	@RequestMapping("/showstudentform")
	public String showStudentForm() {
		return "show-student-form";
	}
	
	@RequestMapping("/processstudent")
	public String processStudent(HttpServletRequest theHttpServletRequest) {
		System.out.println("Student name from java code="+theHttpServletRequest.getParameter("studentName"));
		return "confirm-student";
	}
	//=============================================================
	
	@RequestMapping("/showstudentform2")
	public String showStudentForm2() {
		return "show-student-form2";
	}
	
	@RequestMapping("/processstudent2")
	public String processStudent(@RequestParam("studentName") String studentName, Model theModel) {
		System.out.println("Student name from java code="+ studentName);
		String std = studentName.toUpperCase();
		theModel.addAttribute("studentStr", std);
		return "confirm-student2";
	}
	//==============================================================
	@RequestMapping("/showcustomerform")
	public String showcustomerform(Model theModel) {
		Customer customer = new Customer();
		theModel.addAttribute("customer", customer);
		return "show-customer-form";
	}
	
	@RequestMapping("/processcustomer")
	public String processcustomer(@Validated @ModelAttribute("customer") Customer myCustomer, BindingResult theBindingResult) {
		
		if(theBindingResult.hasErrors() )
			return "show-customer-form";
		
		String a = myCustomer.getFirstName().toUpperCase();
		myCustomer.setFirstName(a);
 
		return "confirm-customer";
	}
	
	
	@InitBinder
	public void initBinderFx(WebDataBinder myWebDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		myWebDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
		
	}
}
