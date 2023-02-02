package com.example.movies_backend.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Movie{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private List<String> genres;
    private String poster;
    private List<String> backdrops;
    @OneToMany(mappedBy="movie")
    private List<Reviews> reviewIds;

    public Movie(String imdbId, String title, String releaseDate, String trailerLink, List<String> genres, String poster, List<String> backdrops, List<Reviews> reviewIds) {    this.imdbId = imdbId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.genres = genres;
        this.poster = poster;
        this.backdrops = backdrops;
        this.reviewIds = reviewIds;
    }
}