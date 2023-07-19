package com.practica.PracticaJAVA.Models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "TicketCategoryID")
    private TicketCategory tycketCategory;
    @Column(name = "OrderedAt")
    private Date orderedAt;
    @Column(name = "NumberOfTickets")
    private int numberOfTickets;
    @Column(name = "TotalPrice")
    private int totalPrice;

    public Orders() {
    }


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TicketCategory getTycketCategory() {
        return tycketCategory;
    }

    public void setTycketCategory(TicketCategory tycketCategory) {
        this.tycketCategory = tycketCategory;
    }

    public Date getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(Date orderedAt) {
        this.orderedAt = orderedAt;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
