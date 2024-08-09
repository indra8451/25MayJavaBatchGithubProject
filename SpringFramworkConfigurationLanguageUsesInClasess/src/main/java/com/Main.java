package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Initialize the application context using XML configuration (spring.xml)
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        
        // Retrieve the bean named "op" of type OperationsOnNumber from the Spring container
        OperationsOnNumber opn = (OperationsOnNumber) applicationContext.getBean("op");
        
        // Print the details of the OperationsOnNumber bean
        System.out.println("OperationsOnNumber Details:");
        System.out.println("-----------------------------");
        System.out.println("Addition: " + opn.getAddition());
        System.out.println("Square Number: " + opn.getSquareNumber());
        System.out.println("Flag: " + opn.isFlag());
        System.out.println("Odd Numbers: " + opn.getOddNumbers());
        System.out.println("Employee Names: " + opn.getEmployeeNames());
        System.out.println("Skills: " + opn.getSkills());
        System.out.println("Config Properties: " + opn.getConfigProperties());
    }
}

/*output 
 * 
 * OperationsOnNumber Details:
-----------------------------
Addition: 120
Square Number: 100
Flag: false
Odd Numbers: [1, 3, 5, 7, 9]
Employee Names: {E001=John Doe, E002=Jane Smith}
Skills: [Java, Spring, Hibernate]
Config Properties: {maxThreads=10, timeout=5000}*/
