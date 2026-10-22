package com.learnspringboot.demo.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class User {
    Order order;
    OnlineOrder onlineOrder;

    @Autowired 
    public User(Order order, OnlineOrder onlineOrder){
        this.order = order;
        this.onlineOrder = onlineOrder;
        System.out.println("initial user");
    }
    
}