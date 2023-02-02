package com.example.movies_backend.repository;

import com.example.movies_backend.domain.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews,Integer> {
}
