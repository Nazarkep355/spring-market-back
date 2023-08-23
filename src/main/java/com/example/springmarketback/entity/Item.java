package com.example.springmarketback.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Item {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    private ItemType itemType;
    @ManyToMany
    private List<Detail> details;
    @OneToOne
    private Photo mainPhoto;
    @OneToMany
    private List<Photo> photos;
    private double price;
}