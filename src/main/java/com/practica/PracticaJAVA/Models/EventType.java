package com.practica.PracticaJAVA.Models;

import jakarta.persistence.*;

@Entity
@Table(name = " EventType")
public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventTypeId;

    @Column(name = "EventTypeName")
    private String eventTypeName;

    public EventType(){
    }

    public Integer getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }
}
