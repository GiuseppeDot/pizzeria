package com.ristorante.pizzeria.ordini;

import com.ristorante.pizzeria.menu.ElementoMenu;
import com.ristorante.pizzeria.tavoli.Tavolo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ordine {
    private int numeroOrdine;
    private Tavolo tavolo;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private LocalDateTime orarioAcquisto = LocalDateTime.now();
    private List<ElementoMenu> elementoMenus = new ArrayList<>();
    @Value("${costo.coperto}")
    private double CostoCoperto;
}
