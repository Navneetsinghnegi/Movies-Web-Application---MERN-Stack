package com.navneet.Cinema.Repositories;

import com.navneet.Cinema.Classes.Movies;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MoviesRepository extends MongoRepository<Movies, ObjectId> {
    Optional<Movies> getMovieByTitle(String title);
}
