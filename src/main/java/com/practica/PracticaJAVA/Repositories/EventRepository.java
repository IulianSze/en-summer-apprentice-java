package com.practica.PracticaJAVA.Repositories;

import com.practica.PracticaJAVA.Models.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Integer> {
   List<Event> findAllByEventID(Integer EventID);
}
