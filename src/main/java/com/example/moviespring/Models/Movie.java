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
public class Movie extends EntityModel{


    private String name;
    private LocalDateTime movieDate;
    private String location;

}
