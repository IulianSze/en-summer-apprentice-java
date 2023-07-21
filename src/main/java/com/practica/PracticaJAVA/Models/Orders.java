package com.practica.PracticaJAVA.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Orders")
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "TicketCategoryID")
    private TicketCategory ticketCategory;
    @Column(name = "OrderedAt")
    private LocalDateTime orderedAt;
    @Column(name = "NumberOfTickets")
    private int numberOfTickets;
    @Column(name = "TotalPrice")
    private int totalPrice;
    public Orders(Customer customer, TicketCategory ticketCategory, LocalDateTime orderedAt, int numberOfTickets, int totalPrice) {
        this.customer = customer;
        this.ticketCategory = ticketCategory;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

}
