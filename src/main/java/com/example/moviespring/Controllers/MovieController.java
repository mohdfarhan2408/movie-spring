package com.example.moviespring.Controllers;

import com.example.moviespring.Models.Movie;
import com.example.moviespring.Repositories.MovieRepo;
import com.example.moviespring.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Movie>> getMovies(){
        return new ResponseEntity<>(this.movieService.getAllMovies(), HttpStatus.OK);
    }

}

