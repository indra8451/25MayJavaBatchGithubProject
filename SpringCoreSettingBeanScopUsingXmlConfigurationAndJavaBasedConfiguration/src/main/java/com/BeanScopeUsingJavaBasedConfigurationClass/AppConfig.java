package com.BeanScopeUsingJavaBasedConfigurationClass; // The package for the configuration class

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Java-based configuration class for Spring.
 */
@Configuration // Marks this class as a source of Spring bean definitions
@ComponentScan(basePackages = "com.BeanScopeUsingJavaBasedConfigurationClass") // Scans the specified package for
																				// components
public class AppConfig {

}

/**
 * This class uses Java-based configuration instead of XML configuration files
 * (e.g., spring.xml or applicationcontext.xml).
 * 
 * - **Removing XML Configuration**: By using @Configuration and @ComponentScan,
 * we avoid the need for an XML configuration file. This approach simplifies
 * setup and makes the configuration more manageable. - **@Configuration**:
 * Indicates that this class contains Spring configuration and bean definitions.
 * - **@ComponentScan**: Automatically scans the specified package for Spring
 * components (e.g., @Component, @Service, @Repository, @Controller) and
 * registers them as beans in the Spring context.
 * 
 * This approach simplifies configuration by keeping everything in Java code,
 * providing a more type-safe and refactor-friendly configuration mechanism.
 */
