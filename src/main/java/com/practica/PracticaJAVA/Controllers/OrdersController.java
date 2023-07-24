package com.practica.PracticaJAVA.Controllers;

import com.practica.PracticaJAVA.Models.*;
import com.practica.PracticaJAVA.Repositories.CustomerRepository;
import com.practica.PracticaJAVA.Repositories.OrderRepository;
import com.practica.PracticaJAVA.Repositories.TicketCategoryRepository;
import com.practica.PracticaJAVA.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class OrdersController {
    Customer customer;
    @Autowired
    private OrderService orderService;
    @Autowired
    private TicketCategoryRepository ticketCategoryRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private OrderRepository ordersRepository;

    @GetMapping("/orders")
    public List<Orders> getOrders(@RequestParam Integer customerId) {
        List<Orders> allOrdersById = orderService.findAllByCustomer(customerId);
        return allOrdersById;

    }

    @PostMapping("/postorders")
    public UsefulInfoOrder addAnOrder(@RequestBody NewOrder newOrder){
        LocalDateTime dateTime= LocalDateTime.now();
        TicketCategory ticketCategory= ticketCategoryRepository.findById(newOrder.getTicketCategoryId()).get();

        this.customer=new Customer();
        int userId=1; //taken from user(customer.)
        Customer customeraux=customerRepository.findById(userId).get();

        Orders placedOrder = new Orders(customeraux, ticketCategory, dateTime,newOrder.getNumberOfTickets(), newOrder.getNumberOfTickets()*ticketCategory.getTicketPrice());
        Orders ord = ordersRepository.save(placedOrder);
        return orderService.getUsefulInfo(ord);
    }

}
