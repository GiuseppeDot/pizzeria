package com.ristorante.pizzeria.pizza;


import com.ristorante.pizzeria.menu.ElementoMenu;
import com.ristorante.pizzeria.topping.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza implements ElementoMenu {

    private String nomePizza;
    private int calorie;
    private double prezzo;
    private List<Topping> toppings = new ArrayList<>();


    @Override
    public String getNome() {
        return nomePizza;
    }
}
