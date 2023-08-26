package config;

import main.Parrot;
import main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Person person(){
        var p = new Person();
        p.setName("Koko");
        return p;
    }
    @Bean
    Parrot parrot(){
        Parrot p1 = new Parrot();
        p1.setName("Elsa");
        return p1;
    }

}
