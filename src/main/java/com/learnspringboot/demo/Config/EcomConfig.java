package com.learnspringboot.demo.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan (
basePackages = "com.learnspringboot.ecomassistant", 
excludeFilters = @ComponentScan.Filter(type =FilterType.Assignable_Type,classes = DpricatedUtilityService.class)
)

public class EcomConfig {
    

}
