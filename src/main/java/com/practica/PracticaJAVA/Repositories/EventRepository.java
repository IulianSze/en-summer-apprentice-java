package com.practica.PracticaJAVA.Repositories;

import com.practica.PracticaJAVA.Models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface EventRepository extends JpaRepository<Event, Integer> {
   List<Event> findAll();

   List<Event> findAllByVenue_VenueIdAndEventType_EventTypeName(Integer id, String type);

}
