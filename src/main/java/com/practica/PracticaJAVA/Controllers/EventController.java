package com.practica.PracticaJAVA.Controllers;

import com.practica.PracticaJAVA.Models.Event;
import com.practica.PracticaJAVA.Models.Orders;
import com.practica.PracticaJAVA.Repositories.EventRepository;
import com.practica.PracticaJAVA.Services.EventService;
import com.practica.PracticaJAVA.Services.OrderService;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class EventController {
    private EventService eventService;
    private OrderService orderService;
    public EventController(EventService eventService){
        this.eventService=eventService;
    }

    @GetMapping("/events")
    public ResponseEntity<List<Event>> getAllEvents() {

        List<Event> allEvents = eventService.findAll();
        return new ResponseEntity<>(allEvents, HttpStatus.OK);

    }
    @GetMapping("/eventsby")
    public List<Event> getEvents(@RequestParam Integer venueId, @RequestParam String eventType) {
        List<Event> allEventsByVenueIdAndEventType=eventService.findAllByVenueAndEventType(venueId,eventType);
        return allEventsByVenueIdAndEventType;

    }
}
