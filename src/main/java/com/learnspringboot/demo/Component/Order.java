package com.learnspringboot.demo.Component;
import org.springframework.stereotype.Component;

@Component 
public class Order {

    public Order(){
    System.out.println("initializing order ");
    }
    public void process(){
        System.out.println("processing order");
    }

}

