package com.example.crud.employees.model;

import jakarta.persistence.*;

@Entity
@Table
public class NewModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
