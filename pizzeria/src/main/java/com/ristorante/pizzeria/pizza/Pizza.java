package com.ristorante.pizzeria.pizza;


import com.ristorante.pizzeria.topping.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza {

    private String name;
    private int calorie;
    private double prezzo;
    private List<Topping> toppings = new ArrayList<>();



}
