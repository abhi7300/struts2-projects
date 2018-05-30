package com.app.action.registration;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/registration")
@ResultPath(value="/")
public class RegistrationAction extends ActionSupport{

	/*
	 * Here’s how the scanning works (using annotations in struts 2):
	 * 
	 * 1. Scan the annotated classes which located at the packaged named “struts,
	 *    struts2, action or actions. 
	 * 2. Next, scan the file which match either of
	 *    the following criteria : 
	 *    a. Implemented the com.opensymphony.xwork2.Action interface. 
	 *    b. Extends the com.opensymphony.xwork2.ActionSupport class. 
	 *    c. File name ends with Action (e.g UserAction, LoginAction).
	 */

	@Action(value="Welcome", results={
			@Result(name="SUCCESS",location="/WEB-INF/registration/Registration.jsp")
		})
	public String welcome() {

		// use the following URL to get here
		// http://localhost:8080/MyStruts2App/registration/Welcome.action
		
		return "SUCCESS";

	}

	
	@Action(value="register", results={
			@Result(name="SUCCESS",location="/WEB-INF/registration/Registration.jsp")
		})
	public String register() {

		// use the following URL to get here
		// http://localhost:8080/MyStruts2App/registration/register.action
		
		return "SUCCESS";

	}
	
}
