package com.example.moviespring.Services;

import com.example.moviespring.Models.Movie;
import com.example.moviespring.Repositories.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepo movieRepo;

    @Autowired
    public MovieService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    //Get all movies
    public List<Movie> getAllMovies(){
        return movieRepo.findAll();
    }


}
