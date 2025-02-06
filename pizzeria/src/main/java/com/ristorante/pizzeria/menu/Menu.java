package com.ristorante.pizzeria.menu;

import com.ristorante.pizzeria.bevande.Bevanda;
import com.ristorante.pizzeria.pizza.Pizza;
import com.ristorante.pizzeria.topping.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
    @NoArgsConstructor
    @AllArgsConstructor
public class Menu {
    private String nomeMenu;
    List<ElementoMenu> elementoMenus = new ArrayList<>();
}