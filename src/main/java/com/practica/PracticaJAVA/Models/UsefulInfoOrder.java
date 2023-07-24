package com.practica.PracticaJAVA.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsefulInfoOrder {
    Integer eventID;
    LocalDateTime orderedAt;
    Integer ticketCategoryId;
    Integer numberOfTickets;
    Integer totalPrice;

}
