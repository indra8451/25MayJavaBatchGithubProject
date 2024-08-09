package com.BeanUsingScopeXMLConfigurationFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Initialize the application context using XML configuration (spring.xml)
        // The XML file "spring.xml" should be located in the classpath at
        // "com/BeanUsingScopeXMLConfigurationFile/spring.xml"
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "com/BeanUsingScopeXMLConfigurationFile/spring.xml");

        // Retrieve the bean named "stat" (of type State) from the Spring container
        State state1 = (State) applicationContext.getBean("stat");
        State state2 = (State) applicationContext.getBean("stat");

        // By default, Spring beans are Singleton scoped, which means that the same
        // bean instance is returned for every request. Therefore, both state1 and 
        // state2 should refer to the same instance of the "stat" bean.

        /*
         * Uncomment this section and check the Spring XML configuration for bean scope
         * to confirm Singleton behavior. If the bean scope is Singleton (the default),
         * both state1 and state2 will have the same hash code.
         * 
         * System.out.println(state1.hashCode()); // Example output: 376416077
         * System.out.println(state2.hashCode()); // Example output: 376416077
         */

        /*
         * If you have configured the bean with a different scope (e.g., Prototype) in
         * the XML configuration, each retrieval will create a new bean instance. 
         * In this case, the hash codes for state1 and state2 will be different.
         */
        System.out.println(state1.hashCode()); // Prints the hash code of the first instance
        System.out.println(state2.hashCode()); // Prints the hash code of the second instance
    }
}
