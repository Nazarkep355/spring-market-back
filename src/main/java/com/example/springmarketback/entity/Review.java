package com.example.springmarketback.entity;

import com.example.springmarketback.entity.userentity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
public class Review {

    @Id
    private Long id;

    @ManyToOne
    private Item item;

    @ManyToOne
    private User author;

    private Date date;


}
