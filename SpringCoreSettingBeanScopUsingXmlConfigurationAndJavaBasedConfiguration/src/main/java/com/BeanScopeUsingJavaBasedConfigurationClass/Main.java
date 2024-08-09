package com.BeanScopeUsingJavaBasedConfigurationClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.BeanScopeUsingJavaBasedConfigurationClass.AppConfig;

public class Main {

    public static void main(String[] args) {

        // Initialize the application context using Java-based configuration
        // Here, AppConfig.class is used to configure and create the Spring container
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the bean named "stat" (of type State) from the Spring container
        State state1 = (State) applicationContext.getBean("stat");
        State state2 = (State) applicationContext.getBean("stat");

        // By default, Spring beans are Singleton scoped, meaning the same bean instance
        // is returned for every request. However, in this case, we are using @Scope("prototype"),
        // so each request will return a new instance.
        
        /*
         * Uncomment this and remove @Scope("prototype") annotation to check Singleton scope
         * In Singleton scope, both state1 and state2 will point to the same instance,
         * and their hash codes will be the same.
         * 
         * System.out.println(state1.hashCode()); // Example output: 376416077
         * System.out.println(state2.hashCode()); // Example output: 376416077
         */

        // If the @Scope("prototype") annotation is used, a new instance will be created
        // for each request, so state1 and state2 should be different instances.
        System.out.println(state1.hashCode()); // Prints the hash code of the first instance
        System.out.println(state2.hashCode()); // Prints the hash code of the second instance
        
        // Example output: 376416077 and 274405583
    }
}
