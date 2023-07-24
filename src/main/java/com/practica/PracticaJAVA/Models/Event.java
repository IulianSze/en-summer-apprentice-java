package com.practica.PracticaJAVA.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Event")
public class Event implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //aici nu trb neaparat strategia specificata ca e auto, doar daca folosim o strategie anume
    private Integer eventID;

    @ManyToOne
    @JoinColumn(name = "VenueID")
    private Venue venue;
    @ManyToOne
    @JoinColumn(name = "EventTypeID")
    private EventType eventType;

    @Column(name = "EventDescription")
    private String eventDescription;

    @Column(name = "EventName")
    private String nameEvent;

    @Column(name = "StartDate")
    private Date startDate;
    @Column(name = "EndDate")
    private Date endDate;
//    @OneToMany(mappedBy = "event")
//    private List<TicketCategory> ticketCategories;

}

