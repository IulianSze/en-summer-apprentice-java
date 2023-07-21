package com.practica.PracticaJAVA.Repositories;

import com.practica.PracticaJAVA.Models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Orders,Integer> {
 List<Orders> findAllByCustomer_CustomerId(Integer id);

}
