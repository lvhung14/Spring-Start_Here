package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean(Parrot.class);
        Person p1 = context.getBean(Person.class);

        System.out.println("Person's Name: " + p1.getName());
        System.out.println("Parrot's name: " + p.getName());
        System.out.println("Person's Parrot: " + p1.getParrot());
    }
}