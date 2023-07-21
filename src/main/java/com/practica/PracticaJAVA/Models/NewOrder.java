package com.practica.PracticaJAVA.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewOrder {

    private Integer orderId;
    private Integer ticketCategoryId;
    private Integer numberOfTickets;

}
