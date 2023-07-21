package com.practica.PracticaJAVA.Services;

import com.practica.PracticaJAVA.Models.Orders;
import com.practica.PracticaJAVA.Models.UsefulInfoOrder;
import com.practica.PracticaJAVA.Repositories.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class OrderService {
   @Autowired
    private OrderRepository orderRepository;

 public List<Orders> findAllByCustomer(Integer customerId){
     return orderRepository.findAllByCustomer_CustomerId(customerId);
 }
    public UsefulInfoOrder getUsefulInfo(Orders order){
     return new UsefulInfoOrder(order.getTicketCategory().getEvent().getEventID(),order.getOrderedAt(),order.getTicketCategory().getTicketCategoryId(),order.getNumberOfTickets(),order.getTotalPrice());
 }
}
