package com.BeanScopeUsingJavaBasedConfigurationClass;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * The State class is a Spring-managed bean with prototype scope.
 */
@Component("stat") // This annotation marks the class as a Spring component with the ID "stat".
@Scope("prototype") // This annotation specifies that a new instance of the bean will be created
					// each time it is requested.
public class State {

	public void sysout() {
		System.out.println("maharastra");
	}
}
