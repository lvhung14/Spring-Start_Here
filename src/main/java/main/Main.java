package main;

import Config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var contex = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = new Parrot();
        p.setName("haha");
        Supplier<Parrot> parrotSupplier = () -> p;
        contex.registerBean("parrot1", Parrot.class, parrotSupplier);
        Parrot x = contex.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}