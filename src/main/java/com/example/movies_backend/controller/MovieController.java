package com.example.movies_backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ap1/v1/movies")
public class MovieController{
    @GetMapping
    public ResponseEntity<String> allMovies(){
        return new ResponseEntity<String>("All Movies",HttpStatus.OK);
    }
}