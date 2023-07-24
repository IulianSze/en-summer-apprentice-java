package com.practica.PracticaJAVA.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Customer")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    @Column(name = "CustomerName")
    private String customerName;

    @Column(name = "Email")
    private String customerEmail;
//    @OneToMany(mappedBy = "customer")
//    private List<Orders> orders;

}
