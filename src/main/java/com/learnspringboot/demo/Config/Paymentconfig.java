package com.learnspringboot.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class Paymentconfig {
    @Bean 
    public PaymentService CreditCardPaymentService() {
        return new CreditCardService();
    }
    @Bean 
    public PaymentService GooglePlayPaymentService() {
        return new GooglePlayService();
    }
}
