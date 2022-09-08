package com.example.moviespring.Repositories;

import com.example.moviespring.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Long> {

}
