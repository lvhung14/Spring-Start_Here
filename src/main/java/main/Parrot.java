package main;


import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "hehe";

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Parrot: " + name;
    }
}
