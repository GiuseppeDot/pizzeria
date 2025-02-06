package com.ristorante.pizzeria.bevande;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BevandaConfig {

    @Bean
    public Bevanda aranciata() {
        Bevanda b = new Bevanda();
        b.setNomeBevanda("Aranciata");
        b.setCalorie(100);
        b.setPrezzo(1.5);
        return b;
    }

    @Bean
    public Bevanda cocaCola() {
        Bevanda b = new Bevanda();
        b.setNomeBevanda("Coca Cola");
        b.setCalorie(157);
        b.setPrezzo(1.5);
        return b;
    }
}
