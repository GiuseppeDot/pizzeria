package com.ristorante.pizzeria.topping;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToppingConfig {

    @Bean
    public Topping abbondanteMozzarella() {
        Topping t = new Topping();
        t.setName("abbondanteMozzarella");
        t.setCalorie(120);
        t.setPrezzo(0.50);
        return t;
    }
    @Bean
    public Topping patatine() {
        Topping t = new Topping();
        t.setName("patatine");
        t.setCalorie(140);
        t.setPrezzo(0.50);
        return t;
    }
    @Bean
    public Topping salame() {
        Topping t = new Topping();
        t.setName("Salame");
        t.setCalorie(110);
        t.setPrezzo(0.50);
        return t;
    }

}
