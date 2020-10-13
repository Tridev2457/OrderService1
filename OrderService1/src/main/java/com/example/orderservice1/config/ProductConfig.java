package com.example.orderservice1.config;


import com.example.orderservice1.model.AppleProduct;
import com.example.orderservice1.model.OrangeProduct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    public AppleProduct appleProduct(){
        return new AppleProduct("Apple", 0.60);
    }

    @Bean
    public OrangeProduct orangeProduct(){
        return new OrangeProduct("Orange", 0.25);
    }
}


