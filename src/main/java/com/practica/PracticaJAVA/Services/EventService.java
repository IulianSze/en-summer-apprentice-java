package com.practica.PracticaJAVA.Services;

import com.practica.PracticaJAVA.Models.Event;
import com.practica.PracticaJAVA.Models.Orders;
import com.practica.PracticaJAVA.Repositories.EventRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor //- si puteam sa  scriem constructoru daca nu faceam asta sau AutoWired
@NoArgsConstructor
@Service

public class EventService {
    @Autowired
    private EventRepository eventRepository; //aici ar putea fi final (sa caut dc)
    public List<Event> findAll() {

        return eventRepository.findAll();
    }
    public List<Event> findAllByVenueAndEventType(Integer venueId, String eventType){
       return eventRepository.findAllByVenue_VenueIdAndEventType_EventTypeName(venueId,eventType);

    }
}
