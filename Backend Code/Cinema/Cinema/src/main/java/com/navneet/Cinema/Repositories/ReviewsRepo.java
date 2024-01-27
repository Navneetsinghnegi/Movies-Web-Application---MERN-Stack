package com.navneet.Cinema.Repositories;

import com.navneet.Cinema.Classes.Reviews;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface ReviewsRepo extends MongoRepository<Reviews, ObjectId> {

}
