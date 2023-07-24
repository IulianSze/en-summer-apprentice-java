package com.practica.PracticaJAVA.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TicketCategory")
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticketCategoryId;

    @ManyToOne
    @JoinColumn(name = "EventID")
    private Event event;

    @Column(name = "Description")
    private String ticketCategoryDescription;

    @Column(name = "Price")
    private Integer ticketPrice;

//    @OneToMany(mappedBy = "ticketCategory")
//    private List<Orders> orders;

}
