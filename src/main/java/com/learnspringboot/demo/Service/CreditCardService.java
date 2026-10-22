package com.learnspringboot.demo.Service;

public class CreditCardService  implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of amount: " );
        // Implement credit card payment processing logic here
    }
    
}
