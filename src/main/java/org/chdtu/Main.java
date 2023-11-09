package org.chdtu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring application context
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        // Retrieve the Person bean
        Person person = context.getBean("person", Person.class);

        // Print the person details
        System.out.println(person);
    }
}
