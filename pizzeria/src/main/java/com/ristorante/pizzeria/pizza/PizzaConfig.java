package com.ristorante.pizzeria.pizza;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {

    @Bean
    public Pizza margherita(){
        Pizza p = new Pizza();
        p.setName("margherita");
        p.setCalorie(350);
        p.setPrezzo(10.50);
        return p;
    }

}
