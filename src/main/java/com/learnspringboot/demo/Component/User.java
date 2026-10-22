package com.learnspringboot.demo.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class User {
    Order order = new Order();

    public User(){
        System.out.println("initial user");
    }
    @Autowired 
    public void setOrder(Order order){
        this.order=order;
    }
}
