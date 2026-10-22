package com.learnspringboot.demo.Component;
import org.springframework.stereotype.Component;

@Component 
public class OnlineOrder { 

    public OnlineOrder(){
        
    }

  
    public static void main(String[] args){
        User user=new User();
        Order order = new Order();
        user.setOrder(order);
    }
}
