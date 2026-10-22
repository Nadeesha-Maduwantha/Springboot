package com.learnspringboot.demo.Service;

public class GooglePlayService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Google Play payment of amount: ");
        // Implement Google Play payment processing logic here
    }
}
