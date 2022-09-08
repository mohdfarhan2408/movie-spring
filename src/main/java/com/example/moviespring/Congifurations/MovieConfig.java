package com.example.moviespring.Congifurations;

import com.example.moviespring.Models.Movie;
import com.example.moviespring.Repositories.MovieRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class MovieConfig {

    @Bean
    CommandLineRunner commandLineRunner(MovieRepo repo){
        return args -> {

            Movie movie1 = new Movie(
                    "Hantu Kak Limah",
                    LocalDateTime.now(),
                    "Mid Valley"
            );


            repo.save(movie1);

        };


    }
}
