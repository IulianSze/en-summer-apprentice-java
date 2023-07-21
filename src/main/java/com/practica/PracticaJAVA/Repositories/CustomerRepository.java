package com.practica.PracticaJAVA.Repositories;

import com.practica.PracticaJAVA.Models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
