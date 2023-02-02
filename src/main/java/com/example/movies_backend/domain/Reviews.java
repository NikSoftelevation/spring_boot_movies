package com.example.movies_backend.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Reviews{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(name="body",nullable=false,columnDefinition="VARCHAR(255)")
    private String body;

    @ManyToOne
    public Movie movie;
    public Reviews(String body,Movie movie) {
        this.body = body;
        this.movie=movie;
    }
}