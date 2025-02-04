package com.ristorante.pizzeria.menu;


import com.ristorante.pizzeria.bevande.Bevanda;
import com.ristorante.pizzeria.pizza.Pizza;
import com.ristorante.pizzeria.topping.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MenuConfig {
    @Autowired
    private Bevanda aranciata;
    @Autowired
    private Bevanda cocaCola;
    @Autowired
    private Pizza margherita;
    @Autowired
    private Pizza pizzaSalame;
    @Autowired
    private Pizza pizzaMortadella;
    @Autowired
    private Topping abbondanteMozzarella;
    @Autowired
    private Topping salame;
    @Autowired
    private Topping patatine;


    @Bean
    public Menu creaMenu() {
        Menu m = new Menu();
        m.setName("Menu Pranzo");
        m.getBevande().add(aranciata);
        m.getBevande().add(cocaCola);
        m.getPizze().add(margherita);
        m.getPizze().add(pizzaSalame);
        m.getPizze().add(pizzaMortadella);
        m.setToppings(List.of(abbondanteMozzarella, salame, patatine));
        return m;

    }

}
