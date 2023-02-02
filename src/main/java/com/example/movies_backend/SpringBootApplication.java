package com.example.movies_backend;

import com.example.movies_backend.domain.Movie;
import com.example.movies_backend.domain.Reviews;
import com.example.movies_backend.repository.MovieRepository;
import com.example.movies_backend.repository.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication implements CommandLineRunner{
	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private ReviewsRepository reviewsRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Movie movie = null;

		Reviews review1 = new Reviews("a", movie);
		Reviews review2 = new Reviews("b",movie);
		Reviews review3 = new Reviews("c",movie);
		Reviews review4 = new Reviews("d",movie);

		List<Reviews> reviewIds = new ArrayList<>();
		reviewIds.add(review1);
		reviewIds.add(review2);
		reviewIds.add(review3);
		reviewIds.add(review4);

		movie = new Movie("tt3915174",
				"Puss in Boots: The Last Wish",
				"2022-12-21", "2022-12-21",
				List.of("Animation", "Action", "Adventure", "comedy", "Family"),
				"https://image.tmdb.org/t/p/w500/1NqwE6LP9IEdOZ57NCT51ftHtWT.jpg",
				List.of(
						"https://image.tmdb.org/t/p/original/2wPJIFrBhzzAP8oHDOlShMkERH6.jpg",
						"https://image.tmdb.org/t/p/original/fnfirCEDIkxZnQEtEMMSgllm0KZ.jpg"), reviewIds);

		 /*reviewsRepository.save(review1);
		 reviewsRepository.save(review2);
		 reviewsRepository.save(review3);
		 reviewsRepository.save(review4);*/

		reviewsRepository.saveAll(reviewIds);
		movieRepository.save(movie);
	}
}