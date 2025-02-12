package com.ristorante.pizzeria.pizza;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {

    @Bean
    public Pizza margherita(){
        Pizza p = new Pizza();
        p.setNomePizza("Margherita");
        p.setCalorie(350);
        p.setPrezzo(10.50);
        return p;
    }
    @Bean
    public Pizza pizzaSalame(){
        Pizza p = new Pizza();
        p.setNomePizza("Pizza Salame");
        p.setCalorie(350);
        p.setPrezzo(10.50);
        return p;
    }
    @Bean
    public Pizza pizzaMortadella(){
        Pizza p = new Pizza();
        p.setNomePizza("Pizza Mortadella");
        p.setCalorie(350);
        p.setPrezzo(12.50);
        return p;
    }

}
