package com.navneet.Cinema.Controllers;

import com.navneet.Cinema.Classes.Movies;
import com.navneet.Cinema.Services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cinema/allMovies")
public class MoviesController {
    @Autowired
    public MoviesService moviesService;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<Movies>> getAllMovies(){
        return new ResponseEntity<>(moviesService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{title}")
    public ResponseEntity<Optional<Movies>> getMoviesByTitle(@PathVariable String title){
        return new ResponseEntity<>(moviesService.getMovieByTitle(title), HttpStatus.OK);
    }
}
