package com.app.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class GlobalInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void destroy() {
		
		/*Overwrite destroy to release resources on application shutdown.*/

	}

	public void init() {
		
		/*The init method is called the after interceptor is instantiated
		  and before calling intercept. This is the place to allocate any
		  resources used by the interceptor.*/

	}

	public String intercept(ActionInvocation arg0) throws Exception {
		/*The intercept method is where the interceptor code is written. 
		Just like an action method, intercept returns a result used by Struts 
		to forward the request to another web resource. Calling invoke on the 
		parameter of type ActionInvocation will execute the action (if this is 
				the last interceptor on the stack) or another interceptor.*/
		
		System.out.println("Global interceptor's intercept method called. ClassName: "+arg0.getAction().getClass());
		return arg0.invoke();
	}

}
