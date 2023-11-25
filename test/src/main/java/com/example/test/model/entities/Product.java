package com.example.test.model.entities;

import com.example.test.model.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
//@JsonIgnoreProperties(value = {"id","name"}, allowSetters  = true)
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    @ManyToOne()
    private Category category;
    private Status status;




}
