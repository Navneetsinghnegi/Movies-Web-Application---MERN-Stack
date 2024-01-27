package com.navneet.Cinema.Services;

import com.navneet.Cinema.Classes.Movies;
import com.navneet.Cinema.Repositories.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesService {
    @Autowired
    public MoviesRepository moviesRepository;
    public List<Movies> allMovies(){
        return moviesRepository.findAll();
    }

    public Optional<Movies> getMovieByTitle(String title) {
        return moviesRepository.getMovieByTitle(title);
    }
}
