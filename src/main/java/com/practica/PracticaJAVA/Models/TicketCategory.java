package com.practica.PracticaJAVA.Models;

import jakarta.persistence.*;

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

    public TicketCategory(){
    }

    public Integer getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(Integer ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getTicketCategoryDescription() {
        return ticketCategoryDescription;
    }

    public void setTicketCategoryDescription(String ticketCategoryDescription) {
        this.ticketCategoryDescription = ticketCategoryDescription;
    }

    public Integer getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
