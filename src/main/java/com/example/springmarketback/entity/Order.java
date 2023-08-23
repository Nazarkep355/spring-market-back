package com.example.springmarketback.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "_orders")
public class Order {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item")
    private Item item;

    private Date date;

    private double sellPrice;

}
