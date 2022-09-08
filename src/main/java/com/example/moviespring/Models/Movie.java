package com.example.moviespring.Models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table (name = "movie")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Movie {

    @Id
    @SequenceGenerator(
            name = "movie_sequence",
            sequenceName = "movie_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "movie_sequence"
    )
    private Long id;
    private String name;
    private LocalDateTime movieDate;
    private String location;

    public Movie(String name, LocalDateTime movieDate, String location) {
        this.name = name;
        this.movieDate = movieDate;
        this.location = location;
    }
}
