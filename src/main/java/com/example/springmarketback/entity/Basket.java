package com.example.springmarketback.entity;

import com.example.springmarketback.entity.userentity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Basket {
    @Id
    private Long id;
    @ManyToOne
    private User owner;
    @ManyToMany
    private List<Item> items;
}
