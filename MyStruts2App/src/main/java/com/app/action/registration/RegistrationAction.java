package com.app.action.registration;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.app.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Namespace("/registration")
@ResultPath(value = "/")
public class RegistrationAction extends ActionSupport implements ModelDriven {

	/*
	 * To use annotations in struts 2 - add the struts2-convention-plugin maven
	 * dependency first then use the annotations in the action class. No need to
	 * extend the ActionSupport class. ActionSupport class is extended to use
	 * specific Struts features like addActionError(), AddActionMessage(),
	 * validate() method, etc.
	 * 
	 * Here’s how the scanning works (using annotations in struts 2):
	 * 
	 * 1. Scan the annotated classes which located at the packaged named
	 * “struts, struts2, action or actions. 2. Next, scan the file which match
	 * either of the following criteria : a. Implemented the
	 * com.opensymphony.xwork2.Action interface. b. Extends the
	 * com.opensymphony.xwork2.ActionSupport class. c. File name ends with
	 * Action (e.g UserAction, LoginAction).
	 */

	// have to initialize it - Not using htt
	private User customer = null;

	@Action(value = "Welcome", results = {
			@Result(name = "SUCCESS", location = "/WEB-INF/registration/Registration.jsp") })
	public String welcome() {

		// use the following URL to get here
		// http://localhost:8080/MyStruts2App/registration/Welcome.action

		addActionMessage("Simple Action message!");

		return "SUCCESS";

	}

	@Action(value = "register", results = {
			@Result(name = "SUCCESS", location = "/WEB-INF/registration/Registration.jsp") })
	public String register() {

		// use the following URL to get here
		// http://localhost:8080/MyStruts2App/registration/register.action
		
		if (customer != null && customer.getPhone() != null && customer.getPhone().contains("abcd")) {

			addActionError("The phone number contains 'abcd'!");
			return "SUCCESS";
		}

		return "SUCCESS";

	}

	// simple validation
	public void validate() {

		// addActionMessage("Simple Action message!");

		// addActionError("I don't know you, dont try to hack me!");
		
		// addFieldError("customer.email", "Email is required.");

        //the validate method returns INPUT if any action errors or field errors are present. Map this result.

	}

	public Object getModel() {
		System.out.println("getModel() method called.");
		return customer = new User();
	}

}
