package com.ristorante.pizzeria.menu;


import com.ristorante.pizzeria.bevande.Bevanda;
import com.ristorante.pizzeria.pizza.Pizza;
import com.ristorante.pizzeria.topping.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class MenuConfig {
    private final Bevanda aranciata;
    private final Bevanda cocaCola;
    private final Pizza margherita;
    private final Pizza pizzaSalame;
    private final Pizza pizzaMortadella;
    private final Topping abbondanteMozzarella;
    private final Topping salame;
    private final Topping patatine;


    @Bean
    public Menu creaMenu() {
        Menu m = new Menu();
        m.setNomeMenu("Menu Pranzo");
        m.setElementoMenus(List.of(aranciata, cocaCola, margherita, pizzaSalame, pizzaMortadella, abbondanteMozzarella,
                salame, patatine));
        return m;

    }

}
