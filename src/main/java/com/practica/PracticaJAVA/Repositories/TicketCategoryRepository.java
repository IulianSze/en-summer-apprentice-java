package com.practica.PracticaJAVA.Repositories;

import com.practica.PracticaJAVA.Models.Event;
import com.practica.PracticaJAVA.Models.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
@Repository
public interface TicketCategoryRepository extends CrudRepository<TicketCategory, Integer> {
}
